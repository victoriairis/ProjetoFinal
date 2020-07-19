package ufersa.sd.Final.entidades;

public class Manicure extends Pessoa implements Funcionario {

	String cargo = "Barbeiro";
	
	public Manicure() {
		// TODO Auto-generated constructor stub
	}

	public Manicure(int id, String nome, String nCelular, String senha, String email) {
		super(id, nome, nCelular, senha, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setCargo(String cargo) {
		// TODO Auto-generated method stub
		this.cargo = cargo;

	}
	
	public String getCargo() {
		return cargo;
	}

}
