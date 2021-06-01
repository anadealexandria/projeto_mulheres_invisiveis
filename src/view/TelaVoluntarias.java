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
		
		JButton btnDoacao = new JButton("Funcion\u00E1rios");
		btnDoacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDoacao telaDoacao = new TelaDoacao();
				telaDoacao.setVisible(true);
				setVisible(false);
			}
		});
		btnDoacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDoacao.setBounds(157, 70, 134, 23);
		contentPane.add(btnDoacao);
		
		JButton btnVoluntrios = new JButton("Volunt\u00E1rios");
		btnVoluntrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFuncionario telaVoluntarias = new TelaFuncionario();
				telaVoluntarias.setVisible(true);
				setVisible(false);
			}
		});
		btnVoluntrios.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoluntrios.setBounds(157, 104, 134, 23);
		contentPane.add(btnVoluntrios);
		
		JButton btnEventos = new JButton("Eventos");
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEventos telaEventos = new TelaEventos();
				telaEventos.setVisible(true);
				setVisible(false);
			}
		});
		btnEventos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEventos.setBounds(157, 138, 134, 23);
		contentPane.add(btnEventos);
		
		JButton btnFinanceiro = new JButton("Financeiro");
		btnFinanceiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFinanceiro telaFinanceiro = new TelaFinanceiro();
				telaFinanceiro.setVisible(true);
				setVisible(false);
			}
		});
		btnFinanceiro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFinanceiro.setBounds(157, 172, 134, 23);
		contentPane.add(btnFinanceiro);
	}

}
