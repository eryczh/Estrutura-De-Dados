package main;

public class Contato {
    
    private String nome;
    private String email;
    private String telefone;

    public Contato () {}

    public Contato (String nome, String email, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
}
