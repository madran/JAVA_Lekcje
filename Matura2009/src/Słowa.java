import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class S�owa {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("dane.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> s�owa = new ArrayList<>();

		while (skaner.hasNextLine()) {
			s�owa.add(skaner.nextLine());
		}

		skaner.close();

		File dane2 = new File("dane2.txt");
		Scanner skaner2 = new Scanner(dane2);
		ArrayList<String> s�owa2 = new ArrayList<>();

		while (skaner2.hasNext()) {
			s�owa2.add(skaner2.next());
		}

		skaner2.close();

		System.out.println("ZADANIE 1");
		System.out.println(zadanie1(s�owa));
		System.out.println();

		System.out.println("ZADANIE 2");
		System.out.println(zadanie2(s�owa));
		System.out.println();

		System.out.println("ZADANIE 3");
		System.out.println(zadanie3(s�owa));
		System.out.println();

		System.out.println("ZADANIE 4");
		zadanie4(s�owa2);
	}

	static int zadanie1(ArrayList<String> s�owa) {

		int ilo��Palindrom�w = 0;
		ArrayList<String> s�owo = new ArrayList<>();

		for (String s : s�owa) {
			String[] tablica = s.split(" ");
			s�owo.add(tablica[0]);
			s�owo.add(tablica[1]);
		}

		for (String s : s�owo) {
			boolean palindrom = true;

			for (int m = 0, n = s.length() - 1; m < s.length() / 2; m++, n--) {
				if (s.charAt(m) != s.charAt(n))
					palindrom = false;
			}

			if (palindrom == true)
				ilo��Palindrom�w++;

		}

		return ilo��Palindrom�w;

	}

	static int zadanie2(ArrayList<String> s�owa) {

		int ilo��ParS��w = 0;

		for (String s : s�owa) {
			String[] jednaLinijka = s.split(" ");

			if (jednaLinijka[0].contains(jednaLinijka[1])) {
				ilo��ParS��w++;
			}

		}

		return ilo��ParS��w;

	}

	static int zadanie3(ArrayList<String> s�owa) {

		int ilo��S��wPowsta�ychPrzezSklejenie = 0;

		for (String s : s�owa) {
			String[] jednaLinijka = s.split(" ");

			if (!(jednaLinijka[0].contains(jednaLinijka[1]))
					|| !(czyNaPocz�tkuLubKo�cu(jednaLinijka[0], jednaLinijka[1]))) {
				ilo��S��wPowsta�ychPrzezSklejenie++;
			}

		}

		return ilo��S��wPowsta�ychPrzezSklejenie;
	}

	static void zadanie4(ArrayList<String> s�owa) {

	}

	static boolean czyNaPocz�tkuLubKo�cu(String a, String b) {
		boolean naPocz�tkuLubKo�cu = false;

		for (int m = 0, n = 0; n < b.length(); m++, n++) {
			if (a.substring(0, b.length()-m).equals(b.substring(n, b.length()))) {
				naPocz�tkuLubKo�cu = true;
			}

			if (a.substring(b.length() + m, a.length()).equals(b.substring(0, b.length() - n))) {
				naPocz�tkuLubKo�cu = true;
			}
		}

		return naPocz�tkuLubKo�cu;
	}

}
