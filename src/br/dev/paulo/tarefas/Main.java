package br.dev.paulo.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

import br.dev.paulo.tarefas.model.Funcionario;

public class Main {

	static String path = "C:\\Users\\25132413\\ProjetoTarefas\\tarefas.txt";

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Maria da silva");//Criação de um Objeto. Que herarquicamente é filho da Classe Object. //Mas no main Criamos um novo construtor
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.setMatricula(9);
		funcionario2.setNome("Patricia Gomes");
		funcionario2.setCargo("Gerente de TI");
		
		Funcionario funcionario3 = new Funcionario("Progamador", "Maria");
		Funcionario funcionario4 = new Funcionario("Progamador", "Pedro", 2);
		
		System.out.println(funcionario1);
		System.out.println(funcionario2);
		System.out.println(funcionario3);
		System.out.println(funcionario4);
		
		System.out.println("Esse foi o video deixa o like fui..");
	}

	//	lerArquivo();
//		gravarArquivo();
	

	private static void gravarArquivo() {
	    FileWriter fw = null;
	    BufferedWriter bw = null; 

	    try {
	        fw = new FileWriter(path, true);
	        bw = new BufferedWriter(fw); 

	        String novalinha = "Isso é uma nova linha!!";
	        bw.write(novalinha); 
	        bw.flush();

	    } catch (Exception erro) {
	        System.out.println(erro.getMessage()); 
	    } finally {
	        try {
	            if (bw != null) bw.close(); // Fecha BufferedWriter
	            if (fw != null) fw.close(); // Fecha FileWriter
	        
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
