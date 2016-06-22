import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class S³owa {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("dane.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> s³owa = new ArrayList<>();

		while (skaner.hasNextLine()) {
			s³owa.add(skaner.nextLine());
		}

		skaner.close();

		File dane2 = new File("dane2.txt");
		Scanner skaner2 = new Scanner(dane2);
		ArrayList<String> s³owa2 = new ArrayList<>();

		while (skaner2.hasNext()) {
			s³owa2.add(skaner2.next());
		}

		skaner2.close();

		System.out.println("ZADANIE 1");
		System.out.println(zadanie1(s³owa));
		System.out.println();

		System.out.println("ZADANIE 2");
		System.out.println(zadanie2(s³owa));
		System.out.println();

		System.out.println("ZADANIE 3");
		System.out.println(zadanie3(s³owa));
		System.out.println();

		System.out.println("ZADANIE 4");
		zadanie4(s³owa2);
	}

	static int zadanie1(ArrayList<String> s³owa) {

		int iloœæPalindromów = 0;
		ArrayList<String> s³owo = new ArrayList<>();

		for (String s : s³owa) {
			String[] tablica = s.split(" ");
			s³owo.add(tablica[0]);
			s³owo.add(tablica[1]);
		}

		for (String s : s³owo) {
			boolean palindrom = true;

			for (int m = 0, n = s.length() - 1; m < s.length() / 2; m++, n--) {
				if (s.charAt(m) != s.charAt(n))
					palindrom = false;
			}

			if (palindrom == true)
				iloœæPalindromów++;

		}

		return iloœæPalindromów;

	}

	static int zadanie2(ArrayList<String> s³owa) {

		int iloœæParS³ów = 0;

		for (String s : s³owa) {
			String[] jednaLinijka = s.split(" ");

			if (jednaLinijka[0].contains(jednaLinijka[1])) {
				iloœæParS³ów++;
			}

		}

		return iloœæParS³ów;

	}

	static int zadanie3(ArrayList<String> s³owa) {

		int iloœæS³ówPowsta³ychPrzezSklejenie = 0;

		for (String s : s³owa) {
			String[] jednaLinijka = s.split(" ");

			if (!(jednaLinijka[0].contains(jednaLinijka[1]))
					|| !(czyNaPocz¹tkuLubKoñcu(jednaLinijka[0], jednaLinijka[1]))) {
				iloœæS³ówPowsta³ychPrzezSklejenie++;
			}

		}

		return iloœæS³ówPowsta³ychPrzezSklejenie;
	}

	static void zadanie4(ArrayList<String> s³owa) {

	}

	static boolean czyNaPocz¹tkuLubKoñcu(String a, String b) {
		boolean naPocz¹tkuLubKoñcu = false;

		for (int m = 0, n = 0; n < b.length(); m++, n++) {
			if (a.substring(0, b.length()-m).equals(b.substring(n, b.length()))) {
				naPocz¹tkuLubKoñcu = true;
			}

			if (a.substring(b.length() + m, a.length()).equals(b.substring(0, b.length() - n))) {
				naPocz¹tkuLubKoñcu = true;
			}
		}

		return naPocz¹tkuLubKoñcu;
	}

}
