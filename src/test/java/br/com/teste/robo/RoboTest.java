package br.com.teste.robo;
import org.junit.Assert;
import org.junit.Test;

public class RoboTest {

	//DIREITA
	//--------------------------------------------------------------------
	@Test(expected=RuntimeException.class)
	public void testeDoLimiteMoverParaDireita(){
		Robo robo = new Robo(50, 50, 49, 2);
		robo.moverXParaDireita();
		robo.moverXParaDireita();
	}
	
	@Test
	public void testeMoverParaDireita(){
		Robo robo = new Robo(50, 50, 30, 2);
		robo.moverXParaDireita();
		Assert.assertEquals(31, robo.getPosicaoPlanoCartesianoX());
	}
	
	//ESQUERDA
	//--------------------------------------------------------------------
	@Test(expected=RuntimeException.class)
	public void testeDoLimiteMoverParaEsquerda(){
		Robo robo = new Robo(50, 50, 1, 2);
		robo.moverXParaEsquerda();
		robo.moverXParaEsquerda();
	}
	
	@Test
	public void testeMoverParaEsquerda(){
		Robo robo = new Robo(50, 50, 30, 2);
		robo.moverXParaEsquerda();
		Assert.assertEquals(29, robo.getPosicaoPlanoCartesianoX());
	}
	
	//CIMA
	//--------------------------------------------------------------------
	@Test(expected=RuntimeException.class)
	public void testeDoLimiteMoverParaCima(){
		Robo robo = new Robo(50, 50, 10, 49);
		robo.moverYParaCima();
		robo.moverYParaCima();
	}
	
	@Test
	public void testeMoverParaCima(){
		Robo robo = new Robo(50, 50, 10, 30);
		robo.moverYParaCima();
		Assert.assertEquals(31, robo.getPosicaoPlanoCartesianoY());
	}
	
	//BAIXO
	//--------------------------------------------------------------------
	@Test(expected=RuntimeException.class)
	public void testeDoLimiteMoverParaBaixo(){
		Robo robo = new Robo(50, 50, 10, 1);
		robo.moverYParaBaixo();
		robo.moverYParaBaixo();
	}
	
	@Test
	public void testeMoverParaBaixo(){
		Robo robo = new Robo(50, 50, 10, 30);
		robo.moverYParaBaixo();
		Assert.assertEquals(29, robo.getPosicaoPlanoCartesianoY());
	}

}
