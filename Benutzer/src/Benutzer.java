/*	Aufgabenstellung: 	-schreibe ein Programm um eine beliebige Anzahl Berwerber anzulegen
 * 						-�berpr�fe in der Eingabe Vor- und Nachname sowie Alter, Besitz eines F�hrerscheins und Schulabschluss
 * 						-Lass dein Programm �berpr�fen ob die angelegten Personen vollj�hrig sind oder nicht
 * 						-stelle eine Eignung f�r den Job fest (Bedingung Bewerber vollj�hrig, im Besitz eines F�hrerscheins und Schulabschluss Abitur oder besser)
 * 						-fasse alle angelegten Bewerber zusammen und errechne ein Durchschnittsalter
 *						-Liste alle geeigneten Bewerber auf 
 */


import java.util.Scanner;

public class Benutzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		//es wird eine Scanner Methode initialisiert um Benutzer Eingaben abzufragen
		
		int Anzahl_Datensaetze;
		
		System.out.println("Guten Tag dies ist Ihr Assistent zum anlegen von neuen Bewerbern");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Wie viele Bewerber sollen angelegt werden?");
		
		Anzahl_Datensaetze = s.nextInt();
		// die erste Zahleneingabe legt fest wie viele Benutzer das System anlegt
		
		System.out.println("");
		
		int Alter[] = new int[Anzahl_Datensaetze];
		String[] Nachname = new String[Anzahl_Datensaetze];
		String[] Vorname = new String[Anzahl_Datensaetze];
		int sum=0, avg = 0;
		String[] Schulabschluss = new String[Anzahl_Datensaetze];
		String[] F�hrerschein = new String[Anzahl_Datensaetze];
		boolean Eignung, F�hrers = false;
		String Eig[] = new String[Anzahl_Datensaetze];
		//es werden mehrere Arrays und Variablen angelegt mit denen ich sp�ter arbeite
		
		for(int x=0;x<Anzahl_Datensaetze;x++) {
			// eine for schleife um die einzelnen Eintr�ge durchzugehen
			
			System.out.println("Vorname f�r "+(x+1)+". Bewerber");
			Vorname[x] = s.next();
			// die n�chste String Eingabe wird im Aktuellen Vornamen gespeichert
			
			System.out.println("");
			
			System.out.println("Nachname f�r "+(x+1)+". Bewerber");
			Nachname[x] = s.next();
			// selbe f�r Nachname
			
			System.out.println("");
			
			System.out.println("Alter f�r "+(x+1)+". Bewerber");
			Alter[x] = s.nextInt();
			// Zahlen eingabe f�r Alter
			
			s.nextLine();  //sinnfreier Input um einen absatz zwischen s.nextInt(); und s.nextLine() zu schaffen da sonst der s.nextline() Befehl einfach �bersprungen wurde
			
			System.out.println("");
			System.out.println("Schulabschluss von "+(x+1)+". Bewerber");
			Schulabschluss[x] = s.nextLine();
			// String Eingabe Schulabschluss
			
			System.out.println("");
			System.out.println("Ist "+(x+1)+". Bewerber im Besitz eines F�hrerscheins (Ja/Nein)");
			F�hrerschein[x] = s.next();
			
			System.out.println("");
			System.out.println(Vorname[x]+" "+Nachname[x]); //Ausgabe der eingegebenen Werte und best�tigung der Eingabe
			System.out.println("Eingabe erfolgreich");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("");
			
			sum = sum+Alter[x]; //aktuelles alter wird zu summe addiert
		}
		s.close();  //scanner methode wird wieder geschlossen um keine unn�tigen Ressourcen zu verbrauchen
		
		System.out.println("Zusammenfassung Bewerber:");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		for(int z=0; z<Anzahl_Datensaetze; z++) {
			String erw;
			
			if(Alter[z]>=18) {
				erw = "-vollj�hrig-";
				}else {
				erw = "-minderj�hrig-";
			}
			// eine if abfrage um zu ermitteln ob angelegte Benutzer vollj�hrig ist oder nicht
			
			switch(F�hrerschein[z]) {
			case "Ja": F�hrers = true;
			break;
			case "J" : F�hrers = true;
			break;
			case "Nein": F�hrers = false;
			break;
			case "N" : F�hrers = false;
			break;
			case "+" : F�hrers = true;
			break;
			case "-" : F�hrers = false;
			break;
			default: F�hrers = false;
			}
			// eine switch case Abfrage um den Besitz eines F�hrerscheins zu pr�fen
			
			switch (Schulabschluss[z]) {
					case "MittlereReife": Eignung = false;
					break;
					case "FachhochschulReife": Eignung = true;
					break;
					case "Hauptschulabschluss": Eignung = false;
					break;
					case "Fachabitur": Eignung = true;
					break;
					case "FachgebundeneHochschulreife": Eignung = true;
					break;
					case "FachoberschulReife": Eignung = true;
					break;
					case "Abitur": Eignung = true;
					break;
					case "Studium": Eignung = true;
					break;
					case "Abi": Eignung = true;
					break;
					case "Student": Eignung = true;
					break;
					case "AllgemeineHochschulreife": Eignung = true;
					break;
					case "Mittlere-Reife": Eignung = false;
					break;
					case "Fachhochschul-Reife": Eignung = true;
					break;
					case "Hauptschul-Abschluss": Eignung = false;
					break;
					case "Fachgebundene-Hochschulreife": Eignung = true;
					break;
					case "Fachoberschul-Reife": Eignung = true;
					break;
					case "Allgemeine-Hochschulreife": Eignung = true;
					break;
					case "Mittlere Reife": Eignung = false;
					break;
					case "Fachhochschul Reife": Eignung = true;
					break;
					case "Hauptschul Abschluss": Eignung = false;
					break;
					case "Fachgebundene Hochschulreife": Eignung = true;
					break;
					case "Fachoberschul Reife": Eignung = true;
					break;
					case "Allgemeine Hochschulreife": Eignung = true;
					break;
					default: Eignung = false;
			}
			// eine switch case abfrage um zu ermitteln ober der Angegebene Schulabschluss f�r den Job geeignet ist oder nicht
			
			if(Eignung == true && erw == "-vollj�hrig-" && F�hrers == true) {
				Eig[z] = "Ist f�r den Job geeignet";
				} else {
				Eig[z] = "Ist nicht f�r den Job geeignet";
			}
			// Eignung f�r den Job wird festgestellt
			
			System.out.println(Vorname[z]+" "+Nachname[z]+ " "+Alter[z]+" "+erw+" |"+Schulabschluss[z]+"| Im Besitz eines F�hrerscheins: "+F�hrerschein[z]+" | "+Eig[z]);
		}
		
		avg = sum / Anzahl_Datensaetze;		// Durchschnittsalter Benutzer
		
		System.out.println("");
		System.out.println("Durchschnittsalter: "+avg);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println("");
		System.out.println("Zusammenfassung geeigneter Bewerber");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		for(int q=0;q<Anzahl_Datensaetze;q++) {
			if(Eig[q]=="Ist f�r den Job geeignet") {
				System.out.println(Vorname[q]+" "+Nachname[q]);
			}
		}
		//alle geeignete Bewerber werden separat aufgelistet
		System.out.println("-----------------------------------------------------------------------------------------------");
		
	}
}


