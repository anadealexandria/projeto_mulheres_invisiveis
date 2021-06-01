package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Receita;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Panel;
import java.awt.TextArea;

public class TelaFinanceiro extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private Panel panel;
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFinanceiro frame = new TelaFinanceiro();
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
	public TelaFinanceiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeEventos = new JLabel("Financeiro:");
		lblListaDeEventos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeEventos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListaDeEventos.setBounds(106, 23, 194, 14);
		contentPane.add(lblListaDeEventos);
		
		btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVoluntarias telaEscolherAcao = new TelaVoluntarias();
				telaEscolherAcao.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(165, 241, 89, 23);
		contentPane.add(btnNewButton);
		
		Panel panel = new Panel();
		panel.setBounds(10, 43, 388, 179);
		contentPane.add(panel);
		
		TextArea textArea = new TextArea();
		panel.add(textArea);
		
		
		
		textArea.setText(Receita.receitaTotal.receitaTotal().toString());
	}
}
