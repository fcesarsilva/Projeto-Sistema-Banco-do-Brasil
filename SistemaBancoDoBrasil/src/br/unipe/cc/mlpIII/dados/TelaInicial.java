package br.unipe.cc.mlpIII.dados;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TelaInicial extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setBounds(100, 100, 538, 410);
		
		JPanel PainelDeBotoes = new JPanel();
		
		JPanel PainelDeRegistros = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(PainelDeRegistros, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
						.addComponent(PainelDeBotoes, GroupLayout.PREFERRED_SIZE, 522, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(PainelDeBotoes, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(PainelDeRegistros, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Ag\u00EAncia", "Conta - DV", "Saldo", "Limite"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNomeDoTitular = new JLabel("Nome do Titular");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblAgncia = new JLabel("Ag\u00EAncia");
		
		JLabel lblConta = new JLabel("Conta - DV");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblDv = new JLabel("-");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblSaldo = new JLabel("Saldo");
		
		JLabel lblLimite = new JLabel("Limite");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GroupLayout gl_PainelDeRegistros = new GroupLayout(PainelDeRegistros);
		gl_PainelDeRegistros.setHorizontalGroup(
			gl_PainelDeRegistros.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelDeRegistros.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNomeDoTitular)
						.addComponent(lblAgncia)
						.addComponent(lblConta))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
						.addGroup(gl_PainelDeRegistros.createSequentialGroup()
							.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PainelDeRegistros.createSequentialGroup()
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDv)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
							.addGap(43)
							.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSaldo)
								.addComponent(lblLimite))
							.addGap(3)
							.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_PainelDeRegistros.setVerticalGroup(
			gl_PainelDeRegistros.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelDeRegistros.createSequentialGroup()
					.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeDoTitular)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelDeRegistros.createSequentialGroup()
							.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAgncia)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConta)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDv)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PainelDeRegistros.createSequentialGroup()
							.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSaldo)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PainelDeRegistros.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLimite)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		PainelDeRegistros.setLayout(gl_PainelDeRegistros);
		
		JButton btnNovo = new JButton("Novo");
		
		JButton btnAlterar = new JButton("Salvar");
		
		JButton btnNewButton = new JButton("Alterar");
		
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnGerarTabela = new JButton("Gerar Tabela");
		GroupLayout gl_PainelDeBotoes = new GroupLayout(PainelDeBotoes);
		gl_PainelDeBotoes.setHorizontalGroup(
			gl_PainelDeBotoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelDeBotoes.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNovo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAlterar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExcluir)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnGerarTabela)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_PainelDeBotoes.setVerticalGroup(
			gl_PainelDeBotoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelDeBotoes.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PainelDeBotoes.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNovo)
						.addComponent(btnAlterar)
						.addComponent(btnNewButton)
						.addComponent(btnExcluir)
						.addComponent(btnGerarTabela))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_PainelDeBotoes.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnNovo, btnAlterar, btnNewButton, btnExcluir, btnGerarTabela});
		PainelDeBotoes.setLayout(gl_PainelDeBotoes);
		getContentPane().setLayout(groupLayout);

	}
}