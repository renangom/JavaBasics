package com.dev.model;

public class Gato {
	private int idade;
	private String nome;
	private String apelido;
	public Gato(int idade, String nome, String apelido) {
		this.idade = idade;
		this.nome = nome;
		this.apelido = apelido;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getApelido() {
		return this.apelido;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
