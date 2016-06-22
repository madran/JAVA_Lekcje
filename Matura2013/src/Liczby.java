import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Liczby {

	public static void main(String[] args) throws FileNotFoundException {

		File plik = new File("dane.txt");
		Scanner skaner = new Scanner(plik);
		ArrayList<String> liczby = new ArrayList<>();

		while (skaner.hasNextLine()) {
			liczby.add(skaner.nextLine());
		}
		
		skaner.close();

		System.out.println("ZADANIE 1");
		System.out.println(zadanie1(liczby));
		System.out.println();

		System.out.println("ZADANIE 2");
		System.out.println(zadanie2(liczby));
		System.out.println();

		System.out.println("ZADANIE 3");
		zadanie3(liczby);
	}

	static int zadanie1(ArrayList<String> liczby) {
		int wyst�pieniaLiczbGdziePierwszaCyfraJestR�wnaOstatniej = 0;

		for (String liczba : liczby) {
			int pierwszaPozycja = (int) liczba.charAt(0);
			int ostatniaPozycja = (int) liczba.charAt(liczba.length() - 1);

			if (pierwszaPozycja == ostatniaPozycja)
				wyst�pieniaLiczbGdziePierwszaCyfraJestR�wnaOstatniej++;
		}

		return wyst�pieniaLiczbGdziePierwszaCyfraJestR�wnaOstatniej;
	}

	static int zadanie2(ArrayList<String> liczby) {

		int liczba;
		ArrayList<String> liczbyDziesi�tne = new ArrayList<>();

		for (String l : liczby) {
			liczba = Integer.parseInt(l, 8);
			liczbyDziesi�tne.add("" + liczba);
		}

		return zadanie1(liczbyDziesi�tne);
	}

	static void zadanie3(ArrayList<String> liczby) {

		
		int liczbaLiczbSpe�niaj�cychWarunek = 0;
		ArrayList <String> lista = new ArrayList <> ();

		for (int i = 0; i < liczby.size(); i++) {
			String liczba = liczby.get(i);
			char[] tablica = new char[liczba.length()];
			char[] tablicaUporz�dkowana = new char[liczba.length()];

			for (int j = 0; j < liczba.length(); j++) {
				tablica[j] = liczba.charAt(j);
				tablicaUporz�dkowana[j] = liczba.charAt(j);
			}
			
			Arrays.sort(tablicaUporz�dkowana);
			
			if (Arrays.equals(tablica, tablicaUporz�dkowana)) {
				String liczbaSpe�niaj�caWarunek = new String (tablica);
				lista.add(liczbaSpe�niaj�caWarunek);
				liczbaLiczbSpe�niaj�cychWarunek++;
			}
		}
		
		
		int najmniejszaLiczbaSpe�niaj�caWarunek = Integer.parseInt(lista.get(0), 8);
		int najwi�kszaLiczbaSpe�niaj�caWarunek = Integer.parseInt(lista.get(0), 8);
		
		for (String l : lista){
			if (Integer.parseInt(l, 8) > najwi�kszaLiczbaSpe�niaj�caWarunek){
				najwi�kszaLiczbaSpe�niaj�caWarunek = Integer.parseInt(l, 8);
			}
			else if (Integer.parseInt(l, 8) < najmniejszaLiczbaSpe�niaj�caWarunek){
				najmniejszaLiczbaSpe�niaj�caWarunek = Integer.parseInt(l, 8);
			}
		}
		
		System.out.println("Ilo�� liczb spe�niaj�cych warunek wynosi " + liczbaLiczbSpe�niaj�cychWarunek + ". Najwi�ksza z tych liczb to " + najwi�kszaLiczbaSpe�niaj�caWarunek + " natomiast najmniejsza " + najmniejszaLiczbaSpe�niaj�caWarunek);

	}
}
