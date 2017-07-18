
package br.com.projeto.fachada;

import br.com.projeto.business.ClienteBusiness;
import br.com.projeto.business.IClienteBusiness;
import br.com.projeto.entidades.Cliente;
import java.util.List;

public class CoreFacade implements ICoreFacade{

    IClienteBusiness clienteBusiness;
    
    public CoreFacade() {
        this.clienteBusiness = new ClienteBusiness();
    }
    

    @Override
    public boolean salvarOuEditarAluno(Cliente cliente) {
        return clienteBusiness.salvarOuEditar(cliente);
    }

    @Override
    public Cliente buscarClientePorCpf(String cpf) {
		return null;
    }

    @Override
    public List<Cliente> getClientes() {
		return null;
    }
    
}
