package fr_Pdl_Java;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UIModifierProfil extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	public UIModifierProfil() {
		getContentPane().setBackground(new Color(0, 206, 209));
		getContentPane().setLayout(null);
		
		JButton btn_Retour = new JButton("Retour");
		btn_Retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Retour.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_Retour.setBounds(31, 40, 89, 23);
		getContentPane().add(btn_Retour);
		
		JButton btn_Deconnexion = new JButton("Deconnexion");
		btn_Deconnexion.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_Deconnexion.setBounds(710, 40, 109, 23);
		getContentPane().add(btn_Deconnexion);
		
		JLabel Jlabel_Recherche = new JLabel("Nom : ");
		Jlabel_Recherche.setFont(new Font("Tahoma", Font.BOLD, 11));
		Jlabel_Recherche.setBounds(50, 141, 49, 14);
		getContentPane().add(Jlabel_Recherche);
		
		textField = new JTextField();
		textField.setBounds(101, 138, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel jLabel_Prenom = new JLabel("Pr\u00E9nom :");
		jLabel_Prenom.setFont(new Font("Tahoma", Font.BOLD, 11));
		jLabel_Prenom.setBounds(50, 166, 63, 14);
		getContentPane().add(jLabel_Prenom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 163, 116, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btn_Recherche = new JButton("Recherche");
		btn_Recherche.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_Recherche.setBounds(257, 92, 109, 23);
		getContentPane().add(btn_Recherche);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Nom", "Pr\u00E9nom", "Date de Naissance", "Num\u00E9ro Stand"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(104);
		table.getColumnModel().getColumn(4).setPreferredWidth(83);
		table.setBounds(772, 255, -724, 107);
		getContentPane().add(table);
		
		JLabel jLabel_ID = new JLabel("ID :");
		jLabel_ID.setFont(new Font("Tahoma", Font.BOLD, 11));
		jLabel_ID.setBounds(50, 116, 46, 14);
		getContentPane().add(jLabel_ID);
		
		textField_2 = new JTextField();
		textField_2.setBounds(85, 113, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
