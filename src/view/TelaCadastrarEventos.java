package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaCadastrarEventos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		setBounds(100, 100, 518, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarEvento = new JLabel("Cadastrar Evento:");
		lblCadastrarEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCadastrarEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarEvento.setBounds(161, 26, 191, 14);
		contentPane.add(lblCadastrarEvento);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 83, 46, 14);
		contentPane.add(lblNome);
		
		JLabel label = new JLabel("");
		label.setBounds(37, 156, 46, 14);
		contentPane.add(label);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblData.setBounds(10, 131, 46, 14);
		contentPane.add(lblData);
		
		JLabel lblGrupoResponsvel = new JLabel("Grupo Respons\u00E1vel:");
		lblGrupoResponsvel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrupoResponsvel.setBounds(10, 188, 147, 14);
		contentPane.add(lblGrupoResponsvel);
		
		JLabel lblObjetivo = new JLabel("Objetivo:");
		lblObjetivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObjetivo.setBounds(10, 245, 106, 14);
		contentPane.add(lblObjetivo);
		
		JLabel lblCusto = new JLabel("Custo:");
		lblCusto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCusto.setBounds(10, 306, 46, 14);
		contentPane.add(lblCusto);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(186, 364, 89, 23);
		contentPane.add(btnEnviar);
		
		textField = new JTextField();
		textField.setBounds(10, 97, 482, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 145, 482, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 202, 482, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 262, 482, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 320, 482, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
