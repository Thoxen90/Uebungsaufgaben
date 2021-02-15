import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Monatszahl=0;
		String Monatsname="";
		Scanner s = new Scanner(System.in);
		
		while(Monatszahl<1||Monatszahl>12) {
		System.out.println("Bitte geben Sie eine Zahl für den Monat ein");
		Monatszahl = s.nextInt();
		if(Monatszahl<1||Monatszahl>12) {
			System.out.println(Monatszahl+" ist keine gültige Monatszahl. Bitte geben Sie eine Zahl von 1-12 ein");
			System.out.println("");
		}
		}
		
		s.close();
		
		switch(Monatszahl) {
		case 1: Monatsname = "Januar";
		break;
		case 2: Monatsname = "Februar";
		break;
		case 3: Monatsname = "März";
		break;
		case 4: Monatsname = "April";
		break;
		case 5: Monatsname = "Mai";
		break;
		case 6: Monatsname = "Juni";
		break;
		case 7: Monatsname = "Juli";
		break;
		case 8: Monatsname = "August";
		break;
		case 9: Monatsname = "September";
		break;
		case 10: Monatsname = "Oktober";
		break;
		case 11: Monatsname = "November";
		break;
		case 12: Monatsname = "Dezember";
		break;
		}
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Die eingegebene Zahl "+Monatszahl+" steht für den Monat "+Monatsname);
	}

}
