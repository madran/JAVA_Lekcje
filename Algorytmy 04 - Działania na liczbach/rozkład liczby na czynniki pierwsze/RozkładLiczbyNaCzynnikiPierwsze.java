
public class Rozk�adLiczbyNaCzynnikiPierwsze {

	public static void main(String[] args) {
		rozk�ad(40);

	}

	public static void rozk�ad(int liczba) {
		int i = 2;
		while (liczba > 1)
		{
			while (liczba % i == 0)
			{
				System.out.println(liczba + "\t" + i);
				liczba = liczba / i;
			}
			i++;
		}
	}

}
