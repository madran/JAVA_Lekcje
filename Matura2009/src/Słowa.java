import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class S這wa {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("dane.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> s這wa = new ArrayList<>();

		while (skaner.hasNextLine()) {
			s這wa.add(skaner.nextLine());
		}

		skaner.close();

		File dane2 = new File("dane2.txt");
		Scanner skaner2 = new Scanner(dane2);
		ArrayList<String> s這wa2 = new ArrayList<>();

		while (skaner2.hasNext()) {
			s這wa2.add(skaner2.next());
		}

		skaner2.close();

		System.out.println("ZADANIE 1");
		System.out.println(zadanie1(s這wa));
		System.out.println();

		System.out.println("ZADANIE 2");
		System.out.println(zadanie2(s這wa));
		System.out.println();

		System.out.println("ZADANIE 3");
		System.out.println(zadanie3(s這wa));
		System.out.println();

		System.out.println("ZADANIE 4");
		zadanie4(s這wa2);
	}

	static int zadanie1(ArrayList<String> s這wa) {

		int ilo�澔alindrom闚 = 0;
		ArrayList<String> s這wo = new ArrayList<>();

		for (String s : s這wa) {
			String[] tablica = s.split(" ");
			s這wo.add(tablica[0]);
			s這wo.add(tablica[1]);
		}

		for (String s : s這wo) {
			boolean palindrom = true;

			for (int m = 0, n = s.length() - 1; m < s.length() / 2; m++, n--) {
				if (s.charAt(m) != s.charAt(n))
					palindrom = false;
			}

			if (palindrom == true)
				ilo�澔alindrom闚++;

		}

		return ilo�澔alindrom闚;

	}

	static int zadanie2(ArrayList<String> s這wa) {

		int ilo�澔arS堯w = 0;

		for (String s : s這wa) {
			String[] jednaLinijka = s.split(" ");

			if (jednaLinijka[0].contains(jednaLinijka[1])) {
				ilo�澔arS堯w++;
			}

		}

		return ilo�澔arS堯w;

	}

	static int zadanie3(ArrayList<String> s這wa) {

		int ilo�漀堯wPowsta造chPrzezSklejenie = 0;

		for (String s : s這wa) {
			String[] jednaLinijka = s.split(" ");

			if (!(jednaLinijka[0].contains(jednaLinijka[1]))
					|| !(czyNaPocz靖kuLubKo鎍u(jednaLinijka[0], jednaLinijka[1]))) {
				ilo�漀堯wPowsta造chPrzezSklejenie++;
			}

		}

		return ilo�漀堯wPowsta造chPrzezSklejenie;
	}

	static void zadanie4(ArrayList<String> s這wa) {

	}

	static boolean czyNaPocz靖kuLubKo鎍u(String a, String b) {
		boolean naPocz靖kuLubKo鎍u = false;

		for (int m = 0, n = 0; n < b.length(); m++, n++) {
			if (a.substring(0, b.length()-m).equals(b.substring(n, b.length()))) {
				naPocz靖kuLubKo鎍u = true;
			}

			if (a.substring(b.length() + m, a.length()).equals(b.substring(0, b.length() - n))) {
				naPocz靖kuLubKo鎍u = true;
			}
		}

		return naPocz靖kuLubKo鎍u;
	}

}
