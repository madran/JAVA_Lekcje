
public class RozkładLiczbyNaCzynnikiPierwsze {

	public static void main(String[] args) {
		int liczba = 780;
		rozłóżLiczbęNaCzynnikiPierwsze(liczba);
	}

	static void rozłóżLiczbęNaCzynnikiPierwsze(int liczba) {
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