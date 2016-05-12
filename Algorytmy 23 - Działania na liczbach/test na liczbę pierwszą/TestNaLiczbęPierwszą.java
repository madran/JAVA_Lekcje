
public class TestNaLiczbêPierwsz¹ {

	public static void main(String[] args) {
		int liczba = 8;
		System.out.println(czyJestLiczb¹Pierwsz¹(liczba));

	}

	static boolean czyJestLiczb¹Pierwsz¹(int liczba) {
		boolean jestLiczb¹Pierwsz¹ = true;
		int reszta = 0;

		if (liczba == 1) {
			jestLiczb¹Pierwsz¹ = false;
		}

		for (int i = 2; i <= Math.sqrt(liczba); i++) {
			reszta = liczba % i;
			if (reszta == 0) {
				jestLiczb¹Pierwsz¹ = false;
			}
		}

		return jestLiczb¹Pierwsz¹;
	}

}
