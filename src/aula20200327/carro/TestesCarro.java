package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCarro {

	@Test
	void testes() {
		Carro gol = new Carro();
		
		gol.abastecer(1.00);
		gol.ligar();
		assertTrue(gol.isLigado());
		
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		assertTrue(gol.isLigado());
		
		gol.acelerar();
		assertFalse(gol.isLigado());
		
		Carro lancer = new Carro();
		
		assertTrue(lancer.isDesligado());
		
		lancer.abastecer(2.00);
		
		lancer.ligar();
		assertTrue(lancer.isLigado());
		
		lancer.acelerar();
		lancer.acelerar();
		assertTrue(lancer.isLigado());
		
		lancer.desligar();
		assertTrue(lancer.isDesligado());
	
		
	}

}
