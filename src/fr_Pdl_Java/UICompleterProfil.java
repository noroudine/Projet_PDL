package fr_Pdl_Java;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class UICompleterProfil extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public UICompleterProfil() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenu MenuHelp = new JMenu("?");
		menuBar.add(MenuHelp);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Haut = new JPanel();
		panel_Haut.setBackground(new Color(0, 206, 209));
		getContentPane().add(panel_Haut, BorderLayout.NORTH);
		panel_Haut.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_West = new JPanel();
		panel_Haut.add(panel_West, BorderLayout.WEST);
		
		JButton btn_Retour = new JButton("RETOUR");
		btn_Retour.setBackground(new Color(0, 206, 209));
		btn_Retour.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_West.add(btn_Retour);
		
		JPanel panel_East = new JPanel();
		panel_Haut.add(panel_East, BorderLayout.EAST);
		
		JButton btn_Deconnexion = new JButton("DECONNEXION");
		btn_Deconnexion.setBackground(new Color(0, 206, 209));
		btn_Deconnexion.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_East.add(btn_Deconnexion);
		
		JPanel panel_Centre = new JPanel();
		getContentPane().add(panel_Centre, BorderLayout.CENTER);
		panel_Centre.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Centre_Centre = new JPanel();
		panel_Centre_Centre.setBackground(new Color(0, 206, 209));
		panel_Centre.add(panel_Centre_Centre, BorderLayout.CENTER);
		panel_Centre_Centre.setLayout(null);
		
		JLabel jLabel_Nom = new JLabel("Nom : ");
		jLabel_Nom.setFont(new Font("Tahoma", Font.BOLD, 11));
		jLabel_Nom.setBounds(24, 23, 46, 14);
		panel_Centre_Centre.add(jLabel_Nom);
		
		textField = new JTextField();
		textField.setBounds(68, 20, 86, 20);
		panel_Centre_Centre.add(textField);
		textField.setColumns(10);
		
		JLabel jLabel_Prenom = new JLabel("Pr\u00E9nom : ");
		jLabel_Prenom.setFont(new Font("Tahoma", Font.BOLD, 11));
		jLabel_Prenom.setBounds(24, 70, 62, 14);
		panel_Centre_Centre.add(jLabel_Prenom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 67, 86, 20);
		panel_Centre_Centre.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel jLabel_DateNaissance = new JLabel("Date de Naissance :");
		jLabel_DateNaissance.setFont(new Font("Tahoma", Font.BOLD, 11));
		jLabel_DateNaissance.setBounds(24, 124, 115, 14);
		panel_Centre_Centre.add(jLabel_DateNaissance);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 121, 86, 20);
		panel_Centre_Centre.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel jLabel_Stand = new JLabel("Num\u00E9ro Stand : ");
		jLabel_Stand.setFont(new Font("Tahoma", Font.BOLD, 11));
		jLabel_Stand.setBounds(24, 174, 100, 14);
		panel_Centre_Centre.add(jLabel_Stand);
		
		textField_3 = new JTextField();
		textField_3.setBounds(134, 171, 86, 20);
		panel_Centre_Centre.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btn_Valider = new JButton("Compl\u00E9ter son profil");
		btn_Valider.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_Valider.setBounds(264, 212, 165, 23);
		panel_Centre_Centre.add(btn_Valider);
		
		JPanel panel_Centre_West = new JPanel();
		panel_Centre_West.setBackground(new Color(0, 206, 209));
		panel_Centre.add(panel_Centre_West, BorderLayout.WEST);
		
		JPanel panel_Centre_East = new JPanel();
		panel_Centre_East.setBackground(new Color(0, 206, 209));
		panel_Centre.add(panel_Centre_East, BorderLayout.EAST);
		
		JPanel panel_Sud = new JPanel();
		getContentPane().add(panel_Sud, BorderLayout.SOUTH);
		panel_Sud.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 46, 14);
		panel_Sud.add(label);
	}
}
