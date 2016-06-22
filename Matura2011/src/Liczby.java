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
		int iloœæLiczbParzystych = 0;
		
		for (String l : liczby){
			int liczba = Integer.parseInt(l, 2);
			if (liczba % 2 == 0) iloœæLiczbParzystych ++;
		}
		
		return iloœæLiczbParzystych;
	}

	static void zadanie2(ArrayList<String> liczby) {
		
		int najwiêkszaLiczba10 = Integer.parseInt(liczby.get(0), 2);
		String najwiêkszaLiczba2 = liczby.get(0);
		
		for (String l : liczby){
			int liczba10 = Integer.parseInt(l, 2);
			if (liczba10 > najwiêkszaLiczba10){
				najwiêkszaLiczba10 = liczba10;
				najwiêkszaLiczba2 = l;
			}
		}
		
		System.out.println(najwiêkszaLiczba2);
		System.out.println(najwiêkszaLiczba10);
	}

	static void zadanie3(ArrayList<String> liczby) {

		int iloœæLiczbKtóreMaj¹DziewiêæCyfr = 0;
		int suma = 0;
		
		for (String l : liczby){
			if(l.length() == 9){						
				iloœæLiczbKtóreMaj¹DziewiêæCyfr++;
				suma += Integer.parseInt(l, 2);
			}
		}
		
		String sumaBinarnie = Integer.toBinaryString(suma);
		
		System.out.println(sumaBinarnie);
		System.out.println(iloœæLiczbKtóreMaj¹DziewiêæCyfr);
	}
}
