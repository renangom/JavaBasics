package data.structure;

import java.util.ArrayList;

public class List {
	public Double MenorValorNoArray(ArrayList<Double> array) {
		double menor = 1000d;
		for(int i = 0; i < 8; i++) {
			if(array.get(i) < menor) {
				menor = array.get(i);
			}
		}
		return menor;
	}
	
	public Double MaiorValorNoArray(ArrayList<Double> array) {
		double maior = 0.0;
		for(int i = 0; i < 8; i++) {
			if(array.get(i) > maior) {
				maior = array.get(i);
			}
		}
		return maior;
	}
	public static void main(String[] args) {
		
		//List notas = new ArrayList(); //antes do java 5
		
		ArrayList<Double> notas = new ArrayList<Double>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas);
		System.out.println("Exiba a posição da nota 5 : " + notas.indexOf(5.0));
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8d);
		System.out.println(notas);
		
		System.out.println("Substitua a nota 5.0 pela nota 7.0");
		notas.set(notas.indexOf(5.0), 7.0);
		System.out.println(notas);
		
		System.out.println("Confira se o elemento 5.0 está na lista");
		notas.contains(5.0);
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("Exiba a menor nota: ");
		List lista = new List();
		double menor = lista.MenorValorNoArray(notas);
		System.out.println(menor);
		
		System.out.println("Achar o maior valor");
		double maior = lista.MaiorValorNoArray(notas);
		System.out.println(maior);
		
		
		
	}
	
}
