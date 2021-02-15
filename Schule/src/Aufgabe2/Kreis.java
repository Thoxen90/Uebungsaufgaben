package Aufgabe2;

public class Kreis {

	private double Radius;
	public double Umfang;
	public double Fl�che;

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double Radius) {
		if (Radius < 0) {
			System.out.println("Fehler! Der Radius kann nicht kleiner als 0 sein.");
			this.Radius = 0;
		} else {
			this.Radius = Radius;
		}
	}

	public void ErrechneUmfang() {
		this.Umfang = Radius * 2 * Math.PI;
	}

	public void ErrechneFl�che() {
		this.Fl�che = Math.PI * Radius * Radius;
	}

}
