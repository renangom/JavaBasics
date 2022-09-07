package com.dev.model;

public class index {
	public static void main(String[] args) {
		Gato gato = new Gato(5, "Brabo", "Bra");
		
		System.out.println(gato.getNome());
		gato.setNome("BraKet");
		System.out.println(gato.getNome());
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		String alunos[] = {"RENAN","JONAS", "LUIZ", "NATÁLIA"};
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("O aluno " + alunos[i] + " tem indice " + i);
		}
		
		try {
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
