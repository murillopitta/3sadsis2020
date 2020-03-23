package aula20200323.cofre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	@Test
	void test() {
		Cofre cofreEscritorio = new Cofre();
		
		cofreEscritorio.abrir();
		cofreEscritorio.fechar();
		
		assertEquals(false, cofreEscritorio.isAberto());
		
		Cofre cofreBanco = new Cofre();
		Cofre cofreQuarto = new Cofre();
		
		cofreBanco.abrir();
		
		cofreQuarto.abrir();
		cofreQuarto.fechar();
		cofreQuarto.abrir();
		
		assertEquals(true, cofreBanco.isAberto());
		assertEquals(true, cofreQuarto.isAberto());
		
		
	}
	
	

}
