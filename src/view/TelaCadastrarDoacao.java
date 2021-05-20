package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Doacao;
import model.Doador;

import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarDoacao extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField nomeDoacao;
	private JTextField cpfCnpj;
	private JTextField valor;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarDoacao frame = new TelaCadastrarDoacao();
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
	public TelaCadastrarDoacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(205, 11, 1, 1);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Doa\u00E7\u00E3o\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(179, 11, 62, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do doador(a):");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 62, 127, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF/CNPJ:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 112, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Valor:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 157, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		nomeDoacao = new JTextField();
		nomeDoacao.setBounds(10, 76, 414, 20);
		contentPane.add(nomeDoacao);
		nomeDoacao.setColumns(10);
		nomeDoacao.setText("");
				
		cpfCnpj = new JTextField();
		cpfCnpj.setBounds(10, 126, 414, 20);
		contentPane.add(cpfCnpj);
		cpfCnpj.setColumns(10);
		cpfCnpj.setText("");
		
		valor = new JTextField();
		valor.setBounds(10, 173, 414, 20);
		contentPane.add(valor);
		valor.setColumns(10);
		valor.setText("0.0");
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = nomeDoacao.getText();
				String identificador = cpfCnpj.getText();				
				double vl = Double.parseDouble(valor.getText());
				
				
				Doacao quantia = new Doacao(vl);
				
				Doador doador = new Doador(nome, identificador, quantia);
				
				
				if(nome.equals("") || identificador.equals("") || vl == 0.0) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");					
				}else {
					Doador.doadores.add(doador);
					TelaDoacao telaDoacao = new TelaDoacao();
					telaDoacao.setVisible(true);
					setVisible(false);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(179, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDoacao telaDoacao = new TelaDoacao();
				telaDoacao.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setBounds(179, 261, 89, 23);
		contentPane.add(btnVoltar);
	}
}
