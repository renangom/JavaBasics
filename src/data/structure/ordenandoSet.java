package data.structure;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ordenandoSet {
	// Serie 1 = Nome: got, genero: fantasia, tempoEpisodeo: 60
	// Serie 2 = nome: dark, genero: drama, tempoEpisodeo:60
	// Serie 3 = nome: that '70s show, genero: comédia, tempoEpisodeo:25

	public static void main(String[] args) {
		Set<Serie> series = new HashSet<>();

		Serie serie1 = new Serie("got", "Fantasia", 60);
		Serie serie2 = new Serie("dark", "Drama", 60);
		Serie serie3 = new Serie("that '70s show", "Comédia", 25);
		series.add(serie1);
		series.add(serie2);
		series.add(serie3);
		System.out.println(series);

		// ordenar em ordem aleatória
		for (Serie serie : series) {
			System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodeo());
		}

		// ordernar por inserção - linkedHashSet

		Set<Serie> seriesLinked = new LinkedHashSet<>();

		seriesLinked.add(serie1);
		seriesLinked.add(serie2);
		seriesLinked.add(serie3);
		System.out.println(seriesLinked);

		// ordenando por por tempoEpisodeo
		Set<Serie> minhasSeries2 = new TreeSet<>(seriesLinked);
		System.out.println(minhasSeries2);
	}
}

class Serie implements Comparable<Serie> {
	private String nome;
	private String genero;
	private Integer tempoEpisodeo;

	public Serie(String nome, String genero, Integer tempoEpisodeo) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodeo = tempoEpisodeo;
	}

	public String getNome() {
		return this.nome;
	}

	public String getGenero() {
		return this.genero;
	}

	public Integer getTempoEpisodeo() {
		return this.tempoEpisodeo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public int compareTo(Serie o) {

		int tempoEpisodeo = Integer.compare(this.getTempoEpisodeo(), o.getTempoEpisodeo());
		if (tempoEpisodeo != 0) {
			return tempoEpisodeo;
		} else {
			int genero = this.getGenero().compareTo(o.getGenero());
			return genero;
		}

	}
}
