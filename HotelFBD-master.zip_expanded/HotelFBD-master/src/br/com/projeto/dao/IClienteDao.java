
package br.com.projeto.dao;

import br.com.projeto.entidades.Cliente;
import java.util.List;

public interface IClienteDao {
    
    public Cliente salvar(Cliente cliente)throws Exception;
    public boolean editar(Cliente cliente);
    public Cliente buscarPorid(Long id);
    public List<Cliente> getAllI();
  
}
