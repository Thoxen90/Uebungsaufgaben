package Aufgabe6;

import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int Einkommen = 0;
		int AnzahlKinder = -1;
		int KinderGeld = 0;
		
		System.out.println("Assisten zum errechnen von Kindergeld");
		System.out.println("--------------------------------------------------------");
		System.out.println("");
		System.out.println("Bitte geben Sie Ihr Jahreseinkommen an:");
		Einkommen = s.nextInt();
		
		while(AnzahlKinder<0) {
		System.out.println("");
		System.out.println("Bitte geben Sie die Anzahl Ihrer Kinder an:");
		AnzahlKinder = s.nextInt();
		if(AnzahlKinder <0) {
			System.out.println("Man kann nicht weniger als 0 Kinder haben");
			System.out.println("");
		}
		}
		
		s.close();
		
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		System.out.println("Ergebnis:");
		System.out.println("");
		System.out.println("Jahreseinkommen: 	"+Einkommen+"€");
		System.out.println("Anzahl der Kinder: 	"+AnzahlKinder);
		
		if(Einkommen<45000)
			switch (AnzahlKinder) {
			case 0: KinderGeld = 0;
			break;
			case 1: KinderGeld = 70;
			break;
			case 2: KinderGeld = (70+130);
			break;
			case 3: KinderGeld = (70+130+220);
			break;
			default: KinderGeld = (70+130+220+(240*(AnzahlKinder-3)));
			}
		else if(Einkommen>=45000)
			switch (AnzahlKinder) {
			case 0: KinderGeld = 0;
			break;
			case 1: KinderGeld = 70;
			break;
			case 2: KinderGeld = (70+70);
			break;
			case 3: KinderGeld = (70+70+140);
			break;
			default: KinderGeld = (70+70+140+(140*(AnzahlKinder-3)));
			}
				
		
		System.out.println("Ergebnis: 		"+KinderGeld+"€ Kindergeld");
		
	}

}
