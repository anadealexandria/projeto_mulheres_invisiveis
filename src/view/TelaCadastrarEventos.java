package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.Evento;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarEventos extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textData;
	private JTextField textObjetivo;
	private JTextField textCusto;
	private JTextField textNome1;
	private JTextField textNome2;
	private JTextField textNome3;

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
	public static List<Evento> eventos = new ArrayList<>();
	public TelaCadastrarEventos() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarEvento = new JLabel("Cadastrar Evento:");
		lblCadastrarEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCadastrarEvento.setBounds(127, 24, 180, 14);
		contentPane.add(lblCadastrarEvento);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setFont(new Font("Tahoma", Font.BOLD, 11));
		Nome.setBounds(10, 64, 46, 14);
		contentPane.add(Nome);
		
		textNome = new JTextField();
		textNome.setBounds(10, 76, 414, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel Data = new JLabel("Data:");
		Data.setFont(new Font("Tahoma", Font.BOLD, 11));
		Data.setBounds(10, 107, 46, 14);
		contentPane.add(Data);
		
		textData = new JTextField();
		textData.setBounds(10, 121, 414, 20);
		contentPane.add(textData);
		textData.setColumns(10);
		
		JLabel Objetivo = new JLabel("Objetivo:");
		Objetivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		Objetivo.setBounds(10, 152, 84, 14);
		contentPane.add(Objetivo);
		
		textObjetivo = new JTextField();
		textObjetivo.setBounds(10, 165, 414, 20);
		contentPane.add(textObjetivo);
		textObjetivo.setColumns(10);
		
		JLabel Custo = new JLabel("Custo:");
		Custo.setFont(new Font("Tahoma", Font.BOLD, 11));
		Custo.setBounds(10, 311, 46, 14);
		contentPane.add(Custo);
		
		textCusto = new JTextField();
		textCusto.setBounds(10, 326, 416, 20);
		contentPane.add(textCusto);
		textCusto.setColumns(10);
		
		JLabel GrupoResponsavel = new JLabel("Grupo respons\u00E1vel:");
		GrupoResponsavel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GrupoResponsavel.setBounds(10, 196, 139, 14);
		contentPane.add(GrupoResponsavel);
		
		textNome1 = new JTextField();
		textNome1.setBounds(66, 215, 358, 20);
		contentPane.add(textNome1);
		textNome1.setColumns(10);
		
		textNome2 = new JTextField();
		textNome2.setBounds(66, 246, 358, 20);
		contentPane.add(textNome2);
		textNome2.setColumns(10);
		
		textNome3 = new JTextField();
		textNome3.setBounds(66, 277, 358, 20);
		contentPane.add(textNome3);
		textNome3.setColumns(10);
		
		JLabel Nome1 = new JLabel("Nome 1:");
		Nome1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Nome1.setBounds(10, 218, 46, 14);
		contentPane.add(Nome1);
		
		JLabel Nome2 = new JLabel("Nome 2:");
		Nome2.setFont(new Font("Tahoma", Font.BOLD, 11));
		Nome2.setBounds(10, 249, 46, 14);
		contentPane.add(Nome2);
		
		JLabel Nome3 = new JLabel("Nome 3:");
		Nome3.setFont(new Font("Tahoma", Font.BOLD, 11));
		Nome3.setBounds(10, 280, 46, 14);
		contentPane.add(Nome3);
		
		JButton botaoEnviar = new JButton("Enviar");
		botaoEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		botaoEnviar.setBounds(190, 357, 89, 23);
		contentPane.add(botaoEnviar);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEventos telaEventos = new TelaEventos();
				telaEventos.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(190, 391, 89, 23);
		contentPane.add(btnNewButton);
		
		botaoEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				String nome = textNome.getText();
				String data = textData.getText();
				String objetivo = textObjetivo.getText();
				double custo = Double.parseDouble(textCusto.getText());
				
				Evento evento = new Evento(nome, data, objetivo, custo);
				eventos.add(evento);
				
			}
		});
	}
}
