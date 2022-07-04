package br.com.letscode.modelos;

import br.com.letscode.excecoes.IdadeNegativaException;

public class Pessoa {
	private String nome;
	private int idade;
	private EstadoCivil estadoCivil;
	private Genero genero;
	private String profissao;
	
	public Pessoa(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public Pessoa(String nome, int idade, char genero, char estadoCivil, String profissao) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setEstadoCivil(estadoCivil);
		this.setGenero(genero);
		this.setProfissao(profissao);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade < 0) throw new IdadeNegativaException();
		this.idade = idade;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(char estado) {
		this.estadoCivil = EstadoCivil.deChar(estado);
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = Genero.deChar(genero);
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return '{' + this.nome + ", " + this.idade + " anos, " + this.genero + ", " + this.estadoCivil + ", " + this.profissao + '}';
	}
}
