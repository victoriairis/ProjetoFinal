package ufersa.sd.projetoSalaoServer;



import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import ufersa.sd.projetoSalao.entidades.Agendamento;
import ufersa.sd.projetoSalao.entidades.Cliente;
import ufersa.sd.projetoSalao.interfaces.InterfaceDoServidor;

public class StubProxy {
	private static String nomeServidor = "127.0.0.1";
	private static int porta = 1099;
	private static final String SERVERVIDOR_NOME = "Servidor";
	
	Registry registro;
	InterfaceDoServidor stub;
	
	public StubProxy() {
		try {
			
			//política de segurança RMI
			System.setProperty("java.security.policy", "java.policy");
			if (System.getSecurityManager() == null) {
			 System.setSecurityManager(new SecurityManager());
			}
			
			System.setProperty("java.security.policy","file:java.policy");
			
			// obter a referência do objeto do servidor
			registro = LocateRegistry.getRegistry(nomeServidor, porta);
			System.out.println("Conectado com servidor");
			
			// Procurando pelo objeto  de referência SERVERVIDOR_NOME
			stub = (InterfaceDoServidor) registro.lookup(SERVERVIDOR_NOME);
		} catch (RemoteException | NotBoundException ex) {
			Logger.getLogger(StubProxy.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public boolean logar(String celular, String password) throws RemoteException, SQLException{
		return stub.logar(celular, password);
	}
	
	// operações com cliente
	public int cadastrarCliente(Cliente cliente) throws RemoteException, SQLException{
		return stub.cadastrarCliente(cliente);
	}
	
	public boolean atualizarCliente(Cliente cliente) throws RemoteException, SQLException{
		return stub.atualizarCliente(cliente);
	}
	
	public boolean removerCliente(int cliente) throws RemoteException, SQLException{
		return stub.removerCliente(cliente);
	}
	
	public Cliente dadosDoCliente(int id) throws RemoteException, SQLException{
		return stub.dadosDoCliente(id);
	}
	
	//operações Agendamento
	
	public int cadastrarAgendamento(Agendamento agenda) throws RemoteException, SQLException{
		return stub.cadastrarAgendamento(agenda);
	}
	
	public boolean atualizarAgendamento(Agendamento agenda) throws RemoteException, SQLException{
		return stub.atualizarAgendamento(agenda);
	}
	
	public boolean removerAgendamento(int agenda) throws RemoteException, SQLException{
		return stub.removerAgendamento(agenda);
	}
	
	public Agendamento dadosDoAgendamento(int id) throws RemoteException, SQLException{
		return stub.dadosDoAgendamento(id);
	}
	
	
	public static void main(String [] args) throws RemoteException, SQLException {
		StubProxy s = new StubProxy();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.err.println("Erro de serviço...\n");
			e.printStackTrace();
		}
		System.out.println(s.logar("victoria", "sd@123"));
	}
}
