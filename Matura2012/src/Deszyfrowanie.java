import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Deszyfrowanie {

	public static void main(String[] args) throws FileNotFoundException {

		File daneS這wa = new File("sz.txt");
		Scanner skanerS這wa = new Scanner(daneS這wa);
		ArrayList<String> s這wa = new ArrayList<>();

		while (skanerS這wa.hasNextLine()) {
			s這wa.add(skanerS這wa.nextLine());
		}

		skanerS這wa.close();

		File daneKlucze = new File("klucze2.txt");
		Scanner skanerKlucze = new Scanner(daneKlucze);
		ArrayList<String> klucze = new ArrayList<>();

		while (skanerKlucze.hasNextLine()) {
			klucze.add(skanerKlucze.nextLine());
		}

		skanerKlucze.close();

		odszyfruj(s這wa, klucze);
		
	}
	
	static void odszyfruj (ArrayList<String> s這wa, ArrayList<String> klucze){
		
		for (int i = 0; i < s這wa.size(); i++) {
			String s這wo = s這wa.get(i);
			String klucz = klucze.get(i);
			String noweS這wo = "";

			for (int m = 0, n = 0; m < s這wo.length(); m++, n++){
				if (n >= klucz.length()) n =0;
				int litera = (int) s這wo.charAt(m) - (int) klucz.charAt(n) + 64;
				while (litera < 65) litera += 26;
				noweS這wo += (char) litera;
			}
			
			System.out.println(noweS這wo);
		}
		
	}

}
