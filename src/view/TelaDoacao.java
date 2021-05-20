package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDoacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDoacao frame = new TelaDoacao();
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
	public TelaDoacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoao = new JLabel("Doa\u00E7\u00E3o:");
		lblDoao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDoao.setBounds(190, 26, 46, 14);
		contentPane.add(lblDoao);
		
		JButton btnCadastrarDoao = new JButton("Cadastrar Doa\u00E7\u00E3o");
		btnCadastrarDoao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarDoacao telaCadastrar = new TelaCadastrarDoacao();
				telaCadastrar.setVisible(true);
				setVisible(false);
			}
		});
		btnCadastrarDoao.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrarDoao.setBounds(150, 75, 137, 23);
		contentPane.add(btnCadastrarDoao);
		
		JButton btnListarDoao = new JButton("Listar Doa\u00E7\u00E3o");
		btnListarDoao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListarDoacoes telaListar = new TelaListarDoacoes();
				telaListar.setVisible(true);
				setVisible(false);
			}
		});
		btnListarDoao.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListarDoao.setBounds(150, 123, 137, 23);
		contentPane.add(btnListarDoao);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEscolherAcao telaEscolher = new TelaEscolherAcao();
				telaEscolher.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBounds(176, 182, 89, 23);
		contentPane.add(btnVoltar);
	}
}
