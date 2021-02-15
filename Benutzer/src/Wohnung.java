import java.util.Scanner;

public class Wohnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int Gehalt = 0, Personen = 0;
		String Wohnung[] = new String[4];
		int Preis[] = new int[4];
		int Größe[] = new int[4];
		
		
		Wohnung[0]= "Wohnung 1";
		Preis[0]=250;
		Größe[0]=1;
		
		Wohnung[1]= "Wohnung 2";
		Preis[1]= 1200;
		Größe[1]= 6;
		
		Wohnung[2]= "Wohnung 3";
		Preis[2]=750;
		Größe[2]=4;
		
		Wohnung[3]="Wohnung 4";
		Preis[3]=450;
		Größe[3]=3;
		
		System.out.println("Bitte geben Sie Ihr monatliches Gehalt an:");
		Gehalt = s.nextInt();
		
		System.out.println("Bitte geben Sie die Anzahl Ihrer Familienmitglieder an:");
		Personen = s.nextInt();
		
		s.close();
		
		for(int x=0;x<Wohnung.length;x++) {
			if(Gehalt>=Preis[x] && Personen <=Größe[x]) {
				System.out.println("Passende Wohnung: "+Wohnung[x]+ " Miete: "+Preis[x]+" € für "+Größe[x]+" Personen");
			}
		}
		
		
	}

}
