package br.dev.paulo.tarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.dev.paulo.tarefas.dao.FuncionarioDAO;
import br.dev.paulo.tarefas.model.Funcionario;

public class FrameFuncionarioList {

	private JLabel labelTitulo;
	private JButton btnCadastro;
	private JTable tabelaFuncionarios;
	private JScrollPane scrollFuncionarios;
	private DefaultTableModel modelFuncionarios;
	private String[] colunas = { "CÓDIGO", "NOME", "CARGO" };
	private JButton btnSair;

	public FrameFuncionarioList(JFrame gerenciador) {
		criarTela(gerenciador);
	}

	
	private void criarTela(JFrame gerenciador) {
		JDialog tela = new JDialog(gerenciador, true);
		tela.setSize(500, 450);
		tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(gerenciador);
		tela.setTitle("Lista de funcionários");
		tela.setResizable(false);

		Container painel = tela.getContentPane();

		labelTitulo = new JLabel("Cadastro de funcionarios");
		labelTitulo.setFont(new Font("Candara", Font.BOLD, 27));
		labelTitulo.setBounds(90, 10, 300, 40);

		
		modelFuncionarios = new DefaultTableModel(colunas, 5) {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tabelaFuncionarios = new JTable(modelFuncionarios);

		tabelaFuncionarios.getTableHeader().setReorderingAllowed(false);
		scrollFuncionarios = new JScrollPane(tabelaFuncionarios);
		scrollFuncionarios.setBounds(10, 60, 460, 260);

		carregarDados();

		btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBounds(75, 350, 200, 40);

		btnCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new FrameFuncionario(tela);
				carregarDados();

			}
		});

		btnSair = new JButton("Sair");
		btnSair.setBounds(300, 350, 80, 40);

		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",
						JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					tela.dispose();

				}

			}
		});

		painel.add(labelTitulo);
		painel.add(scrollFuncionarios);
		painel.add(btnCadastro);
		painel.add(btnSair);

		tela.setVisible(true);

	}

	private void carregarDados() {
		FuncionarioDAO dao = new FuncionarioDAO();
		List<Funcionario> funcionarios = dao.listar();

		Object[][] dados = new Object[funcionarios.size()][3];

		int i = 0;
		for (Funcionario f : funcionarios) {
			dados[i][0] = f.getMatricula();
			dados[i][1] = f.getNome();
			dados[i][2] = f.getCargo();
			i++;
		}

		modelFuncionarios.setDataVector(dados, colunas);
	}

}
