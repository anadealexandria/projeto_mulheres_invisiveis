package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.DadosLoginSenha;
import model.Voluntaria;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarVoluntarias extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarVoluntarias frame = new TelaCadastrarVoluntarias();
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
	public TelaCadastrarVoluntarias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Volunt\u00E1ria Respons\u00E1vel");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(60, 23, 282, 14);
		contentPane.add(lblNewLabel);
		
		JLabel nome = new JLabel("Nome:");
		nome.setFont(new Font("Tahoma", Font.BOLD, 11));
		nome.setBounds(10, 63, 60, 14);
		contentPane.add(nome);
		
		textNome = new JTextField();
		textNome.setBounds(10, 78, 424, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel Cpf = new JLabel("CPF:");
		Cpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		Cpf.setBounds(10, 109, 46, 14);
		contentPane.add(Cpf);
		
		textCpf = new JTextField();
		textCpf.setBounds(10, 122, 424, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel Telefone = new JLabel("Telefone:");
		Telefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		Telefone.setBounds(10, 151, 70, 14);
		contentPane.add(Telefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(10, 163, 424, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(169, 217, 89, 23);
		contentPane.add(btnEnviar);
		btnEnviar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String nome = textNome.getText();
			String cpf = textCpf.getText();
			String telefone = textTelefone.getText();
			
			
			Voluntaria voluntaria = new Voluntaria(nome, cpf, telefone);
			Voluntaria.voluntarias.add(voluntaria);
			textNome.setText("");
			textCpf.setText("");
			textTelefone.setText("");
			
		}
		});
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVoluntarias telaVoluntarias = new TelaVoluntarias();
				telaVoluntarias.setVisible(true);
				setVisible(false);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(169, 251, 89, 23);
		contentPane.add(btnNewButton);
	}
}