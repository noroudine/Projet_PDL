package fr_Pdl_Java;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.Label;
import javax.swing.ImageIcon;


public class UIAcceuil extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public UIAcceuil() {
		getContentPane().setBackground(Color.WHITE);
		initComponents();
	}
	

	private void initComponents () {
		setTitle("Acceuil");
		
		setPreferredSize(new Dimension(500, 400));
		setSize(new Dimension(700,400));
		setResizable(false);
		
		getContentPane().setLayout(null);
		
		Button button_Public = new Button("PUBLIC");
		button_Public.setFont(new Font("Dialog", Font.BOLD, 12));
		button_Public.setBounds(71, 316, 70, 22);
		getContentPane().add(button_Public);
		
		Button button_Connexion = new Button("CONNEXION");
		button_Connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onConnexionClicked();  
			}
		});
		button_Connexion.setFont(new Font("Dialog", Font.BOLD, 12));
		button_Connexion.setBounds(291, 316, 94, 22);
		getContentPane().add(button_Connexion);
		
		Button button_Inscription = new Button("INSCRIPTION");
		button_Inscription.setFont(new Font("Dialog", Font.BOLD, 12));
		button_Inscription.setBounds(499, 316, 94, 22);
		getContentPane().add(button_Inscription);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(UIAcceuil.class.getResource("/fr_Pdl_Java/logo-armada-date.jpg")));
		lblNewLabel.setBounds(142, 11, 402, 279);
		getContentPane().add(lblNewLabel);
	}

	
	
	protected void onConnexionClicked() {
		
			UIConnexion ui = new UIConnexion(this);
			ui.showMe();
			cacheToi();

	}
	
	protected void cacheToi() {
		this.setVisible(false);
	}

	public void montreToi() {
		this.setVisible(true);
	}
}
