package Wetterstation;

public class Wetter {

	public static void main(String[] args) {

		int Temperatur[] = { 12, 13, 9, 12, 15, 16, 15, 16, 11, 8, 13, 13, 15, 12 };
		int Max = Temperatur[0], Min = Temperatur[0];
		int Schnitt= 0;
		int Differenz=0, Tage =0;

		for ( int i = 0; i < Temperatur.length; i++ ) {
			Schnitt = Schnitt + Temperatur[i];
			if(i<Temperatur.length-1) {
				if(Temperatur[i]-Temperatur[i+1]>Differenz||Temperatur[i+1]-Temperatur[i]>Differenz) {
					Differenz = Temperatur[i]-Temperatur[i+1];
					Tage = i+1;
				}
			}
			if (Temperatur[i] > Max) {
				Max = Temperatur[i];
			} else if (Temperatur[i] < Min) {
				Min = Temperatur[i];
			}
		}
		
		Schnitt /= Temperatur.length;
		
		System.out.println("Durchschnitts Temperatur: "+Schnitt+"°C");
		System.out.println("Max. Temperatur: "+Max+"°C	|	Min. Temperatur: "+Min+"°C");
		System.out.println("Größte Differenz: "+Differenz+"°C 	|	Tage: "+Tage+" bis "+(Tage+1));
	}

}
