package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVoluntarias extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					TelaVoluntarias frame = new TelaVoluntarias();
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
	public TelaVoluntarias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolherUmaAo = new JLabel("Volunt\u00E1rio Logado:");
		lblEscolherUmaAo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolherUmaAo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEscolherUmaAo.setBounds(10, 30, 408, 29);
		contentPane.add(lblEscolherUmaAo);
		
		JButton btnDoacao = new JButton("Buscar evento");
		btnDoacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaBuscarEvento telaBuscarEvento = new TelaBuscarEvento();
				telaBuscarEvento.setVisible(true);
				setVisible(false);
			}
		});
		btnDoacao.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDoacao.setBounds(157, 84, 134, 25);
		contentPane.add(btnDoacao);
		
		JButton btnVoluntrios = new JButton("Doar");
		btnVoluntrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarDoacao telaCadastrarDoacao = new TelaCadastrarDoacao();
				telaCadastrarDoacao.setVisible(true);
				setVisible(false);
			}
		});
		btnVoluntrios.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoluntrios.setBounds(157, 120, 134, 25);
		contentPane.add(btnVoluntrios);
		
		JButton btnEventos = new JButton("Sair");
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEventos telaEventos = new TelaEventos();
				telaEventos.setVisible(true);
				setVisible(false);
			}
		});
		btnEventos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEventos.setBounds(334, 174, 84, 25);
		contentPane.add(btnEventos);
	}

}
