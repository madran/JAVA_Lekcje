
public class InsertionSort {

	public static void main(String[] args) {
		int[] tab = {4, 2, 7, 5, 9};

		insertionSort(tab);

		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
	}

	//Sortowanie przez wstawianie jest podobnym algorytmem jaki stosujemy sortuj¹c karty.
	//Przechodzimy przez wszystkie elementy zaczynaj¹c od drugiego rozpatruj¹c czy znajduje siê
	//na odpowiedniej pozycji sprawdzaj¹c od pocz¹tku tablicy.
	//Przyk³ad tab = {4, 2, 7, 5, 9}
	//Zaczynamy od drugiego elementu czyli liczby 2
	//sprawdzamy czy jest mniejszy od 4
	//jest wiêc 'wyci¹gamy' dwójkê ze swojego miesca
	//i przesuwamy wszystko co jest przed niê (czwórka) o jedn¹ pozycjê
	//a na wolne miejsce wstawiamy dwójkê
	//nastêpnie bierzemy 7 i powtarzamy procedurê
	public static void insertionSort(int[] tab) {
		for(int i = 1; i < tab.length; i++) {
			int temp = tab[i];
			int j;

			for(j = i - 1; j >= 0 && temp < tab[j]; j--) { //tutaj porównywanie kolejnych elementów nie odbywa siê
				tab[j + 1] = tab[j];                       //od pocz¹tku tablicy tylko od sprawdzanego do pocz¹tku tablicy
			}

			tab[j + 1] = temp;
		}
	}

}
