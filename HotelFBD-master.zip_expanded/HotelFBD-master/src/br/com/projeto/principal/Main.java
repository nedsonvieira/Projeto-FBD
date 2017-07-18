
package br.com.projeto.principal;

import br.com.projeto.entidades.Cliente;
import br.com.projeto.fachada.CoreFacade;
import br.com.projeto.fachada.ICoreFacade;


public class Main {
    
    public static void main(String[] a){
        
       ICoreFacade facade = new CoreFacade();
        
        
        Cliente cliente = new Cliente();
        cliente.setNome("Heldon");
        cliente.setCpf("123.123.123-12");
        
        cliente.getEndereco().setCep("58701-090");
        cliente.getEndereco().setRua("Capitao");
        
        
        
        
       
        
        facade.salvarOuEditarAluno(cliente);
        
        
       // facade.salvarOuEditarAluno(aluno)
       
    }
    
}
