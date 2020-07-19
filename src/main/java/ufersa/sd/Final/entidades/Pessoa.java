package ufersa.sd.Final.entidades;

public abstract class Pessoa {

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	int id;
	String nome;
	String nCelular;
	String senha;
	String email = null;
	
	public Pessoa(int id, String nome, String nCelular, String senha, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.nCelular = nCelular;
		this.senha = senha;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getnCelular() {
		return nCelular;
	}

	public void setnCelular(String nCelular) {
		this.nCelular = nCelular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
