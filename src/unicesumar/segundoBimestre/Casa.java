package unicesumar.segundoBimestre;

public class Casa {
	
	private double metrosQuadrados;
	private double aluguel;
	private Dono dono;
	
	public Casa (double metrosQuadrados, double aluguel, Dono dono) {
		if (dono == null) {
			throw new RuntimeException("A casa precisa de um dono!");
		}
		this.metrosQuadrados = metrosQuadrados;
		this.aluguel = aluguel;
		this.dono = dono;
		this.dono.setCasa(this);
	}
	
	public Dono getDono() {
		return dono;
	}

}
