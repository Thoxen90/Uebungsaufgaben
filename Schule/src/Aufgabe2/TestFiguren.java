package Aufgabe2;

public class TestFiguren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kreis Test = new Kreis();
		Test.setRadius(2.5);
		Test.ErrechneUmfang();
		Test.ErrechneFl�che();

		System.out.println("Kreis: ");
		System.out.println("Radius: " + Test.getRadius() + " | Umfang: " + String.format("%1.2f", Test.Umfang)
				+ " | Fl�che: " + String.format("%1.2f", Test.Fl�che));
		System.out.println();

		Rechteck Test2 = new Rechteck();
		Test2.setLaenge(4.5);
		Test2.setBreite(6.5);
		Test2.ErrechneUmfang();
		Test2.ErrechneFl�che();

		System.out.println("Rechteck: ");
		System.out.println("L�nge: " + Test2.getLaenge() + " | Breite: " + Test2.getBreite() + " | Umfang: "
				+ String.format("%1.2f", Test2.Umfang) + " | Fl�che: " + String.format("%1.2f", Test2.Fl�che));
		System.out.println();
	}

}
