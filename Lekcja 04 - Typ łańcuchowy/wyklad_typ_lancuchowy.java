//*****************************************************************************
//Typ �a�cuchowy                                                              *
//*****************************************************************************
//Ci�g lub �a�cych znak�w to specjalny typ danych, kt�ry s�u�y do przechowywania tekst�w.
//W przypadku j�zyka Java s�uzy do tego klasa String. Klasa ta obudowuje (inaczej przes�ania)
//tablic� znak�w (typ char) i dostarcza szereg metod umo�liwiaj�cych manipulowania ni�.

//Ci�gi w jave s� niezmienne. Oznacza to �e nie mo�na zmieni� warto�ci tekstu przechowywanego w obiekcie.
//Wszystkie metody, kt�re modyfikuj� teskt tak naprawd� zwracaj� nowy obiekt z nowym ci�giem.



//Metody deklaracji zmiennej typu String
//*****************************************************************************
//Deklaracja przy pomocy litera�u
//W przypadku ci�g�ow litera�em jest dowolny tekst zapisany w cudzys�owiu pod�wjnym.
String imi� = "Kamilka";

//Je�eli chcemy aby w tek�cie znajdowa� si� podw�jny cudzys��w to nalezy poprzedzi� go uko�nikiem '\',
//cudzys��w pojedynczy mo�na u�ywa� bez ogranicze�
String cudzys�owy = "Cudzys��w podw�jny \" i cudzys��w pojedy�czy '.";

//Taka metoda tworzenia obiekt�w typu String charakteryzuje si� tym, �e je�eli przypiszemy do dw�ch r�nych zmiennych
//ten sam ci�g to obie zmienne b�d� wskazywa� na ten sam obiekt:
String imi�1 = "Kamilka";
String imi�2 = "Kamilka";
//Obie zmienne wskazuj� na ten sam obiekt string (przetrzymuj� adres do tego samego obiektu)
//przetrzymuj�cy tekst "Kamilka" (kwestia optymalizacji, aby nie mno�y� obiekty).
//Je�eli chcemy utworzy� dwa r�ne obiekty z t� sam� warto�ci� ci�gu to nale�y uzy� operatora new
String imi�3 = new String("Kamilka"); //zmienna imi�3 wskazuje na inny obiekt ni� imi�1 i imi�2

//Deklaracja przy pomocy operatora new
String imi�1 = new String("Kamilka");

char[] imi�Tablica = {'K', 'a', 'm', 'i', 'l', 'k', 'a'};
String imi� = new String(imi�);



//*****************************************************************************
//Najwa�niejsze metody klasy String                                           *
//*****************************************************************************

//D�ugo�� ci�gu
//*****************************************************************************
//(deklaracja) -> int length()
String tekst = "Ala ma kota";
tekst.length(); //Zwraca 11



//��czenie ci�g�w
//*****************************************************************************
String tekst = "Ala ma kota";

//(deklaracja) -> String concat(String str)
tekst.concat(", a kot ma Al�"); //��czy ci�g zapisany w zmiennej tekst z przekazanym do metody concat()
                               //zwr�ci "Ala ma kota, a kot ma Al�"

//Cz�ciej do ��czenia ci�g�w wykorzystuje si� operator +
String nowyTekst = tekst + ", a kot ma Al�";
//Je�eli u�yjemy operatora + z ci�giem oraz typami podstawowymi to ca�o�� zostanie zapisana jako ci�g (rzutowanie niejawne).
//Trzeba przy tym bra� pod uwag� kolejno�� wykonywania operator�w:
System.out.print("Liczba " + 1); //wypisze "Liczba 1"
System.out.print("Liczba " + 1 + 2); //wypisze "Liczba 12"
System.out.print("Liczba " + (1 + 2)); //wypisze "Liczba 3"
System.out.print(1 + 2 + " Liczba"); //wypisze "3 Liczba"

//Je�eli chcemy �atwo przkonwertowa� jaki� typ podstawowy na ci�g to mo�emy po��czy� go z pustym ci�giem:
String liczbaJakoCi�g = 123 + ""; //"123"



//Przechodzenie po elementach ci�gu
//*****************************************************************************
String tekst = "Ala ma kota";

//(deklaracja) -> char charAt(int index)
tekst.charAt(1) //Zwr�ci warto�� ci�gu na pozycji o indeksie 1 ('l')

for(int i = 0; i > tekst.length(); i++) {
	System.out.print(tekst.charAt(i));
}

for(char litera : tekst) {
    System.out.print(litera);
}



//Por�wnywanie ci�g�w
//*****************************************************************************
//Ci�gi por�wnujemy przy pomocy metody equals().
String imi�1 = "Kamilka";
String imi�2 = "Kamilka";
String imi�3 = "�ukasz";
String imi�4 = new String("Kamilka");

//(deklaracja) -> boolean equals(String str)
imi�1.equals(imi�2); //zwr�ci true
imi�1.equals(imi�3); //zwr�ci false

imi�1.equals(imi�4); //zwr�ci true
imi�1 == imi�4 //zwr�ci false
imi�1 == imi�2 //zwr�ci true
//nie por�wnuje sie obiekt�w przypomocy operatora ==, poniewa� operator ten por�wnuje same obiekty (adresy pod kt�rym s� zapisane)
//a nie warto�� ci�gu w nich zawartych. Dlatego, por�wnanie przy pomocy tego operatora, zmiennych
//imie1 i imi�2 zwr�ci true (imi�1 i imi�2 wskazuje na ten sam obiekt (adres w pami�ci gdzie jest zapisany ten obiekt))
//Por�wnenie natomiast zmiennej imi�1 i imi�4 zwr�ci false powniewa� zmienne te wskazuj� na r�ne obiekty (chocia�
//warto�� przetrzymywanego w nich ci�gu jest taka sama).



