package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import model.Evento;
import model.Voluntaria;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class TelaCadastrarEventos extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textData;
	private JTextField textObjetivo;
	private JTextField textCusto;
	private JTextField textResponsavel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
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
		setBounds(100, 100, 468, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarEvento = new JLabel("Cadastrar Evento:");
		lblCadastrarEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarEvento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastrarEvento.setBounds(127, 24, 180, 14);
		contentPane.add(lblCadastrarEvento);
		
		JLabel Nome = new JLabel("Nome do Evento:");
		Nome.setFont(new Font("Tahoma", Font.BOLD, 11));
		Nome.setBounds(10, 64, 95, 14);
		contentPane.add(Nome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		textNome.setBounds(10, 76, 432, 25);
		contentPane.add(textNome);
		textNome.setColumns(10);
		textNome.setText("");
		
		
		JLabel Data = new JLabel("Data:");
		Data.setFont(new Font("Tahoma", Font.BOLD, 11));
		Data.setBounds(10, 107, 46, 14);
		contentPane.add(Data);
		
		textData = new JTextField();
		textData.setFont(new Font("Tahoma", Font.BOLD, 11));
		textData.setBounds(10, 121, 432, 25);
		contentPane.add(textData);
		textData.setColumns(10);
		textData.setText("");
		
		JLabel Objetivo = new JLabel("Objetivo:");
		Objetivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		Objetivo.setBounds(10, 157, 84, 14);
		contentPane.add(Objetivo);
		
		textObjetivo = new JTextField();
		textObjetivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		textObjetivo.setBounds(10, 171, 432, 25);
		contentPane.add(textObjetivo);
		textObjetivo.setColumns(10);
		textObjetivo.setText("");
		
		JLabel Custo = new JLabel("Custo:");
		Custo.setFont(new Font("Tahoma", Font.BOLD, 11));
		Custo.setBounds(10, 246, 46, 14);
		contentPane.add(Custo);
		
		textCusto = new JTextField();
		textCusto.setFont(new Font("Tahoma", Font.BOLD, 11));
		textCusto.setBounds(10, 260, 432, 25);
		contentPane.add(textCusto);
		textCusto.setColumns(10);
		textCusto.setText("0.0");
	
		JButton botaoEnviar = new JButton("Enviar");
		botaoEnviar.setFont(new Font("Tahoma", Font.BOLD, 13));
		botaoEnviar.setBounds(190, 338, 89, 25);
		contentPane.add(botaoEnviar);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEventos telaEventos = new TelaEventos();
				telaEventos.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(190, 374, 89, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblResponsvel = new JLabel("Respons\u00E1vel:");
		lblResponsvel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResponsvel.setBounds(10, 202, 84, 14);
		contentPane.add(lblResponsvel);
		
		textResponsavel = new JTextField();
		textResponsavel.setFont(new Font("Tahoma", Font.BOLD, 11));
		textResponsavel.setBounds(10, 215, 432, 25);
		contentPane.add(textResponsavel);
		textResponsavel.setColumns(10);
		textResponsavel.setText("");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Manh\u00E3");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(10, 292, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tarde");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_1.setBounds(109, 292, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Noite");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_2.setBounds(210, 292, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		botaoEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {					
				String nome = textNome.getText();
				String data = textData.getText();
				String objetivo = textObjetivo.getText();
				String responsavel = textResponsavel.getText();
				double custo = Double.parseDouble(textCusto.getText());
			
				if(nome.equals("") || data.equals("") || objetivo.equals("") || responsavel.equals("") || custo == 0.0) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				}else {
				Voluntaria volResponsavel = new Voluntaria(responsavel);
				
				
				Evento evento = new Evento(nome, data, objetivo, volResponsavel, custo);
				Evento.eventos.add(evento);	
				TelaEventos telaEventos = new TelaEventos();
				telaEventos.setVisible(true);
				setVisible(false);
				textNome.setText("");
				textData.setText("");
				textObjetivo.setText("");
				textResponsavel.setText("");
				textCusto.setText("");
				}
				}catch(NumberFormatException x) {
					JOptionPane.showMessageDialog(null, "Use o ponto para a notação do valor!");
				}
				}
				
			
		});
		
	}
}
