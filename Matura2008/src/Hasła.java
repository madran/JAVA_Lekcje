import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Has³a {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("slowa.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> s³owa = new ArrayList<>();

		while (skaner.hasNextLine()) {
			s³owa.add(skaner.nextLine());
		}

		skaner.close();

		System.out.println("ZADANIE 1");
		zadanie1(s³owa);
		System.out.println();

		System.out.println("ZADANIE 2");
		zadanie2(s³owa);
	}

	static void zadanie1(ArrayList<String> s³owa) {

		String najd³u¿szeHas³o = s³owa.get(0);
		String najkrótszeHas³o = s³owa.get(0);

		for (String s : s³owa) {
			String has³o = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				has³o += s.charAt(i);
			}

			// System.out.println(has³o);

			if (has³o.length() > najd³u¿szeHas³o.length()) {
				najd³u¿szeHas³o = has³o;
			}

			if (has³o.length() < najkrótszeHas³o.length()) {
				najkrótszeHas³o = has³o;
			}
		}

		System.out.println("Najd³u¿sze has³o: " + najd³u¿szeHas³o);
		System.out.println("D³ugoœæ najd³u¿szego has³a: " + najd³u¿szeHas³o.length());
		System.out.println("Najkrótsze has³o: " + najkrótszeHas³o);
		System.out.println("D³ugoœæ najkrótszego has³a: " + najkrótszeHas³o.length());
		

	}

	static void zadanie2(ArrayList<String> s³owa) {

		String najd³u¿szeHas³o = "";
		String najkrótszeHas³o = "00000000000000000000000000000000000000000000000000000000000000000000";
		ArrayList<String> has³a12 = new ArrayList<>();
		int d³ugoœæWszystkichHase³ = 0;

		for (String s : s³owa) {
		
			String palindrom = "";
			String resztaWyrazu = "";
			String has³o = "";

			for (int i = 0; i < s.length(); i++) {
				if (czyPalindrom(s.substring(0, i + 1))) {
					palindrom = s.substring(0, i + 1);
				}
			}

			resztaWyrazu = s.substring(palindrom.length(), s.length());
			has³o = odwróæ(resztaWyrazu) + palindrom + resztaWyrazu;
			d³ugoœæWszystkichHase³ += has³o.length();
			if (has³o.length() == 12)
				has³a12.add(has³o);
			if (has³o.length() > najd³u¿szeHas³o.length())
				najd³u¿szeHas³o = has³o;
			if (has³o.length() < najkrótszeHas³o.length())
				najkrótszeHas³o = has³o;

//				System.out.println(has³o);

		}

		System.out.println( );
		System.out.println("Has³a12");
		for (String h : has³a12) {
			System.out.println(h);
		}
		System.out.println();
		System.out.println(najd³u¿szeHas³o);
		System.out.println(najkrótszeHas³o);
		System.out.println(d³ugoœæWszystkichHase³);

	}

	static boolean czyPalindrom(String s³owo) {

		boolean palindrom = true;

		for (int i = 0, j = s³owo.length() - 1; i < s³owo.length(); i++, j--) {
			if (!(s³owo.charAt(i) == s³owo.charAt(j))) {
				palindrom = false;
			}
		}

		return palindrom;
	}

	static String odwróæ(String s³owo) {
		String noweS³owo = "";

		for (int i = s³owo.length() - 1; i >= 0; i--) {
			noweS³owo += s³owo.charAt(i);
		}

		return noweS³owo;
	}

}
