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


public class UIConnexion extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPasswordField pFPassword;
	private JTextField tFLogin;
	
	public UIConnexion(UIAcceuil uiAcceuil) {
		setType(Type.UTILITY);
		initComponents(uiAcceuil);
	}
	
	private void initComponents (UIAcceuil uiAcceuil) {
		setTitle("Sign In");
		getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		setPreferredSize(new Dimension(360, 180));
		setSize(new Dimension(515, 295));
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(0, 206, 209));
		getContentPane().add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel labelLogin = new JLabel("Login :");
		labelLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelLogin.setBounds(115, 28, 46, 14);
		panelLogin.add(labelLogin);
		
		tFLogin = new JTextField();
		tFLogin.setBounds(171, 25, 150, 20);
		panelLogin.add(tFLogin);
		tFLogin.setColumns(10);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBackground(new Color(0, 206, 209));
		getContentPane().add(panelPassword);
		panelPassword.setLayout(null);
		
		pFPassword = new JPasswordField();
		pFPassword.setBounds(186, 12, 144, 20);
		panelPassword.add(pFPassword);
		
		JLabel labelPassword = new JLabel("Password : ");
		labelPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelPassword.setBounds(118, 15, 81, 14);
		panelPassword.add(labelPassword);
		
		JPanel panelButtons = new JPanel();
		panelButtons.setBackground(new Color(0, 206, 209));
		FlowLayout flowLayout_2 = (FlowLayout) panelButtons.getLayout();
		flowLayout_2.setVgap(10);
		getContentPane().add(panelButtons);
		
		JButton buttonSubmit = new JButton("Submit");
		buttonSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onSubmitClicked();
			}
		});
		buttonSubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonSubmit.setToolTipText("Valider votre saisie ...");
		
		/*
		buttonSubmit.addActionListener( new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				onSubmitClicked();
			}
		});
		*/
		
		panelButtons.add(buttonSubmit);
		
		JButton buttonCancel = new JButton("Cancel");
		buttonCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		buttonCancel.addActionListener( new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter ?", 
						"Confirmation de sortie", JOptionPane.YES_NO_OPTION)) {
					dispose();
				}
			}
		});
		panelButtons.add(buttonCancel);
	}

	
	
	protected void onSubmitClicked() {
		if (tFLogin.getText().equals("admin") && String.valueOf(pFPassword.getPassword()).equals("admin")) {
			
			UIGestionDeParticipants ui = new UIGestionDeParticipants(this);
			ui.showMe ();
			
			cacheToi();
		} else {
			JOptionPane.showMessageDialog(null, "Vous n'êtes pas authentifié(e) !");
		}
	}

	protected void cacheToi() {
		this.setVisible(false);
	}

	public void montreToi() {
		this.setVisible(true);
	}
	
	public void showMe() {
		this.setVisible(true);
	}
}
