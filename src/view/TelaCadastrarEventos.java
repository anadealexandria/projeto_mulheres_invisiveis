package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastrarEventos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarEventos frame = new TelaCadastrarEventos();
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
	public TelaCadastrarEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarEvento = new JLabel("Cadastrar Evento:");
		lblCadastrarEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCadastrarEvento.setBounds(127, 24, 180, 14);
		contentPane.add(lblCadastrarEvento);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 64, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(10, 76, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblData.setBounds(10, 107, 46, 14);
		contentPane.add(lblData);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 121, 414, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblObjetivo = new JLabel("Objetivo:");
		lblObjetivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObjetivo.setBounds(10, 152, 84, 14);
		contentPane.add(lblObjetivo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 165, 414, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCusto = new JLabel("Custo:");
		lblCusto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCusto.setBounds(10, 196, 46, 14);
		contentPane.add(lblCusto);
		
		textField_3 = new JTextField();
		textField_3.setBounds(8, 209, 416, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(173, 259, 89, 23);
		contentPane.add(btnEnviar);
	}
}
