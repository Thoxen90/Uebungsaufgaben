import java.util.Scanner;

public class Bytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine beliebige Anzahl an Bytes an:");
		long Byte = s.nextLong();
		String Titel = "Byte";
		double BytesMetrisch = 0;
		
		s.close();
		
		if(Byte>=1000 && Byte <1000000) {
			BytesMetrisch = Byte /1000.0;
			Titel = "KByte";			
		}
		if(Byte>=1000000 && Byte <1000000000) {
			BytesMetrisch = Byte / 1000000.0;
			Titel = "MByte";
		}
		if(Byte>=1000000000) {
			BytesMetrisch = Byte/1000000000.0;
			Titel = "GByte";
		}
		System.out.println(Byte+" Byte sind "+BytesMetrisch+" "+Titel);
		
	}

}
