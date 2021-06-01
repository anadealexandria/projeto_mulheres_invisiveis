package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import enums.DoacaoEnum;
import model.Doacao;
import model.Doador;
import model.Receita;
import servicos.DoacoesDados;

import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class TelaCadastrarDoacao extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField doador_;
	private JTextField descriçao;
	private JTextField quantidade;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					TelaCadastrarDoacao frame = new TelaCadastrarDoacao();
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
	public TelaCadastrarDoacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(205, 11, 1, 1);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Doa\u00E7\u00E3o\r\n:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(179, 11, 62, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 62, 127, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Descri\u00E7\u00E3o:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 112, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Doador:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 157, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		doador_ = new JTextField();
		doador_.setBounds(10, 173, 414, 25);
		contentPane.add(doador_);
		doador_.setColumns(10);
		doador_.setText("");
				
		descriçao = new JTextField();
		descriçao.setBounds(10, 126, 414, 25);
		contentPane.add(descriçao);
		descriçao.setColumns(10);
		descriçao.setText("");
		
		quantidade = new JTextField();
		quantidade.setBounds(10, 76, 414, 25);
		contentPane.add(quantidade);
		quantidade.setColumns(10);
		quantidade.setText("0.0");
		
		JCheckBox chckbxMensal = new JCheckBox("Mensal");
		chckbxMensal.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxMensal.setBounds(10, 205, 70, 23);
		contentPane.add(chckbxMensal);
		
		JCheckBox chckbxEntregaNoLocal = new JCheckBox("Entrega No Local");
		chckbxEntregaNoLocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxEntregaNoLocal.setBounds(90, 205, 137, 23);
		contentPane.add(chckbxEntregaNoLocal);
		
		JLabel lblTipoDeDoao = new JLabel("Tipo de Doa\u00E7\u00E3o:");
		lblTipoDeDoao.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeDoao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipoDeDoao.setBounds(10, 246, 414, 14);
		contentPane.add(lblTipoDeDoao);
		
		JCheckBox chckbxDinheiro = new JCheckBox("Dinheiro");
		chckbxDinheiro.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxDinheiro.setBounds(10, 268, 97, 23);
		contentPane.add(chckbxDinheiro);
		
		JCheckBox chckbxAlimento = new JCheckBox("Alimento");
		chckbxAlimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxAlimento.setBounds(10, 294, 97, 23);
		contentPane.add(chckbxAlimento);
		
		JCheckBox chckbxRoupa = new JCheckBox("Roupa");
		chckbxRoupa.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxRoupa.setBounds(10, 320, 97, 23);
		contentPane.add(chckbxRoupa);
		
		JCheckBox chckbxOutros = new JCheckBox("Outros");
		chckbxOutros.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxOutros.setBounds(10, 346, 97, 23);
		contentPane.add(chckbxOutros);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {		
				double quantidade1 = Double.parseDouble(quantidade.getText());
				String descricao = descriçao.getText();				
				boolean recorrente = chckbxMensal.isSelected();
				String doadorNome = doador_.getText();
				boolean coleta = chckbxEntregaNoLocal.isSelected();
				DoacaoEnum tipoDoacao = DoacaoEnum.SEMESCOLHA ;
				
				if(chckbxDinheiro.isSelected()) {
					tipoDoacao = DoacaoEnum.DINHEIRO;
				}
				if(chckbxAlimento.isSelected()) {
					tipoDoacao = DoacaoEnum.ALIMENTO;
				}
				if(chckbxRoupa.isSelected()) {
					tipoDoacao = DoacaoEnum.ROUPA;
				}
				if(chckbxOutros.isSelected()) {
					tipoDoacao = DoacaoEnum.OUTROS;
				}
				
				
				Doacao doacao = new Doacao(quantidade1, descricao, recorrente, doadorNome, coleta, tipoDoacao);
				
					
				if(doadorNome.equals("") || descricao.equals("") || quantidade1 == 0.0 || 
						tipoDoacao == DoacaoEnum.SEMESCOLHA) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");					
				}else {
					DoacoesDados.getDoacoes().add(doacao);
					TelaDoacao telaDoacao = new TelaDoacao();
					telaDoacao.setVisible(true);
					setVisible(false);
					
				}
			}catch(NumberFormatException x) {
				JOptionPane.showMessageDialog(null, "Use o ponto para a notação do valor!");
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(335, 407, 89, 23);
		contentPane.add(btnNewButton);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDoacao telaDoacao = new TelaDoacao();
				telaDoacao.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setBounds(236, 407, 89, 23);
		contentPane.add(btnVoltar);
		
	}
}
