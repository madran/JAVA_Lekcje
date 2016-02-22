
public class £añcuch {

	char [] tablicaZnaków;

	£añcuch (char [] tablica) {
		tablicaZnaków = tablica;
	}

	int d³ugoœæ (){
		return tablicaZnaków.length;
	}

	char znakNaPozycji (int pozycja){
		return tablicaZnaków[pozycja];
	}

	//Metoda do³¹cz zwraca nowy obiekt klasy £añcuch który zawiera ci¹g znaków powsta³y z po³¹czenia
	//ci¹gu znaków bêd¹cy atrybutem klasy £añcuch z ³añcuchem przekazanym do metody do³¹cz.

	£añcuch do³¹cz (£añcuch ³añcuch){

		char [] tablicaPo³¹czona = new char [d³ugoœæ () + ³añcuch.d³ugoœæ()];
		int k = 0;

		for (int i = 0; i < tablicaPo³¹czona.length; i++){
			if (i < d³ugoœæ()){
				tablicaPo³¹czona [i] = znakNaPozycji(i);
			}

			else {
				tablicaPo³¹czona [i] = ³añcuch.znakNaPozycji(k);
				k++;
			}
		}

		return new £añcuch (tablicaPo³¹czona);
	}

	String naString (){
		return new String (tablicaZnaków);
	}

}
