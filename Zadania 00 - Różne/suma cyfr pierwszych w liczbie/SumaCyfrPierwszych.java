public class SumaCyfrPierwszych {

	public static void main(String[] args) {

		int liczba = 212345;

		int suma = sumujLiczbyPierwsze(liczba);
		System.out.println("Suma cyfr pierwszych w liczbie:");
		System.out.println(suma + " ! :D");

	}

	static int sumujLiczbyPierwsze(int liczba) {

		int suma = 0;

		int reszta = liczba % 10;

		if (czyJestLiczb�Pierwsz�(reszta)) {
			suma = suma + reszta;
		}

		while (liczba > 10) {
			liczba = (liczba - reszta) / 10;
			reszta = liczba % 10;

			if (czyJestLiczb�Pierwsz�(reszta)) {
				suma = suma + reszta;
			}
		}

		return suma;
	}

	static boolean czyJestLiczb�Pierwsz�(int liczba) {
		boolean jestLiczb�Pierwsz� = true;
		int reszta = 0;

		if (liczba == 1) {
			jestLiczb�Pierwsz� = false;
		}

		for (int i = 2; i <= liczba / 2; i++) {
			reszta = liczba % i;
			if (reszta == 0) {
				jestLiczb�Pierwsz� = false;
			}
		}

		return jestLiczb�Pierwsz�;
	}

}
