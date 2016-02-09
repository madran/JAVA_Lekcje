package test;

public class Test {

	public static void main(String[] args) {

//		char [] tablica = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
//		int indeks = 5;
//		int d�ugo��  = 5;
//		char [] tablicaBezPodci�gu = usu�Podci�g (tablica, indeks, d�ugo��);
//
//
//
//		System.out.println();
//		System.out.println();
//		System.out.print("Tablica bez podci�gu");
//		System.out.println();
//
//		for (int i = 0; i < tablicaBezPodci�gu.length; i++){
//			System.out.print(tablicaBezPodci�gu[i] + ", ");
//		}

		rek(10);

	}

	static int rek(int a) {
		if (a > 0) {
			System.out.println(a);
			return rek(a - 1);
		} else
			return 0;
	}

	static char [] usu�Podci�g (char [] tablica, int indeks, int d�ugo��){

		char [] tablicaBezPodci�gu = new char [tablica.length - d�ugo��];


//		for (int i = 0; i < tablica.length; i++){
//
//			if (i < indeks){
//				tablicaBezPodci�gu [i] = tablica [i];
//			}
//
//			if (i > indeks + d�ugo�� - 1){
//				tablicaBezPodci�gu [i - d�ugo��] = tablica [i];
//			}
//		}

		for (int i = 0; i < indeks; i++) {
			tablicaBezPodci�gu [i] = tablica [i];
		}

		for (int i = indeks + d�ugo��; i < tablica.length; i++) {
			tablicaBezPodci�gu [i - d�ugo��] = tablica [i];
		}



		return tablicaBezPodci�gu;
	}

	static int liczbaUrodzenia(int dzie�, int miesi�c, int rok) {

		int liczba = dzie� + miesi�c + rok;

		int reszta = liczba % 10; // 7;

		int liczbaUrodzenia = reszta;

		while (liczba > 10) {
			liczba = (liczba - reszta) / 10; // 198; 19; 1
			reszta = liczba % 10; // 8; 9; 1
			liczbaUrodzenia = liczbaUrodzenia + reszta; // 8; 17; 18

			if(liczbaUrodzenia > 10 && liczba < 10) {
				liczba = liczbaUrodzenia;
				reszta = liczbaUrodzenia = liczba % 10;
			}
		}

		return liczbaUrodzenia;
	}

	static int gcd1(int a, int b) {
		int gcd = 1;

		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}

		return gcd;
	}

	static int gcd2(int a, int b) {
		int gcd = 1;

		int min = a < b ? a : b;

		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
		}

		return gcd;
	}

	// Algorytm Euklidesa opiera si� na za�o�eniu, �e najwi�kszy wsp�lny
	// dzielnik dw�ch liczb nie zmienia si�,
	// je�eli od wi�kszej liczby odejmujemy mniejsz�.
	static int gcd3(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}

		return a;
	}

	static int gcd4(int a, int b) {
		int c;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}

		return a;
	}

	// Algorytm binarny - najbardziej wydajny.
	static int gcd5(int a, int b) {
		int d = 1;
		while ((a % 2 == 0) && (b % 2 == 0)) {
			a = a / 2;
			b = b / 2;
			d = d * 2;
		}

		while (a > 0) {
			if (a % 2 == 0) {
				a = a / 2;
			} else if (b % 2 == 0) {
				b = b / 2;
			} else {
				int t = a - b;
				t = (a - b) > 0 ? t : -t;
				t = (a - b) / 2;
				if (a < b) {
					b = t;
				} else {
					a = t;
				}
			}
		}

		return d * b;
	}
}
