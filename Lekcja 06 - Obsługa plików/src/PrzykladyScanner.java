import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrzykladyScanner {

	public static void main(String[] args) throws FileNotFoundException {

		//Czytanie kolejnych linii z pliku:
		File plik1 = new File("dane");

		Scanner scanner1 = new Scanner(plik1);

		while(scanner1.hasNextLine()){
            System.out.println(scanner1.nextLine());
        }

		scanner1.close();


		//Czytanie kolejnych s³ów z pliku (domyœlnie rozdzielane spacj¹):
		File plik2 = new File("dane");

		Scanner scanner2 = new Scanner(plik2);

		while(scanner2.hasNext()){
			System.out.println(scanner2.next());
		}

		scanner2.close();


		//Mo¿na ustawiæ w³asny znak, który pos³u¿y do dzielenia s³ów
		//przy pomocy metody useDeliemiter():
		File plik3 = new File("dane");

		Scanner scanner3 = new Scanner(plik3);
		scanner3.useDelimiter("a"); //s³owa bêd¹ rozdzielane liter¹ 'a'

		while(scanner3.hasNext()){
			System.out.println(scanner3.next());
		}

		scanner3.close();

	}

}
