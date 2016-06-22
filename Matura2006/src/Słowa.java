import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
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

//		zadanie1(s³owa);
//		System.out.println(zadanie2(s³owa));
		System.out.println(zadanie3(s³owa));

	}

	static void zadanie1(ArrayList<String> s³owa) {
		HashMap<String, Integer> s³owaWymieszane = new HashMap<>();

		for (int i = 0; i < s³owa.size(); i++) {
			if (s³owaWymieszane.containsKey(s³owa.get(i))) {
				s³owaWymieszane.put(s³owa.get(i), s³owaWymieszane.get(s³owa.get(i)) + 1);
			} else {
				s³owaWymieszane.put(s³owa.get(i), 1);
			}
		}

		String najczêœciejPowtarzaj¹ceSiêS³owo = s³owa.get(0);
		int najwiêkszaIloœæPowtórzeñ = 1;
		int iloœæPowtarzaj¹cychSiêS³ów = 0;

		for (Entry<String, Integer> s : s³owaWymieszane.entrySet()) {
			if (s.getValue() > 1)
				iloœæPowtarzaj¹cychSiêS³ów++;
			if (s.getValue() > najwiêkszaIloœæPowtórzeñ) {
				najwiêkszaIloœæPowtórzeñ = s.getValue();
				najczêœciejPowtarzaj¹ceSiêS³owo = s.getKey();
			}
		}

		System.out.println(iloœæPowtarzaj¹cychSiêS³ów);
		System.out.println(najczêœciejPowtarzaj¹ceSiêS³owo);
		System.out.println(najwiêkszaIloœæPowtórzeñ);
	}

	static int zadanie2(ArrayList<String> liczby) {
		int iloœæLiczbParzystych = 0;

		for (String s : liczby) {

			if (Integer.parseInt("" + s.charAt(s.length() - 1), 16) % 2 == 0)
				iloœæLiczbParzystych++;
		}

		return iloœæLiczbParzystych;
	}

	static int zadanie3(ArrayList<String> s³owa) {
		int iloœæPalindromów = 0;

		for (int i = 0; i < s³owa.size(); i++) {
			String s³owo = s³owa.get(i);
			boolean czyPalindrom = true;
			for (int m = 0, n = s³owo.length() - 1; m < s³owo.length() / 2 + 1; m++, n--) {
				System.out.println(s³owo.charAt(m));
				System.out.println(s³owo.charAt(n));
				if (s³owo.charAt(m) != s³owo.charAt(n)) {
					czyPalindrom = false;
					break;
				}
			}

			if (czyPalindrom == true)
				iloœæPalindromów++;

		}

		return iloœæPalindromów;

	}

}
