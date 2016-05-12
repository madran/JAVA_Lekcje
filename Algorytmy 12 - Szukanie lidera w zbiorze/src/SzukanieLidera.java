
public class SzukanieLidera {

	public static void main(String[] args) {
		int[] zbior = {1, 2, 1, 3, 3, 3, 3, 2, 3};
		System.out.println(szukanieLidera(zbior));
	}

	public static Integer szukanieLidera(int[] zbior) {
		int lider = 0;
		int licznik = 0;

		for (int i = 0; i < zbior.length; i++)
			if (licznik == 0) {
				lider = zbior[i];
				licznik = 1;
			} else {
				if (lider == zbior[i]) {
					licznik++;
				} else {
					licznik--;
				}
			}

		// Sprawdzamy, czy mamy lidera

		if (licznik == 0) {
			return null;
		} else {
			licznik = 0;
			for (int i = 0; i < zbior.length; i++) {
				if (lider == zbior[i]) {
					licznik++;
				}
			}

			if (licznik > zbior.length / 2) {
				return new Integer(lider);
			} else {
				return null;
			}
		}
	}

}
