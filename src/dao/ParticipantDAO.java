package dao;


import java.sql.*;

	public class ParticipantDAO extends ConnectionDAO {
		public ParticipantDAO() {
	}
	
	public int add(objet.Participant participant) {
	
		PreparedStatement ps = null;
		int returnValue = 0;
	
	try(Connection con1 = DriverManager.getConnection(URL1,LOGIN,PASS)){
	
	
		ps = con1.prepareStatement("INSERT INTO Participant (nom,prenom) VALUES (?,?)");
		
		ps.setString(1, participant.getNom());
		ps.setString(2,participant.getPrenom());

	}catch(Exception i) {
		i.printStackTrace();
	}
		return returnValue;
	}
}
		