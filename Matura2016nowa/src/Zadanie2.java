import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("dane_6_2.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> s�owa = new ArrayList<>();
		ArrayList<Integer> klucze = new ArrayList<>();

		while (skaner.hasNextLine()) {
			s�owa.add(skaner.next());
			klucze.add(skaner.nextInt());
		}

		skaner.close();

		odszyfruj(s�owa, klucze);

	}

	static void odszyfruj(ArrayList<String> s�owa, ArrayList<Integer> klucze) {

		for (int i = 0; i < s�owa.size(); i++) {
			String s�owo = s�owa.get(i);
			int k = klucze.get(i);

			while (k >= 26) {
				k = k - 26;
			}

			String noweS�owo = "";
			
			for (int j = 0; j < s�owo.length(); j++) {
				int nowyZnak = (char) ((int) s�owo.charAt(j) - k);
				if (nowyZnak < 65)
					noweS�owo += (char) (nowyZnak + 26);
				else
					noweS�owo += (char) nowyZnak;
			}
			System.out.println(noweS�owo);
		}

	}

}