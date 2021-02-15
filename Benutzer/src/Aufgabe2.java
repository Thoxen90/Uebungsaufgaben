import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		double BMI;
		double Gewicht;
		double Größe;
		int Kalorien = 0;
		
		System.out.println("Bitte geben Sie Ihre größe in Metern an:");
		Größe = s.nextDouble();
		System.out.println("");
		
		System.out.println("Bitte geben Sie Ihr Gewicht in kg an:");
		Gewicht = s.nextDouble();
		
		s.close();
		
		BMI = Gewicht/(Größe*Größe);
		
		if(BMI < 18.5) {
			Kalorien = 3000;
		}
		if(BMI>=18.5 && BMI <25) {
			Kalorien = 2000;
		}
		if(BMI>=25 && BMI <30) {
			Kalorien = 1800;
		}
		if(BMI>=30 && BMI <40) {
			Kalorien = 1200;
		}
		if(BMI>=40) {
			Kalorien = 700;
		}
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Ergebnis: BMI = "+String.format("%1.1f", BMI)+"    Empfohlene Kalorien = "+Kalorien);
		
	}

}
