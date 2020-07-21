package ufersa.sd.Final.entidades;

import ufersa.sd.Final.interfaces.Funcionario;

public class Barbeiro extends Pessoa implements Funcionario {

	String cargo = "Barbeiro";

	
	public Barbeiro() {
		// TODO Auto-generated constructor stub
	}

	public Barbeiro(int id, String nome, String nCelular, String senha, String email) {
		super(id, nome, nCelular, senha, email);
		// TODO Auto-generated constructor stub
	}

	

	public String getCargo() {
		return cargo;
	}

	@Override
	public void setCargo(String cargo) {
		// TODO Auto-generated method stub
		
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
