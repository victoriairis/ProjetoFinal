package ufersa.sd.Final.ClientRMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import ufersa.sd.Final.ServerRMI.AgendamentoInterface;

public class UserPeer {

	public UserPeer() {
		// TODO Auto-generated constructor stub
	}
	public static final int SERVIDOR_PORTA = 34001;
	public static void main(String args[]) {
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
	}
}
