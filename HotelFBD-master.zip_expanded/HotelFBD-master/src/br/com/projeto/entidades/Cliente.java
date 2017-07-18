
package br.com.projeto.entidades;



public class Cliente {
    
    private Long id;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String identidade;
    private int acompanhantes;
    private String telefone;

    public Cliente() {
        this.endereco = new Endereco(); 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public int getAcompanhantes() {
		return acompanhantes;
	}

	public void setAcompanhantes(int acompanhantes) {
		this.acompanhantes = acompanhantes;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

   
    
    
}
