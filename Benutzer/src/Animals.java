import java.util.Scanner;

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String Eingabe = "";
		boolean Eingabeprüfung = false;
		
		while(Eingabeprüfung == false) {
		System.out.println("Bitte gib den Text Kuh | Hund | Katze ein:");
		Eingabe = s.next();
		
		if(Eingabe.equals("Kuh")) {
			System.out.println("	^__^");
			System.out.println("	(oo)\\_______");
			System.out.println("	(__)\\       )\\/\\");
			System.out.println("	    ||----w |");
			System.out.println("	    ||     ||");
			System.out.println("");
		}
		if(Eingabe.equals("Hund")) {
			System.out.println("	^__^");
			System.out.println("	(oo)\\________  /");
			System.out.println("	/_/  \\_______)/");
		    System.out.println("	     ||     ||");
		    System.out.println("");
		   }
		if(Eingabe.equals("Katze")) {
			System.out.println("	 ^_^      \\");    
			System.out.println("	(o_o)____ /	");          
			System.out.println("	    (____)	");    
			System.out.println("	    ||  ||");
			System.out.println("");
		}
		}
	
	s.close();	
	}

}
