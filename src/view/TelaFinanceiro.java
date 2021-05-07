package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;

public class TelaFinanceiro extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFinanceiro frame = new TelaFinanceiro();
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
	public TelaFinanceiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeEventos = new JLabel("Financeiro:");
		lblListaDeEventos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeEventos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListaDeEventos.setBounds(117, 22, 194, 14);
		contentPane.add(lblListaDeEventos);
		
		table = new JTable();
		table.setBounds(345, 78, -250, 88);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setForeground(Color.RED);
		table_1.setBounds(339, 65, -256, 138);
		contentPane.add(table_1);
	}
}
