package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaPrincipalSistema extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static TelaPrincipalSistema telaPrincipal;

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
		
		JLabel lblBemvindasMulheres = new JLabel("Bem-vinda \u00E0s  Mulheres Invis\u00EDveis!");
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
		
		JButton btnCadastrarVoluntriaResponsvel = new JButton("Cadastrar Volunt\u00E1ria Respons\u00E1vel");		
		btnCadastrarVoluntriaResponsvel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarVoluntarias cadastrarVoluntarias = new TelaCadastrarVoluntarias();
				cadastrarVoluntarias.setVisible(true);
			}
		});
		btnCadastrarVoluntriaResponsvel.setBounds(75, 227, 279, 23);
		contentPane.add(btnCadastrarVoluntriaResponsvel);
		
		textField = new JTextField();
		textField.setBounds(11, 91, 413, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(11, 141, 413, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEventos telaEventos = new TelaEventos();
				telaEventos.setVisible(true);
			}
		});
		btnEntrar.setBounds(168, 193, 89, 23);
		contentPane.add(btnEntrar);
	}
}
