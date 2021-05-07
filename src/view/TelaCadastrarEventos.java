package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Evento;
import servicos.EventosServico;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarEventos extends JPanel {

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
	}
	
	

	public void cadastrarEvento() {
		// pegar infoma��es do formul�rio
		// criar objeto/s
		Evento evento = new Evento();
		// Preencher objeto com as informa��es do formul�rio
		EventosServico eventoServico = new EventosServico();
		eventoServico.adicionar(evento);
	}
}