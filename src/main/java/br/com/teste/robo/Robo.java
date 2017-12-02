package br.com.teste.robo;

import java.io.IOException;

public class Robo {

	private int limiteEixoDasOrdenadasY, limiteEixoDasAbcissasX;
	private int posicaoPlanoCartesianoX, posicaoPlanoCartesianoY;
	
	private final String DIREITA = "Direita";
	private final String ESQUERDA = "Esquerda";
	private final String CIMA = "Cima";
	private final String BAIXO = "Baixo";
	//private String textoDoLog = "";

	public Robo(int limiteEixoDasOrdenadasY, int limiteEixoDasAbcissasX,
			int posicaoPlanoCartesianoX, int posicaoPlanoCartesianoY) {
		this.limiteEixoDasOrdenadasY = limiteEixoDasOrdenadasY;
		this.limiteEixoDasAbcissasX = limiteEixoDasAbcissasX;
		this.posicaoPlanoCartesianoX = posicaoPlanoCartesianoX;
		this.posicaoPlanoCartesianoY = posicaoPlanoCartesianoY;
	}
	
	

	public Robo() {
		super();
	}



	//DIREITA
	// --------------------------------------------------------------------------------
	public void moverXParaDireita(int qtdPassos) {

		if (ehPossivelMoverParaDireitaX(qtdPassos)) {
			this.posicaoPlanoCartesianoX = posicaoPlanoCartesianoX + qtdPassos;
			try {
				GeradorDeLog.gravarLog(qtdPassos, DIREITA);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			throw new RuntimeException("NÃO É POSSÍVEL MOVER PARA A DIREITA!");
		}
	}

	public boolean ehPossivelMoverParaDireitaX(int qtdPassos) {
		if (this.posicaoPlanoCartesianoX + qtdPassos <= limiteEixoDasAbcissasX) {
			return true;
		}
		return false;
	}

	//ESQUERDA
	// -------------------------------------------------------------------------------
	public void moverXParaEsquerda(int qtdPassos) {

		if (ehPossivelMoverParaEsquerdaX(qtdPassos)) {
			this.posicaoPlanoCartesianoX = posicaoPlanoCartesianoX - qtdPassos;
			try {
				GeradorDeLog.gravarLog(qtdPassos, ESQUERDA);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			throw new RuntimeException("NÃO É POSSÍVEL MOVER PARA A ESQUERDA!");
		}
	}

	public boolean ehPossivelMoverParaEsquerdaX(int qtdPassos) {
		if (this.posicaoPlanoCartesianoX - qtdPassos >= 0) {
			return true;
		}
		return false;
	}

	//CIMA
	// --------------------------------------------------------------------------------
	public void moverYParaCima(int qtdPassos) {
		if (ehPossivelMoverParaCimaY(qtdPassos)) {
			this.posicaoPlanoCartesianoY = posicaoPlanoCartesianoY + qtdPassos;
			try {
				GeradorDeLog.gravarLog(qtdPassos, CIMA);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			throw new RuntimeException("NÃO É POSSÍVEL MOVER PARA CIMA!");
		}
	}

	public boolean ehPossivelMoverParaCimaY(int qtdPassos) {
		if (this.posicaoPlanoCartesianoY + qtdPassos <= limiteEixoDasOrdenadasY) {
			return true;
		}
		return false;
	}
	
	//BAIXO
	//---------------------------------------------------------------------------------
	public void moverYParaBaixo(int qtdPassos) {

		if (ehPossivelMoverParaBaixoY(qtdPassos)) {
			this.posicaoPlanoCartesianoY = posicaoPlanoCartesianoY - qtdPassos;
			try {
				GeradorDeLog.gravarLog(qtdPassos, BAIXO);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			throw new RuntimeException("NÃO É POSSÍVEL MOVER PARA BAIXO!");
		}
	}

	public boolean ehPossivelMoverParaBaixoY(int qtdPassos) {
		if (this.posicaoPlanoCartesianoY - qtdPassos >= 0) {
			return true;
		}
		return false;
	}

	
	//GETTERS E SETTERS
	//---------------------------------------------------------------------------------
	public int getLimiteEixoDasOrdenadasY() {
		return limiteEixoDasOrdenadasY;
	}

	public void setLimiteEixoDasOrdenadasY(int limiteEixoDasOrdenadasY) {
		this.limiteEixoDasOrdenadasY = limiteEixoDasOrdenadasY;
	}

	public int getLimiteEixoDasAbcissasX() {
		return limiteEixoDasAbcissasX;
	}

	public void setLimiteEixoDasAbcissasX(int limiteEixoDasAbcissasX) {
		this.limiteEixoDasAbcissasX = limiteEixoDasAbcissasX;
	}

	public int getPosicaoPlanoCartesianoX() {
		return posicaoPlanoCartesianoX;
	}

	public void setPosicaoPlanoCartesianoX(int posicaoPlanoCartesianoX) {
		this.posicaoPlanoCartesianoX = posicaoPlanoCartesianoX;
	}

	public int getPosicaoPlanoCartesianoY() {
		return posicaoPlanoCartesianoY;
	}

	public void setPosicaoPlanoCartesianoY(int posicaoPlanoCartesianoY) {
		this.posicaoPlanoCartesianoY = posicaoPlanoCartesianoY;
	}
}
