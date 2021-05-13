package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Evento;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.TextArea;

public class TelaListarEventos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListarEventos frame = new TelaListarEventos();
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
	public TelaListarEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeEventos = new JLabel("Lista de Eventos:");
		lblListaDeEventos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListaDeEventos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeEventos.setBounds(102, 28, 224, 14);
		contentPane.add(lblListaDeEventos);
		
		Panel panel = new Panel();
		panel.setBounds(10, 48, 414, 203);
		contentPane.add(panel);
		
		TextArea textArea = new TextArea();
		panel.add(textArea);
		for(Evento evento: TelaCadastrarEventos.eventos) {
			textArea.setText(evento.toString());
		}
		
		
	}
}
