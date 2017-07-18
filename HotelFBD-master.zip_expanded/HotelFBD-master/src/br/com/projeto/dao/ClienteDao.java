
package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.projeto.entidades.Cliente;
import br.com.projeto.entidades.Endereco;
import br.com.projeto.util.ConnectionFactory;
import br.com.projeto.util.SqlUtilCliente;

public class ClienteDao implements IClienteDao {

    Connection conexaoPost;
    PreparedStatement statment;
    ResultSet result;

    public ClienteDao() {
        try {
            conexaoPost = ConnectionFactory.getInstance(ConnectionFactory.TIPO_BASE_DADOS_POSTGRES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente salvar(Cliente cliente)throws Exception{

        try {
            Long id = salvarEndereco(cliente.getEndereco());
            statment = conexaoPost.prepareStatement(SqlUtilCliente.INSERT_CLIENTE_ALL);
            statment.setLong(1, cliente.getId());
            statment.setString(2, cliente.getNome());
            statment.setString(3, cliente.getCpf());
            statment.setLong(4, id);
            statment.setString(5, cliente.getIdentidade());
            statment.setInt(6, cliente.getAcompanhantes());
            statment.setString(5, cliente.getTelefone());
            statment.execute();

          
            
            statment = conexaoPost.prepareStatement(SqlUtilCliente.SELECT_CLIENTE_ULTIMO_REGISTRO);
            result = statment.executeQuery();
            
            result.next();
            cliente.setId(new Long(result.getInt("id")));
            return cliente;
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                conexaoPost.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }
             throw new Exception("Erro....");
  
    }

    @Override
    public boolean editar(Cliente cliente) {
		return false;
    }

    @Override
    public Cliente buscarPorid(Long id) {
		return null;
    }

    @Override
    public List<Cliente> getAllI() {
		return null;
    }

    private Long salvarEndereco(Endereco end) throws Exception {
        try {
            statment = conexaoPost.prepareStatement(SqlUtilCliente.INSERT_ENDERECO_ALL);
            statment.setString(1, end.getCep());
            statment.setString(2, end.getRua());
            statment.setString(3, end.getBairro());
            statment.setString(4, end.getCidade());
            statment.setString(5, end.getUf());
            statment.execute();
            
            statment = conexaoPost.prepareStatement("select * from endereco");
            result = statment.executeQuery();
            
            while(result.next()){
                if(result.isLast()){
                     return result.getLong("id");
                }
            }
           
            return new Long(0);
           

        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                conexaoPost.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
                throw new Exception(ex1.getMessage());
            }
            throw new Exception(ex.getMessage());
        }

    }

}
