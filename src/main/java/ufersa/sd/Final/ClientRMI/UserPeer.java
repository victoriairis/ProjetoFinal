package ufersa.sd.Final.ClientRMI;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import ufersa.sd.Final.entidades.Agendamento;
import ufersa.sd.Final.interfaces.AgendamentoInterface;

public class UserPeer {

	public UserPeer() {
		// TODO Auto-generated constructor stub
	}
	static boolean isClient;
	
	public static final int SERVIDOR_PORTA = 34001;
	public static void main(String args[]) {
		
		/**
		 * P2P é cliente e servidor ao mesmo tempo
		 *  */
		if(isClient == true) {
			Scanner entrada = new Scanner(System.in);
	    	System.out.println("Informe o nome/endereco do servidor:");
	        String host = entrada.nextLine();
	        
	        try {

	        	Registry registro = LocateRegistry.getRegistry(host, SERVIDOR_PORTA);
	            AgendamentoInterface stubObjRemotoCliente = (AgendamentoInterface) registro.lookup("Agendamento");
	        
	            stubObjRemotoCliente.criarAgendamento();
	            
	            
	        }catch(Exception e) {
	        	
	        	e.printStackTrace();
	        }
		} else {
			// TODO Auto-generated method stub
			System.setProperty("java.rmi.server.hostname", "127.0.0.1");
			
			try {
				Agendamento refAgendamentoRemoto = new Agendamento();
				AgendamentoInterface skeleton = (AgendamentoInterface) UnicastRemoteObject.exportObject((Remote) refAgendamentoRemoto, 0);
				LocateRegistry.createRegistry(SERVIDOR_PORTA); 
				
				
				Registry registro = LocateRegistry.getRegistry(SERVIDOR_PORTA);
				
				/* O método bind é então chamado no stub do registro para vincular 
				 * o stub do objeto remoto ao nome "Loja" no registro.*/
				
				registro.bind("Loja", (Remote) skeleton);

				System.err.println("Servidor iniciando e rodando. ");
				
			} catch (Exception e) {
				System.err.println("Servidor com erro crítico");
				e.printStackTrace();
			}
		
		}
		
	}
}
