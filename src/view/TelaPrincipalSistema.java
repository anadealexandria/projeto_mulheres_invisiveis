package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.DadosLoginSenha;

import javax.swing.JPasswordField;

public class TelaPrincipalSistema extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private static TelaPrincipalSistema telaPrincipal;
	private JPasswordField passwordSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalSistema frame = new TelaPrincipalSistema();
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
	public TelaPrincipalSistema() {
		telaPrincipal = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(75, 30, -66, 22);
		contentPane.add(textArea);
		
		JLabel lblBemvindasMulheres = new JLabel("Bem-vinda \u00E0  Mulheres Invis\u00EDveis!");
		lblBemvindasMulheres.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemvindasMulheres.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBemvindasMulheres.setBounds(0, 0, 424, 37);
		contentPane.add(lblBemvindasMulheres);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setBounds(10, 72, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenhta = new JLabel("Senha:");
		lblSenhta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenhta.setBounds(10, 122, 46, 14);
		contentPane.add(lblSenhta);
		
		JButton btnCadastrarVoluntriaResponsvel = new JButton("Primeiro Cadastro");		
		btnCadastrarVoluntriaResponsvel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrarVoluntriaResponsvel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrimeiroCadastro cadastro = new TelaPrimeiroCadastro();
				cadastro.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCadastrarVoluntriaResponsvel.setBounds(141, 227, 145, 23);
		contentPane.add(btnCadastrarVoluntriaResponsvel);
		
		textLogin = new JTextField();
		textLogin.setBounds(11, 91, 413, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(10, 144, 414, 20);
		contentPane.add(passwordSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(168, 193, 89, 23);
		contentPane.add(btnEntrar);		
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = textLogin.getText();
				String senha = new String(passwordSenha.getPassword());	
				
				if(login.equals(DadosLoginSenha.acesso[0]) && senha.equals(DadosLoginSenha.acesso[1])) {
						TelaEscolherAcao telaAcao = new TelaEscolherAcao();
						telaAcao.setVisible(true);
						setVisible(false);
				}else {		
					textLogin.setText("");
					passwordSenha.setText("");
					JOptionPane.showMessageDialog(null, "Usuário não cadastrado ou Inválido!");
				
				}
			}	
		});
	}
}


