
public class Rozk�adLiczbyNaCzynnikiPierwsze {

	public static void main(String[] args) {
		int liczba = 780;
		roz��Liczb�NaCzynnikiPierwsze(liczba);
	}

	static void roz��Liczb�NaCzynnikiPierwsze(int liczba) {
		int i = 2;

		while (i <= liczba) {

				while (liczba % i == 0){
					liczba = liczba / i;
					System.out.println(i);
				}

			i++;

		}

	}
}