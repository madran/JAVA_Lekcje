
public class InsertionSort {

	public static void main(String[] args) {
		int[] tab = {4, 2, 7, 5, 9};

		insertionSort(tab);

		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
	}

	//Sortowanie przez wstawianie jest podobnym algorytmem jaki stosujemy sortuj�c karty.
	//Przechodzimy przez wszystkie elementy zaczynaj�c od drugiego rozpatruj�c czy znajduje si�
	//na odpowiedniej pozycji sprawdzaj�c od pocz�tku tablicy.
	//Przyk�ad tab = {4, 2, 7, 5, 9}
	//Zaczynamy od drugiego elementu czyli liczby 2
	//sprawdzamy czy jest mniejszy od 4
	//jest wi�c 'wyci�gamy' dw�jk� ze swojego miesca
	//i przesuwamy wszystko co jest przed ni� (czw�rka) o jedn� pozycj�
	//a na wolne miejsce wstawiamy dw�jk�
	//nast�pnie bierzemy 7 i powtarzamy procedur�
	public static void insertionSort(int[] tab) {
		for(int i = 1; i < tab.length; i++) {
			int temp = tab[i];
			int j;

			for(j = i - 1; j >= 0 && temp < tab[j]; j--) { //tutaj por�wnywanie kolejnych element�w nie odbywa si�
				tab[j + 1] = tab[j];                       //od pocz�tku tablicy tylko od sprawdzanego do pocz�tku tablicy
			}

			tab[j + 1] = temp;
		}
	}

}
