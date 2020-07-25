package ufersa.sd.projetoSalao.entidades;

import java.io.Serializable;

import ufersa.sd.projetoSalao.interfaces.Funcionario;

public class Manicure extends Pessoa implements Funcionario, Serializable {
	
	private static final long serialVersionUID = 1L;
	private String cargo = "Barbeiro";
	
	public Manicure() {
		// TODO Auto-generated constructor stub
	}

	public Manicure(int id, String nome, String nCelular, String senha, String email) {
		// TODO Auto-generated constructor stub
		super(id, nome, nCelular, senha, email);
	}

	@Override
	public void setCargo(String cargo) {
		// TODO Auto-generated method stub
		this.cargo = cargo;

	}
	
	public String getCargo() {
		return cargo;
	}

	@Override
	public void cadastrarFuncionario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFuncionario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarFuncionario() {
		// TODO Auto-generated method stub
		
	}

}
