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
			String[] tablicaPojedy�czychWyraz�w = a.split(" ");
			int zmienna = 0;

			for (int i = 1; i < tablicaPojedy�czychWyraz�w.length; i++) {

				if (tablicaPojedy�czychWyraz�w[0].length() == tablicaPojedy�czychWyraz�w[i].length()) {
					zmienna++;
				}

				if (zmienna == 4)
					System.out.println(a);

			}

		}

	}

	static void zadanie2(ArrayList<String> anagramy) {

		for (String a : anagramy) {
			String[] tablicaPojedy�czychWyraz�w = a.split(" ");
			char[] pierwszyWyraz = tablicaPojedy�czychWyraz�w[0].toCharArray();
			Arrays.sort(pierwszyWyraz);
			char[] drugiWyraz = tablicaPojedy�czychWyraz�w[1].toCharArray();
			Arrays.sort(drugiWyraz);
			char[] trzeciWyraz = tablicaPojedy�czychWyraz�w[2].toCharArray();
			Arrays.sort(trzeciWyraz);
			char[] czwartyWyraz = tablicaPojedy�czychWyraz�w[3].toCharArray();
			Arrays.sort(czwartyWyraz);
			char[] pi�tyWyraz = tablicaPojedy�czychWyraz�w[4].toCharArray();
			Arrays.sort(pi�tyWyraz);

			if (Arrays.equals(pierwszyWyraz, drugiWyraz) && Arrays.equals(drugiWyraz, trzeciWyraz)
					&& Arrays.equals(trzeciWyraz, czwartyWyraz) && Arrays.equals(czwartyWyraz, pi�tyWyraz)) {
				System.out.println(a);
			}
		}

	}

}
