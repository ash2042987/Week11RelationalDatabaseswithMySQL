package Application;

import java.awt.Choice;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	private dao.GenresDao GenresDao;
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display Members", "A member", "Create a Member", "Delete a Member", "Display Genre" );
	
	
	public void start( ) {
		String selection ="";
		
		
		do {
			printMenu();
			selection = scanner.nextLine();
		
			
			if(selection.equals("1")) {
				//displayMembers();
			} else if (selection.equals("2")) {
				 //displayMember();
				 
			} else if (selection.equals("3")) {
				//createMember();
			
			
			} else if (selection.equals("4")) {
				//deleteMember();
			
			} else if (selection.equals("5")) {
				//displayGenre();
			
			} else if (selection.equals("6")) {
				//displayMembers();	
			
			} 
			
				System.out.println("Press Enter to proceed...");
				scanner.nextLine();
		}while(!selection.equals("-1")); 
					
		}
		
			private void printMenu() {
				System.out.println("Pick your Choice");
				for (int i = 0; i < options.size(); i++) {
					System.out.println(i + 1 + " " + options.get(i)); 
						
}
}
}
	