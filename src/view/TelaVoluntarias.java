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

public class TelaVoluntarias extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		setBounds(100, 100, 452, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Volunt\u00E1rias:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(180, 26, 67, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar volunt\u00E1rias");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarVoluntarias telaCadastrarVoluntarias = new TelaCadastrarVoluntarias();
				telaCadastrarVoluntarias.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(138, 81, 158, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Listas volunt\u00E1rias");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListarVoluntarias telaListarVoluntarias = new TelaListarVoluntarias();
				telaListarVoluntarias.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(138, 126, 158, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEscolherAcao telaEscolherAcao = new TelaEscolherAcao();
				telaEscolherAcao.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(175, 167, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
