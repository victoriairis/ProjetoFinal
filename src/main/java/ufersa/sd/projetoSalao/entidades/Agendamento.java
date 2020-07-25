package ufersa.sd.projetoSalao.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import ufersa.sd.projetoSalao.interfaces.AgendamentoInterface;
import ufersa.sd.projetoSalao.interfaces.Funcionario;

public class Agendamento implements AgendamentoInterface, Serializable{

	private static final long serialVersionUID = 1L;
	
	int id;
	
	private Salao salao;
	
	private Funcionario funcionario; 
	
	private Cliente cliente;
	
	private LocalTime hora;
	
	private LocalDate data;
	

	public Agendamento() {
		super();// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Salao getSalao() {
		return salao;
	}
	public void setSalao(Salao salao) {
		this.salao = salao;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public void criarAgendamento() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletarAgendamento() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void modificarAgendamento() {
		// TODO Auto-generated method stub
		
	}	
}
