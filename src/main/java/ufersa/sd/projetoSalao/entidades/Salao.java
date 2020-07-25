package ufersa.sd.projetoSalao.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import ufersa.sd.projetoSalao.interfaces.Funcionario;

public class Salao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	
	public Salao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	ArrayList<Funcionario> funcionarios;
	Map<String, Agendamento> agendamentos;
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public Map<String, Agendamento> getAgendamentos() {
		return agendamentos;
	}
	
	public void setAgendamentos(Map<String, Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
}
