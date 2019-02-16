package dao;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.member;

public class GenresDao {
		
	
	private Connection connection;
	private MembersDao memberDao;
	private final String GET_GENRE_QUERY = "Select * From members";
	


	public  GenresDao() {
		connection = DBconnection.getConnection();
	}
	

	public List<member> getMembers() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_GENRE_QUERY).executeQuery();
		List<member> members = new ArrayList<member>();
		
		
		while (rs.next()) {
			members.add(populateMembers(rs.getInt(1), rs.getString(2)));
			
		}
		
		return members;
	
	}
	 
		private Member populateMembers(int id, String name) {
	 		return new Member(id, name, MembersDao.getMemberSinger_id(id));
	 	}
	}
	
	
	
	
	
	
	
	