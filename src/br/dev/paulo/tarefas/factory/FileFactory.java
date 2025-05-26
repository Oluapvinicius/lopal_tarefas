package br.dev.paulo.tarefas.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileFactory {
	
	private String arquivo = "C:\\Users\\25132413\\ProjetoTarefas\\funcionarios.csv";
	
	private FileWriter fw;
	private BufferedWriter bw;
	
	
	public FileFactory() throws IOException{
		fw = new FileWriter(arquivo, true);//Ele pega o arquivo
		bw = new BufferedWriter(fw);// ele escreve no arquivo
	}
	
	public BufferedWriter getBufferedWriter() {
		return bw;
	}

}