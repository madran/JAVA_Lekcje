import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Liczby {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File("liczby.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList<String> liczby = new ArrayList<>();

		while (skaner.hasNextLine()) {
			liczby.add(skaner.nextLine());
		}

		skaner.close();

		System.out.println("ZADANIE1");
		System.out.println(zadanie1(liczby));
		System.out.println();
		
		System.out.println("ZADANIE2");
		zadanie2(liczby);
		System.out.println();
		
		System.out.println("ZADANIE3");
		zadanie3(liczby);
	}

	static int zadanie1(ArrayList<String> liczby) {
		int ilo��LiczbParzystych = 0;
		
		for (String l : liczby){
			int liczba = Integer.parseInt(l, 2);
			if (liczba % 2 == 0) ilo��LiczbParzystych ++;
		}
		
		return ilo��LiczbParzystych;
	}

	static void zadanie2(ArrayList<String> liczby) {
		
		int najwi�kszaLiczba10 = Integer.parseInt(liczby.get(0), 2);
		String najwi�kszaLiczba2 = liczby.get(0);
		
		for (String l : liczby){
			int liczba10 = Integer.parseInt(l, 2);
			if (liczba10 > najwi�kszaLiczba10){
				najwi�kszaLiczba10 = liczba10;
				najwi�kszaLiczba2 = l;
			}
		}
		
		System.out.println(najwi�kszaLiczba2);
		System.out.println(najwi�kszaLiczba10);
	}

	static void zadanie3(ArrayList<String> liczby) {

		int ilo��LiczbKt�reMaj�Dziewi��Cyfr = 0;
		int suma = 0;
		
		for (String l : liczby){
			if(l.length() == 9){						
				ilo��LiczbKt�reMaj�Dziewi��Cyfr++;
				suma += Integer.parseInt(l, 2);
			}
		}
		
		String sumaBinarnie = Integer.toBinaryString(suma);
		
		System.out.println(sumaBinarnie);
		System.out.println(ilo��LiczbKt�reMaj�Dziewi��Cyfr);
	}
}
