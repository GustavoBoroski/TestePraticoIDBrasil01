package br.com.idbrasil.main;

import java.util.ArrayList;

import br.com.idbrasil.controller.QualOperacao;
import br.com.idbrasil.exception.NumeroMaiorNaoSoma;
import br.com.idbrasil.model.NumerosRomanos;

public class RealizarCalculo {

	public static void main(String[] args) throws Exception {

		NumerosRomanos numeroRomano = new NumerosRomanos();
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(numeroRomano.getX());
		lista.add(numeroRomano.getV());
		QualOperacao qo = new QualOperacao(lista);
		System.out.println(qo.realizarSoma());
		
	}
}

