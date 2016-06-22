import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("anagram.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> anagramy = new ArrayList<>();

		while (skaner.hasNextLine()) {
			anagramy.add(skaner.nextLine());
		}

		skaner.close();

		System.out.println("ZADANIE 1");
		zadanie1(anagramy);
		System.out.println();

		System.out.println("ZADANIE 2");
		zadanie2(anagramy);

	}

	static void zadanie1(ArrayList<String> anagramy) {

		for (String a : anagramy) {
			String[] tablicaPojedyñczychWyrazów = a.split(" ");
			int zmienna = 0;

			for (int i = 1; i < tablicaPojedyñczychWyrazów.length; i++) {

				if (tablicaPojedyñczychWyrazów[0].length() == tablicaPojedyñczychWyrazów[i].length()) {
					zmienna++;
				}

				if (zmienna == 4)
					System.out.println(a);

			}

		}

	}

	static void zadanie2(ArrayList<String> anagramy) {

		for (String a : anagramy) {
			String[] tablicaPojedyñczychWyrazów = a.split(" ");
			char[] pierwszyWyraz = tablicaPojedyñczychWyrazów[0].toCharArray();
			Arrays.sort(pierwszyWyraz);
			char[] drugiWyraz = tablicaPojedyñczychWyrazów[1].toCharArray();
			Arrays.sort(drugiWyraz);
			char[] trzeciWyraz = tablicaPojedyñczychWyrazów[2].toCharArray();
			Arrays.sort(trzeciWyraz);
			char[] czwartyWyraz = tablicaPojedyñczychWyrazów[3].toCharArray();
			Arrays.sort(czwartyWyraz);
			char[] pi¹tyWyraz = tablicaPojedyñczychWyrazów[4].toCharArray();
			Arrays.sort(pi¹tyWyraz);

			if (Arrays.equals(pierwszyWyraz, drugiWyraz) && Arrays.equals(drugiWyraz, trzeciWyraz)
					&& Arrays.equals(trzeciWyraz, czwartyWyraz) && Arrays.equals(czwartyWyraz, pi¹tyWyraz)) {
				System.out.println(a);
			}
		}

	}

}
