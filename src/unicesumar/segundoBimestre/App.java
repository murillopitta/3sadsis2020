package unicesumar.segundoBimestre;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

/*A atividade de vocês valendo 1,5 (um ponto e meio) consiste projetar e implementar um modelo de sua escolha que apresente:

- Uma associação 1 para 0..1 bidirecional;

- Uma associação 1 para 1..* unidirecional;

- Uma associação 0..* para 0..* bidirecional.*/

public class App {
	
	public static void main(String[] args) {
		
		//associação 1 para 0..1 bidirecional
		
		Dono manoel = new Dono("Manoel Rodrigues", 123456789);
		
		System.out.println("Casa do manoel: " + manoel.getCasa());
		
		Casa casa1 = new Casa(45.00, 1500.00, manoel);
		
		System.out.println("Casa do manoel: " + manoel.getCasa());
		System.out.println("Dono da casa: " + casa1.getDono());
		
		//associação 1 para 1..* unidirecional
		
		Comodo sala = new Comodo(50.00);
		
		Apartamento apart502 = new Apartamento("Rua São José, 805", sala);
		
		System.out.println("Comodos do apartamento: " + apart502.getComodos());
		
		Comodo banheiro = new Comodo(10.00);
		Comodo quarto = new Comodo(15.00);
		Comodo cozinha = new Comodo(20.00);
		
		apart502.setComodos(banheiro);
		apart502.setComodos(quarto);
		apart502.setComodos(cozinha);
		
		System.out.println("Comodos do apartamento: " + apart502.getComodos());
		
		//associação 0..* para 0..* bidirecional.
		
		Funcionario jonas = new Funcionario(123484567);
		
		Emprego balconista = new Emprego(1600.00);
		
		System.out.println("Relações funcionario: " + jonas.getEmpregos());
		System.out.println("Relações emprego: " + balconista.getFuncionarios());
		
		Funcionario maria = new Funcionario(12344843);
		Funcionario marcelo = new Funcionario(12484355);
		
		Emprego atendente = new Emprego(1100.00);
		
		jonas.setEmpregos(atendente);
		jonas.setEmpregos(balconista);
		atendente.setFuncionarios(jonas);
		balconista.setFuncionarios(jonas);
		
		maria.setEmpregos(atendente);
		atendente.setFuncionarios(maria);
		
		System.out.println("Relações funcionario jonas: " + jonas.getEmpregos());
		System.out.println("Relações emprego balconista: " + balconista.getFuncionarios());
		System.out.println("Relações funcionario maria: " + maria.getEmpregos());
		System.out.println("Relações emprego atendente: " + atendente.getFuncionarios());
		System.out.println("Relações funcionario marcelo: " + marcelo.getEmpregos());
		
		
	}

}
