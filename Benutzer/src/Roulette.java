import java.lang.Math;

public class Roulette {

	public static void main(String[] args) {
	
		int MaxEinsatz = 0;
		int Summe = 0;
		int Gewinn = 0;
	
	for(int Spiel = 1; Spiel<=1000000; Spiel++) {
		int Einsatz=1;
		while(Math.random()<0.5) {
			Einsatz = Einsatz*2;
			Gewinn = Gewinn-Einsatz;
			if (MaxEinsatz<Einsatz) {
				MaxEinsatz = Einsatz;
			}
			
		Gewinn = Gewinn+Einsatz*2;
		Summe = Summe+Einsatz;

	}

	}
	System.out.println("Gewonnene Summe: "+Gewinn);
	Gewinn = Gewinn -Summe;
	System.out.println("MaxEinsatz: "+MaxEinsatz);
	System.out.println("Eingesetze Summe: "+Summe);
	System.out.println("Gewinn: "+Gewinn);
}
}