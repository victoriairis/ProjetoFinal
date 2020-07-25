package ufersa.sd.projetoSalao.entidades;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import ufersa.sd.projetoSalao.interfaces.Funcionario;

public class Cabeleireiro extends Pessoa implements Funcionario, Serializable{

	private static final long serialVersionUID = 1L;
	private String cargo = "Cabeleireiro";
	
   @CreationTimestamp
    private Date createdAt;

    @CreationTimestamp
    private Date updatedAt;

	public Cabeleireiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cabeleireiro(int id, String nome, String nCelular, String senha, String email) {
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
