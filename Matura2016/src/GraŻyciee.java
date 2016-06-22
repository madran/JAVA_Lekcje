import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gra¯yciee {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File ("gra.txt");
		Scanner skaner = new Scanner (dane);
		char [] [] plansza = new char [12] [20];

		int i = 0;
		while (skaner.hasNextLine()){
			String linia = skaner.nextLine();
			for (int j = 0; j < 20; j++){
					plansza [i] [j] = linia.charAt(j);
			}
			i++;
		}

		skaner.close();

//		for (int m = 0; m < plansza.length; m++){
//			for (int n = 0; n < plansza[m].length; n++ ){
//				System.out.print(plansza [m] [n]);
//			}
//			System.out.println();
//		}

		zadanie1(plansza, 37);


	}


	static int zadanie1 (char [] [] plansza, int pokolenie){
		char [] [] nowaPlansza = kolejnePokolenie (plansza, 37);

		int odp = ile¯ywychS¹siadów(nowaPlansza, 1, 18);

		return odp;

	}


	static char [] [] kolejnePokolenie (char [] [] plansza, int pokolenie) {

		char [] [] nowaPlansza = new char [12] [20];

		for (int i = 0; i < pokolenie; i++){

			for (int m = 0; m < plansza.length; m++){
				for (int n = 0; n < plansza[m].length; n++){
					if(czyBêdzie¯ywa(plansza, m, n)) nowaPlansza [m] [n] = 'X';
					else nowaPlansza [m] [n] = '.';
				}
			}
		}

		return nowaPlansza;
	}

	static boolean czyBêdzie¯ywa (char [] [] plansza, int i, int j){

		if (plansza [i] [j] == 'X'){
			if(ile¯ywychS¹siadów(plansza, i, j) == 2 || ile¯ywychS¹siadów(plansza, i, j) == 3) return true;
		}

		else {
			if (ile¯ywychS¹siadów(plansza, i, j) == 3) return true;
		}

		return false;

	}

	static int ile¯ywychS¹siadów (char [] [] plansza, int i, int j){
		int iloœæZywychS¹siadów = 0;

		if (i != 0 && i != 11 && j != 0 && j != 19){
			System.out.println("1");
			if (plansza [i - 1] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i - 1] [j] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i - 1] [j + 1] == 'X') iloœæZywychS¹siadów ++;

			if (plansza [i] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i] [j + 1] == 'X') iloœæZywychS¹siadów ++;

			if (plansza [i + 1] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i + 1] [j] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i + 1] [j + 1] == 'X') iloœæZywychS¹siadów ++;

			return iloœæZywychS¹siadów;
		}

		if (i == 0) {
			System.out.println("2");
		if (plansza [11] [j - 1] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [11] [j] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [11] [j + 1] == 'X') iloœæZywychS¹siadów ++;

		if (plansza [i] [j - 1] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [i] [j + 1] == 'X') iloœæZywychS¹siadów ++;

		if (plansza [i + 1] [j - 1] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [i + 1] [j] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [i + 1] [j + 1] == 'X') iloœæZywychS¹siadów ++;
		}

		else if (i == 11) {
			System.out.println("1");
			if (plansza [i - 1] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i - 1] [j] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i - 1] [j + 1] == 'X') iloœæZywychS¹siadów ++;

			if (plansza [i] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i] [j + 1] == 'X') iloœæZywychS¹siadów ++;

			if (plansza [0] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [0] [j] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [0] [j + 1] == 'X') iloœæZywychS¹siadów ++;
		}

		if (j == 0) {
			if (plansza [i - 1] [19] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i - 1] [j] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i - 1] [j + 1] == 'X') iloœæZywychS¹siadów ++;

			if (plansza [i] [19] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i] [j + 1] == 'X') iloœæZywychS¹siadów ++;

			if (plansza [i + 1] [19] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i + 1] [j] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i + 1] [j + 1] == 'X') iloœæZywychS¹siadów ++;
		}

		else if (j == 19){
			if (plansza [i - 1] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i - 1] [j] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i - 1] [0] == 'X') iloœæZywychS¹siadów ++;

			if (plansza [i] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i] [0] == 'X') iloœæZywychS¹siadów ++;

			if (plansza [i + 1] [j - 1] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i + 1] [j] == 'X') iloœæZywychS¹siadów ++;
			if (plansza [i + 1] [0] == 'X') iloœæZywychS¹siadów ++;
		}

		return iloœæZywychS¹siadów;
	}
}
