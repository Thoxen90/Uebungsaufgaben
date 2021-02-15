import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int Menge;
		double Preis;
		double Bestellwert;
		double Versandkosten = 5.50;
		double Rechnungsbetrag;
		
		System.out.println("Bitte geben Sie die gewünschte Menge ein:");
		Menge = s.nextInt();
		System.out.println("");
		
		System.out.println("Bitte geben Sie den Preis ein:");
		Preis = s.nextDouble();
		System.out.println("");
		
		s.close();
		
		Bestellwert = Menge*Preis;
		
		if(Bestellwert<100) {
			Versandkosten = 5.50;
		}
		if(Bestellwert>=100 && Bestellwert<200) {
			Versandkosten = 3.00;
		}
		if(Bestellwert>=200) {
			Versandkosten = 0;
		}
		
		Rechnungsbetrag = Bestellwert+Versandkosten;
		
		System.out.println("Bestellwert: "+Bestellwert+"€    Versandkosten: "+Versandkosten+"€    Rechnunsbetrag: "+Rechnungsbetrag+"€");
	}

}
