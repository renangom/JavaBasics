package data.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenandoLista {
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>();
		
		Gato gato1 = new Gato("John", 18, "Preto");
		Gato gato2 = new Gato("Simba", 6, "Tigrado");
		Gato gato3 = new Gato("John", 12, "Amarelo");
		
		meusGatos.add(gato1);
		meusGatos.add(gato2);
		meusGatos.add(gato3);
		
		System.out.println(meusGatos);
		System.out.println("--\tOrdem Natural (Nome)\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Idade\t---");
		//Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Cor\t---");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
	}
}


class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getCor() {
		return this.cor;
	}
	public Integer getIdade() {
		return this.idade;
	}
	
	@Override
	public String toString() {
		return "Gato{"+
				"nome='"+nome+ '\''+
				", idade="+ idade +
				", cor='"+ cor + '\''+
				'}';
	}
	
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}

class ComparatorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}
