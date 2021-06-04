package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import enums.DoacaoEnum;
import model.Doacao;
import servicos.DoacoesDados;
import servicos.UsuariosDados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoarVoluntario extends JFrame {

	private JPanel contentPane;
	private JTextField textQuantidade;
	private JTextField textDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					DoarVoluntario frame = new DoarVoluntario();
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
	public DoarVoluntario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantidade.setBounds(10, 59, 97, 14);
		contentPane.add(lblQuantidade);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescrio.setBounds(10, 103, 97, 14);
		contentPane.add(lblDescrio);
		
		textQuantidade = new JTextField();
		textQuantidade.setBounds(10, 72, 414, 25);
		contentPane.add(textQuantidade);
		textQuantidade.setColumns(10);
		
		textDescricao = new JTextField();
		textDescricao.setBounds(10, 117, 414, 25);
		contentPane.add(textDescricao);
		textDescricao.setColumns(10);
		
		JCheckBox chckbxDinheiro = new JCheckBox("Dinheiro");
		chckbxDinheiro.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxDinheiro.setBounds(10, 149, 73, 23);
		contentPane.add(chckbxDinheiro);
		
		JCheckBox chckbxAlimento = new JCheckBox("Alimento");
		chckbxAlimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxAlimento.setBounds(10, 175, 75, 23);
		contentPane.add(chckbxAlimento);
		
		JCheckBox chckbxRoupa = new JCheckBox("Roupa");
		chckbxRoupa.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxRoupa.setBounds(101, 149, 61, 23);
		contentPane.add(chckbxRoupa);
		
		JCheckBox chckbxOutros = new JCheckBox("Outros");
		chckbxOutros.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxOutros.setBounds(101, 175, 71, 23);
		contentPane.add(chckbxOutros);
		
		JCheckBox chckbxMensal = new JCheckBox("Mensal");
		chckbxMensal.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxMensal.setBounds(174, 149, 97, 23);
		contentPane.add(chckbxMensal);
		
		JCheckBox chckbxEntregaLocal = new JCheckBox("Entrega no local");
		chckbxEntregaLocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxEntregaLocal.setBounds(174, 175, 124, 23);
		contentPane.add(chckbxEntregaLocal);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				UsuariosDados usuarioLog = new UsuariosDados();
				double quantidade = Double.parseDouble(textQuantidade.getText());
				String descricao = textDescricao.getText();
				boolean recorrencia = chckbxMensal.isSelected();
				String doador = usuarioLog.getUsuarioLogado().getNome();
				boolean coleta = chckbxEntregaLocal.isSelected();
				DoacaoEnum tipoDoacao = DoacaoEnum.SEMESCOLHA;
				
				if (chckbxDinheiro.isSelected()) {
					tipoDoacao = DoacaoEnum.DINHEIRO;
				}
				if (chckbxAlimento.isSelected()) {
					tipoDoacao = DoacaoEnum.ALIMENTO;
				}
				if (chckbxRoupa.isSelected()) {
					tipoDoacao = DoacaoEnum.ROUPA;
				}
				if (chckbxOutros.isSelected()) {
					tipoDoacao = DoacaoEnum.OUTROS;
				}
				
				Doacao DoacaoVoluntaria = new Doacao(quantidade, descricao, recorrencia, doador, coleta, tipoDoacao);
				DoacoesDados.getDoacoes().add(DoacaoVoluntaria);
				
				TelaVoluntarias telaVoluntarias = new TelaVoluntarias();
				telaVoluntarias.setVisible(true);
				setVisible(false);
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, "Preencha o campo quantidade com números!");
				}
			}
		});
		btnEnviar.setBounds(335, 227, 89, 23);
		contentPane.add(btnEnviar);
	}
}
