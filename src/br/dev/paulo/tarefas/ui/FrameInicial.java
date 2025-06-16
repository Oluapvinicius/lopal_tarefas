
package br.dev.paulo.tarefas.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameInicial {
   private JLabel labelTitulo;
   private JButton btnTarefas;
   private JButton btnFuncionario;

   public FrameInicial() {
      this.criarTela();
   }

   private void criarTela() {
      JFrame tela = new JFrame();
      tela.setSize(350, 250);
      tela.setDefaultCloseOperation(3);
      tela.setLayout((LayoutManager)null);
      tela.setLocationRelativeTo((Component)null);
      
      tela.setTitle("Gerenciamento de Tarefas");
      tela.setResizable(false);
      Container painel = tela.getContentPane();
      this.labelTitulo = new JLabel("Gerenciamento de Tarefas");
      this.labelTitulo.setBounds(90, 30, 250, 30);
      this.btnTarefas = new JButton("Tarefas");
      this.btnTarefas.setBounds(180, 90, 120, 40);
      this.btnFuncionario = new JButton("Funcionario");
      this.btnFuncionario.setBounds(50, 90, 120, 40);
     
      
      painel.add(this.btnFuncionario);
      painel.add(this.labelTitulo);
      painel.add(this.btnTarefas);
      
      

      btnTarefas.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              new FrameFuncionarioList(tela);
          }
      });
      
      
      
      tela.setVisible(true);
      
      
   }
}




//   private static void gravarArquivo() {
//      FileWriter fw = null;
//      BufferedWriter bw = null;
//
//      try {
//         fw = new FileWriter(path, true);
//         bw = new BufferedWriter(fw);
//         String novaLinha = "Isso é uma nova linha!!\n";
//         bw.write(novaLinha);
//         bw.flush();
//      } catch (Exception var3) {
//         System.out.println(var3.getMessage());
//      }
//
//   }