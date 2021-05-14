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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarVoluntarias extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		setBounds(100, 100, 461, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Volunt\u00E1ria Respons\u00E1vel");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(60, 23, 282, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 63, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 78, 424, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(10, 109, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 122, 424, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(10, 151, 70, 14);
		contentPane.add(lblTelefone);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 163, 424, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLogin.setBounds(10, 194, 60, 14);
		contentPane.add(lblLogin);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 208, 424, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(10, 239, 46, 14);
		contentPane.add(lblSenha);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 253, 424, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaPrincipalSistema telaPrincipal = new TelaPrincipalSistema();
				telaPrincipal.setVisible(true);
				setVisible(false);
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(169, 284, 89, 23);
		contentPane.add(btnEnviar);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVoluntarias telaVoluntarias = new TelaVoluntarias();
				telaVoluntarias.setVisible(true);
				setVisible(false);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(169, 318, 89, 23);
		contentPane.add(btnNewButton);
	}
}