package Entities;

public class genre {
		
		private int genres_id;
		private String totalMembers;
		private String year;
	
		
		public genre (int id, String totalMembers, String year) {
			this.setGenres_id(id);
			this.setTotalMembers(totalMembers);
			this.setYear(year);
			
		}


		public int getGenres_id() {
			return genres_id;
		}


		public void setGenres_id(int genres_id) {
			this.genres_id = genres_id;
		}


		public String getTotalMembers() {
			return totalMembers;
		}


		public void setTotalMembers(String totalMembers) {
			this.totalMembers = totalMembers;
		}


		public String getYear() {
			return year;
		}


		public void setYear(String year) {
			this.year = year;
		}
		

		
		
}
