package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import model.Disponibilidade;
import model.Funcionaria;
import model.Voluntaria;
import servicos.UsuariosDados;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarFuncionaria extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textSenha;
	private JTextField textCpf;
	private JTextField textMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					TelaCadastrarFuncionaria frame = new TelaCadastrarFuncionaria();
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
	public TelaCadastrarFuncionaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Funcion\u00E1ria");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 414, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 59, 46, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 114, 46, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Senha:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 169, 46, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CPF:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 223, 66, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Matr\u00EDcula:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 281, 112, 25);
		contentPane.add(lblNewLabel_5);
		
		textNome = new JTextField();
		textNome.setBounds(10, 78, 414, 25);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(10, 133, 414, 25);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(10, 187, 414, 25);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setBounds(10, 245, 414, 25);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(10, 299, 414, 25);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String cpf = textCpf.getText();
				String email = textEmail.getText();
				String senha = textSenha.getText();
				String matricula = textMatricula.getText();
				
				
				Funcionaria funcionaria= null;
				UsuariosDados usuarioDados = new UsuariosDados();
				
				if (funcionaria == null) {
				
				if (usuarioDados.buscaPorEmail(email) != null) {
					JOptionPane.showMessageDialog(null, "Email já em uso!");
					return;
				}
				
				funcionaria = new Funcionaria(nome,email, senha, cpf, matricula);
				usuarioDados.cadastraUsuario(funcionaria);
				JOptionPane.showMessageDialog(null, "Funcionária cadastrada com sucesso!");
				
				TelaFuncionario telaFuncionario = new TelaFuncionario();
				telaFuncionario.setVisible(true);
				setVisible(false);
				
				
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(335, 347, 89, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGestora telaGestora = new TelaGestora();
				telaGestora.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(233, 347, 89, 25);
		contentPane.add(btnNewButton_1);
	}
}
