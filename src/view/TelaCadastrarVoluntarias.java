package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import model.DadosLoginSenha;
import model.Disponibilidade;
import model.Usuario;
import model.Voluntaria;
import servicos.UsuariosDados;

import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class TelaCadastrarVoluntarias extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpfCnpj;
	private JTextField textEmail;
	private JPasswordField textSenha;
	private JCheckBox chckbxManha;
	private JCheckBox chckbxTarde;
	private JCheckBox chckbxNoite;
	private Voluntaria voluntaria;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
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
		setBounds(100, 100, 461, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Volunt\u00E1ria ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 23, 424, 14);
		contentPane.add(lblNewLabel);
		
		JLabel nome = new JLabel("Nome:");
		nome.setFont(new Font("Tahoma", Font.BOLD, 11));
		nome.setBounds(10, 63, 60, 14);
		contentPane.add(nome);
		
		textNome = new JTextField();
		textNome.setBounds(10, 78, 424, 25);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel Cpf = new JLabel("CPF/CNPJ:");
		Cpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		Cpf.setBounds(10, 109, 119, 14);
		contentPane.add(Cpf);
		
		textCpfCnpj = new JTextField();
		textCpfCnpj.setBounds(10, 122, 424, 25);
		contentPane.add(textCpfCnpj);
		textCpfCnpj.setColumns(10);
		
		JLabel Telefone = new JLabel("Email:");
		Telefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		Telefone.setBounds(10, 151, 70, 14);
		contentPane.add(Telefone);
		
		textEmail = new JTextField();
		textEmail.setBounds(10, 163, 424, 25);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(345, 384, 89, 23);
		contentPane.add(btnEnviar);
		btnEnviar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String nome = textNome.getText();
			String cpfCnpj = textCpfCnpj.getText();
			String email = textEmail.getText();
			String senha = new String(textSenha.getPassword());
			
			
			Disponibilidade disponibilidade = new Disponibilidade();
			
			disponibilidade.setManha(chckbxManha.isSelected());
			disponibilidade.setTarde(chckbxTarde.isSelected());
			disponibilidade.setNoite(chckbxNoite.isSelected());
			
			UsuariosDados usuarioDados = new UsuariosDados();
			
			if (voluntaria == null) {
			
			if (usuarioDados.buscaPorEmail(email) != null) {
				JOptionPane.showMessageDialog(null, "Email já em uso!");
				return;
			}
			Voluntaria voluntaria = new Voluntaria(nome, email, senha, cpfCnpj, disponibilidade);
			usuarioDados.cadastraUsuario(voluntaria);
			JOptionPane.showMessageDialog(null, "Voluntária cadastrada com sucesso!");
			
			
			textNome.setText("");
			textCpfCnpj.setText("");
			textEmail.setText("");
			textSenha.setText("");
			chckbxManha.setSelected(false);
			chckbxTarde.setSelected(false);
			chckbxNoite.setSelected(false);
			} else {
				voluntaria.setNome(nome);
				voluntaria.setCpfCnpj(cpfCnpj);
				voluntaria.setEmail(email);
				voluntaria.setSenha(senha);
				voluntaria.setDisponibilidade(disponibilidade);
				JOptionPane.showMessageDialog(null, "Voluntária editada com sucesso!");
				
				
			}
		}
		});
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVoluntario telaVoluntario = new TelaVoluntario();
				telaVoluntario.setVisible(true);
				setVisible(false);				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(240, 384, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(10, 199, 48, 14);
		contentPane.add(lblSenha);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(10, 211, 424, 25);
		contentPane.add(textSenha);
		
		chckbxManha = new JCheckBox("Manh\u00E3");
		chckbxManha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxManha.setBounds(10, 274, 70, 23);
		contentPane.add(chckbxManha);
		
		JLabel lblDisponibilidade = new JLabel("Disponibilidade:");
		lblDisponibilidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDisponibilidade.setBounds(10, 253, 119, 14);
		contentPane.add(lblDisponibilidade);
		
		chckbxTarde = new JCheckBox("Tarde");
		chckbxTarde.setBounds(82, 274, 60, 23);
		contentPane.add(chckbxTarde);
		
		chckbxNoite = new JCheckBox("Noite");
		chckbxNoite.setBounds(144, 274, 97, 23);
		contentPane.add(chckbxNoite);
	}
	
	
	public TelaCadastrarVoluntarias(Voluntaria voluntario) {
		this();
		this.voluntaria = voluntario;
		textNome.setText(voluntario.getNome());
		textCpfCnpj.setText(voluntario.getCpfCnpj());
		textEmail.setText(voluntario.getEmail());
		textSenha.setText(voluntario.getSenha());
		
	
	}
}