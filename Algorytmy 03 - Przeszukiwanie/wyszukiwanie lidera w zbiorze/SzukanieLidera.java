
public class SzukanieLidera {

	public static void main(String[] args) {
		int[] zbior = {1, 1, 2, 3, 4, 5, 1, 1, 1};
		szukanieLidera(zbior);
	}

	public static void szukanieLidera(int[] tablica) {
		int kandydatNaLidera = tablica [0];
		int licznik = 1;
		
		for (int i = 1; i < tablica.length; i++){
			if (tablica [i] == kandydatNaLidera) licznik ++;
			else licznik --;
			if (licznik == 0) {
				kandydatNaLidera = tablica [i];
				licznik = 1;
			}
		}
		
		int wyst¹pienieKandydataNaLidera = 0;
		for (int i = 0; i < tablica.length; i++){
			if (tablica[i] == kandydatNaLidera) wyst¹pienieKandydataNaLidera ++;
		}
	
		if (wyst¹pienieKandydataNaLidera >= tablica.length / 2 + 1) System.out.print(kandydatNaLidera);
		else System.out.print("Brak lidera");
	}

}
