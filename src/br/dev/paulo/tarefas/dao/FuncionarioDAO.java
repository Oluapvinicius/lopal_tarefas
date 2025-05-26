package br.dev.paulo.tarefas.dao;

import java.io.IOException;

import br.dev.paulo.tarefas.factory.FileFactory;
import br.dev.paulo.tarefas.model.Funcionario;

public class FuncionarioDAO {
	
	private Funcionario funcionario; //Criando um atributo Funcionario.
	
	//Criando dois construtores 
	public FuncionarioDAO() {} // construtor DEFAULT
	
	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	// Criando o metodo gravar
	// CRUD
	public void gravar() {
		try {
			FileFactory ff = new FileFactory();
			ff.getBufferedWriter().write(funcionario.toString());
			ff.getBufferedWriter().flush();
			System.out.println("Seu usuario foi gravado com sucesso!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
