package ufersa.sd.projetoSalao.interfaces;



import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

import ufersa.sd.projetoSalao.entidades.Agendamento;
import ufersa.sd.projetoSalao.entidades.Cliente;

//Criando a interface (Skeleton) do servidor
public interface InterfaceDoServidor extends Remote{

	
	/* interface para chamadas de métodos remotos */
	public boolean logar(String name, String password) throws RemoteException, SQLException;
	
	// Entidade cliente operações remotas - add - update - remove - list
	public int cadastrarCliente(Cliente cliente) throws RemoteException, SQLException;
	public boolean atualizarCliente(Cliente cliente) throws RemoteException, SQLException;
	public boolean removerCliente(int idCliente) throws RemoteException, SQLException;
	public Cliente dadosDoCliente(int id) throws RemoteException, SQLException;
	
	// Entidade agendamento operações remotas - add - update - remove - list
	public int cadastrarAgendamento(Agendamento agenda) throws RemoteException, SQLException;
	public boolean atualizarAgendamento(Agendamento agenda) throws RemoteException, SQLException;
	public boolean removerAgendamento(int idAgendamento) throws RemoteException, SQLException;
	public Agendamento dadosDoAgendamento(int id) throws RemoteException, SQLException;

}