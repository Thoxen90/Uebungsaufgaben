import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int Anzahl = 0;
		
		System.out.println("Bitte geben Sie an wie viele Zahlen eingelesen werden sollen:");
		Anzahl = s.nextInt();
		System.out.println("");
		
		int Eingabe[] = new int[Anzahl];
		String Ausgabe[] =new String[Anzahl];
		
		for(int x=0;x<Anzahl;x++) {
			System.out.println("Bitte geben Sie die "+(x+1)+". Zahl ein");
			Eingabe[x] = s.nextInt();
				
			switch(Eingabe[x]) {
				case 0 : Ausgabe[x] = "Null";
				break;
				case 1 : Ausgabe[x] = "Eins";
				break;
				case 2 : Ausgabe[x] = "Zwei";
				break;
				case 3 : Ausgabe[x] = "Drei";
				break;
				case 4 : Ausgabe[x] = "Vier";
				break;
				case 5 : Ausgabe[x] = "Fünf";
				break;
				case 6 : Ausgabe[x] = "Sechs";
				break;
				case 7 : Ausgabe[x] = "Sieben";
				break;
				case 8 : Ausgabe[x] = "Acht";
				break;
				case 9 : Ausgabe[x] = "Neun";
				break;
				case 10 : Ausgabe[x] = "Zehn";
			}
		
			System.out.println("Eingabe: "+Eingabe[x]+"     Ausgabe: "+Ausgabe[x]);
			System.out.println("");
		
		}
		
		s.close();
	}

}
