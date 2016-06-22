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
		int licznikLiczbMaj¹cychWiêcej0ni¿1 = 0;

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
				licznikLiczbMaj¹cychWiêcej0ni¿1 += 1;

		}

		return licznikLiczbMaj¹cychWiêcej0ni¿1;
	}

	static int zadanie2(ArrayList<String> liczby) {

		int liczbaS³ówSpe³niaj¹cychWarunek = 0;

		for (String l : liczby) {
			char[] liczba = l.toCharArray();
			char[] liczbaUporz¹dkowana = l.toCharArray();
			Arrays.sort(liczbaUporz¹dkowana);

			if (Arrays.equals(liczba, liczbaUporz¹dkowana)) {
				if (l.contains("1") && l.contains("0")) {
					liczbaS³ówSpe³niaj¹cychWarunek++;
				}
			}
		}

		return liczbaS³ówSpe³niaj¹cychWarunek;

	}

	static void zadanie3(ArrayList<String> liczby) {

		int najwiêkszaIloœæZer = 0;
		
		for (String l : liczby){
			int iloœæZer = 0;
			
			for (int i = 0; i < l.length(); i++){
				if (l.charAt(i) == '0'){
					iloœæZer ++;
					if (iloœæZer > najwiêkszaIloœæZer) najwiêkszaIloœæZer = iloœæZer;
				}
				else iloœæZer = 0;
			}
		}
		
		System.out.println(najwiêkszaIloœæZer);
		
		for (String l : liczby){
			int iloœæZer = 0;
			
			for (int i = 0; i < l.length(); i++){
				if (l.charAt(i) == '0'){
					iloœæZer ++;
					if (iloœæZer == najwiêkszaIloœæZer) System.out.println(l);
				}
				else iloœæZer = 0;
			}
		}
	}

}
