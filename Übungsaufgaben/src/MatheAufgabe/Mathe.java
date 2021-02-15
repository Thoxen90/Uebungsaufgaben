package MatheAufgabe;

public class Mathe {

	public static void main(String[] args) {

		double x = 3.5;
		double y = -4.5542;
		System.out.println(add(x, y));
		System.out.println("--------------");
		x = 3.5;
		System.out.println(sub(x, y));
		System.out.println("--------------");
		x = add(x, 0);
		System.out.println(x + " | " + y);
		System.out.println("--------------");

		if (x == add(sub(x, y), y)) {
			System.out.println("Erfolg");
		} else {
			System.out.println("Fehler");
		}

		System.out.println(x + " 	 " + y);
		System.out.println(mul(x, y));

		x = 7;
		y = 2.5;
		System.out.println(x + " 	|	" + y);
		System.out.println(div(x, y));
		System.out.println("--------------");
		System.out.println(pow(2, 0));
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static double sub(double x, double y) {
		// if (x - y >= 0) {
		return x - y;
		// } else {
		// return y - x;
		// }
	}

	public static double mul(double x, double y) {
		double z = 0;
		if (y > 0) {
			for (double i = 1; i <= y; i++) {
				z += x;
				if (y - i < 1) {
					double temp = mul2((y - i), 100);
					z += mul(x, temp) / 100;
				}
			}
		} else if (y < 0) {
			for (double i = -1; i >= y; i--) {
				z -= x;
				if (y - i > -1) {
					double temp = mul2((y - i), 100);
					z += mul(x, temp) / 100;
				}
			}
		} else {
			z = 0;
		}
		return z;
	}

	public static double mul2(double x, double y) {
		double z = 0;
		if (y > 0) {
			for (double i = 1; i <= y; i++) {
				z += x;
			}
		} else if (y < 0) {
			for (double i = -1; i >= y; i--) {
				z -= x;
			}
		} else {
			z = 0;
		}
		return z;
	}

	public static double div(double x, double y) {
		double zähler = 0;
		while (x - y >= 0) {
			x -= y;
			zähler++;
		}
		return zähler;
	}

	public static double pow(int basis, int exponent) {
		double erg = basis;
		if (exponent == 1) {
			erg = basis;
		} else if (exponent == 0) {
			erg = 1;
		} else {
			for (int i = 1; i < exponent; i++) {
				erg = mul(erg, basis);
			}
		}
		return erg;
	}

}
