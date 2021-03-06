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
		int wystąpieniaLiczbGdziePierwszaCyfraJestRównaOstatniej = 0;

		for (String liczba : liczby) {
			int pierwszaPozycja = (int) liczba.charAt(0);
			int ostatniaPozycja = (int) liczba.charAt(liczba.length() - 1);

			if (pierwszaPozycja == ostatniaPozycja)
				wystąpieniaLiczbGdziePierwszaCyfraJestRównaOstatniej++;
		}

		return wystąpieniaLiczbGdziePierwszaCyfraJestRównaOstatniej;
	}

	static int zadanie2(ArrayList<String> liczby) {

		int liczba;
		ArrayList<String> liczbyDziesiętne = new ArrayList<>();

		for (String l : liczby) {
			liczba = Integer.parseInt(l, 8);
			liczbyDziesiętne.add("" + liczba);
		}

		return zadanie1(liczbyDziesiętne);
	}

	static void zadanie3(ArrayList<String> liczby) {

		
		int liczbaLiczbSpełniającychWarunek = 0;
		ArrayList <String> lista = new ArrayList <> ();

		for (int i = 0; i < liczby.size(); i++) {
			String liczba = liczby.get(i);
			char[] tablica = new char[liczba.length()];
			char[] tablicaUporządkowana = new char[liczba.length()];

			for (int j = 0; j < liczba.length(); j++) {
				tablica[j] = liczba.charAt(j);
				tablicaUporządkowana[j] = liczba.charAt(j);
			}
			
			Arrays.sort(tablicaUporządkowana);
			
			if (Arrays.equals(tablica, tablicaUporządkowana)) {
				String liczbaSpełniającaWarunek = new String (tablica);
				lista.add(liczbaSpełniającaWarunek);
				liczbaLiczbSpełniającychWarunek++;
			}
		}
		
		
		int najmniejszaLiczbaSpełniającaWarunek = Integer.parseInt(lista.get(0), 8);
		int największaLiczbaSpełniającaWarunek = Integer.parseInt(lista.get(0), 8);
		
		for (String l : lista){
			if (Integer.parseInt(l, 8) > największaLiczbaSpełniającaWarunek){
				największaLiczbaSpełniającaWarunek = Integer.parseInt(l, 8);
			}
			else if (Integer.parseInt(l, 8) < najmniejszaLiczbaSpełniającaWarunek){
				najmniejszaLiczbaSpełniającaWarunek = Integer.parseInt(l, 8);
			}
		}
		
		System.out.println("Ilość liczb spełniających warunek wynosi " + liczbaLiczbSpełniającychWarunek + ". Największa z tych liczb to " + największaLiczbaSpełniającaWarunek + " natomiast najmniejsza " + najmniejszaLiczbaSpełniającaWarunek);

	}
}
