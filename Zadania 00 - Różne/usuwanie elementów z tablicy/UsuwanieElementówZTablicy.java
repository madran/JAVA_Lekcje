
public class UsuwanieElement�wZTablicy {

	public static void main(String[] args) {
		char [] tablica = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		int indeks = 0;
		int d�ugo��  = 5;
		char [] tablicaBezZnaku = usu�Znak(tablica, indeks);
		char [] tablicaBezPodci�gu = usu�Podci�gSposobem�ukaszowym (tablica, indeks, d�ugo��);

		System.out.print("Tablica bez znaku");
		System.out.println();

		for (int i = 0; i < tablicaBezZnaku.length; i++){
			System.out.print(tablicaBezZnaku[i] + ", ");
		}

		System.out.println();
		System.out.println();
		System.out.print("Tablica bez podci�gu");
		System.out.println();

		for (int i = 0; i < tablicaBezPodci�gu.length; i++){
			System.out.print(tablicaBezPodci�gu[i] + ", ");
		}

	}


	static char [] usu�Znak (char [] tablica, int indeks){

		char [] nowaTablica = new char [tablica.length - 1];

		for (int i = 0; i < tablica.length; i++){
			if (indeks > i){
				nowaTablica [i] = tablica [i];
			}
			else if (indeks < i){
				nowaTablica [i - 1] = tablica [i];
			}
		}

		return nowaTablica;
	}

	static char [] usu�Podci�g (char [] tablica, int indeks, int d�ugo��){

		char [] tablicaBezPodci�gu = new char [tablica.length - d�ugo��];

		for (int i = 0; i < tablica.length; i++){

			if (i < indeks){
				tablicaBezPodci�gu [i] = tablica [i];
			}


			else if (i > indeks + d�ugo�� - 1){
				tablicaBezPodci�gu [i - d�ugo��] = tablica [i];
			}

		}


		return tablicaBezPodci�gu;
	}

	static char [] usu�Podci�gSposobem�ukaszowym (char [] tablica, int indeks, int d�ugo��){

		char [] tablicaBezPodci�gu = new char [tablica.length - d�ugo��];

		for (int i = 0; i < indeks; i++){
			tablicaBezPodci�gu [i] = tablica [i];
		}

		for (int i = indeks + d�ugo��; i < tablica.length; i++){
			tablicaBezPodci�gu [i - d�ugo��] = tablica [i];
		}

		return tablicaBezPodci�gu;
	}

	
}
