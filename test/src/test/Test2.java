package test;

public class Test2 {

	public static void main(String[] args) {
		int wysoko��Choinki = 5;
		char [] [] choinka = stw�rzChoink�(wysoko��Choinki);

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
					System.out.print("i = ");
					System.out.println(i);

					System.out.print("j = ");
					System.out.println(j);
					System.out.println();
					odwr�conaFigura [j] [figura.length - i - 1] = figura [i] [j];
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
