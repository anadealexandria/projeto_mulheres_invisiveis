package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DadosLoginSenha;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrimeiroCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrimeiroCadastro frame = new TelaPrimeiroCadastro();
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
	public TelaPrimeiroCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrimeiroCadastro = new JLabel("Primeiro Cadastro:");
		lblPrimeiroCadastro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrimeiroCadastro.setBounds(159, 29, 118, 14);
		contentPane.add(lblPrimeiroCadastro);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLogin.setBounds(10, 77, 46, 14);
		contentPane.add(lblLogin);
		
		textLogin = new JTextField();
		textLogin.setBounds(10, 93, 414, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(10, 135, 46, 14);
		contentPane.add(lblSenha);
		
		textSenha = new JTextField();
		textSenha.setBounds(10, 153, 414, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  login = textLogin.getText();
				String senha = textSenha.getText();
				
				DadosLoginSenha.acesso[0] = login;
				DadosLoginSenha.acesso[1] = senha;
				
				TelaPrincipalSistema principal = new TelaPrincipalSistema();
				principal.setVisible(true);
				setVisible(false);
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(159, 205, 89, 23);
		contentPane.add(btnEnviar);
	}
}
