package ufersa.sd.projetoSalao.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "pessoas")
public abstract class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "celular")
	private String nCelular;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "email")
	private String email = null;
	

	public Pessoa() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Pessoa(int id, String nome, String nCelular, String senha, String email) {
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
