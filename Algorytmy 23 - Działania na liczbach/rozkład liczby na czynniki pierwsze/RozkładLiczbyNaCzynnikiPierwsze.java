
public class RozkładLiczbyNaCzynnikiPierwsze {

	public static void main(String[] args) {
		rozkład(40);

	}

	public static void rozkład(int liczba) {
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
