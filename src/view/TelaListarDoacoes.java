package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Doador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaListarDoacoes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListarDoacoes frame = new TelaListarDoacoes();
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
	public TelaListarDoacoes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListarDoadores = new JLabel("Listar Doa\u00E7\u00F5es:");
		lblListarDoadores.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListarDoadores.setBounds(172, 26, 110, 14);
		contentPane.add(lblListarDoadores);
		
		Panel panel = new Panel();
		panel.setBounds(10, 46, 414, 151);
		contentPane.add(panel);
		
		TextArea textArea = new TextArea();
		panel.add(textArea);
		
		textArea.setText(Doador.doadores.toString());
		
		Button button = new Button("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDoacao telaDoacao = new TelaDoacao();
				telaDoacao.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBounds(172, 228, 70, 22);
		contentPane.add(button);
	}
}
