package Entities;

import java.util.List;

public class member {

	private int singer_id;
	private String firstName;
	private String lastName;
	private List<member> members;
	
	
	public member (int singer_id, String firstName, String lastName, List<member>members) {
		this.setSinger_id(singer_id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		
	}


	public int getSinger_id() {
		return singer_id;
	}


	public void setSinger_id(int singer_id) {
		this.singer_id = singer_id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public List<member> getMembers() {
		return members;
	}


	public void setMembers(List<member> members) {
		this.members = members;
	}
}
