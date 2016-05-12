public class LiczbyPierwsze {

	public static void main(String[] args) {

		int liczba = 100;
		boolean[] tablicaLiczb = sitoEratostenesa(liczba);

		for (int i = 0; i < tablicaLiczb.length; i++) {
			if (tablicaLiczb[i] == false) {
				System.out.print(i + ", ");
			}
		}

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