package fr_Pdl_Java;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class UIParticipant extends JFrame {
		private static final long serialVersionUID = 1L;
		private JTextField tF_Nom;
		private JTextField tF_Prenom;
		private JTextField tF_DateNaissance;
		private JTextField tF_NumeroStand;
		private JTextField tF_Id;
	
	public UIParticipant(UIConnexion uiConnexion) {
		initComponents(uiConnexion);
	}
	
	public void initComponents(UIConnexion uiConnexion) {
		
		setPreferredSize(new Dimension(500, 400));
		setSize(new Dimension(700,400));
		setResizable(false);
		getContentPane().setBackground(new Color(0, 206, 209));
		getContentPane().setLayout(null);
		
		JButton btnDeconnexion = new JButton("Deconnexion");
		btnDeconnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment vous déconnecter ?", 
						"Confirmation de sortie", JOptionPane.YES_NO_OPTION)) {
					dispose();
					UIConnexion ui = new UIConnexion(null);
					ui.showMe ();
				}
			}
		});
		
		btnDeconnexion.setBounds(460, 42, 112, 23);
		btnDeconnexion.setBackground(new Color(0, 206, 209));
		btnDeconnexion.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(btnDeconnexion);
		
		JLabel jLabel_Nom = new JLabel("Nom :");
		jLabel_Nom.setBounds(35, 116, 46, 14);
		jLabel_Nom.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(jLabel_Nom);
		
		JLabel jLabel = new JLabel("Pr\u00E9nom : ");
		jLabel.setBounds(35, 157, 66, 14);
		jLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(jLabel);
		
		JLabel jLabel_DateNaissance = new JLabel("Date de naissance :");
		jLabel_DateNaissance.setBounds(37, 199, 121, 14);
		jLabel_DateNaissance.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(jLabel_DateNaissance);
		
		JLabel jLabel_Stand = new JLabel("Num\u00E9ro stand : \r\n");
		jLabel_Stand.setBounds(35, 246, 102, 14);
		jLabel_Stand.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(jLabel_Stand);
		
		JButton btn_CompleterProfil = new JButton("Compl\u00E9ter Profil");
		btn_CompleterProfil.setBounds(436, 272, 136, 23);
		btn_CompleterProfil.setBackground(new Color(0, 206, 209));
		btn_CompleterProfil.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(btn_CompleterProfil);
		
		tF_Nom = new JTextField();
		tF_Nom.setBounds(83, 113, 86, 20);
		getContentPane().add(tF_Nom);
		tF_Nom.setColumns(10);
		
		tF_Prenom = new JTextField();
		tF_Prenom.setBounds(111, 154, 86, 20);
		getContentPane().add(tF_Prenom);
		tF_Prenom.setColumns(10);
		
		tF_DateNaissance = new JTextField();
		tF_DateNaissance.setBounds(160, 196, 86, 20);
		tF_DateNaissance.setColumns(10);
		getContentPane().add(tF_DateNaissance);
		
		tF_NumeroStand = new JTextField();
		tF_NumeroStand.setBounds(141, 243, 86, 20);
		tF_NumeroStand.setColumns(10);
		getContentPane().add(tF_NumeroStand);
		
		JLabel jLabel_Identifiant = new JLabel("ID :");
		jLabel_Identifiant.setBounds(35, 80, 46, 14);
		jLabel_Identifiant.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(jLabel_Identifiant);
		
		tF_Id = new JTextField();
		tF_Id.setBounds(73, 77, 86, 20);
		tF_Id.setColumns(10);
		getContentPane().add(tF_Id);
	}
	
	public void showMe() {
		this.setVisible(true);
	}
}