
package br.com.projeto.util;

public class SqlUtilCliente {

    
    public static final String INSERT_CLIENTE_ALL = "INSERT INTO Cliente(nome, cpf, id_endereco, identidade, acompanhantes, telefone) values (?, ?, ?, ?, ?, ?)";
    public static final String INSERT_ENDERECO_ALL = "INSERT INTO Endereco(cep, rua, bairro, cidade, uf) values ( ?, ?, ?, ?, ?)";
    
    
    public static final String SELECT_CLIENTE_ULTIMO_REGISTRO = "SELECT * FROM cliente ORDER BY id DESC LIMIT 1";
    
    
    private SqlUtilCliente() {
    }
    
    
    
    
}
