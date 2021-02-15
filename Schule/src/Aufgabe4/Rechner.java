package Aufgabe4;

import java.util.Scanner;

public class Rechner {

	public static void main(String[] args) {

		Rechner neu = new Rechner();
		neu.setDecimal();
		neu.errechneBinär();
		neu.errechneOktal();
		neu.errechneHexa();
	

	}

	Scanner s = new Scanner(System.in);

	private int decimal = 0;
	private int stellen = 0, stellenhexa = 0,stellenoktal = 0;
	static char[] HexaTabelle = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
	String Hexa="";

	public int getDecimal() {
		return decimal;
	}

	public void setDecimal() {
		System.out.println("Bitte gegeben Sie eine Decimal Zahl ein: ");
		this.decimal = s.nextInt();
	}

	public void errechneBinär() {

		int tempDecimal = decimal, tempDecimal2 = decimal;

		while (tempDecimal != 0) {
			tempDecimal /= 2;
			stellen++;
		}

		int binär[] = new int[stellen];

		for (int i = 0; i < stellen; i++) {
			binär[i] = tempDecimal2 % 2;
			tempDecimal2 /= 2;
		}

		System.out.println("Umgerechnet in Binärzahl: ");

		for (int i = stellen - 1; i >= 0; i--) {
			System.out.print(binär[i]);
		}
		System.out.println();

	}

	public void errechneOktal() {

		int tempDecimal = decimal,tempDecimal2 = decimal;
		
		System.out.println("Umgerechnet in Oktal: ");
		
		while(tempDecimal!=0) {
			tempDecimal /= 8;
			stellenoktal++;
		}
		
		int Oktal[]= new int[stellenoktal];
		
		for(int i = 0; i<stellenoktal;i++) {
			Oktal[i]=tempDecimal2%8;
			tempDecimal2/=8;
		}
		
		for(int i = stellenoktal -1 ; i >= 0; i--) {
			System.out.print(Oktal[i]);
		}
		
	}

	public void errechneHexa() {

		int tempDecimal = decimal;
		int tempDecimal2 = decimal;
		
		System.out.println();
		System.out.println("Umgerechnet in Hexadecimal: ");

		while (tempDecimal != 0) {
			tempDecimal /= 16;
			stellenhexa++;
		}
		
		for(int i = 0; i < stellenhexa;i++) {
			Hexa= HexaTabelle[tempDecimal2 % 16] + Hexa;
			tempDecimal2 /= 16;
		}
		
		System.out.println(Hexa);
		System.out.println();

	}

	

}
