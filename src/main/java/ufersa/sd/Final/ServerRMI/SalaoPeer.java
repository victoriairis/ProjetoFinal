package ufersa.sd.Final.ServerRMI;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import org.apache.tomcat.jni.Multicast;

import ufersa.sd.Final.entidades.Agendamento;

public class SalaoPeer {

	public SalaoPeer() {
		// TODO Auto-generated constructor stub
	}
	public static final int SERVIDOR_PORTA = 34001;
	public static void main(String[] args) {
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
