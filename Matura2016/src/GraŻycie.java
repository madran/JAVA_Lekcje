import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Gra¯ycie {

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


		//Wygl¹da na to ¿e wszystkie zadania daj¹ prawid³owy wynik ;p
		System.out.println("Zadanie1");
		System.out.println(zadanie1(plansza, 37));

		System.out.println("Zadanie2");
		System.out.println(zadanie2(plansza2, 1));

		System.out.println("Zadanie3");
		System.out.println(zadanie3(plansza3, 100));

	}


	static int zadanie1 (char [] [] plansza, int pokolenie){
		char [] [] nowaPlansza = kolejnePokolenie (plansza, pokolenie);

		int odp = ile¯ywychS¹siadów(nowaPlansza, 1, 18);

		return odp;
	}

	static int zadanie2 (char [] [] plansza, int pokolenie){
		char [] [] nowaPlansza = kolejnePokolenie (plansza, pokolenie);

		int ¿yweKomórki = 0;

		for (int m = 0; m < nowaPlansza.length; m++){
			for (int n = 0; n < nowaPlansza[m].length; n++){
				if(nowaPlansza[m][n] == 'X') ¿yweKomórki++;
			}
		}

		return ¿yweKomórki;
	}

	static int zadanie3 (char [] [] plansza, int pokolenie){
		int pokolenieSta³e = kolejnePokolenieTest (plansza, pokolenie);

		return pokolenieSta³e;
	}


	static char [] [] kolejnePokolenie (char [] [] plansza, int pokolenie) {
//		rysujPlanszê(plansza);

		char [] [] nowaPlansza = new char [12] [20];

		for (int i = 0; i < pokolenie; i++){

			for (int m = 0; m < plansza.length; m++){
				for (int n = 0; n < plansza[m].length; n++){
					if(czyBêdzie¯ywa(plansza, m, n)) nowaPlansza [m] [n] = 'X';
					else nowaPlansza [m] [n] = '.';
				}
			}

			//Tu by³ b³¹d. Zrobi³aœ pêtlê, która tworzy nowe pokolenie w nowaPlansza ale nic z t¹ now¹ plansz¹
			//nie robi³aœ. Ja j¹ kopiuje do plansza, na podstawie której bêdê tworzyæ kolejne pokolenie.
			plansza = kopiujTablice(nowaPlansza);

//			System.out.println();
//			rysujPlanszê(plansza);
		}
		return nowaPlansza;
	}

	/**
	 * Ta metoda dzia³a podobnie do metody kolejnePokolenie z t¹ ró¿nic¹ ¿e porównuje w niej
	 * stare i nowe pokolenie by zrealizowaæ zadanie3
	 * Zwraca nr nowego pokolenia, które wygl¹da tak samo jak stare.
	 */
	static int kolejnePokolenieTest (char [] [] plansza, int pokolenie) {
//		rysujPlanszê(plansza);

		char [] [] nowaPlansza = new char [12] [20];

		for (int i = 0; i < pokolenie; i++){

			for (int m = 0; m < plansza.length; m++){
				for (int n = 0; n < plansza[m].length; n++){
					if(czyBêdzie¯ywa(plansza, m, n)) nowaPlansza [m] [n] = 'X';
					else nowaPlansza [m] [n] = '.';
				}
			}

			//zak³adam ¿e pokolenia sa takie same
			boolean takieSame = true;
			for (int m = 0; m < plansza.length; m++){
				//je¿eli jakieœ wiersz nie jest prawdziwy to zmieniam wartoœæ zmiennej takieSame na false
				if(!Arrays.equals(plansza[m], nowaPlansza[m])) takieSame = false;
			}

//			System.out.println();
//			rysujPlanszê(nowaPlansza);

			//je¿eli plansze s¹ takie same to zwracam wartoœæ 'i' czyli aktualne pokolenie
			if(takieSame == true) return i;

			plansza = kopiujTablice(nowaPlansza);
		}

		return 0;
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

		//Utworzy³em metodê chceckCords która sprawdza czy wspó³rzêdna nie jest poza zakresem
		//wywo³ujê j¹ z wartoœci¹ i lub j odpowiednio pomniejszon¹ lub powiêkszon¹
		//oraz maksymalnym zakresem.
		if (plansza [checkCords(i-1, 11)] [checkCords(j-1, 19)] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [checkCords(i-1, 11)] [checkCords(j, 19)] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [checkCords(i-1, 11)] [checkCords(j+1, 19)] == 'X') iloœæZywychS¹siadów ++;

		if (plansza [checkCords(i, 11)] [checkCords(j-1, 19)] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [checkCords(i, 11)] [checkCords(j+1, 19)] == 'X') iloœæZywychS¹siadów ++;

		if (plansza [checkCords(i+1, 11)] [checkCords(j-1, 19)] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [checkCords(i+1, 11)] [checkCords(j, 19)] == 'X') iloœæZywychS¹siadów ++;
		if (plansza [checkCords(i+1, 11)] [checkCords(j+1, 19)] == 'X') iloœæZywychS¹siadów ++;

		return iloœæZywychS¹siadów;
	}

	/**
	 * Metoda checkCords przyjmuje wartoœæ wspó³rzêdnej oraz jej maksymalny zakres.
	 * Je¿eli wspó³rzêdna jest mniejsza od 0 to odejmuje j¹ od zakresu i dodajê 1
	 * Np. wspó³rzêdna = -1 i zakres = 11,
	 * wspó³rzêdna powinna równaæ siê 11, dlatego zwracam 11 - 1 + 1 (zakresMax - Math.abs(wspó³rzêdna) + 1).
	 * Analogicznie dla wspó³rzêdnej wiêkszej ni¿ zakres
	 * Np. wspó³rzêdna = 12 i zakres = 11,
	 * wspó³rzêdna powinna równaæ siê 0, dlatego zwracam 12 - 11 - 1 (Math.abs(wspó³rzêdna) - zakresMax - 1).
	 * I to dzia³a poprawnie ;P
	 * Zak³adam ¿e zakres minimalny równa siê 0.
	 */
	static int checkCords(int wspó³rzêdna, int zakresMax) {
		if(wspó³rzêdna < 0) return zakresMax - Math.abs(wspó³rzêdna) + 1;
		if(wspó³rzêdna > zakresMax) return Math.abs(wspó³rzêdna) - zakresMax - 1;

		return wspó³rzêdna;
	}

	static void rysujPlanszê(char [] [] plansza) {
		for (int m = 0; m < plansza.length; m++){
			for (int n = 0; n < plansza[m].length; n++ ){
				System.out.print(plansza [m] [n]);
			}
		System.out.println();
		}
	}

	static char [] [] kopiujTablice(char [] [] tablica) {
		//zak³adam ¿e drugi wymiar tablicy ma zawsze tak¹ sam¹ d³ugoœæ dlatego ustalam jej d³ugoœæ na tablica[0].length
		//(bo w javie mog¹ byæ ró¿ne ale w tym wypadku plansza jest zawsze prostok¹tna ;P)
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
