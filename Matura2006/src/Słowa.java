import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
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

//		zadanie1(s�owa);
//		System.out.println(zadanie2(s�owa));
		System.out.println(zadanie3(s�owa));

	}

	static void zadanie1(ArrayList<String> s�owa) {
		HashMap<String, Integer> s�owaWymieszane = new HashMap<>();

		for (int i = 0; i < s�owa.size(); i++) {
			if (s�owaWymieszane.containsKey(s�owa.get(i))) {
				s�owaWymieszane.put(s�owa.get(i), s�owaWymieszane.get(s�owa.get(i)) + 1);
			} else {
				s�owaWymieszane.put(s�owa.get(i), 1);
			}
		}

		String najcz�ciejPowtarzaj�ceSi�S�owo = s�owa.get(0);
		int najwi�kszaIlo��Powt�rze� = 1;
		int ilo��Powtarzaj�cychSi�S��w = 0;

		for (Entry<String, Integer> s : s�owaWymieszane.entrySet()) {
			if (s.getValue() > 1)
				ilo��Powtarzaj�cychSi�S��w++;
			if (s.getValue() > najwi�kszaIlo��Powt�rze�) {
				najwi�kszaIlo��Powt�rze� = s.getValue();
				najcz�ciejPowtarzaj�ceSi�S�owo = s.getKey();
			}
		}

		System.out.println(ilo��Powtarzaj�cychSi�S��w);
		System.out.println(najcz�ciejPowtarzaj�ceSi�S�owo);
		System.out.println(najwi�kszaIlo��Powt�rze�);
	}

	static int zadanie2(ArrayList<String> liczby) {
		int ilo��LiczbParzystych = 0;

		for (String s : liczby) {

			if (Integer.parseInt("" + s.charAt(s.length() - 1), 16) % 2 == 0)
				ilo��LiczbParzystych++;
		}

		return ilo��LiczbParzystych;
	}

	static int zadanie3(ArrayList<String> s�owa) {
		int ilo��Palindrom�w = 0;

		for (int i = 0; i < s�owa.size(); i++) {
			String s�owo = s�owa.get(i);
			boolean czyPalindrom = true;
			for (int m = 0, n = s�owo.length() - 1; m < s�owo.length() / 2 + 1; m++, n--) {
				System.out.println(s�owo.charAt(m));
				System.out.println(s�owo.charAt(n));
				if (s�owo.charAt(m) != s�owo.charAt(n)) {
					czyPalindrom = false;
					break;
				}
			}

			if (czyPalindrom == true)
				ilo��Palindrom�w++;

		}

		return ilo��Palindrom�w;

	}

}
