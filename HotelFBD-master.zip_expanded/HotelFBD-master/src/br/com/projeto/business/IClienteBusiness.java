
package br.com.projeto.business;

import br.com.projeto.entidades.Cliente;
import java.util.List;

public interface IClienteBusiness {
      
    public boolean salvarOuEditar(Cliente aluno);
    public Cliente buscarPorid(Long id);
    public List<Cliente> getAllI();
}
