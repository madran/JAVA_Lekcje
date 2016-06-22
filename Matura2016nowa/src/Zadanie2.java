import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("dane_6_2.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> s這wa = new ArrayList<>();
		ArrayList<Integer> klucze = new ArrayList<>();

		while (skaner.hasNextLine()) {
			s這wa.add(skaner.next());
			klucze.add(skaner.nextInt());
		}

		skaner.close();

		odszyfruj(s這wa, klucze);

	}

	static void odszyfruj(ArrayList<String> s這wa, ArrayList<Integer> klucze) {

		for (int i = 0; i < s這wa.size(); i++) {
			String s這wo = s這wa.get(i);
			int k = klucze.get(i);

			while (k >= 26) {
				k = k - 26;
			}

			String noweS這wo = "";
			
			for (int j = 0; j < s這wo.length(); j++) {
				int nowyZnak = (char) ((int) s這wo.charAt(j) - k);
				if (nowyZnak < 65)
					noweS這wo += (char) (nowyZnak + 26);
				else
					noweS這wo += (char) nowyZnak;
			}
			System.out.println(noweS這wo);
		}

	}

}