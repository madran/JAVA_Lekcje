
public class Rozk³adLiczbyNaCzynnikiPierwsze {

	public static void main(String[] args) {
		rozk³ad(40);

	}

	public static void rozk³ad(int liczba) {
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
