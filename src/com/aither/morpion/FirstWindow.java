package com.aither.morpion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWindow {

	private JFrame frame;
	private JTextField Joueur1;
	private JTextField Joueur2;
	private String J1;
	private String J2;
	private Morpion windowJeu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow window = new FirstWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,700,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[100][100,grow][100][100][100,grow][100][100]", "[100,grow][100,grow]"));
		
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "cell 1 0 2 1,alignx center,aligny center");
		panel_2.setLayout(new BorderLayout(0, 0));
		JLabel lblNewLabel = new JLabel("Joueur 1");
		panel_2.add(lblNewLabel, BorderLayout.SOUTH);
		
		// Bouton lancement du jeu
		JButton btnNewButton = new JButton("Lancer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J1=Joueur1.getText();
				J2=Joueur2.getText();
				FirstWindow.this.frame.setVisible(false);
				windowJeu = new Morpion(J1,J2);
				
			}
		});
		frame.getContentPane().add(btnNewButton, "cell 3 0,alignx center,aligny center");
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "cell 4 0 2 1,alignx center,aligny center");
		panel_3.setLayout(new BorderLayout(0, 0));
		JLabel lblNewLabel_1 = new JLabel("Joueur 2");
		panel_3.add(lblNewLabel_1, BorderLayout.SOUTH);
		
		// TEXTE JOUEUR 1
		JPanel panelJ1 = new JPanel();
		frame.getContentPane().add(panelJ1, "cell 1 1 2 1,grow");
		panelJ1.setLayout(new BorderLayout(0, 0));
		Joueur1 = new JTextField();
		panelJ1.add(Joueur1, BorderLayout.NORTH);
		Joueur1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnNewButton_1, "cell 3 1,alignx center,aligny center");
		// texte joueur 2 
		JPanel panelJ2 = new JPanel();
		frame.getContentPane().add(panelJ2, "cell 4 1 2 1,grow");
		panelJ2.setLayout(new BorderLayout(0, 0));
		
		Joueur2 = new JTextField();
		panelJ2.add(Joueur2, BorderLayout.NORTH);
		Joueur2.setColumns(10);
	}

}
