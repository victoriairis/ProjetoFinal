package ufersa.sd.projetoSalao.controle;

import java.rmi.RemoteException;
import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ufersa.sd.projetoSalao.entidades.Acesso;
import ufersa.sd.projetoSalao.entidades.Agendamento;
import ufersa.sd.projetoSalao.entidades.Cliente;
import ufersa.sd.projetoSalaoServer.StubProxy;

@RestController
public class SalaoControle {

StubProxy stub = new StubProxy(); 
	
	@GetMapping("/login")
	public Acesso login(@RequestParam(value = "celular") String celular,@RequestParam(value = "password") 
		String password) throws RemoteException, SQLException {
		boolean logou = stub.logar(celular, password);
		return new Acesso(logou);
	}
	
	/**
	 * rotas para clientes
	 * @param id
	 * @return
	 * @throws RemoteException
	 * @throws SQLException
	 */
	
	/*recebe dados do cliente*/
	@GetMapping("/usuario")
	public Cliente cliente(@RequestParam(value = "id") int id) throws RemoteException, SQLException {
		Cliente cliente = stub.dadosDoCliente(id);
		return cliente;
	}
	
	//CadastrarCliente
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ResponseEntity<Integer> cadastro(@RequestBody Cliente cliente) throws RemoteException, SQLException {
		Integer id = stub.cadastrarCliente(cliente);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	//AtualizarCliente
	@RequestMapping(value = "/atualizar", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> update(@RequestBody Cliente cliente) throws RemoteException, SQLException {
		Boolean atualizou = stub.atualizarCliente(cliente);
		return new ResponseEntity<Boolean>(atualizou, HttpStatus.OK);
	}
	
	//removerCliente
	@RequestMapping(value = {"/deletar/{id}"}, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable final int id) throws RemoteException, SQLException {
		Boolean removeu = stub.removerCliente(id);
		return new ResponseEntity<Boolean>(removeu, HttpStatus.OK);
	}
	

	
	//CadastrarAgendamento
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ResponseEntity<Integer> agenda(@RequestBody Agendamento agenda) throws RemoteException, SQLException {
		Integer id = stub.cadastrarAgendamento(agenda);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	//AtualizarAgendamento
	@RequestMapping(value = "/atualizar", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> update(@RequestBody Agendamento agenda) throws RemoteException, SQLException {
		Boolean atualizou = stub.atualizarAgendamento(agenda);
		return new ResponseEntity<Boolean>(atualizou, HttpStatus.OK);
	}
	
	//removerAgendamento
	@RequestMapping(value = {"/deletar/{id}"}, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete1(@PathVariable final int id) throws RemoteException, SQLException {
		Boolean removeu = stub.removerAgendamento(id);
		return new ResponseEntity<Boolean>(removeu, HttpStatus.OK);
	}
}