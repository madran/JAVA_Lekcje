
public class �a�cuch {

	char [] tablicaZnak�w;

	�a�cuch (char [] tablica) {
		tablicaZnak�w = tablica;
	}

	int d�ugo�� (){
		return tablicaZnak�w.length;
	}

	char znakNaPozycji (int pozycja){
		return tablicaZnak�w[pozycja];
	}

	//Metoda do��cz zwraca nowy obiekt klasy �a�cuch kt�ry zawiera ci�g znak�w powsta�y z po��czenia
	//ci�gu znak�w b�d�cy atrybutem klasy �a�cuch z �a�cuchem przekazanym do metody do��cz.

	�a�cuch do��cz (�a�cuch �a�cuch){

		char [] tablicaPo��czona = new char [d�ugo�� () + �a�cuch.d�ugo��()];
		int k = 0;

		for (int i = 0; i < tablicaPo��czona.length; i++){
			if (i < d�ugo��()){
				tablicaPo��czona [i] = znakNaPozycji(i);
			}

			else {
				tablicaPo��czona [i] = �a�cuch.znakNaPozycji(k);
				k++;
			}
		}

		return new �a�cuch (tablicaPo��czona);
	}

	String naString (){
		return new String (tablicaZnak�w);
	}

}
