import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Scanner;

// przedzia� <65, 90>

public class Napisy {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("NAPIS.TXT");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> napisy = new ArrayList<>();

		while (skaner.hasNextLine()) {
			napisy.add(skaner.nextLine());
		}

		skaner.close();

		System.out.println("ZADANIE 1");
		System.out.println(zadanie1(napisy));
		System.out.println();

		System.out.println("ZADANIE 2");
		zadanie2(napisy);
		System.out.println();

		System.out.println("ZADANIE 3");
		zadanie3(napisy);

	}

	static int zadanie1(ArrayList<String> napisy) {
		int ilo��Napis�wPierwszych = 0;

		for (int i = 0; i < napisy.size(); i++) {
			String napis = napisy.get(i);
			int suma = 0;

			for (int j = 0; j < napis.length(); j++) {
				int tmp = napis.charAt(j);
				suma += tmp;
			}

			if (czyJestLiczb�Pierwsz�(suma)) {
				ilo��Napis�wPierwszych++;
			}
		}

		return ilo��Napis�wPierwszych;
	}

	static void zadanie2(ArrayList<String> napisy) {

		for (int i = 0; i < napisy.size(); i++) {
			String napis = napisy.get(i);
			int[] tablica = new int[napis.length()];
			int[] tablicaPosortowana = new int[napis.length()];

			for (int j = 0; j < napis.length(); j++) {
				tablica[j] = napis.charAt(j);
				tablicaPosortowana[j] = napis.charAt(j);
			}

			Arrays.sort(tablicaPosortowana);

			if (Arrays.equals(tablica, tablicaPosortowana)) {
				System.out.println(napis);
			}

		}
	}

	static void zadanie3(ArrayList<String> napisy) {

		HashMap<String, Integer> mieszaj�caMapa = new HashMap<>();

		for (String n : napisy) {
			if (mieszaj�caMapa.containsKey(n)) {
				mieszaj�caMapa.put(n, mieszaj�caMapa.get(n) + 1);
			}
			else mieszaj�caMapa.put(n, 1);
		}

		for(Entry<String, Integer> wpis : mieszaj�caMapa.entrySet()) {
			String napis = wpis.getKey();
			Integer ilo��Wyst�pie� = wpis.getValue();
			if (ilo��Wyst�pie� > 1){
				System.out.println(napis);
			}
		}
	}

	static boolean czyJestLiczb�Pierwsz�(int liczba) {
		boolean liczbaPierwsza = true;

		for (int i = 2; i <= liczba / 2; i++) {
			int reszta = liczba % i;
			if (reszta == 0) {
				liczbaPierwsza = false;
				break;
			}
		}

		return liczbaPierwsza;
	}

}
