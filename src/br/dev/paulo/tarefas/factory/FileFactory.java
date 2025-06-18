package br.dev.paulo.tarefas.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileFactory {

    private String arquivoFuncionarios = Paths.get("ArquivosGerenciador", "funcionarios.csv").toString();
    private String arquivoTarefas = Paths.get("ArquivosGerenciador", "tarefas.csv").toString();

    public FileFactory() throws IOException {
        // Criar diretório se não existir
        Files.createDirectories(Paths.get("ArquivosGerenciador"));
        
        // Criar arquivos se não existirem
        if (!Files.exists(Paths.get(arquivoFuncionarios))) {
            Files.createFile(Paths.get(arquivoFuncionarios));
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoFuncionarios, true))) {
                bw.write("matricula,nome,cargo,salario\n");
            }
        }
        
        if (!Files.exists(Paths.get(arquivoTarefas))) {
            Files.createFile(Paths.get(arquivoTarefas));
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoTarefas, true))) {
                bw.write("codigo,titulo,descricao,data,prazo,conclusao,status,responsavel\n");
            }
        }
    }

    public BufferedWriter getBufferWriterFuncionarios() throws IOException {
        return new BufferedWriter(new FileWriter(arquivoFuncionarios, true));
    }

    public BufferedWriter getBufferWriterTarefas() throws IOException {
        return new BufferedWriter(new FileWriter(arquivoTarefas, true));
    }

    public BufferedReader getBufferedReaderFuncionarios() throws IOException {
        return new BufferedReader(new FileReader(arquivoFuncionarios));
    }

    public BufferedReader getBufferedReaderTarefas() throws IOException {
        return new BufferedReader(new FileReader(arquivoTarefas));
    }
}