package com.dev.model;

import java.util.Locale;
import java.util.Scanner;

public class testandoexcecoes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		try{
			System.out.println("Digite seu nome : ");
			String nome = scanner.next();
		
			System.out.println("Digite seu sobrenome");
			String sobrenome = scanner.next();
		
			System.out.println("Digite sua idade");
			int idade = scanner.nextInt();
		
		}catch(Exception e) {
			System.out.println("Preencha os campos corretamente");
		}
		
		
		
		
	}
}
