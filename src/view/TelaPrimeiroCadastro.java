package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DadosLoginSenha;
import servicos.UsuariosDados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaPrimeiroCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textSenha;
	
	private UsuariosDados usuariosDados;

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
		usuariosDados = new UsuariosDados();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrimeiroCadastro = new JLabel("Mulheres Invisíveis");
		lblPrimeiroCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimeiroCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrimeiroCadastro.setBounds(153, 11, 143, 14);
		contentPane.add(lblPrimeiroCadastro);
		
		JLabel lblLogin = new JLabel("Email: ");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLogin.setBounds(10, 89, 46, 14);
		contentPane.add(lblLogin);
		
		textLogin = new JTextField();
		textLogin.setBounds(10, 105, 414, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		textLogin.setText("");
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(10, 147, 46, 14);
		contentPane.add(lblSenha);
		
		textSenha = new JTextField();
		textSenha.setBounds(10, 165, 414, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		textSenha.setText("");
		
		JButton btnEnviar = new JButton("Entrar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String email = textLogin.getText().toUpperCase();
				String senha = textSenha.getText().toUpperCase();
				
				if (email.equals("") || senha.equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					return;
				}			
					 
				if (usuariosDados.validaLogin(email, senha)) {
					TelaPrincipalSistema principal = new TelaPrincipalSistema();
					principal.setVisible(true);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválida!");
				}
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(335, 227, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel lblLogin_1 = new JLabel("Login");
		lblLogin_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLogin_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLogin_1.setBounds(194, 53, 48, 14);
		contentPane.add(lblLogin_1);
	}
}
