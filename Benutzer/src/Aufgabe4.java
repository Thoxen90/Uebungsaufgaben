import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		double Preis = 0.28;
		int Kilometer = 0;
		double Ergebnis = 0;
		double Preisab20 = 0.25;
		double Preisab50 = 0.20;
		
		System.out.println("Bitte geben Sie die gewünschte Strecke in Kilometern an:");
		Kilometer = s.nextInt();
		
		s.close();
		
		if(Kilometer<=20) {
		Ergebnis = (Preis*Kilometer);
		}
		if(Kilometer>20 && Kilometer<=50) {
			Ergebnis = (Preis*20+(Preisab20*(Kilometer-20)));
		}
		if(Kilometer>50) {
			Ergebnis = (Preis*20+(Preisab20*30)+(Preisab50*(Kilometer-50)));
		}
				
		System.out.println("");
		System.out.println("Fahrpreis für "+Kilometer+ " Kilometer: "+String.format("%1.2f €",Ergebnis));

		Ergebnis = 0; 
		
		//Alternativer Rechnungsweg---------------------------------------
		
		  for(int x=1 ; x<=Kilometer ; x++){
			  Ergebnis = Ergebnis + Preis;
			  switch(x){
			  	case 20: Preis = 0.25;
			  	break;
			  	case 50: Preis = 0.20;
			  	break;
			  }
		  }
		
		// Alternativer Rechnungsweg---------------------------------------  
 
		System.out.println("");
		System.out.println("Fahrpreis für "+Kilometer+ " Kilometer: "+String.format("%1.2f €", Ergebnis));

		}
	}




