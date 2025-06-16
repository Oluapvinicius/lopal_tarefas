package br.dev.paulo.tarefas.model;

import java.time.LocalDate;

import javax.swing.JComboBox;

public class Tarefa {
	private String titulo;
	private String descricao;
	private LocalDate dataInicial;
	private LocalDate prazo;
	private LocalDate dataconc;
	
	public Tarefa() {
		
	}
	
    public Tarefa(String titulo,String descricao,LocalDate dataInicial,LocalDate prazo,LocalDate dataconc ) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicial = dataInicial;
		this.prazo = prazo;
		this.dataconc = dataconc;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getPrazo() {
		return prazo;
	}

	public void setPrazo(LocalDate prazo) {
		this.prazo = prazo;
	}

	public LocalDate getDataconc() {
		return dataconc;
	}

	public void setDataconc(LocalDate dataconc) {
		this.dataconc = dataconc;
	}

}
