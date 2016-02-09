
public class RysowanieFigur {

	public static void main(String[] args) {

		int wysokoœæChoinki = 5;
		char [] [] choinka = stwórzChoinkê(wysokoœæChoinki);
//		rysuj(choinka);
//
//		System.out.println();
//
//		int wysokoœæLego = 5;
//		int szerokoœæLego = 20;
//		char [] [] lego = stwórzLego(wysokoœæLego, szerokoœæLego);
//		rysuj(lego);
//
//		System.out.println();
//
//		int d³ugoœæBokuNieKwadratowegoLego = 5;
//		char [] [] kwadratoweLego = stwórzLego (d³ugoœæBokuNieKwadratowegoLego);
//		rysuj(kwadratoweLego);
//
//		int szerokoœæDiamentu = 7;	// tylko nieprarzyste!
//		char [] [] diament = stwórzDiament (szerokoœæDiamentu);
//		rysuj(diament);
		System.out.println();
		char [] [] choinkaOdwrócona = obróæ(choinka, 270);
		rysuj(choinkaOdwrócona);

	}

	static char [] [] stwórzChoinkê (int wysokoœæ){
		char [] [] choinka = new char [wysokoœæ] [wysokoœæ * 2 - 1];

		for (int i = 0; i < wysokoœæ; i++){

			for (int j = 0; j < i * 2 + 1; j++){
				choinka [i] [wysokoœæ - 1 - i + j] = 'A';
			}

			for (int j = 0; j < wysokoœæ - 1 - i; j++){
				choinka [i] [j] = ' ';
			}

			for (int j = wysokoœæ + i; j < choinka[i].length; j++){
				choinka [i] [j] = ' ';
			}
		}

		return choinka;
	}

	static char [] [] stwórzLego (int wysokoœæ, int szerokoœæ){
			char [] [] lego = new char [wysokoœæ] [szerokoœæ];

			for (int i = 0; i < wysokoœæ; i++){
				for ( int j = 0; j < szerokoœæ; j++){
					lego [i] [j] = 'H';
				}

			}

			return lego;
	}

	static char [] [] stwórzLego (int d³ugoœæBokuNieKwadratowegoLego){

		return stwórzLego (d³ugoœæBokuNieKwadratowegoLego, d³ugoœæBokuNieKwadratowegoLego);
	}

	static char [] [] stwórzDiament (int szerokoœæ){
		char [] [] diament = new char [szerokoœæ] [szerokoœæ];


		for (int i = 0; i < szerokoœæ/2 + 1; i++){

			for (int j = 0; j < 2 * i + 1; j++){
					diament [i] [szerokoœæ/2 - i + j] = '*';
					diament [szerokoœæ - 1 - i] [szerokoœæ/2 - i + j] = '*';
			}

			for (int j = 0; j < szerokoœæ/2 - i; j++){
				diament [i] [j] = ' ';
				diament [szerokoœæ - 1 - i] [j] = ' ';
			}

			for (int j = szerokoœæ/2 + 1 + i; j < szerokoœæ; j++){
				diament [i] [j] = ' ';
				diament [szerokoœæ - 1 - i] [j] = ' ';
			}

		}

		return diament;
	}

	static char [] [] obróæ (char [] [] figura, int k¹t){
		char [] [] odwróconaFigura = null;

		if (k¹t == 90){
			odwróconaFigura = new char [figura[0].length] [figura.length];
			for (int i = 0; i < figura[0].length; i++){
				for (int j = 0; j < figura.length; j++){
					odwróconaFigura [i] [j] = figura [j] [i];
				}
			}
		}

		if (k¹t == 180){
			odwróconaFigura = new char [figura.length] [figura[0].length];
			for (int i = 0; i < figura.length; i++){
				for (int j = 0; j < figura[0].length; j++){
					odwróconaFigura [i] [j] = figura [figura.length - 1 - i] [figura[0].length - 1 - j];
				}
			}
		}

		if (k¹t == 270){
			odwróconaFigura = new char [figura[0].length] [figura.length];
			for (int i = 0; i < figura.length; i++){
				for (int j = 0; j < figura[0].length; j++){
					odwróconaFigura [j] [figura.length - 1 - i] = figura [i] [j];
				}
			}
		}


		return odwróconaFigura;
	}

	static void rysuj (char [] [] tablica){
		for (int i = 0; i < tablica.length; i++){
			for (int j = 0; j < tablica[i].length; j++){
				System.out.print(tablica [i] [j]);
			}
			System.out.println();
		}

	}
}

