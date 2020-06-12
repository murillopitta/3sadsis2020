package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.Arrays;

public class Funcionario {
	private int cpf;
	private ArrayList<Emprego> empregos = new ArrayList<>();
	
	public Funcionario(int cpf) {
		this.cpf = cpf;
	}
	
	public void setEmpregos(Emprego emprego) {
		this.empregos.add(emprego);
	}
	
	public ArrayList<Emprego> getEmpregos() {
		return empregos;
	}

}
