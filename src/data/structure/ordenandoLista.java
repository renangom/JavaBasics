package data.structure;

import java.util.ArrayList;
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
	
}
