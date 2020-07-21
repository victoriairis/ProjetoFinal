package ufersa.sd.Final.entidades;

import java.util.ArrayList;
import java.util.Map;

import ufersa.sd.Final.interfaces.Funcionario;

public class Salao {

	public Salao() {
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<Funcionario> funcionarios;
	Map<String, Agendamento> agendamentos;
	int id;
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
