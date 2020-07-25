package ufersa.sd.projetoSalao.service;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Teste {

	public static void main(String [] args) {
		  SpringApplication app = new SpringApplication(Teste.class);
	        app.setDefaultProperties(Collections.singletonMap("server.port", "1099"));
	        app.run(args);
	}
}
