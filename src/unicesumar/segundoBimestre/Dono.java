package unicesumar.segundoBimestre;

public class Dono {
	
	private String nome;
	private int cpf;
	private Casa casa;
	
	public Dono(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	
	public Casa getCasa() {
		return casa;
	}
	

}
