package ufersa.sd.projetoSalao.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import ufersa.sd.projetoSalao.interfaces.Funcionario;

@Entity
@Table(name = "barber")
public class Barbeiro extends Pessoa implements Funcionario, Serializable{

	private static final long serialVersionUID = 1L;
	private String cargo = "Barbeiro";

	
	public Barbeiro() {
		// TODO Auto-generated constructor stub
		super();
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
		this.cargo = cargo;
		
	}

	@Override
	public void cadastrarFuncionario() {
		
		
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
