import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LiczbyBinarne {

	public static void main(String[] args) throws FileNotFoundException {

		File plik = new File ("liczby.txt");
		Scanner skaner = new Scanner (plik);
		ArrayList <String> liczbyBinarne = new ArrayList <> ();

		while (skaner.hasNextLine()){
			liczbyBinarne.add(skaner.nextLine());
		}

		skaner.close();
//
//
		System.out.println("Iloœæ liczb, w których liczba jedynek jest wiêksza ni¿ liczba zer wynosi " + zadanie1(liczbyBinarne));
		zadanie2(liczbyBinarne);
//		zadanie3(liczbyBinarne);

		File plik1 = new File ("liczby.txt");
		Scanner skaner1 = new Scanner (plik1);
		ArrayList <LiczbaBinarna> liczbyBinarne1 = new ArrayList <> ();

		while (skaner1.hasNextLine()){
			liczbyBinarne1.add(new LiczbaBinarna(skaner1.nextLine()));
		}

		skaner1.close();

		System.out.println("Iloœæ liczb, w których liczba jedynek jest wiêksza ni¿ liczba zer wynosi " + zad1(liczbyBinarne1));
		zad2(liczbyBinarne1);
	}

	static int zad1(ArrayList <LiczbaBinarna> liczbyBinarne) {
		int licznik = 0;

		for(LiczbaBinarna b : liczbyBinarne) {
			if(b.liczbaJedynek < b.liczbaZer) {
				licznik++;
			}
		}

		return licznik;
	}

	static int zadanie1 (ArrayList <String> liczby){

		int licznik0 = 0;
		int licznik1 = 0;
		int licznikLiczbMaj¹cychWiêcej0ni¿1 = 0;

		for (String l : liczby){
			licznik0 = 0;
			licznik1 = 0;
			for (int i = 0; i < l.length(); i++){
//				System.out.println(l);
				if (l.charAt(i) == '0') {
					licznik0 = licznik0 + 1;
//					System.out.println("0 " + licznik0);
				}
				if (l.charAt(i) == '1') {
					licznik1 += 1;
//					System.out.println("1 " + licznik1);
				}
			}

			if (licznik1 < licznik0) licznikLiczbMaj¹cychWiêcej0ni¿1 += 1;

		}

		return licznikLiczbMaj¹cychWiêcej0ni¿1;
	}


	static void zad2 (ArrayList <LiczbaBinarna> liczby){
		int licznik2 = 0;
		int licznik8 = 0;

		for (LiczbaBinarna l : liczby){
			if (l.czyPodzielnaPrzez2()){
				licznik2 += 1;
				if (l.czyPodzielnaPrzez8()){
					licznik8 += 1;
				}
			}

		}

		System.out.println("Jest " + licznik2 + " liczb podzielnych przez 2 oraz " + licznik8 + " liczb podzielnych przez 8");
	}

	static void zadanie2 (ArrayList <String> liczby){
		int licznik2 = 0;
		int licznik8 = 0;

		for (String l : liczby){
			if (l.charAt(l.length() - 1) == '0'){
				licznik2 += 1;
				if (l.charAt(l.length() - 2) == '0' && l.charAt(l.length() - 3) == '0'){
					licznik8 += 1;

				}
			}

		}

		System.out.println("Jest " + licznik2 + " liczb podzielnych przez 2 oraz " + licznik8 + " liczb podzielnych przez 8");

	}

	static void zadanie3 (ArrayList <String> liczby) {

		ArrayList <String> najkrótszeLiczby = new ArrayList <> ();
		ArrayList <String> najd³u¿szeLiczby = new ArrayList <> ();
		int najkrótszaD³ugoœæ = liczby.get(0).length();
		int najd³u¿szaD³ugoœæ = liczby.get(0).length();

		for (String l : liczby){
			if (l.length() < najkrótszaD³ugoœæ){
				najkrótszaD³ugoœæ = l.length();
				}
			else if (l.length() > najd³u¿szaD³ugoœæ){
				najd³u¿szaD³ugoœæ = l.length();
			}
		}

		for (String l : liczby){
			if (l.length() == najkrótszaD³ugoœæ){
				najkrótszeLiczby.add(l);
				}
			else if (l.length() == najd³u¿szaD³ugoœæ){
				najd³u¿szeLiczby.add(l);
			}
		}


		Collections.sort(najkrótszeLiczby);
		Collections.sort(najd³u¿szeLiczby);

		String najkrótszaLiczba = najkrótszeLiczby.get(0);
		String najd³u¿szaLiczba = najd³u¿szeLiczby.get(najd³u¿szeLiczby.size() - 1);

		for (int i = 0; i < liczby.size(); i++){
			if (liczby.get(i).equals(najkrótszaLiczba)) System.out.print("Liczba w linii " + (i + 1) + " jest najmniejsza,");
			if (liczby.get(i).equals(najd³u¿szaLiczba)) System.out.println(" a w linii " + (i + 1) + " najwiêksza");
		}

	}

}
