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

		if (czyJestLiczb¹Pierwsz¹(reszta)) {
			suma = suma + reszta;
		}

		while (liczba > 10) {
			liczba = (liczba - reszta) / 10;
			reszta = liczba % 10;

			if (czyJestLiczb¹Pierwsz¹(reszta)) {
				suma = suma + reszta;
			}
		}

		return suma;
	}

	static boolean czyJestLiczb¹Pierwsz¹(int liczba) {
		boolean jestLiczb¹Pierwsz¹ = true;
		int reszta = 0;

		if (liczba == 1) {
			jestLiczb¹Pierwsz¹ = false;
		}

		for (int i = 2; i <= liczba / 2; i++) {
			reszta = liczba % i;
			if (reszta == 0) {
				jestLiczb¹Pierwsz¹ = false;
			}
		}

		return jestLiczb¹Pierwsz¹;
	}

}
