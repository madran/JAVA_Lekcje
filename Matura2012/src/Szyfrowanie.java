import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Szyfrowanie {

	public static void main(String[] args) throws FileNotFoundException {

		File daneS�owa = new File("tj.txt");
		Scanner skanerS�owa = new Scanner(daneS�owa);
		ArrayList<String> s�owa = new ArrayList<>();

		while (skanerS�owa.hasNextLine()) {
			s�owa.add(skanerS�owa.nextLine());
		}

		skanerS�owa.close();

		File daneKlucze = new File("klucze1.txt");
		Scanner skanerKlucze = new Scanner(daneKlucze);
		ArrayList<String> klucze = new ArrayList<>();

		while (skanerKlucze.hasNextLine()) {
			klucze.add(skanerKlucze.nextLine());
		}

		skanerKlucze.close();

		zaszyfruj(s�owa, klucze);

	}

	static void zaszyfruj(ArrayList<String> s�owa, ArrayList<String> klucze) {

		for (int i = 0; i < s�owa.size(); i++) {
			String s�owo = s�owa.get(i);
			String klucz = klucze.get(i);
			String noweS�owo = "";

			for (int m = 0, n = 0; m < s�owo.length(); m++, n++){
				if (n >= klucz.length()) n = 0;
				int litera = (int) s�owo.charAt(m) + (int) klucz.charAt(n) - 64;
					while (litera > 90){
						litera -= 26;
					}
				noweS�owo += (char) litera;
			}
			
			System.out.println(noweS�owo);
		}

	}

}
