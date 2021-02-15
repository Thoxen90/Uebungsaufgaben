import java.util.Scanner;

public class Wochentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int Startjahr = 1900;
		
		System.out.println("Bitte geben Sie das Jahr an:");
		int AktuellJahr = s.nextInt();
		int Schalttage = (AktuellJahr-Startjahr)/4;
		System.out.println("Bitte geben Sie den Monat an:");
		int AktuellMonat = s.nextInt();
		System.out.println("Bitte geben Sie den Tag an:");
		int AktuellTag = s.nextInt();
		
		s.close();
		
		int GesamtTage=(AktuellJahr-Startjahr)*365;
		GesamtTage = GesamtTage+Schalttage;
		if(AktuellJahr %4 == 0 && AktuellMonat <= 2) {
			GesamtTage= GesamtTage-1;
		}
		
		switch(AktuellMonat) {
		case 12: GesamtTage += 30; // kein break: alle nachfolgenden
		case 11: GesamtTage += 31; // Anweisungen werden ausgeführt
		case 10: GesamtTage += 30;
		case 9: GesamtTage += 31;
		case 8: GesamtTage += 31;
		case 7: GesamtTage += 30;
		case 6: GesamtTage += 31;
		case 5: GesamtTage += 30;
		case 4: GesamtTage += 31;
		case 3: GesamtTage += 28;                        
		case 2: GesamtTage += 31;
		}
		 GesamtTage=GesamtTage+AktuellTag;
		 
		
		 GesamtTage=(GesamtTage%7);
		 
	

		
		String Ausgabe="";
		
		switch(GesamtTage) {
		case 0: Ausgabe="Sonntag";
		break;
		case 1: Ausgabe="Montag";
		break;
		case 2: Ausgabe="Dienstag";
		break;
		case 3: Ausgabe="Mittwoch";
		break;
		case 4: Ausgabe="Donnerstag";
		break;
		case 5: Ausgabe="Freitag";
		break;
		case 6: Ausgabe="Samstag";
		break;
		default: Ausgabe="Fehlerhafte Ausgabe";
		}
		System.out.println(Ausgabe+" der "+AktuellTag+"."+AktuellMonat+"."+AktuellJahr);
		
		
	}

}
