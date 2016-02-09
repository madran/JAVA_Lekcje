
public class RysowanieFigur {

	public static void main(String[] args) {

		int wysoko��Choinki = 5;
		char [] [] choinka = stw�rzChoink�(wysoko��Choinki);
//		rysuj(choinka);
//
//		System.out.println();
//
//		int wysoko��Lego = 5;
//		int szeroko��Lego = 20;
//		char [] [] lego = stw�rzLego(wysoko��Lego, szeroko��Lego);
//		rysuj(lego);
//
//		System.out.println();
//
//		int d�ugo��BokuNieKwadratowegoLego = 5;
//		char [] [] kwadratoweLego = stw�rzLego (d�ugo��BokuNieKwadratowegoLego);
//		rysuj(kwadratoweLego);
//
//		int szeroko��Diamentu = 7;	// tylko nieprarzyste!
//		char [] [] diament = stw�rzDiament (szeroko��Diamentu);
//		rysuj(diament);
		System.out.println();
		char [] [] choinkaOdwr�cona = obr��(choinka, 270);
		rysuj(choinkaOdwr�cona);

	}

	static char [] [] stw�rzChoink� (int wysoko��){
		char [] [] choinka = new char [wysoko��] [wysoko�� * 2 - 1];

		for (int i = 0; i < wysoko��; i++){

			for (int j = 0; j < i * 2 + 1; j++){
				choinka [i] [wysoko�� - 1 - i + j] = 'A';
			}

			for (int j = 0; j < wysoko�� - 1 - i; j++){
				choinka [i] [j] = ' ';
			}

			for (int j = wysoko�� + i; j < choinka[i].length; j++){
				choinka [i] [j] = ' ';
			}
		}

		return choinka;
	}

	static char [] [] stw�rzLego (int wysoko��, int szeroko��){
			char [] [] lego = new char [wysoko��] [szeroko��];

			for (int i = 0; i < wysoko��; i++){
				for ( int j = 0; j < szeroko��; j++){
					lego [i] [j] = 'H';
				}

			}

			return lego;
	}

	static char [] [] stw�rzLego (int d�ugo��BokuNieKwadratowegoLego){

		return stw�rzLego (d�ugo��BokuNieKwadratowegoLego, d�ugo��BokuNieKwadratowegoLego);
	}

	static char [] [] stw�rzDiament (int szeroko��){
		char [] [] diament = new char [szeroko��] [szeroko��];


		for (int i = 0; i < szeroko��/2 + 1; i++){

			for (int j = 0; j < 2 * i + 1; j++){
					diament [i] [szeroko��/2 - i + j] = '*';
					diament [szeroko�� - 1 - i] [szeroko��/2 - i + j] = '*';
			}

			for (int j = 0; j < szeroko��/2 - i; j++){
				diament [i] [j] = ' ';
				diament [szeroko�� - 1 - i] [j] = ' ';
			}

			for (int j = szeroko��/2 + 1 + i; j < szeroko��; j++){
				diament [i] [j] = ' ';
				diament [szeroko�� - 1 - i] [j] = ' ';
			}

		}

		return diament;
	}

	static char [] [] obr�� (char [] [] figura, int k�t){
		char [] [] odwr�conaFigura = null;

		if (k�t == 90){
			odwr�conaFigura = new char [figura[0].length] [figura.length];
			for (int i = 0; i < figura[0].length; i++){
				for (int j = 0; j < figura.length; j++){
					odwr�conaFigura [i] [j] = figura [j] [i];
				}
			}
		}

		if (k�t == 180){
			odwr�conaFigura = new char [figura.length] [figura[0].length];
			for (int i = 0; i < figura.length; i++){
				for (int j = 0; j < figura[0].length; j++){
					odwr�conaFigura [i] [j] = figura [figura.length - 1 - i] [figura[0].length - 1 - j];
				}
			}
		}

		if (k�t == 270){
			odwr�conaFigura = new char [figura[0].length] [figura.length];
			for (int i = 0; i < figura.length; i++){
				for (int j = 0; j < figura[0].length; j++){
					odwr�conaFigura [j] [figura.length - 1 - i] = figura [i] [j];
				}
			}
		}


		return odwr�conaFigura;
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

