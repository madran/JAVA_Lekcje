
public class TypoweWyj¹tki {

	static String tekst = null;

	public static void main(String[] args) {
		nullPointerException();
//		arrayIndexOutOfBoundsException();
	}

	public static void nullPointerException() {
		//Eclipse wychwyci zadeklarowan¹ zmienn¹ lokaln¹ bez jej definicji:
		//int i;
		//String tekst;
		//System.out.print(i); //podkreœli b³¹d
		//Kompilator podkreœli obie linijki i zaproponuje definicjê domyœln¹ wartoœci¹

		//Tablice typów prostych przy deklaracji s¹ inicjalizowane wartoœci¹ domyœln¹.
		//dla int jest to zero.
		int[] i = new int[2];
		System.out.println(i[0]);

		//dla obiektów jest to null
		String[] s = new String[2];
		System.out.println(s[0]);

		//Nie zawsze eclipse jest w stanie okreœliæ czy dana zmienna zosta³a zainicjalizowana.
		//Wtedy zostanie wyrzucony NullPointerException
		//Np.:
		//próbujemy uzyskaæ do atrybutu tekst, który nie zosta³ zainicjalizowany ¿adn¹ wartoœci¹.
		System.out.println(tekst.length());
	}

	public static void arrayIndexOutOfBoundsException() {
		//Indeks tablicy poza zakresem
		int[] tab = new int [10];
		tab[10] = 5;
	}

	public static void illegalArgumentException() {
		//Wyj¹tek zostanie wyrzucony gdy do wywo³ywanej metody przeka¿emy parametry z³ych typów
		//np. metoda ¿¹da przekazania char a my przeka¿emy String
	}

	//IllegalStateException - odnosi siê do stanu obiektu, czyli wartoœci atrybutów jakie zawiera.
	//Np.: plik scannera zosta³ zamkniêty.

	//NumberFormatException - kiedy metoda konwertuje ci¹g na liczbê jednak przekazany ci¹g nie mo¿e byæ przekonewertowany
	//np posiada niedozwolone znaki.

	//StackOverflowError - gdy iloœæ wywo³añ metody rekurencyjnie przekroczy maksymalny poziom.



}
