package br.com.idbrasil.controller;

import java.util.ArrayList;

import br.com.idbrasil.model.NumerosRomanos;

public class QualOperacao {

	private ArrayList<Integer> listaDeNumeros = new ArrayList<>();
	
	public QualOperacao(ArrayList<Integer> listaDeNumeros) {
		this.setListaDeNumeros(listaDeNumeros);
	}

	public ArrayList<Integer> getListaDeNumeros() {
		return listaDeNumeros;
	}

	public void setListaDeNumeros(ArrayList<Integer> listaDeNumeros) {
		this.listaDeNumeros = listaDeNumeros;
	}
	
	public Integer realizarSoma() throws Exception {
		NumerosRomanos nr = new NumerosRomanos();
		Integer somatoria = 0;
		int maxI = 0;
		int maxX = 0;
		int maxC = 0;
		if (listaDeNumeros.contains(nr.getI()) || listaDeNumeros.contains(nr.getX()) || listaDeNumeros.contains(nr.getC())) {
			for (int i = 0; i < listaDeNumeros.size(); i++) {
				if(listaDeNumeros.get(i) == nr.getI() && maxI <= 3) {
					if(listaDeNumeros.get(i - 1) >= listaDeNumeros.get(i)) {
						somatoria += listaDeNumeros.get(i);
						maxI++;
						continue;
					}else if(listaDeNumeros.get(i - 1) == listaDeNumeros.get(0)) {
						
					}
				}
				if(listaDeNumeros.get(i) == nr.getX() && maxX <= 3) {
					if(listaDeNumeros.get(i - 1) >= listaDeNumeros.get(i)) {
						somatoria += listaDeNumeros.get(i);
						maxX++;
						continue;
					}
				}
				if(listaDeNumeros.get(i) == nr.getC() && maxC <= 3) {
					if(listaDeNumeros.get(i - 1) >= listaDeNumeros.get(i)) {
						somatoria += listaDeNumeros.get(i);
						maxC++;
						continue;
					}
				}
				if(listaDeNumeros.get(i) != nr.getI() && listaDeNumeros.get(i) != nr.getX() && listaDeNumeros.get(i) != nr.getC()) {
					somatoria += listaDeNumeros.get(i);
				}else {
					throw new Exception("Numeros adicionados não foram aceitos!");
				}
			}
		}		
		return somatoria;
	}
	
	
	public Integer realizarSubtracao() throws Exception {
		NumerosRomanos nr = new NumerosRomanos();
		Integer somatoria = 0;
		for (int i = 0; i < listaDeNumeros.size(); i++) {
			if (nr.getV() == listaDeNumeros.get(i) || nr.getL() == listaDeNumeros.get(i) || nr.getD() == listaDeNumeros.get(i) || nr.getM() == listaDeNumeros.get(i)) {
				throw new Exception("Numeros adicionados não foram aceitos!");
			} else {
				somatoria += listaDeNumeros.get(i);
			}
		}
		return somatoria;
	}
}
