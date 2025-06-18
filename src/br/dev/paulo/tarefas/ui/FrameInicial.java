package br.dev.paulo.tarefas.ui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameInicial {

	private JButton btnFuncionarios;
	private JButton btnTarefas;

	public FrameInicial() {
		criarTela();
	}

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setSize(350, 150);
		tela.setTitle("Gerenciador de Tarefas");
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);

		btnFuncionarios = new JButton("Funcionários");
		btnFuncionarios.setBounds(10, 25, 150, 40);
		btnFuncionarios.setFont(new Font("Candara",Font.BOLD,20));

		btnTarefas = new JButton("Tarefas");
		btnTarefas.setBounds(170, 25, 150, 40);
		btnTarefas.setFont(new Font("Candara",Font.BOLD,18));
		;

		Container painel = tela.getContentPane();
		painel.add(btnFuncionarios);
		painel.add(btnTarefas);

		btnFuncionarios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameFuncionarioList(tela);

			}
		});

		btnTarefas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameTarefaList(tela);

			}
		});

	}

}
//terminei