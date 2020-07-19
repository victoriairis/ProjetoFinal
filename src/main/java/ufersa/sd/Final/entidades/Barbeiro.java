package ufersa.sd.Final.entidades;

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
}
