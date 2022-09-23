package data.structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class estruturaSet {
	public static void main(String[] args) {
		//set não são duplicados e não tem índice
		
		//inicializando set
		//Set notas = new HashSet();
		//Set<Double> notas = new HashSet<>();
		//HashSet<Double> notas = new HashSet<>();
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 7d, 5.7, 5d, 9.6, 15.2, 13.4, 8d));
		System.out.println(notas); //ordem aleatória e o 7 entra apenas uma vez
		
		//Conferir se a nota 5 está no conjunto
		System.out.println("Nota 5 está no conjunto: " + notas.contains(5d));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		
		Iterator<Double> iterator =  notas.iterator();
		Double soma = 0d;
		
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Remova a nota 5.7");
		notas.remove(5.7);
		
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next() < 7) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		
		
		
	}
}
