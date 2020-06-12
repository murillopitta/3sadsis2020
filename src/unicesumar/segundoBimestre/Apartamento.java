package unicesumar.segundoBimestre;
import java.util.ArrayList;
import java.util.Arrays;

public class Apartamento {
	private String endereco;
	private ArrayList<Comodo> comodos = new ArrayList<>();
	
	public Apartamento(String endereco, Comodo comodo) {
		if (comodo == null) {
			throw new RuntimeException("O Apartamento precisa de pelo menos um comodo!");
		}
		this.endereco = endereco;
		this.comodos.add(comodo);
	}
	
	public void setComodos(Comodo comodo) {
		this.comodos.add(comodo);
	}
	
	public ArrayList<Comodo> getComodos() {
		return comodos;
	}

}
