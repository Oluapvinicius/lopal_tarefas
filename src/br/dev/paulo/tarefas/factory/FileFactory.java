package br.dev.paulo.tarefas.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFactory {
	
	private String arquivo = "C:\\Users\\25132413\\ProjetoTarefas\\funcionarios.csv";
	
	private FileWriter fw;
	private BufferedWriter bw;
	
	private FileReader fr;
	private BufferedReader br;
	
	
	public FileFactory() throws IOException{
		fw = new FileWriter(arquivo, true);//Ele pega o arquivo
		bw = new BufferedWriter(fw);// ele escreve no arquivo
		
		fr = new FileReader(arquivo);
		br = new BufferedReader(fr);
	}
	
	public BufferedWriter getBufferedWriter() {
		return bw;
	}
	
	public BufferedReader getBufferedReader() {
		return br;
	}
	

}