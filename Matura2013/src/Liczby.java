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
		int wyst¹pieniaLiczbGdziePierwszaCyfraJestRównaOstatniej = 0;

		for (String liczba : liczby) {
			int pierwszaPozycja = (int) liczba.charAt(0);
			int ostatniaPozycja = (int) liczba.charAt(liczba.length() - 1);

			if (pierwszaPozycja == ostatniaPozycja)
				wyst¹pieniaLiczbGdziePierwszaCyfraJestRównaOstatniej++;
		}

		return wyst¹pieniaLiczbGdziePierwszaCyfraJestRównaOstatniej;
	}

	static int zadanie2(ArrayList<String> liczby) {

		int liczba;
		ArrayList<String> liczbyDziesiêtne = new ArrayList<>();

		for (String l : liczby) {
			liczba = Integer.parseInt(l, 8);
			liczbyDziesiêtne.add("" + liczba);
		}

		return zadanie1(liczbyDziesiêtne);
	}

	static void zadanie3(ArrayList<String> liczby) {

		
		int liczbaLiczbSpe³niaj¹cychWarunek = 0;
		ArrayList <String> lista = new ArrayList <> ();

		for (int i = 0; i < liczby.size(); i++) {
			String liczba = liczby.get(i);
			char[] tablica = new char[liczba.length()];
			char[] tablicaUporz¹dkowana = new char[liczba.length()];

			for (int j = 0; j < liczba.length(); j++) {
				tablica[j] = liczba.charAt(j);
				tablicaUporz¹dkowana[j] = liczba.charAt(j);
			}
			
			Arrays.sort(tablicaUporz¹dkowana);
			
			if (Arrays.equals(tablica, tablicaUporz¹dkowana)) {
				String liczbaSpe³niaj¹caWarunek = new String (tablica);
				lista.add(liczbaSpe³niaj¹caWarunek);
				liczbaLiczbSpe³niaj¹cychWarunek++;
			}
		}
		
		
		int najmniejszaLiczbaSpe³niaj¹caWarunek = Integer.parseInt(lista.get(0), 8);
		int najwiêkszaLiczbaSpe³niaj¹caWarunek = Integer.parseInt(lista.get(0), 8);
		
		for (String l : lista){
			if (Integer.parseInt(l, 8) > najwiêkszaLiczbaSpe³niaj¹caWarunek){
				najwiêkszaLiczbaSpe³niaj¹caWarunek = Integer.parseInt(l, 8);
			}
			else if (Integer.parseInt(l, 8) < najmniejszaLiczbaSpe³niaj¹caWarunek){
				najmniejszaLiczbaSpe³niaj¹caWarunek = Integer.parseInt(l, 8);
			}
		}
		
		System.out.println("Iloœæ liczb spe³niaj¹cych warunek wynosi " + liczbaLiczbSpe³niaj¹cychWarunek + ". Najwiêksza z tych liczb to " + najwiêkszaLiczbaSpe³niaj¹caWarunek + " natomiast najmniejsza " + najmniejszaLiczbaSpe³niaj¹caWarunek);

	}
}
