package ufersa.sd.projetoSalao.service;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		//política de segurança RMI
		System.setProperty("java.security.policy", "java.policy");
		if (System.getSecurityManager() == null) {
		 System.setSecurityManager(new SecurityManager());
		}
		
		System.setProperty("java.security.policy","file:java.policy");
		
		  SpringApplication app = new SpringApplication(RestServiceApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "1099"));
	        app.run(args);
	}
}