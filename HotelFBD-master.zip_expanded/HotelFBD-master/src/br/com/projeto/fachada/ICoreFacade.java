
package br.com.projeto.fachada;

import br.com.projeto.entidades.Cliente;
import java.util.List;


public interface ICoreFacade {
          
    public boolean salvarOuEditarAluno(Cliente cliente);
    public Cliente buscarClientePorCpf(String cpf);
    public List<Cliente> getClientes();
    
   
}
