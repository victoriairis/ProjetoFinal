package ufersa.sd.projetoSalao.entidades;

import java.io.Serializable;

public class Acesso implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private final boolean acesso;

	public Acesso(boolean acesso) {
		this.acesso = acesso;
	}

	public boolean isAcesso() {
		return acesso;
	}
}