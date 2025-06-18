package br.dev.paulo.tarefas;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.swing.JFrame;

import br.dev.paulo.tarefas.dao.FuncionarioDAO;
import br.dev.paulo.tarefas.model.Funcionario;
import br.dev.paulo.tarefas.ui.FrameFuncionario;

import br.dev.paulo.tarefas.ui.FrameInicial;
import br.dev.paulo.tarefas.utils.Utils;

public class Main {
	
    
    
	
	


	static String path = "C:\\Users\\25132413\\ProjetoTarefas\\tarefas.txt";

	public static void main(String[] args) {

		new FrameInicial();

	}

		
//		FuncionarioDAO dao = new FuncionarioDAO();
//	    List<Funcionario> funcionarios = dao.Listar();
//	    
//	    for(Funcionario f : funcionarios) {
//	    	System.out.println(f.getNome());
//	    	System.out.println(f.getCargo());
//	    	System.out.println("--------------");
//	    }

	}

	
	//	lerArquivo();
//		gravarArquivo();
	

	//private static void gravarArquivo() {
//	    FileWriter fw = null;
//	    BufferedWriter bw = null; 
//
//	    try {
//	        fw = new FileWriter(path, true);
//	        bw = new BufferedWriter(fw); 
//
//	        String novalinha = "Isso é uma nova linha!!";
//	        bw.write(novalinha); 
//	        bw.flush();
//
//	    } catch (Exception erro) {
//	        System.out.println(erro.getMessage()); 
//	    } finally {
//	        try {
//	            if (bw != null) bw.close(); // Fecha BufferedWriter
//	            if (fw != null) fw.close(); // Fecha FileWriter
//	        
//	        }
//	        
//	}

//	private static void lerArquivo() {
//		FileReader fr = null;
//		BufferedReader br = null;
//
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//
//			String linha = br.readLine();
//
//			while (linha != null) {
//				String registro[] = linha.split(";");
//
//				System.out.println("NOME: " + registro[0]);
//				System.out.println("TAREFA: " + registro[1]);
//				System.out.println("----------------");
//				linha = br.readLine();
//			}
//
//		} catch (FileNotFoundException erro) {
//			System.out.println(erro.getMessage());
//		} catch (IOException erro) {
//			System.out.println(erro.getMessage());
//		} catch (Exception erro) {
//			System.out.println(erro.getMessage());
//		}
//	}


