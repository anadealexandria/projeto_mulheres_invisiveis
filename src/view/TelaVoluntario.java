package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import model.VoluntarioTableModel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TelaVoluntario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					TelaVoluntario frame = new TelaVoluntario();
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
	public TelaVoluntario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoluntrias = new JLabel("Volunt\u00E1rios");
		lblVoluntrias.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoluntrias.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVoluntrias.setBounds(10, 25, 450, 25);
		contentPane.add(lblVoluntrias);
		
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFuncionario telaFuncionario = new TelaFuncionario();
				telaFuncionario.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(272, 294, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarVoluntarias telaCadastrarVoluntarias = new TelaCadastrarVoluntarias();
				telaCadastrarVoluntarias.setVisible(true);
				setVisible(false);
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrar.setBounds(371, 295, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEditar.setBounds(272, 93, 89, 23);
		contentPane.add(btnEditar);
		
		
		table_1 = new JTable();
		table_1.setBounds(197, 318, 1, 1);
		contentPane.add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 127, 452, 152);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		VoluntarioTableModel tabela = new VoluntarioTableModel();
		table.setModel(tabela);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() != -1) {
					tabela.removeVoluntario(table.getSelectedRow());
				}
			}
		});
		btnRemover.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemover.setBounds(371, 93, 89, 23);
		contentPane.add(btnRemover);
		
	}
}
