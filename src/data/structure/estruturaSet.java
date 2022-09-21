package data.structure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class estruturaSet {
	public static void main(String[] args) {
		//set não são duplicados e não tem índice
		
		//inicializando set
		//Set notas = new HashSet();
		//Set<Double> notas = new HashSet<>();
		//HashSet<Double> notas = new HashSet<>();
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 7d));
		System.out.println(notas);
		
		
	}
}
