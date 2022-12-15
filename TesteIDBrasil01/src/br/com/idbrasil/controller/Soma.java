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
	
	public Integer realizarSoma() throws NumeroMaiorNaoSoma {
		NumerosRomanos nr = new NumerosRomanos();
		Integer somatoria = 0;
		for (int i = 0; i < listaDeNumeros.size(); i++) {
			try {
				if (nr.getV() == listaDeNumeros.get(i) || nr.getL() == listaDeNumeros.get(i) || nr.getD() == listaDeNumeros.get(i) || nr.getM() == listaDeNumeros.get(i)) {
					return ;
				} else {
					somatoria += listaDeNumeros.get(i);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		return somatoria;
	}
}
