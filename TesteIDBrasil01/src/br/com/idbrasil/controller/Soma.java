package br.com.idbrasil.controller;

import java.util.ArrayList;

import br.com.idbrasil.exception.NumeroMaiorNaoSoma;
import br.com.idbrasil.model.NumerosRomanos;

public class Soma {

	private ArrayList<Integer> listaDeNumeros = new ArrayList<>();
	
	public Soma(ArrayList<Integer> listaDeNumeros) {
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
