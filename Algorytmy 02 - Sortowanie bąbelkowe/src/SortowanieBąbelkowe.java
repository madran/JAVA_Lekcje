public class SortowanieB¹belkowe {


	public static void main(String[] args) {

//		int [] tablica = {7, 2, 5, 1, 3, 6, 4};
		int [] tablica = {1, 2, 3, 4, 5, 6, 7};

		int [] tablicaPosortowana = new int [7];

		tablicaPosortowana = sortujJeszczeLepiej(tablica);


		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablicaPosortowana [i] + ", ");
		}


	}

	//Ulepszone sortowanie b¹belkowe ze sprawdzaniem czy tablica jest ju¿ posortowana
	static int [] sortujJeszczeLepiej(int [] tablica) {
		int x = 0;
		boolean jestPosortowana = false;


		for (int i = 0; i < tablica.length && jestPosortowana == false; i++) {				// powoduje, ¿e pêtla j przechodzi przez tablice wiele razy

			for (int j = tablica.length - 1; j > i; j--) {

				if (tablica [j - 1] > tablica [j]) {
					int a = tablica [j];
					tablica [j] = tablica [j - 1];
					tablica [j - 1] = a;

					jestPosortowana = false;
				}

				else {
					jestPosortowana = true;
				}

				x++;
			}

		}

		return tablica;
	}


	//Ulepszone sortowanie b¹belkowe
	static int [] sortujLepiej (int [] tablica) {
		int x = 0;

		for (int i = 0; i < tablica.length; i++) {				// powoduje, ¿e pêtla j przechodzi przez tablice wiele razy

			for (int j = tablica.length - 1; j > i; j--) {

				if (tablica [j - 1] > tablica [j]) {
					int a = tablica [j];
					tablica [j] = tablica [j - 1];
					tablica [j - 1] = a;
				}
				x++;
			}

		}

		return tablica;

	}


	//Standardowe sortowanie b¹belkowe
	static int [] sortuj (int [] tablica) {
		int y = 0;

		for (int i = 0; i < tablica.length - 1; i++) {

			for (int j = 0; j < tablica.length - 1; j++) {

				if (tablica [j] > tablica [j + 1]) {
					int a = tablica [j];
					tablica [j] = tablica [j + 1];
					tablica [j + 1] = a;
				}
				y++;
			}

		}

		return tablica;

	}


}

