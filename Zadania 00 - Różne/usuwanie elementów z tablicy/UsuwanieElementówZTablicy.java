
public class UsuwanieElementówZTablicy {

	public static void main(String[] args) {
		char [] tablica = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		int indeks = 0;
		int d³ugoœæ  = 5;
		char [] tablicaBezZnaku = usuñZnak(tablica, indeks);
		char [] tablicaBezPodci¹gu = usuñPodci¹gSposobem£ukaszowym (tablica, indeks, d³ugoœæ);

		System.out.print("Tablica bez znaku");
		System.out.println();

		for (int i = 0; i < tablicaBezZnaku.length; i++){
			System.out.print(tablicaBezZnaku[i] + ", ");
		}

		System.out.println();
		System.out.println();
		System.out.print("Tablica bez podci¹gu");
		System.out.println();

		for (int i = 0; i < tablicaBezPodci¹gu.length; i++){
			System.out.print(tablicaBezPodci¹gu[i] + ", ");
		}

	}


	static char [] usuñZnak (char [] tablica, int indeks){

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

	static char [] usuñPodci¹g (char [] tablica, int indeks, int d³ugoœæ){

		char [] tablicaBezPodci¹gu = new char [tablica.length - d³ugoœæ];

		for (int i = 0; i < tablica.length; i++){

			if (i < indeks){
				tablicaBezPodci¹gu [i] = tablica [i];
			}


			else if (i > indeks + d³ugoœæ - 1){
				tablicaBezPodci¹gu [i - d³ugoœæ] = tablica [i];
			}

		}


		return tablicaBezPodci¹gu;
	}

	static char [] usuñPodci¹gSposobem£ukaszowym (char [] tablica, int indeks, int d³ugoœæ){

		char [] tablicaBezPodci¹gu = new char [tablica.length - d³ugoœæ];

		for (int i = 0; i < indeks; i++){
			tablicaBezPodci¹gu [i] = tablica [i];
		}

		for (int i = indeks + d³ugoœæ; i < tablica.length; i++){
			tablicaBezPodci¹gu [i - d³ugoœæ] = tablica [i];
		}

		return tablicaBezPodci¹gu;
	}

	
}
