package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DoacaoTableModel;
import model.VoluntarioTableModel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaDoacao extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					TelaDoacao frame = new TelaDoacao();
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
	public TelaDoacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoao = new JLabel("Doa\u00E7\u00E3o:");
		lblDoao.setBounds(10, 11, 414, 29);
		lblDoao.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoao.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblDoao);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(335, 272, 89, 29);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFuncionario telaFuncionario = new TelaFuncionario();
				telaFuncionario.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnVoltar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 414, 161);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		DoacaoTableModel tabela = new DoacaoTableModel();
		table.setModel(tabela);
		
		JButton btnAceitarDoao = new JButton("Remover ");
		btnAceitarDoao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					tabela.removeDoacao(table.getSelectedRow());
				}
			}
			
		});
		btnAceitarDoao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAceitarDoao.setBounds(10, 66, 119, 23);
		contentPane.add(btnAceitarDoao);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarDoacao telaCadastrarDoacao = new TelaCadastrarDoacao();
				telaCadastrarDoacao.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(139, 66, 110, 23);
		contentPane.add(btnNewButton);
	}
}
