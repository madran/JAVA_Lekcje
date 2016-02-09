
public class LiczbyPierwsze {

	public static void main(String[] args) {

		int liczba = 100;
		int[] tablica = znajdŸLiczbyPierwsze(liczba);
		boolean[] tablicaLiczb = sitoEratostenesa(liczba);

		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + ", ");
		}

		System.out.println();

		for (int i = 0; i < tablicaLiczb.length; i++) {
			if (tablicaLiczb[i] == false) {
				System.out.print(i + ", ");
			}
		}

	}

	static int[] znajdŸLiczbyPierwsze(int liczba) {

		int j = 0;

		for (int i = 2; i <= liczba; i++) {

			if (SumaCyfrPierwszych.czyJestLiczb¹Pierwsz¹(i)) {
				j++;
			}
		}

		int[] tablica = new int[j];
		j = 0;

		for (int i = 2; i <= liczba; i++) {

			if (SumaCyfrPierwszych.czyJestLiczb¹Pierwsz¹(i)) {
				tablica[j] = i;
				j++;
			}
		}

		return tablica;
	}

	static boolean[] sitoEratostenesa(int liczba) {

		boolean[] tablicaLiczb = new boolean[liczba + 1]; // domyœlnie false -
															// liczby pierwsze
		tablicaLiczb [0] = true;
		tablicaLiczb [1] = true;


		for (int i = 2; i * i <= tablicaLiczb.length; i++) {

			for (int j = i * 2; j < tablicaLiczb.length; j = j + i) {

				tablicaLiczb[j] = true;

			}
		}
		return tablicaLiczb;
	}
}
