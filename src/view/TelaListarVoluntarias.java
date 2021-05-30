package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Voluntaria;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.Panel;
import java.awt.TextArea;

public class TelaListarVoluntarias extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListarVoluntarias frame = new TelaListarVoluntarias();
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
	public TelaListarVoluntarias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeVoluntrias = new JLabel("Lista de Volunt\u00E1rias:");
		lblListaDeVoluntrias.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeVoluntrias.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListaDeVoluntrias.setBounds(106, 23, 203, 14);
		contentPane.add(lblListaDeVoluntrias);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFuncionario telaVoluntarias = new TelaFuncionario();
				telaVoluntarias.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(170, 213, 89, 23);
		contentPane.add(btnNewButton);
		
		Panel panel = new Panel();
		panel.setBounds(10, 43, 414, 164);
		contentPane.add(panel);
		
		TextArea textArea = new TextArea();
		panel.add(textArea);
		for (int i = 0 ; i < Voluntaria.voluntarias.size() ; i++) {
			textArea.setText(Voluntaria.voluntarias.toString());
		}
	}
}
