package br.com.idbrasil.model;

public class NumerosRomanos {

	
	/*
	 * 	private Integer I 		->      1º - PODE REPETIR 3X		|	2º - A DIREITA DO MAIOR SOMA	|	3º - A ESQUERDA DO MAIOR SUBTRAI  
	 * 	private Integer V  		->      1º - NÃO PODE SE REPETIR 	|	2º - NÃO UTILIZA DA REGRA		|	3º - NÃO UTILIZA DA REGRA
	 * 	private Integer X  		->      1º - PODE REPETIR 3X		|	2º - A DIREITA DO MAIOR SOMA	|	3º - A ESQUERDA DO MAIOR SUBTRAI
	 * 	private Integer L  		->      1º - NÃO PODE SE REPETIR	|	2º - NÃO UTILIZA DA REGRA		|	3º - NÃO UTILIZA DA REGRA	
	 * 	private Integer C  		->      1º - PODE REPETIR 3X		|	2º - A DIREITA DO MAIOR SOMA	|	3º - A ESQUERDA DO MAIOR SUBTRAI
	 * 	private Integer D  		->      1º - NÃO PODE SE REPETIR	|	2º - NÃO UTILIZA DA REGRA		|	3º - NÃO UTILIZA DA REGRA 
	 * 	private Integer M   	->      1º - PODE REPETIR 3X		|	2º - NÃO UTILIZA DA REGRA		|	3º - NÃO UTILIZA DA REGRA
	 */	 
	
	
	private Integer I; 							 
	private Integer V; //Maior
	private Integer X;  
	private Integer L; //Maior
	private Integer C; 
	private Integer D; //Maior
	private Integer M; //Maior
	
	public Integer getI() {
		return I = 1;
	}
	public Integer getV() {
		return V = 5;
	}
	public Integer getX() {
		return X = 10;
	}
	public Integer getL() {
		return L = 50;
	}
	public Integer getC() {
		return C = 100;
	}
	public Integer getD() {
		return D = 500;
	}
	public Integer getM() {
		return M = 1000;
	}
}
