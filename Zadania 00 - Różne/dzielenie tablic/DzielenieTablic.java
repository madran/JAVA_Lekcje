
public class DzielenieTablic {

	public static void main(String[] args) {

		char [] tablica = {'w', 'e', 'c', 'r', 'b', 'c', 's', 'c', 'i', 'x', 'c', 'c', 'c', 'e', 'b', 'c'};

//		char [] [] tablicaZwracana = podzielTablicePrzezIndeks(tablica, 2);
//		char [] [] wynik = podzielTablicePrzezZnak (tablica, 'c');
		char [] [] result = podzielTablicePrzezZnak (tablica, 'c');

//		System.out.println (tablicaZwracana [0]);
//		System.out.println (tablicaZwracana [1]);
//		System.out.println();

//		for (int i = 0; i < wynik.length; i++){
//			System.out.print(i);
//			System.out.print(wynik [i].length);
//		System.out.println(wynik[i]);
//		}
		for (int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}

	static char [] [] podzielTablicePrzezIndeks (char [] tablica, int indeks){

		char [] nowaTablica1 = new char [indeks];
		char [] nowaTablica2 = new char [tablica.length - indeks];

		//tablica.length == 7
		//indeksy 0 - 6
		for (int i = 0; i < tablica.length; i++) {

			if (i < indeks) {
				nowaTablica1 [i] = tablica [i];
			}
			else {
				nowaTablica2 [i-indeks] = tablica [i];
			}

		}

		char [] [] tablicaZwracana = new char [2][];
		tablicaZwracana[0] = nowaTablica1;
		tablicaZwracana[1] = nowaTablica2;

		return tablicaZwracana;
	}

	static char [] [] podzielTablicePrzezZnakZ£EEEE (char[] tablica, char znak){

		int iloœæWyst¹pieñZnaku = 0;

		for (int i = 0; i < tablica.length - 0; i++){
			if (tablica [i] == znak){
				iloœæWyst¹pieñZnaku++;
			}
		}

		int [] indeksyZnaku = new int [iloœæWyst¹pieñZnaku];
		int j = 0;

		for (int i = 0; i < tablica.length; i++){
			if (tablica [i] == znak){
				indeksyZnaku [j] = i;
				j++;
			}
		}

		iloœæWyst¹pieñZnaku = 2;
		char [] [] wynik = new char [iloœæWyst¹pieñZnaku + 1] [];

		int poprzedni = 0;
		for (int i = 0; i < iloœæWyst¹pieñZnaku + 1; i++){
			if (i < iloœæWyst¹pieñZnaku) {
				if(indeksyZnaku[i] - poprzedni > 0) {
					wynik [i] = new char [indeksyZnaku[i] - poprzedni];
				}
				poprzedni = indeksyZnaku[i] + 1;
			}
			else {
				wynik [i] = new char [tablica.length - poprzedni];
			}
		}

		int k = 0;
		int l = 0;
		int w = 0;

		int poprzedni1 = 0;
		for (int i = 0; i < tablica.length; i++){
			if (tablica [i] != znak) {
				if(indeksyZnaku[w] - poprzedni1 > 0) {
//					System.out.print("ok");
					wynik [k] [l] = tablica [i];
					l++;
				}
				poprzedni1 = indeksyZnaku[k] + 1;
			}
			else{
				if(indeksyZnaku[w] - poprzedni1 > 0)
					k++;
				l = 0;
				w++;
			}
		}
		return wynik;
	}

	static char [] [] podzielTablicePrzezZnak(char [] string, char znak) {
		int arrays = 0;
		for(int i = 0; i < string.length - 1; i++) {
			if((string[i] == znak && string[i+1] != znak) || (string[i] != znak && i == 0)) {
				arrays++;
			}
		}

		char [] [] result = new char[arrays][];
		int j = 0;
		for(int i = 0; i < string.length - 1; i++) {
			if(string[i] != znak) {
				int arrayLength = 0;
				int k = i;
				while(string[k] != znak) {
					arrayLength++;
					if(k + 1 >= string.length) break;
					k++;
				}

				k = 0;
				char[] tab = new char[arrayLength];
				while(string[i] != znak) {
					tab[k] = string[i];
					if(i + 1 >= string.length) break;
					i++;
					k++;
				}
				result[j] = tab;
				j++;
				i--;
			}
		}
		return result;
	}

}
