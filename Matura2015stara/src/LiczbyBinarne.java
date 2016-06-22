import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LiczbyBinarne {

	public static void main(String[] args) throws FileNotFoundException {

		File plik = new File("slowa.txt");
		Scanner skaner = new Scanner(plik);
		ArrayList<String> liczbyBinarne = new ArrayList<>();

		while (skaner.hasNextLine()) {
			liczbyBinarne.add(skaner.nextLine());
		}

		skaner.close();

		System.out.println("ZADANIE 1");
		System.out.println(zadanie1(liczbyBinarne));
		System.out.println();

		System.out.println("ZADANIE 2");
		System.out.println(zadanie2(liczbyBinarne));
		System.out.println();

		 System.out.println("ZADANIE 3");
		 zadanie3(liczbyBinarne);
	}

	static int zadanie1(ArrayList<String> liczby) {

		int licznik0 = 0;
		int licznik1 = 0;
		int licznikLiczbMaj�cychWi�cej0ni�1 = 0;

		for (String l : liczby) {
			licznik0 = 0;
			licznik1 = 0;
			for (int i = 0; i < l.length(); i++) {
				if (l.charAt(i) == '0') {
					licznik0 = licznik0 + 1;
				}
				if (l.charAt(i) == '1') {
					licznik1 += 1;
				}
			}

			if (licznik1 < licznik0)
				licznikLiczbMaj�cychWi�cej0ni�1 += 1;

		}

		return licznikLiczbMaj�cychWi�cej0ni�1;
	}

	static int zadanie2(ArrayList<String> liczby) {

		int liczbaS��wSpe�niaj�cychWarunek = 0;

		for (String l : liczby) {
			char[] liczba = l.toCharArray();
			char[] liczbaUporz�dkowana = l.toCharArray();
			Arrays.sort(liczbaUporz�dkowana);

			if (Arrays.equals(liczba, liczbaUporz�dkowana)) {
				if (l.contains("1") && l.contains("0")) {
					liczbaS��wSpe�niaj�cychWarunek++;
				}
			}
		}

		return liczbaS��wSpe�niaj�cychWarunek;

	}

	static void zadanie3(ArrayList<String> liczby) {

		int najwi�kszaIlo��Zer = 0;
		
		for (String l : liczby){
			int ilo��Zer = 0;
			
			for (int i = 0; i < l.length(); i++){
				if (l.charAt(i) == '0'){
					ilo��Zer ++;
					if (ilo��Zer > najwi�kszaIlo��Zer) najwi�kszaIlo��Zer = ilo��Zer;
				}
				else ilo��Zer = 0;
			}
		}
		
		System.out.println(najwi�kszaIlo��Zer);
		
		for (String l : liczby){
			int ilo��Zer = 0;
			
			for (int i = 0; i < l.length(); i++){
				if (l.charAt(i) == '0'){
					ilo��Zer ++;
					if (ilo��Zer == najwi�kszaIlo��Zer) System.out.println(l);
				}
				else ilo��Zer = 0;
			}
		}
	}

}
