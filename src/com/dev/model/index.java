package com.dev.model;

public class index {
	public static void main(String[] args) {
		Gato gato = new Gato(5, "Brabo", "Bra");
		
		System.out.println(gato.getNome());
		gato.setNome("BraKet");
		System.out.println(gato.getNome());
	}
}
