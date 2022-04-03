package fr_Pdl_Java;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UIGestionDeParticipants extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tF_Id;
	private JTextField tF_Nom;
	private JTextField tF_Prenom;
	private JTextField tF_Profil;
	private JTable table;
	
	public UIGestionDeParticipants(UIConnexion uiConnexion) {
		initComponents(uiConnexion);
	}
	
	public void initComponents(UIConnexion uiConnexion) {
		setPreferredSize(new Dimension(500, 400));
		setSize(new Dimension(700,400));
		setResizable(false);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel JLabel_Id = new JLabel("ID :");
		JLabel_Id.setFont(new Font("Tahoma", Font.BOLD, 11));
		JLabel_Id.setBounds(32, 86, 46, 14);
		panel.add(JLabel_Id);
		
		JLabel jLabel_Prenom = new JLabel("Pr\u00E9nom :");
		jLabel_Prenom.setFont(new Font("Tahoma", Font.BOLD, 11));
		jLabel_Prenom.setBounds(32, 156, 59, 14);
		panel.add(jLabel_Prenom);
		
		JLabel jLabel_Nom = new JLabel("Nom :");
		jLabel_Nom.setFont(new Font("Tahoma", Font.BOLD, 11));
		jLabel_Nom.setBounds(32, 124, 46, 14);
		panel.add(jLabel_Nom);
		
		tF_Id = new JTextField();
		tF_Id.setBounds(73, 83, 86, 20);
		panel.add(tF_Id);
		tF_Id.setColumns(10);
		
		tF_Nom = new JTextField();
		tF_Nom.setColumns(10);
		tF_Nom.setBounds(73, 121, 86, 20);
		panel.add(tF_Nom);
		
		tF_Prenom = new JTextField();
		tF_Prenom.setColumns(10);
		tF_Prenom.setBounds(101, 153, 86, 20);
		panel.add(tF_Prenom);
		
		JLabel JLabel_Profil = new JLabel("Profil :");
		JLabel_Profil.setFont(new Font("Tahoma", Font.BOLD, 11));
		JLabel_Profil.setBounds(262, 86, 46, 14);
		panel.add(JLabel_Profil);
		
		tF_Profil = new JTextField();
		tF_Profil.setBounds(318, 83, 86, 20);
		panel.add(tF_Profil);
		tF_Profil.setColumns(10);
		
		JButton btn_Valider = new JButton("Valider");
		btn_Valider.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_Valider.setBounds(262, 152, 86, 23);
		panel.add(btn_Valider);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer.setBounds(372, 152, 100, 23);
		panel.add(btnSupprimer);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModifier.setBounds(494, 152, 100, 23);
		panel.add(btnModifier);
		
		JLabel JLabel_Title = new JLabel("GESTION DE PARTICIPANTS");
		JLabel_Title.setFont(new Font("Tahoma", Font.BOLD, 14));
		JLabel_Title.setBounds(251, 31, 215, 14);
		panel.add(JLabel_Title);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Nom", "Prénom", "Profil"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(656, 237, -615, 72);
		panel.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(639, 238, 17, 66);
		panel.add(scrollBar);
		
		JButton btn_Acceuil = new JButton("Acceuil");
		btn_Acceuil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				uiConnexion.montreToi();
				
				dispose();
			}
		});
		btn_Acceuil.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_Acceuil.setBounds(42, 325, 86, 23);
		panel.add(btn_Acceuil);
	}
	
	public void showMe() {
		this.setVisible(true);
	}
}
