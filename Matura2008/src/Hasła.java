import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Has豉 {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("slowa.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> s這wa = new ArrayList<>();

		while (skaner.hasNextLine()) {
			s這wa.add(skaner.nextLine());
		}

		skaner.close();

		System.out.println("ZADANIE 1");
		zadanie1(s這wa);
		System.out.println();

		System.out.println("ZADANIE 2");
		zadanie2(s這wa);
	}

	static void zadanie1(ArrayList<String> s這wa) {

		String najd逝窺zeHas這 = s這wa.get(0);
		String najkr鏒szeHas這 = s這wa.get(0);

		for (String s : s這wa) {
			String has這 = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				has這 += s.charAt(i);
			}

			// System.out.println(has這);

			if (has這.length() > najd逝窺zeHas這.length()) {
				najd逝窺zeHas這 = has這;
			}

			if (has這.length() < najkr鏒szeHas這.length()) {
				najkr鏒szeHas這 = has這;
			}
		}

		System.out.println("Najd逝窺ze has這: " + najd逝窺zeHas這);
		System.out.println("D逝go�� najd逝窺zego has豉: " + najd逝窺zeHas這.length());
		System.out.println("Najkr鏒sze has這: " + najkr鏒szeHas這);
		System.out.println("D逝go�� najkr鏒szego has豉: " + najkr鏒szeHas這.length());
		

	}

	static void zadanie2(ArrayList<String> s這wa) {

		String najd逝窺zeHas這 = "";
		String najkr鏒szeHas這 = "00000000000000000000000000000000000000000000000000000000000000000000";
		ArrayList<String> has豉12 = new ArrayList<>();
		int d逝go�潧szystkichHase� = 0;

		for (String s : s這wa) {
		
			String palindrom = "";
			String resztaWyrazu = "";
			String has這 = "";

			for (int i = 0; i < s.length(); i++) {
				if (czyPalindrom(s.substring(0, i + 1))) {
					palindrom = s.substring(0, i + 1);
				}
			}

			resztaWyrazu = s.substring(palindrom.length(), s.length());
			has這 = odwr鵵(resztaWyrazu) + palindrom + resztaWyrazu;
			d逝go�潧szystkichHase� += has這.length();
			if (has這.length() == 12)
				has豉12.add(has這);
			if (has這.length() > najd逝窺zeHas這.length())
				najd逝窺zeHas這 = has這;
			if (has這.length() < najkr鏒szeHas這.length())
				najkr鏒szeHas這 = has這;

//				System.out.println(has這);

		}

		System.out.println( );
		System.out.println("Has豉12");
		for (String h : has豉12) {
			System.out.println(h);
		}
		System.out.println();
		System.out.println(najd逝窺zeHas這);
		System.out.println(najkr鏒szeHas這);
		System.out.println(d逝go�潧szystkichHase�);

	}

	static boolean czyPalindrom(String s這wo) {

		boolean palindrom = true;

		for (int i = 0, j = s這wo.length() - 1; i < s這wo.length(); i++, j--) {
			if (!(s這wo.charAt(i) == s這wo.charAt(j))) {
				palindrom = false;
			}
		}

		return palindrom;
	}

	static String odwr鵵(String s這wo) {
		String noweS這wo = "";

		for (int i = s這wo.length() - 1; i >= 0; i--) {
			noweS這wo += s這wo.charAt(i);
		}

		return noweS這wo;
	}

}
