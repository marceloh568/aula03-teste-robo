package br.com.teste.robo;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoboTest {

	//Robo robo = new Robo();
	
	@BeforeClass
	public static void limparLogParaIniciarTeste(){
		GeradorDeLog.cleanLog();
	}
	
	//LIMITE DIREITA / DIREITA
	//--------------------------------------------------------------------
	@Test(expected=RuntimeException.class)
	public void testeDoLimiteMoverParaDireita(){
		Robo robo = new Robo(50, 50, 49, 2);
		
		//robo.setLimiteEixoDasOrdenadasY(50);
		//robo.setLimiteEixoDasAbcissasX(50);
		//robo.setPosicaoPlanoCartesianoX(49);
		//robo.setPosicaoPlanoCartesianoY(2);
		
		robo.moverXParaDireita(2);
	}
	
	@Test
	public void testeMoverParaDireita(){
		Robo robo = new Robo(50, 50, 30, 2);
		robo.moverXParaDireita(2);
		Assert.assertEquals(32, robo.getPosicaoPlanoCartesianoX());
	}
	
	//LIMITE ESQUERDA / ESQUERDA
	//--------------------------------------------------------------------
	@Test(expected=RuntimeException.class)
	public void testeDoLimiteMoverParaEsquerda(){
		Robo robo = new Robo(50, 50, 1, 2);
		
		//robo.setLimiteEixoDasOrdenadasY(50);
		//robo.setLimiteEixoDasAbcissasX(50);
		//robo.setPosicaoPlanoCartesianoX(1);
		//robo.setPosicaoPlanoCartesianoY(2);
		
		robo.moverXParaEsquerda(2);
	}
	
	@Test
	public void testeMoverParaEsquerda(){
		Robo robo = new Robo(50, 50, 30, 2);
		
		//robo.setLimiteEixoDasOrdenadasY(50);
		//robo.setLimiteEixoDasAbcissasX(50);
		//robo.setPosicaoPlanoCartesianoX(30);
		//robo.setPosicaoPlanoCartesianoY(2);
		
		robo.moverXParaEsquerda(3);
		Assert.assertEquals(27, robo.getPosicaoPlanoCartesianoX());
	}
	
	//LIMITE BAIXO / BAIXO
	//--------------------------------------------------------------------
	@Test(expected=RuntimeException.class)
	public void testeDoLimiteMoverParaBaixo(){
		Robo robo = new Robo(50, 50, 10, 1);
		
		//robo.setLimiteEixoDasOrdenadasY(50);
		//robo.setLimiteEixoDasAbcissasX(50);
		//robo.setPosicaoPlanoCartesianoX(10);
		//robo.setPosicaoPlanoCartesianoY(1);
		
		robo.moverYParaBaixo(2);
	}
	
	@Test
	public void testeMoverParaBaixo(){
		Robo robo = new Robo(50, 50, 10, 30);
		
		//robo.setLimiteEixoDasOrdenadasY(50);
		//robo.setLimiteEixoDasAbcissasX(50);
		//robo.setPosicaoPlanoCartesianoX(10);
		//robo.setPosicaoPlanoCartesianoY(30);
		
		robo.moverYParaBaixo(1);
		Assert.assertEquals(29, robo.getPosicaoPlanoCartesianoY());
	}
	
	//LIMITE CIMA/ CIMA
	//--------------------------------------------------------------------
	@Test(expected=RuntimeException.class)
	public void testeDoLimiteMoverParaCima(){
		Robo robo = new Robo(50, 50, 10, 49);
		
		//robo.setLimiteEixoDasOrdenadasY(50);
		//robo.setLimiteEixoDasAbcissasX(50);
		//robo.setPosicaoPlanoCartesianoX(10);
		//robo.setPosicaoPlanoCartesianoY(49);
		
		robo.moverYParaCima(2);
	}
	
	@Test
	public void testeMoverParaCima(){
		Robo robo = new Robo(50, 50, 10, 30);
		
		//robo.setLimiteEixoDasOrdenadasY(50);
		//robo.setLimiteEixoDasAbcissasX(50);
		//robo.setPosicaoPlanoCartesianoX(10);
		//robo.setPosicaoPlanoCartesianoY(30);
		
		robo.moverYParaCima(1);
		Assert.assertEquals(31, robo.getPosicaoPlanoCartesianoY());
	}
	


}
