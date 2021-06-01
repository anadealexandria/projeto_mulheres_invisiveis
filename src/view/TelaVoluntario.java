package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import model.Voluntaria;
import model.VoluntariasUtil;
import model.VoluntarioTableModel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaVoluntario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textArquivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					TelaVoluntario frame = new TelaVoluntario();
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
	public TelaVoluntario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoluntrias = new JLabel("Volunt\u00E1rios");
		lblVoluntrias.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoluntrias.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVoluntrias.setBounds(10, 25, 450, 25);
		contentPane.add(lblVoluntrias);
		
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFuncionario telaFuncionario = new TelaFuncionario();
				telaFuncionario.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(272, 395, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarVoluntarias telaCadastrarVoluntarias = new TelaCadastrarVoluntarias();
				telaCadastrarVoluntarias.setVisible(true);
				setVisible(false);
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrar.setBounds(371, 396, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnEditar = new JButton("Editar");
		VoluntarioTableModel voluntarioTable = new VoluntarioTableModel();
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() != -1) {
					Voluntaria voluntario = voluntarioTable.selecionaVoluntario(table.getSelectedRow());
					TelaCadastrarVoluntarias telaCadastraVoluntaria = new TelaCadastrarVoluntarias(voluntario);
					telaCadastraVoluntaria.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEditar.setBounds(272, 125, 89, 23);
		contentPane.add(btnEditar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 159, 452, 212);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		VoluntarioTableModel tabela = new VoluntarioTableModel();
		table.setModel(tabela);
		
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() != -1) {
					tabela.removeVoluntario(table.getSelectedRow());
				}
			}
		});
		btnRemover.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemover.setBounds(371, 125, 89, 23);
		contentPane.add(btnRemover);
		
		JLabel lblArquivo = new JLabel("Arquivo:");
		lblArquivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArquivo.setBounds(10, 78, 59, 14);
		contentPane.add(lblArquivo);
		
		textArquivo = new JTextField();
		textArquivo.setBounds(61, 73, 300, 25);
		contentPane.add(textArquivo);
		textArquivo.setColumns(10);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				JFileChooser telaArquivo = new JFileChooser();
				telaArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
				telaArquivo.showOpenDialog(telaArquivo);
				File arquivo = telaArquivo.getSelectedFile();
				//VoluntarioTableModel listagem = new VoluntarioTableModel();
				
				textArquivo.setText(arquivo.getPath());
				List<Voluntaria> listaDoArquivo = VoluntariasUtil.lerArquivo(arquivo.getPath());
				tabela.carregarDados(listaDoArquivo);
				
				} catch (Exception erro){
					erro.printStackTrace();
				}
			}
		});
		btnProcurar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProcurar.setBounds(371, 74, 89, 23);
		contentPane.add(btnProcurar);
		
	}
}
