package aula20200323.cofre;

public class CofreSeguro {
	
	private int senha;
	private boolean aberto = false;
	
	public CofreSeguro(int senha) {
		this.senha = senha;
	}


	
	public void abrir(int senha) {
		if(senha == this.senha) {
			aberto = true;
		}
		
	}
	public void fechar() {
		aberto = false;
	}
	public boolean isAberto() {
		//return false;
		return aberto;
	}
}
