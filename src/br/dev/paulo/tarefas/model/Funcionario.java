package br.dev.paulo.tarefas.model;

public class Funcionario {
	private String nome;
	private int matricula;
	private String cargo;
	
	//Método construtor
	public Funcionario(String nome) {
	  this.nome = nome;
	}
	// Contrutor Padrão ou Default (que e a mesma coisa so que em linguagem diferente)
	public Funcionario() {
		
	}
	
	public Funcionario(String cargo, String nome) {
		this.cargo = cargo;
		this.nome = nome;
	}
	
	public Funcionario(String cargo, String nome, int matricula) {
		this.cargo = cargo;
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() { // criando o Meu proprio toString.
		System.out.println("Minha toString...");
		String funcionario = matricula + "," + nome + "," + cargo + "\n";
		return funcionario;
	}
	

}
