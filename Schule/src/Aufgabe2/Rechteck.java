package Aufgabe2;

public class Rechteck {

	private double Laenge, Breite;
	public double Umfang, Fl�che;

	public double getLaenge() {
		return Laenge;
	}

	public void setLaenge(double Laenge) {
		if (this.Laenge < 0) {
			System.out.println("Fehler! Die L�nge eines Rechtecks kann nicht kleiner als 0 sein!");
			this.Laenge = 0;
		} else {
			this.Laenge = Laenge;
		}
	}

	public double getBreite() {
		return Breite;
	}

	public void setBreite(double Breite) {
		if (this.Breite < 0) {
			System.out.println("Fehler! Die Breite eines Rechtecks kann nicht kleiner als 0 sein!");
			this.Breite = 0;
		} else {
			this.Breite = Breite;
		}
	}

	public void ErrechneUmfang() {
		this.Umfang = Laenge * 2 + Breite * 2;
	}

	public void ErrechneFl�che() {
		this.Fl�che = Laenge * Breite;
	}

}