//Manipulowanie ci�gami
//*****************************************************************************
String tekst = "Ala ma kota";

//Zwracanie podci�gu
//(deklaracja) -> String substring(int beginIndex)
//(deklaracja) -> String substring(int beginIndex, int endIndex)
tekst.substring(7); //Zwr�ci ci�g "kota"
tekst.substring(0, 2); //Zwr�ci "Ala"

String nrFaktury: "83929438493/10/11/2005";
//wyci�ganie ostatnich znak�w niezale�nie od d�ugo�ci ci�gu:
nrFaktury.substring(nrFaktury.length() - 4); //zwr�ci "2005"

//Dzielenie ci�gu
//(deklaracja) -> String[] split(String regex)
String tekst = "Ala ma kota";
tekst.split(" "); //zwraca tablic� ci�g�w zawieraj�ca podci�gi utworzone przez podzia�a ca�ego ci�gu
                  //na podstawie przekazanego znaku (a dok�adniej wyra�enia regularnego) podzia�u.
                  //W tym wypadku bedzie to tablica sk�adaj�ca si� z trzech element�w "Ala", "ma", "kota".

//Usuwanie bia�ych znak�w
//(deklaracja) -> String trim()
String tekst = " Ala ma kota    ";
tekst.trim(); //zwr�ci ci�g pozbiawiony bia�ych znak�w znajduj�cych sie na jego pocz�tku i ko�cu
              //W tym wypadku zw�rci "Ala ma kota"


//*****************************************************************************
//Bia�e znaki (znaki niedrukowalne, white space)
//Do bia�ych znak�w zalicza si� spacja, tabulator, znak nowej linii,
//znak powrotu kursora na pocz�tek linii i inne.
//*****************************************************************************


//Ma�e i wielkie litery
//(deklaracja) -> String toLowerCase()
//(deklaracja) -> String toUpperCase()
String tekst = "Ala ma kota";
tekst.toLowerCase() //zwr�ci "ala ma kota"
tekst.toUpperCase() //zwr�ci "ALA MA KOTA"



//Przeszukiwanie ci�g�w
//*****************************************************************************
String tekst = "Ala ma kota";

//(deklaracja) -> int indexOf(int ch)
//(deklaracja) -> int lastIndexOf(int ch)
tekst.indexOf('a'); //zwr�ci pierwszy indeks pod jakim wyst�puje przekazany znak (2)
tekst.lastIndexOf('a'); //zwr�ci ostatni indeks pod jakim wyst�puje przekazany znak (10)

//(deklaracja) -> int indexOf(String str)
//(deklaracja) -> int lastIndexOf(String str)
String tekst = "Ala ma kota a kot ma Ale";
tekst.indexOf("kot"); //zwr�ci pierwszy indeks pod jakim wyst�puje przekazany podci�g (7)
tekst.lastIndexOf("kot"); //zwr�ci ostatni indeks pod jakim wyst�puje przekazany podci�g (14)

String tekst = "Ala ma kota";
//(deklaracja) -> boolean contains(string str)
tekst.contains("Ala"); //zwraca true lub false zale�nie od tego czy przekazany podci�g znajduje si� w danym ci�gu.
					   //zwr�ci true
tekst.contains("ala"); //zwr�ci false (wielko�� liter ma znaczenie)

//Sprawdza czy ci�g posiada przekazany podci�g na jego pocz�tku lub ko�ca
String tekst = "Ala ma kota"
//(deklaracja) -> boolean endsWith(string suffix)
tekst.endsWith("kota") //zwr�ci true

//(deklaracja) -> boolean startsWith(string prefix)
tekst.startsWith("Ala") //zwr�ci true


//Podmiana ci�gu
//*****************************************************************************
String tekst = "Ala ma kota";

//(deklaracja) -> String replace(char oldChar, char newChar)
tekst.replace('a', 'o')	//Zwraca ci�g z zamienionymi znakiami 'a' na 'o' ("Alo mo koto")

//(deklaracja) -> String replace(String regex, String replacement)
tekst.replace("ma", "nie ma")	//Zwraca ci�g z podmienionymi podci�gami "ma" na "nie ma" ("Ala nie ma kota")


String tekst = "Ala ma kota a kot ma Ale";

//(deklaracja) -> String replaceAll(String regex, String replacement)
tekst.replaceAll("kot", "pies") //Podmienia wszystkie wyst�pienia podci�gu "kot" na "pies" i zwraca nowy ci�g
                                //"Ala ma piesa a pies ma Ale"

//(deklaracja) -> String replaceFirst(String regex, String replacement)
tekst.replaceFirst("kot", "ps") //Podmienia pierwsze wyst�penie podci�gu "kot" na "ps" i zwraca nowy ci�g
								  ////"Ala ma psa a kot ma Ale"




//Wsztstkie typy, kt�re mo�e przyj�� metoda print
//void print(boolean b) 
//Prints a boolean value.
// 
//void print(char c) 
//Prints a character.
// 
//void print(char[] s) 
//Prints an array of characters.
// 
//void print(double d) 
//Prints a double-precision floating-point number.
// 
//void print(float f) 
//Prints a floating-point number.
// 
//void print(int i) 
//Prints an integer.
// 
//void print(long l) 
//Prints a long integer.
// 
//void print(Object obj) 
//Prints an object.
// 
//void print(String s) 
//Prints a string.