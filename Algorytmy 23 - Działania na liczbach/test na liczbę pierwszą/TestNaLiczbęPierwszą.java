
public class TestNaLiczb�Pierwsz� {

	public static void main(String[] args) {
		int liczba = 8;
		System.out.println(czyJestLiczb�Pierwsz�(liczba));

	}

	static boolean czyJestLiczb�Pierwsz�(int liczba) {
		boolean jestLiczb�Pierwsz� = true;
		int reszta = 0;

		if (liczba == 1) {
			jestLiczb�Pierwsz� = false;
		}

		for (int i = 2; i <= Math.sqrt(liczba); i++) {
			reszta = liczba % i;
			if (reszta == 0) {
				jestLiczb�Pierwsz� = false;
			}
		}

		return jestLiczb�Pierwsz�;
	}

}
