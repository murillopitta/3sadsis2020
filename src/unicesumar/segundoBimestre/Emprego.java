package unicesumar.segundoBimestre;

import java.util.ArrayList;

public class Emprego {
	private double salario;
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	public Emprego(double salario) {
		this.salario = salario;
	}
	
	public void setFuncionarios(Funcionario funcionarios) {
		this.funcionarios.add(funcionarios);
	}

	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
