package Aufgabe2;

public class TestFiguren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kreis Test = new Kreis();
		Test.setRadius(2.5);
		Test.ErrechneUmfang();
		Test.ErrechneFläche();

		System.out.println("Kreis: ");
		System.out.println("Radius: " + Test.getRadius() + " | Umfang: " + String.format("%1.2f", Test.Umfang)
				+ " | Fläche: " + String.format("%1.2f", Test.Fläche));
		System.out.println();

		Rechteck Test2 = new Rechteck();
		Test2.setLaenge(4.5);
		Test2.setBreite(6.5);
		Test2.ErrechneUmfang();
		Test2.ErrechneFläche();

		System.out.println("Rechteck: ");
		System.out.println("Länge: " + Test2.getLaenge() + " | Breite: " + Test2.getBreite() + " | Umfang: "
				+ String.format("%1.2f", Test2.Umfang) + " | Fläche: " + String.format("%1.2f", Test2.Fläche));
		System.out.println();
	}

}
