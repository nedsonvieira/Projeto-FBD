
package br.com.projeto.business;

import br.com.projeto.dao.ClienteDao;
import br.com.projeto.dao.IClienteDao;
import br.com.projeto.entidades.Cliente;
import java.util.List;

public class ClienteBusiness implements IClienteBusiness {

    private IClienteDao clienteDao;

    public ClienteBusiness() {
        this.clienteDao = new ClienteDao();
    }

    @Override
    public boolean salvarOuEditar(Cliente Cliente) {
        try {
            if (Cliente.getId() == null) {
                Cliente  = clienteDao.salvar(Cliente);
                
                return true;
            }
            if (Cliente.getId() != null) {
                clienteDao.editar(Cliente);
                return true;
            }

        } catch (Exception e) {
                e.printStackTrace();
               // O que fazer com a exeçao.. 
        }
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

}
