package com.aither.morpion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JRadioButton;

public class Morpion {

	private JFrame frame;
	private String J1="Joueur 1";
	private String J2="Joueur 2";
	private JTextField TEXT1;
	private JTextField TEXT2;
	private int coups=0;
	private int PointJ1=0;
	private int PointJ2=0;
	private int case1=0;
	private int case2=0;
	private int case3=0;
	private int case4=0;
	private int case5=0;
	private int case6=0;
	private int case7=0;
	private int case8=0;
	private int case9=0;
	private JButton Case1;
	private JButton Case2;
	private JButton Case3;
	private JButton Case4;
	private JButton Case5;
	private JButton Case6;
	private JButton Case7;
	private JButton Case8;
	private JButton Case9;
	public JLabel Barre;
	private JLabel PTJ1;
	private JLabel PTJ2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Morpion window = new Morpion();
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
	public Morpion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[100,grow][100,grow][100,grow][100,grow][100,grow][100,grow][100]", "[100,grow][100,grow][100,grow][100,grow][100,grow][100][100][100,grow]"));
		
		//Nom joueur 1
		JLabel Joueur1 = new JLabel("Joueur1");
		frame.getContentPane().add(Joueur1, "flowx,cell 1 0,alignx center,aligny center");
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "cell 1 1,grow");
		panel_1.setLayout(new BorderLayout(0, 0));
		TEXT1 = new JTextField();
		panel_1.add(TEXT1, BorderLayout.NORTH);
		TEXT1.setColumns(10);
		JButton btnNewButton = new JButton("Valider J1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				J1=TEXT1.getText();
				Joueur1.setText(J1);
			}
		});
		panel_1.add(btnNewButton, BorderLayout.SOUTH);
		
		//Nom joueur 2 
		JLabel Joueur2 = new JLabel("Joueur2");
		frame.getContentPane().add(Joueur2, "flowx,cell 5 0,alignx center,aligny center");
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "cell 5 1,grow");
		panel_2.setLayout(new BorderLayout(0, 0));
		TEXT2 = new JTextField();
		panel_2.add(TEXT2, BorderLayout.NORTH);
		TEXT2.setColumns(10);
		JButton btnNewButton_1 = new JButton("Valider J2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				J2=TEXT2.getText();
				Joueur2.setText(J2);
			}
		});
		panel_2.add(btnNewButton_1, BorderLayout.SOUTH);
		
		//point joueur 1
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 1 2,grow");
		PTJ1 = new JLabel("0");
		panel.add(PTJ1);
		
		//Point joueur 2
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "cell 5 2,grow");
		PTJ2 = new JLabel("0");
		panel_3.add(PTJ2);
		
		
		// Cadre de jeux
		Case1 = new JButton("");
		Case1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case1.getText()=="") {
					if((coups%2)==0) {
						Case1.setText("X");case1=1;test1();coups++;
					}
					else
					{
						Case1.setText("O");case1=2;test2();coups++;
					}
				}
				
			}
		});
		frame.getContentPane().add(Case1, "cell 2 3,grow");
		
		Case2 = new JButton("");
		Case2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case2.getText()=="") {
					if((coups%2)==0) {
						Case2.setText("X"); case2=1; coups++; test1();
					}
					else
					{
						Case2.setText("O"); case2=2; coups++; test2();
					}
				}
			}
		});
		frame.getContentPane().add(Case2, "cell 3 3,grow");
		
		Case3 = new JButton("");
		Case3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case3.getText()=="") {
					if((coups%2)==0) {
						Case3.setText("X");case3=1;test1();coups++;
					}
					else
					{
						Case3.setText("O");case3=2;test2();coups++;
					}
				}
			}
		});
		frame.getContentPane().add(Case3, "cell 4 3,grow");
		
		Case4 = new JButton("");
		Case4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case4.getText()=="") {
					if((coups%2)==0) {
						Case4.setText("X");case4=1;test1();coups++;
					}
					else
					{
						Case4.setText("O");case4=2;test2();coups++;
					}
				}
			}
		});
		frame.getContentPane().add(Case4, "cell 2 4,grow");
		
		Case5 = new JButton("");
		Case5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case5.getText()=="") {
					if((coups%2)==0) {
						Case5.setText("X");case5=1;test1();coups++;
					}
					else
					{
						Case5.setText("O");case5=2;test2();coups++;
					}
				}
			}
		});
		frame.getContentPane().add(Case5, "cell 3 4,grow");
		
		Case6 = new JButton("");
		Case6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case6.getText()=="") {
					if((coups%2)==0) {
						Case6.setText("X");case6=1;test1();coups++;
					}
					else
					{
						Case6.setText("O");case6=2;test2();coups++;
					}
				}
			}
		});
		frame.getContentPane().add(Case6, "cell 4 4,grow");
		
		Case7 = new JButton("");
		Case7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case7.getText()=="") {
					if((coups%2)==0) {
						Case7.setText("X");case7=1;test1();coups++;
					}
					else
					{
						Case7.setText("O");case7=2;test2();coups++;
					}
				}
			}
		});
		frame.getContentPane().add(Case7, "cell 2 5,grow");
		
		Case8 = new JButton("");
		Case8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case8.getText()=="") {
					if((coups%2)==0) {
						Case8.setText("X");case8=1;test1();coups++;
					}
					else
					{
						Case8.setText("O");case8=2;test2();coups++;
					}
				}
			}
		});
		frame.getContentPane().add(Case8, "cell 3 5,grow");
		
		Case9 = new JButton("");
		Case9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Case9.getText()=="") {
					if((coups%2)==0) {
						Case9.setText("X");case9=1;test1();coups++;
					}
					else
					{
						Case9.setText("O");case9=2;test2();coups++;
					}
				}
			}
		});
		frame.getContentPane().add(Case9, "cell 4 5,grow");
		
		// zone de texte final
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, "cell 1 7 5 1,grow");
		Barre = new JLabel("");
		panel_4.add(Barre);
	}
	private void test1()
	{	// test des 8 combinaisons possible pour gagner
		//tests Horizontal
		if((case1==1 & case2==1 & case3==1)|(case4==1 & case5==1 & case6==1)|(case7==1 & case8==1 & case9==1)) {
			Victoire1();
		}
		//test Vertical
		if((case1==1 & case4==1 &case7==1)|(case2==1 & case5==1 &case8==1)|(case3==1 & case6==1 &case9==1)) {
			Victoire1();
		}
		//test Diagonal
		if((case1==1 & case5==1 &case9==1)|(case3==1 & case5==1 &case7==1)) {
			Victoire1();
		}
	}
	private void test2()
	{
		// test des 8 combinaisons possible pour gagner
		//tests Horizontal
		if((case1==2 & case2==2 &case3==2)|(case4==2 & case5==2 &case6==2)|(case7==2 & case8==2 &case9==2)) {
			Victoire2();
		}
		//test Vertical
		if((case1==2 & case4==2 &case7==2)|(case2==2 & case5==2 &case8==2)|(case3==2 & case6==2 &case9==2)) {
			Victoire2();
		}
		//test Diagonal
		if((case1==2 & case5==2 &case9==2)|(case3==2 & case5==2 &case7==2)) {
			Victoire2();
		}
		
	}
	private void Victoire1()
	{
		Barre.setText("Victoire de "+J1+" en "+coups+" coups");PointJ1++;
		PTJ1.setText(""+PointJ1+"");
		case1=0;case2=0;case3=0;case4=0;case5=0;case6=0;case7=0;case8=0;case9=0;coups=0;
		Case1.setText("");Case2.setText("");Case3.setText("");Case4.setText("");Case5.setText("");
		Case6.setText("");Case7.setText("");Case8.setText("");Case9.setText("");
		
		
	}
	private void Victoire2()
	{
		Barre.setText("Victoire de "+J2+" en "+coups+" coups");PointJ2++;
		PTJ2.setText(""+PointJ2+"");
		case1=0;case2=0;case3=0;case4=0;case5=0;case6=0;case7=0;case8=0;case9=0;
		Case1.setText("");Case2.setText("");Case3.setText("");Case4.setText("");Case5.setText("");
		Case6.setText("");Case7.setText("");Case8.setText("");Case9.setText("");coups=0;
		
	}
	
}
