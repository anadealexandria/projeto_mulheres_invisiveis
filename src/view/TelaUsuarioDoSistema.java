package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class TelaUsuarioDoSistema extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaUsuarioDoSistema frame = new TelaUsuarioDoSistema();
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
	public TelaUsuarioDoSistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaUmaAo = new JLabel("Escolha uma a\u00E7\u00E3o:");
		lblEscolhaUmaAo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaUmaAo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEscolhaUmaAo.setBounds(156, 26, 135, 14);
		contentPane.add(lblEscolhaUmaAo);
		
		JButton btnDoao = new JButton("Doa\u00E7\u00E3o");
		btnDoao.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDoao.setBounds(99, 76, 100, 23);
		contentPane.add(btnDoao);
		
		JButton btnVoluntrias = new JButton("Volunt\u00E1rias");
		btnVoluntrias.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoluntrias.setBounds(235, 128, 110, 23);
		contentPane.add(btnVoluntrias);
		
		JButton btnEventos = new JButton("Eventos");
		btnEventos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEventos.setBounds(235, 76, 110, 23);
		contentPane.add(btnEventos);
		
		JButton btnFinanceiro = new JButton("Financeiro");
		btnFinanceiro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFinanceiro.setBounds(99, 128, 100, 23);
		contentPane.add(btnFinanceiro);
	}

}
