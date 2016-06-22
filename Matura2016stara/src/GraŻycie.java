import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Gra�ycie {

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

		char [] [] plansza2 = kopiujTablice(plansza);
		char [] [] plansza3 = kopiujTablice(plansza);


		//Wygl�da na to �e wszystkie zadania daj� prawid�owy wynik ;p
		System.out.println("Zadanie1");
		System.out.println(zadanie1(plansza, 37));

		System.out.println("Zadanie2");
		System.out.println(zadanie2(plansza2, 1));

		System.out.println("Zadanie3");
		System.out.println(zadanie3(plansza3, 100));

	}


	static int zadanie1 (char [] [] plansza, int pokolenie){
		char [] [] nowaPlansza = kolejnePokolenie (plansza, pokolenie);

		int odp = ile�ywychS�siad�w(nowaPlansza, 1, 18);

		return odp;
	}

	static int zadanie2 (char [] [] plansza, int pokolenie){
		char [] [] nowaPlansza = kolejnePokolenie (plansza, pokolenie);

		int �yweKom�rki = 0;

		for (int m = 0; m < nowaPlansza.length; m++){
			for (int n = 0; n < nowaPlansza[m].length; n++){
				if(nowaPlansza[m][n] == 'X') �yweKom�rki++;
			}
		}

		return �yweKom�rki;
	}

	static int zadanie3 (char [] [] plansza, int pokolenie){
		int pokolenieSta�e = kolejnePokolenieTest (plansza, pokolenie);

		return pokolenieSta�e;
	}


	static char [] [] kolejnePokolenie (char [] [] plansza, int pokolenie) {
//		rysujPlansz�(plansza);

		char [] [] nowaPlansza = new char [12] [20];

		for (int i = 0; i < pokolenie; i++){

			for (int m = 0; m < plansza.length; m++){
				for (int n = 0; n < plansza[m].length; n++){
					if(czyB�dzie�ywa(plansza, m, n)) nowaPlansza [m] [n] = 'X';
					else nowaPlansza [m] [n] = '.';
				}
			}

			//Tu by� b��d. Zrobi�a� p�tl�, kt�ra tworzy nowe pokolenie w nowaPlansza ale nic z t� now� plansz�
			//nie robi�a�. Ja j� kopiuje do plansza, na podstawie kt�rej b�d� tworzy� kolejne pokolenie.
			plansza = kopiujTablice(nowaPlansza);

//			System.out.println();
//			rysujPlansz�(plansza);
		}
		return nowaPlansza;
	}

	/**
	 * Ta metoda dzia�a podobnie do metody kolejnePokolenie z t� r�nic� �e por�wnuje w niej
	 * stare i nowe pokolenie by zrealizowa� zadanie3
	 * Zwraca nr nowego pokolenia, kt�re wygl�da tak samo jak stare.
	 */
	static int kolejnePokolenieTest (char [] [] plansza, int pokolenie) {
//		rysujPlansz�(plansza);

		char [] [] nowaPlansza = new char [12] [20];

		for (int i = 0; i < pokolenie; i++){

			for (int m = 0; m < plansza.length; m++){
				for (int n = 0; n < plansza[m].length; n++){
					if(czyB�dzie�ywa(plansza, m, n)) nowaPlansza [m] [n] = 'X';
					else nowaPlansza [m] [n] = '.';
				}
			}

			//zak�adam �e pokolenia sa takie same
			boolean takieSame = true;
			for (int m = 0; m < plansza.length; m++){
				//je�eli jakie� wiersz nie jest prawdziwy to zmieniam warto�� zmiennej takieSame na false
				if(!Arrays.equals(plansza[m], nowaPlansza[m])) takieSame = false;
			}

//			System.out.println();
//			rysujPlansz�(nowaPlansza);

			//je�eli plansze s� takie same to zwracam warto�� 'i' czyli aktualne pokolenie
			if(takieSame == true) return i;

			plansza = kopiujTablice(nowaPlansza);
		}

		return 0;
	}

	static boolean czyB�dzie�ywa (char [] [] plansza, int i, int j){

		if (plansza [i] [j] == 'X'){
			if(ile�ywychS�siad�w(plansza, i, j) == 2 || ile�ywychS�siad�w(plansza, i, j) == 3) return true;
		}

		else {
			if (ile�ywychS�siad�w(plansza, i, j) == 3) return true;
		}

		return false;

	}

	static int ile�ywychS�siad�w (char [] [] plansza, int i, int j){
		int ilo��ZywychS�siad�w = 0;

		//Utworzy�em metod� chceckCords kt�ra sprawdza czy wsp�rz�dna nie jest poza zakresem
		//wywo�uj� j� z warto�ci� i lub j odpowiednio pomniejszon� lub powi�kszon�
		//oraz maksymalnym zakresem.
		if (plansza [checkCords(i-1, 11)] [checkCords(j-1, 19)] == 'X') ilo��ZywychS�siad�w ++;
		if (plansza [checkCords(i-1, 11)] [checkCords(j, 19)] == 'X') ilo��ZywychS�siad�w ++;
		if (plansza [checkCords(i-1, 11)] [checkCords(j+1, 19)] == 'X') ilo��ZywychS�siad�w ++;

		if (plansza [checkCords(i, 11)] [checkCords(j-1, 19)] == 'X') ilo��ZywychS�siad�w ++;
		if (plansza [checkCords(i, 11)] [checkCords(j+1, 19)] == 'X') ilo��ZywychS�siad�w ++;

		if (plansza [checkCords(i+1, 11)] [checkCords(j-1, 19)] == 'X') ilo��ZywychS�siad�w ++;
		if (plansza [checkCords(i+1, 11)] [checkCords(j, 19)] == 'X') ilo��ZywychS�siad�w ++;
		if (plansza [checkCords(i+1, 11)] [checkCords(j+1, 19)] == 'X') ilo��ZywychS�siad�w ++;

		return ilo��ZywychS�siad�w;
	}

	/**
	 * Metoda checkCords przyjmuje warto�� wsp�rz�dnej oraz jej maksymalny zakres.
	 * Je�eli wsp�rz�dna jest mniejsza od 0 to odejmuje j� od zakresu i dodaj� 1
	 * Np. wsp�rz�dna = -1 i zakres = 11,
	 * wsp�rz�dna powinna r�wna� si� 11, dlatego zwracam 11 - 1 + 1 (zakresMax - Math.abs(wsp�rz�dna) + 1).
	 * Analogicznie dla wsp�rz�dnej wi�kszej ni� zakres
	 * Np. wsp�rz�dna = 12 i zakres = 11,
	 * wsp�rz�dna powinna r�wna� si� 0, dlatego zwracam 12 - 11 - 1 (Math.abs(wsp�rz�dna) - zakresMax - 1).
	 * I to dzia�a poprawnie ;P
	 * Zak�adam �e zakres minimalny r�wna si� 0.
	 */
	static int checkCords(int wsp�rz�dna, int zakresMax) {
		if(wsp�rz�dna < 0) return zakresMax - Math.abs(wsp�rz�dna) + 1;
		if(wsp�rz�dna > zakresMax) return Math.abs(wsp�rz�dna) - zakresMax - 1;

		return wsp�rz�dna;
	}

	static void rysujPlansz�(char [] [] plansza) {
		for (int m = 0; m < plansza.length; m++){
			for (int n = 0; n < plansza[m].length; n++ ){
				System.out.print(plansza [m] [n]);
			}
		System.out.println();
		}
	}

	static char [] [] kopiujTablice(char [] [] tablica) {
		//zak�adam �e drugi wymiar tablicy ma zawsze tak� sam� d�ugo�� dlatego ustalam jej d�ugo�� na tablica[0].length
		//(bo w javie mog� by� r�ne ale w tym wypadku plansza jest zawsze prostok�tna ;P)
		//                                                        ||
		//                                                        \/
		char [] [] nowaTablica = new char [tablica.length] [tablica[0].length];
		for (int i = 0; i < tablica.length; i++){
			for (int j = 0; j < tablica[i].length; j++){
				nowaTablica[i][j] = tablica[i][j];
			}
		}

		return nowaTablica;
	}
}
