package br.com.teste.robo;

public class Robo {

	private int limiteEixoDasOrdenadasY, limiteEixoDasAbcissasX;
	private int posicaoPlanoCartesianoX, posicaoPlanoCartesianoY;

	public Robo(int limiteEixoDasOrdenadasY, int limiteEixoDasAbcissasX,
			int posicaoPlanoCartesianoX, int posicaoPlanoCartesianoY) {
		this.limiteEixoDasOrdenadasY = limiteEixoDasOrdenadasY;
		this.limiteEixoDasAbcissasX = limiteEixoDasAbcissasX;
		this.posicaoPlanoCartesianoX = posicaoPlanoCartesianoX;
		this.posicaoPlanoCartesianoY = posicaoPlanoCartesianoY;
	}

	//DIREITA
	// --------------------------------------------------------------------------------
	public void moverXParaDireita() {

		if (ehPossivelMoverParaDireitaX()) {
			this.posicaoPlanoCartesianoX = posicaoPlanoCartesianoX + 1;
		} else {
			throw new RuntimeException("NÃO É POSSÍVEL MOVER PARA A DIREITA!");
		}
	}

	public boolean ehPossivelMoverParaDireitaX() {
		if (this.posicaoPlanoCartesianoX + 1 <= limiteEixoDasAbcissasX) {
			return true;
		}
		return false;
	}

	//ESQUERDA
	// -------------------------------------------------------------------------------
	public void moverXParaEsquerda() {

		if (ehPossivelMoverParaEsquerdaX()) {
			this.posicaoPlanoCartesianoX = posicaoPlanoCartesianoX - 1;
		} else {
			throw new RuntimeException("NÃO É POSSÍVEL MOVER PARA A ESQUERDA!");
		}
	}

	public boolean ehPossivelMoverParaEsquerdaX() {
		if (this.posicaoPlanoCartesianoX - 1 >= 0) {
			return true;
		}
		return false;
	}

	//CIMA
	// --------------------------------------------------------------------------------
	public void moverYParaCima() {
		if (ehPossivelMoverParaCimaY()) {
			this.posicaoPlanoCartesianoY = posicaoPlanoCartesianoY + 1;
		} else {
			throw new RuntimeException("NÃO É POSSÍVEL MOVER PARA CIMA!");
		}
	}

	public boolean ehPossivelMoverParaCimaY() {
		if (this.posicaoPlanoCartesianoY + 1 <= limiteEixoDasOrdenadasY) {
			return true;
		}
		return false;
	}
	
	//BAIXO
	//---------------------------------------------------------------------------------
	public void moverYParaBaixo() {

		if (ehPossivelMoverParaBaixoY()) {
			this.posicaoPlanoCartesianoY = posicaoPlanoCartesianoY - 1;
		} else {
			throw new RuntimeException("NÃO É POSSÍVEL MOVER PARA BAIXO!");
		}
	}

	public boolean ehPossivelMoverParaBaixoY() {
		if (this.posicaoPlanoCartesianoY - 1 >= 0) {
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
