package br.dev.paulo.tarefas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Main {

	static String path = "C:\\Users\\25132413\\ProjetoTarefas\\tarefas.txt";

	public static void main(String[] args) {

		lerArquivo();
//		gravarArquivo();
	}

	private static void gravarArquivo() {

		FileWriter fr = null;
		Buffer bw = null;

		try {
			fw = new FileWriter(path, true);
			bw = new BufferedReader(fw);

			String novaLinha = "Isso é uma nova linha!!";

			bw.write(novaLinha);

			bw.flush();
		} catch (Exception e) {
			System.out.println(erro.getMessage());
		}

	}

	private static void lerArquivo() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String linha = br.readLine();

			while (linha != null) {
				String registro[] = linha.split(";");

				System.out.println("NOME: " + registro[0]);
				System.out.println("TAREFA: " + registro[1]);
				System.out.println("----------------");
				linha = br.readLine();
			}

		} catch (FileNotFoundException erro) {
			System.out.println(erro.getMessage());
		} catch (IOException erro) {
			System.out.println(erro.getMessage());
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	}

}
