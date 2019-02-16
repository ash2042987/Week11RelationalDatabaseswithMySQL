package dao;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.member;

public class MembersDao {
	
	
	private Connection connection;
	private final String GET_MEMBERS_BY_SINGER_ID_QUERY ="SELECT * FROM members WHERE singer_id = ?";
		
		public MembersDao() {
			connection = DBConnection.getConnection();
		}
		 
		public List<member> getMembersBySingerId(int id) throws SQLException{
			PreparedStatement ps = connection.prepareStatement("GET MEMBERS BY SINGER_ID QUERY");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			List<member> members = new ArrayList<member>();
			
			while(rs.next()) {
				members.add(new Member(rs.getInt(1), rs.getString(2) rs.getString(3)));
			}
			return members;
			
			private Members (int id, String name, String member) throws SQLException {
				return new Members (id, name, MembersDAO.getMembersbySolarSINGERid(id));
			}
		
	
		
		
	}
	
}
