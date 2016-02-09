
public class Rozk³adLiczbyNaCzynnikiPierwsze {

	public static void main(String[] args) {
		int liczba = 780;
		roz³ó¿LiczbêNaCzynnikiPierwsze(liczba);
	}

	static void roz³ó¿LiczbêNaCzynnikiPierwsze(int liczba) {
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