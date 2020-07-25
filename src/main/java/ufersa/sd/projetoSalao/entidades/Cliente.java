package ufersa.sd.projetoSalao.entidades;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nome, String nCelular, String senha, String email) {
		super(id, nome, nCelular, senha, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public String getnCelular() {
		// TODO Auto-generated method stub
		return super.getnCelular();
	}

	@Override
	public void setnCelular(String nCelular) {
		// TODO Auto-generated method stub
		super.setnCelular(nCelular);
	}

	@Override
	public String getSenha() {
		// TODO Auto-generated method stub
		return super.getSenha();
	}

	@Override
	public void setSenha(String senha) {
		// TODO Auto-generated method stub
		super.setSenha(senha);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}
}
