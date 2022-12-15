package br.com.idbrasil.main;

import java.util.ArrayList;

import br.com.idbrasil.controller.Soma;
import br.com.idbrasil.exception.NumeroMaiorNaoSoma;
import br.com.idbrasil.model.NumerosRomanos;

public class RealizarCalculo {

	public static void main(String[] args) throws Exception {

		NumerosRomanos numeroRomano = new NumerosRomanos();
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(numeroRomano.getV());
		lista.add(numeroRomano.getI());
		lista.add(numeroRomano.getI());
		lista.add(numeroRomano.getI());
		Soma rs = new Soma(lista);
		System.out.println(rs.realizarSoma());
		
	}
}

