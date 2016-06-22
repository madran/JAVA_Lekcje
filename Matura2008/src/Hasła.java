import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Has�a {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("slowa.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> s�owa = new ArrayList<>();

		while (skaner.hasNextLine()) {
			s�owa.add(skaner.nextLine());
		}

		skaner.close();

		System.out.println("ZADANIE 1");
		zadanie1(s�owa);
		System.out.println();

		System.out.println("ZADANIE 2");
		zadanie2(s�owa);
	}

	static void zadanie1(ArrayList<String> s�owa) {

		String najd�u�szeHas�o = s�owa.get(0);
		String najkr�tszeHas�o = s�owa.get(0);

		for (String s : s�owa) {
			String has�o = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				has�o += s.charAt(i);
			}

			// System.out.println(has�o);

			if (has�o.length() > najd�u�szeHas�o.length()) {
				najd�u�szeHas�o = has�o;
			}

			if (has�o.length() < najkr�tszeHas�o.length()) {
				najkr�tszeHas�o = has�o;
			}
		}

		System.out.println("Najd�u�sze has�o: " + najd�u�szeHas�o);
		System.out.println("D�ugo�� najd�u�szego has�a: " + najd�u�szeHas�o.length());
		System.out.println("Najkr�tsze has�o: " + najkr�tszeHas�o);
		System.out.println("D�ugo�� najkr�tszego has�a: " + najkr�tszeHas�o.length());
		

	}

	static void zadanie2(ArrayList<String> s�owa) {

		String najd�u�szeHas�o = "";
		String najkr�tszeHas�o = "00000000000000000000000000000000000000000000000000000000000000000000";
		ArrayList<String> has�a12 = new ArrayList<>();
		int d�ugo��WszystkichHase� = 0;

		for (String s : s�owa) {
		
			String palindrom = "";
			String resztaWyrazu = "";
			String has�o = "";

			for (int i = 0; i < s.length(); i++) {
				if (czyPalindrom(s.substring(0, i + 1))) {
					palindrom = s.substring(0, i + 1);
				}
			}

			resztaWyrazu = s.substring(palindrom.length(), s.length());
			has�o = odwr��(resztaWyrazu) + palindrom + resztaWyrazu;
			d�ugo��WszystkichHase� += has�o.length();
			if (has�o.length() == 12)
				has�a12.add(has�o);
			if (has�o.length() > najd�u�szeHas�o.length())
				najd�u�szeHas�o = has�o;
			if (has�o.length() < najkr�tszeHas�o.length())
				najkr�tszeHas�o = has�o;

//				System.out.println(has�o);

		}

		System.out.println( );
		System.out.println("Has�a12");
		for (String h : has�a12) {
			System.out.println(h);
		}
		System.out.println();
		System.out.println(najd�u�szeHas�o);
		System.out.println(najkr�tszeHas�o);
		System.out.println(d�ugo��WszystkichHase�);

	}

	static boolean czyPalindrom(String s�owo) {

		boolean palindrom = true;

		for (int i = 0, j = s�owo.length() - 1; i < s�owo.length(); i++, j--) {
			if (!(s�owo.charAt(i) == s�owo.charAt(j))) {
				palindrom = false;
			}
		}

		return palindrom;
	}

	static String odwr��(String s�owo) {
		String noweS�owo = "";

		for (int i = s�owo.length() - 1; i >= 0; i--) {
			noweS�owo += s�owo.charAt(i);
		}

		return noweS�owo;
	}

}
