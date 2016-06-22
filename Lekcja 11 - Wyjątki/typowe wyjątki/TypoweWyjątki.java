
public class TypoweWyj�tki {

	static String tekst = null;

	public static void main(String[] args) {
		nullPointerException();
//		arrayIndexOutOfBoundsException();
	}

	public static void nullPointerException() {
		//Eclipse wychwyci zadeklarowan� zmienn� lokaln� bez jej definicji:
		//int i;
		//String tekst;
		//System.out.print(i); //podkre�li b��d
		//Kompilator podkre�li obie linijki i zaproponuje definicj� domy�ln� warto�ci�

		//Tablice typ�w prostych przy deklaracji s� inicjalizowane warto�ci� domy�ln�.
		//dla int jest to zero.
		int[] i = new int[2];
		System.out.println(i[0]);

		//dla obiekt�w jest to null
		String[] s = new String[2];
		System.out.println(s[0]);

		//Nie zawsze eclipse jest w stanie okre�li� czy dana zmienna zosta�a zainicjalizowana.
		//Wtedy zostanie wyrzucony NullPointerException
		//Np.:
		//pr�bujemy uzyska� do atrybutu tekst, kt�ry nie zosta� zainicjalizowany �adn� warto�ci�.
		System.out.println(tekst.length());
	}

	public static void arrayIndexOutOfBoundsException() {
		//Indeks tablicy poza zakresem
		int[] tab = new int [10];
		tab[10] = 5;
	}

	public static void illegalArgumentException() {
		//Wyj�tek zostanie wyrzucony gdy do wywo�ywanej metody przeka�emy parametry z�ych typ�w
		//np. metoda ��da przekazania char a my przeka�emy String
	}

	//IllegalStateException - odnosi si� do stanu obiektu, czyli warto�ci atrybut�w jakie zawiera.
	//Np.: plik scannera zosta� zamkni�ty.

	//NumberFormatException - kiedy metoda konwertuje ci�g na liczb� jednak przekazany ci�g nie mo�e by� przekonewertowany
	//np posiada niedozwolone znaki.

	//StackOverflowError - gdy ilo�� wywo�a� metody rekurencyjnie przekroczy maksymalny poziom.



}
