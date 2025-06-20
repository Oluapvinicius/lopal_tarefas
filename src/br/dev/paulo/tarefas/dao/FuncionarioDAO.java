package br.dev.paulo.tarefas.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.paulo.tarefas.factory.FileFactory;
import br.dev.paulo.tarefas.model.Funcionario;

public class FuncionarioDAO {

	private Funcionario funcionario;

	public FuncionarioDAO() {
		this.getNomesFuncionarios();
	}

	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void gravar() {
		try {
			FileFactory ff = new FileFactory();
			ff.getBufferWriterFuncionarios().write(funcionario.toString());
			ff.getBufferWriterFuncionarios().flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Funcionario> listar() {

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		try {
			FileFactory ff = new FileFactory();
			BufferedReader br = ff.getBufferedReaderFuncionarios();

			String linha = "";

			br.readLine();

			while (linha != null) {

				linha = br.readLine();
				System.out.println(linha);

				if (linha != null) {
					String funcionarioStr[] = linha.split(",");

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

	public String[] getNomesFuncionarios() {
		List<Funcionario> funcionarios = listar();
		String[] nomes = new String[funcionarios.size()];

		for (int i = 0; i < funcionarios.size(); i++) {
			nomes[i] = funcionarios.get(i).getNome();
		}

		return nomes;
	}

}
//terminei