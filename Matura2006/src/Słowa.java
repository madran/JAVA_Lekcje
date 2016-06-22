import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
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

//		zadanie1(s這wa);
//		System.out.println(zadanie2(s這wa));
		System.out.println(zadanie3(s這wa));

	}

	static void zadanie1(ArrayList<String> s這wa) {
		HashMap<String, Integer> s這waWymieszane = new HashMap<>();

		for (int i = 0; i < s這wa.size(); i++) {
			if (s這waWymieszane.containsKey(s這wa.get(i))) {
				s這waWymieszane.put(s這wa.get(i), s這waWymieszane.get(s這wa.get(i)) + 1);
			} else {
				s這waWymieszane.put(s這wa.get(i), 1);
			}
		}

		String najcz��ciejPowtarzaj鉍eSi熽這wo = s這wa.get(0);
		int najwi瘯szaIlo�澔owt鏎ze� = 1;
		int ilo�澔owtarzaj鉍ychSi熽堯w = 0;

		for (Entry<String, Integer> s : s這waWymieszane.entrySet()) {
			if (s.getValue() > 1)
				ilo�澔owtarzaj鉍ychSi熽堯w++;
			if (s.getValue() > najwi瘯szaIlo�澔owt鏎ze�) {
				najwi瘯szaIlo�澔owt鏎ze� = s.getValue();
				najcz��ciejPowtarzaj鉍eSi熽這wo = s.getKey();
			}
		}

		System.out.println(ilo�澔owtarzaj鉍ychSi熽堯w);
		System.out.println(najcz��ciejPowtarzaj鉍eSi熽這wo);
		System.out.println(najwi瘯szaIlo�澔owt鏎ze�);
	}

	static int zadanie2(ArrayList<String> liczby) {
		int ilo�潲iczbParzystych = 0;

		for (String s : liczby) {

			if (Integer.parseInt("" + s.charAt(s.length() - 1), 16) % 2 == 0)
				ilo�潲iczbParzystych++;
		}

		return ilo�潲iczbParzystych;
	}

	static int zadanie3(ArrayList<String> s這wa) {
		int ilo�澔alindrom闚 = 0;

		for (int i = 0; i < s這wa.size(); i++) {
			String s這wo = s這wa.get(i);
			boolean czyPalindrom = true;
			for (int m = 0, n = s這wo.length() - 1; m < s這wo.length() / 2 + 1; m++, n--) {
				System.out.println(s這wo.charAt(m));
				System.out.println(s這wo.charAt(n));
				if (s這wo.charAt(m) != s這wo.charAt(n)) {
					czyPalindrom = false;
					break;
				}
			}

			if (czyPalindrom == true)
				ilo�澔alindrom闚++;

		}

		return ilo�澔alindrom闚;

	}

}
