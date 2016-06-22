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
		System.out.println("Ilo�� liczb, w kt�rych liczba jedynek jest wi�ksza ni� liczba zer wynosi " + zadanie1(liczbyBinarne));
		zadanie2(liczbyBinarne);
//		zadanie3(liczbyBinarne);

		File plik1 = new File ("liczby.txt");
		Scanner skaner1 = new Scanner (plik1);
		ArrayList <LiczbaBinarna> liczbyBinarne1 = new ArrayList <> ();

		while (skaner1.hasNextLine()){
			liczbyBinarne1.add(new LiczbaBinarna(skaner1.nextLine()));
		}

		skaner1.close();

		System.out.println("Ilo�� liczb, w kt�rych liczba jedynek jest wi�ksza ni� liczba zer wynosi " + zad1(liczbyBinarne1));
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
		int licznikLiczbMaj�cychWi�cej0ni�1 = 0;

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

			if (licznik1 < licznik0) licznikLiczbMaj�cychWi�cej0ni�1 += 1;

		}

		return licznikLiczbMaj�cychWi�cej0ni�1;
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

		ArrayList <String> najkr�tszeLiczby = new ArrayList <> ();
		ArrayList <String> najd�u�szeLiczby = new ArrayList <> ();
		int najkr�tszaD�ugo�� = liczby.get(0).length();
		int najd�u�szaD�ugo�� = liczby.get(0).length();

		for (String l : liczby){
			if (l.length() < najkr�tszaD�ugo��){
				najkr�tszaD�ugo�� = l.length();
				}
			else if (l.length() > najd�u�szaD�ugo��){
				najd�u�szaD�ugo�� = l.length();
			}
		}

		for (String l : liczby){
			if (l.length() == najkr�tszaD�ugo��){
				najkr�tszeLiczby.add(l);
				}
			else if (l.length() == najd�u�szaD�ugo��){
				najd�u�szeLiczby.add(l);
			}
		}


		Collections.sort(najkr�tszeLiczby);
		Collections.sort(najd�u�szeLiczby);

		String najkr�tszaLiczba = najkr�tszeLiczby.get(0);
		String najd�u�szaLiczba = najd�u�szeLiczby.get(najd�u�szeLiczby.size() - 1);

		for (int i = 0; i < liczby.size(); i++){
			if (liczby.get(i).equals(najkr�tszaLiczba)) System.out.print("Liczba w linii " + (i + 1) + " jest najmniejsza,");
			if (liczby.get(i).equals(najd�u�szaLiczba)) System.out.println(" a w linii " + (i + 1) + " najwi�ksza");
		}

	}

}
