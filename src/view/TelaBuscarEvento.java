package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Disponibilidade;
import model.Evento;
import model.EventoTableModel;
import model.Voluntaria;
import servicos.UsuariosDados;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class TelaBuscarEvento extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
    private	EventoTableModel eventoTurno = new EventoTableModel();
    private EventoTableModel eventoSelecao = new EventoTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					TelaBuscarEvento frame = new TelaBuscarEvento();
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
	public TelaBuscarEvento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar Evento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 26, 414, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Turno:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 77, 49, 25);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxManha = new JCheckBox("Manh\u00E3");
		chckbxManha.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxManha.setBounds(65, 78, 71, 25);
		contentPane.add(chckbxManha);
		
		JCheckBox chckbxTarde = new JCheckBox("Tarde");
		chckbxTarde.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxTarde.setBounds(138, 78, 59, 25);
		contentPane.add(chckbxTarde);
		
		JCheckBox chckbxNoite = new JCheckBox("Noite");
		chckbxNoite.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNoite.setBounds(205, 78, 97, 25);
		contentPane.add(chckbxNoite);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 113, 414, 103);
		contentPane.add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(eventoTurno);
		
		
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVoluntarias telaVoluntarias = new TelaVoluntarias();
				telaVoluntarias.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(335, 376, 89, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disponibilidade disponibilidade;
				
				disponibilidade = new Disponibilidade(chckbxManha.isSelected(), chckbxTarde.isSelected(), chckbxNoite.isSelected());
				List<Evento> eventosTurno = eventoTurno.getDadosEventos().buscarEvento(disponibilidade);
				eventoTurno.setEventosSelecionados(eventosTurno);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(335, 78, 89, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblEventosSelecionados = new JLabel("Eventos Selecionados:");
		lblEventosSelecionados.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEventosSelecionados.setBounds(10, 227, 206, 14);
		contentPane.add(lblEventosSelecionados);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 252, 414, 113);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		UsuariosDados usuarioDados = new UsuariosDados();
		Voluntaria voluntario = (Voluntaria) usuarioDados.getUsuarioLogado();
		eventoSelecao.carregarEventosVoluntaria(voluntario);
		table_1.setModel(eventoSelecao);
		
		JButton btnSelecionar = new JButton("Selecionar");
		btnSelecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Voluntaria voluntario = (Voluntaria) usuarioDados.getUsuarioLogado();
				if (table.getSelectedRow() != -1) {
					Evento eventoSelecionado = eventoTurno.getEventosSelecionados().get(table.getSelectedRow());
					eventoSelecao.addEventoSelecionado(eventoSelecionado);
					eventoSelecionado.getVoluntariaEventos().add(voluntario);
				}
			}
		});
		btnSelecionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSelecionar.setBounds(228, 377, 97, 23);
		contentPane.add(btnSelecionar);
		
	}
}
