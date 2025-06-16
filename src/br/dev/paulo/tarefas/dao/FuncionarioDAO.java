package br.dev.paulo.tarefas.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.paulo.tarefas.factory.FileFactory;
import br.dev.paulo.tarefas.model.Funcionario;

public class FuncionarioDAO {

	private Funcionario funcionario; // Criando um atributo Funcionario.

	// Criando dois construtores
	public FuncionarioDAO() {
	} // construtor DEFAULT

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
			
			e.printStackTrace();
		}
	}

	public List<Funcionario> Listar() {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		try {
			FileFactory ff = new FileFactory();
			BufferedReader br = ff.getBufferedReader();

			String linha = "";

			br.readLine();

			while (linha != null) {
				// extraindo uma linha diferente
				linha = br.readLine();

				// Criando um vetor
				if (linha != null) {
					String funcionarioStr[] = linha.split(",");

					// Criando um objeto funcionario
					Funcionario funcionario = new Funcionario();
					funcionario.setMatricula(funcionarioStr[0]);
					funcionario.setNome(funcionarioStr[1]);
					funcionario.setCargo(funcionarioStr[2]);
					funcionario.setSalario(Double.parseDouble(funcionarioStr[3]));

					funcionarios.add(funcionario);
				}

			}
			return funcionarios;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
