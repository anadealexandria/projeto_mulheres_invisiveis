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
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import enums.PerfisEnum;
import model.Usuario;
import servicos.UsuariosDados;

public class TelaPrincipalSistema extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textLogin;
	private JPasswordField passwordSenha;
	
	private UsuariosDados usuariosDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
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
		usuariosDados = new UsuariosDados();
		
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
		lblBemvindasMulheres.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBemvindasMulheres.setBounds(0, 0, 424, 37);
		contentPane.add(lblBemvindasMulheres);
		
		JLabel lblLogin = new JLabel("Email:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setBounds(10, 72, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenhta = new JLabel("Senha:");
		lblSenhta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenhta.setBounds(10, 122, 46, 14);
		contentPane.add(lblSenhta);
		
		textLogin = new JTextField();
		textLogin.setBounds(11, 91, 413, 25);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(10, 144, 414, 25);
		contentPane.add(passwordSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(335, 227, 89, 23);
		contentPane.add(btnEntrar);		
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = textLogin.getText();
				String senha = new String(passwordSenha.getPassword());
				
				if (email.equals("") || senha.equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					return;
				}			
					 
				if (usuariosDados.validaLogin(email, senha)) {
					
					Usuario usuarioLogado = usuariosDados.buscaPorEmail(email);
					usuariosDados.setUsuarioLogado(usuarioLogado);
					
					PerfisEnum perfil = usuarioLogado.getPerfil();
					// Seleciona tela de acordo com o Perfil do Usuário
					switch (perfil) {
					case FUNCIONARIO:
						TelaPrincipalSistema principal = new TelaPrincipalSistema();
						principal.setVisible(true);
						break;
						
					case VOLUNTARIA:
						TelaPrincipalSistema principal2 = new TelaPrincipalSistema();
						principal2.setVisible(true);
						break;
						
					case GESTOR:
						TelaPrincipalSistema principal3 = new TelaPrincipalSistema();
						principal3.setVisible(true);
						break;	
					}
					
					setVisible(false);
					
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválida!");
				}
			}	
		});
	}
}


