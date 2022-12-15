package br.com.idbrasil.main;

import java.util.ArrayList;

import br.com.idbrasil.controller.Soma;
import br.com.idbrasil.exception.NumeroMaiorNaoSoma;
import br.com.idbrasil.model.NumerosRomanos;

public class RealizarCalculo {

	public static void main(String[] args) {

		NumerosRomanos numeroRomano = new NumerosRomanos();
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(numeroRomano.getV());
		lista.add(numeroRomano.getI());
		lista.add(numeroRomano.getI());
		lista.add(numeroRomano.getI());
		Soma rs = new Soma(lista);
		
		try {
			rs.realizarSoma();
		} catch (NumeroMaiorNaoSoma e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}

