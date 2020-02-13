package hangman;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import hangman.model.*;

public class GameScoreTest {
	PowerBonusScore puntajePower;
	BonusScore puntaje;
	OriginalScore puntajeOriginal;
	// Si algun dato es null -----> Error
	// Si algun valor es negatico -----> Error 
	// Si los dos datos son Mayores o iguales a 0 -----> Correcto y Resultado de Puntaje
	
	@Test
	public void DeberiaDarBuenosResultadosConBonusSCore() {
		BonusScore puntaje = new BonusScore();
		int valorMinimo ,valorMaximo,valorFrontera;
		valorMinimo = puntaje.calculateScore(0,5);
		valorMaximo = puntaje.calculateScore(5,0);
		valorFrontera = puntaje.calculateScore(10,2);
		Assert.assertEquals(0,valorMinimo);
		Assert.assertEquals(50,valorMaximo);
		Assert.assertEquals(140,valorFrontera);
		
	}
	
	@Test
	public void DeberiaDarBuenosResultadosConPowerBonusScore() {
		PowerBonusScore puntajePower = new PowerBonusScore();
		int valorMinimo ,valorMaximo,valorFrontera,valorFronteraNegativa;
		valorMinimo = puntajePower.calculateScore(0,5);
		valorFrontera = puntajePower.calculateScore(2,5);
		valorMaximo = puntajePower.calculateScore(3,0);
		valorFronteraNegativa =  puntajePower.calculateScore(4,0);
		Assert.assertEquals(0,valorMinimo);
		Assert.assertEquals(0,valorFrontera);
		Assert.assertEquals(155,valorMaximo);
		Assert.assertEquals(500,valorFronteraNegativa);
	}
	
	@Test
	public void DeberiaDarBuenosResultadosConOriginalScore() {
		 OriginalScore puntajeOriginal = new OriginalScore();
		 
		 int valorMinimo ,valorMaximo,valorFrontera;
		 valorMaximo = puntajeOriginal.calculateScore(5,0);
		 valorFrontera = puntajeOriginal.calculateScore(0,2);
		 valorMinimo = puntajeOriginal.calculateScore(0,10);
		 
		 Assert.assertEquals(100,valorMaximo);
		 Assert.assertEquals(80,valorFrontera);
		 Assert.assertEquals(0,valorMinimo);
		 
		 
	}

	
}