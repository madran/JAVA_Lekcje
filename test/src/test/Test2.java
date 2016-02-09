package test;

public class Test2 {

	public static void main(String[] args) {
		int wysokoœæChoinki = 5;
		char [] [] choinka = stwórzChoinkê(wysokoœæChoinki);

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
					System.out.print("i = ");
					System.out.println(i);

					System.out.print("j = ");
					System.out.println(j);
					System.out.println();
					odwróconaFigura [j] [figura.length - i - 1] = figura [i] [j];
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
