//*****************************************************************************
//Typ ³añcuchowy                                                              *
//*****************************************************************************
//Ci¹g lub ³añcych znaków to specjalny typ danych, który s³u¿y do przechowywania tekstów.
//W przypadku jêzyka Java s³uzy do tego klasa String. Klasa ta obudowuje (inaczej przes³ania)
//tablicê znaków (typ char) i dostarcza szereg metod umo¿liwiaj¹cych manipulowania ni¹.

//Ci¹gi w jave s¹ niezmienne. Oznacza to ¿e nie mo¿na zmieniæ wartoœci tekstu przechowywanego w obiekcie.
//Wszystkie metody, które modyfikuj¹ teskt tak naprawdê zwracaj¹ nowy obiekt z nowym ci¹giem.



//Metody deklaracji zmiennej typu String
//*****************************************************************************
//Deklaracja przy pomocy litera³u
//W przypadku ci¹g³ow litera³em jest dowolny tekst zapisany w cudzys³owiu podówjnym.
String imiê = "Kamilka";

//Je¿eli chcemy aby w tekœcie znajdowa³ siê podwójny cudzys³ów to nalezy poprzedziæ go ukoœnikiem '\',
//cudzys³ów pojedynczy mo¿na u¿ywaæ bez ograniczeñ
String cudzys³owy = "Cudzys³ów podwójny \" i cudzys³ów pojedyñczy '.";

//Taka metoda tworzenia obiektów typu String charakteryzuje siê tym, ¿e je¿eli przypiszemy do dwóch ró¿nych zmiennych
//ten sam ci¹g to obie zmienne bêd¹ wskazywaæ na ten sam obiekt:
String imiê1 = "Kamilka";
String imiê2 = "Kamilka";
//Obie zmienne wskazuj¹ na ten sam obiekt string (przetrzymuj¹ adres do tego samego obiektu)
//przetrzymuj¹cy tekst "Kamilka" (kwestia optymalizacji, aby nie mno¿yæ obiekty).
//Je¿eli chcemy utworzyæ dwa ró¿ne obiekty z t¹ sam¹ wartoœci¹ ci¹gu to nale¿y uzyæ operatora new
String imiê3 = new String("Kamilka"); //zmienna imiê3 wskazuje na inny obiekt ni¿ imiê1 i imiê2

//Deklaracja przy pomocy operatora new
String imiê1 = new String("Kamilka");

char[] imiêTablica = {'K', 'a', 'm', 'i', 'l', 'k', 'a'};
String imiê = new String(imiê);



//*****************************************************************************
//Najwa¿niejsze metody klasy String                                           *
//*****************************************************************************

//D³ugoœæ ci¹gu
//*****************************************************************************
//(deklaracja) -> int length()
String tekst = "Ala ma kota";
tekst.length(); //Zwraca 11



//£¹czenie ci¹gów
//*****************************************************************************
String tekst = "Ala ma kota";

//(deklaracja) -> String concat(String str)
tekst.concat(", a kot ma Alê"); //³¹czy ci¹g zapisany w zmiennej tekst z przekazanym do metody concat()
                               //zwróci "Ala ma kota, a kot ma Alê"

//Czêœciej do ³¹czenia ci¹gów wykorzystuje siê operator +
String nowyTekst = tekst + ", a kot ma Alê";
//Je¿eli u¿yjemy operatora + z ci¹giem oraz typami podstawowymi to ca³oœæ zostanie zapisana jako ci¹g (rzutowanie niejawne).
//Trzeba przy tym braæ pod uwagê kolejnoœæ wykonywania operatorów:
System.out.print("Liczba " + 1); //wypisze "Liczba 1"
System.out.print("Liczba " + 1 + 2); //wypisze "Liczba 12"
System.out.print("Liczba " + (1 + 2)); //wypisze "Liczba 3"
System.out.print(1 + 2 + " Liczba"); //wypisze "3 Liczba"

//Je¿eli chcemy ³atwo przkonwertowaæ jakiœ typ podstawowy na ci¹g to mo¿emy po³¹czyæ go z pustym ci¹giem:
String liczbaJakoCi¹g = 123 + ""; //"123"



//Przechodzenie po elementach ci¹gu
//*****************************************************************************
String tekst = "Ala ma kota";

//(deklaracja) -> char charAt(int index)
tekst.charAt(1) //Zwróci wartoœæ ci¹gu na pozycji o indeksie 1 ('l')

for(int i = 0; i > tekst.length(); i++) {
	System.out.print(tekst.charAt(i));
}

for(char litera : tekst) {
    System.out.print(litera);
}



//Porównywanie ci¹gów
//*****************************************************************************
//Ci¹gi porównujemy przy pomocy metody equals().
String imiê1 = "Kamilka";
String imiê2 = "Kamilka";
String imiê3 = "£ukasz";
String imiê4 = new String("Kamilka");

//(deklaracja) -> boolean equals(String str)
imiê1.equals(imiê2); //zwróci true
imiê1.equals(imiê3); //zwróci false

imiê1.equals(imiê4); //zwróci true
imiê1 == imiê4 //zwróci false
imiê1 == imiê2 //zwróci true
//nie porównuje sie obiektów przypomocy operatora ==, poniewa¿ operator ten porównuje same obiekty (adresy pod którym s¹ zapisane)
//a nie wartoœæ ci¹gu w nich zawartych. Dlatego, porównanie przy pomocy tego operatora, zmiennych
//imie1 i imiê2 zwróci true (imiê1 i imiê2 wskazuje na ten sam obiekt (adres w pamiêci gdzie jest zapisany ten obiekt))
//Porównenie natomiast zmiennej imiê1 i imiê4 zwróci false powniewa¿ zmienne te wskazuj¹ na ró¿ne obiekty (chocia¿
//wartoœæ przetrzymywanego w nich ci¹gu jest taka sama).



//Manipulowanie ci¹gami
//*****************************************************************************
String tekst = "Ala ma kota";

//Zwracanie podci¹gu
//(deklaracja) -> String substring(int beginIndex)
//(deklaracja) -> String substring(int beginIndex, int endIndex)
tekst.substring(7); //Zwróci ci¹g "kota"
tekst.substring(0, 2); //Zwróci "Ala"

String nrFaktury: "83929438493/10/11/2005";
//wyci¹ganie ostatnich znaków niezale¿nie od d³ugoœci ci¹gu:
nrFaktury.substring(nrFaktury.length() - 4); //zwróci "2005"

//Dzielenie ci¹gu
//(deklaracja) -> String[] split(String regex)
String tekst = "Ala ma kota";
tekst.split(" "); //zwraca tablicê ci¹gów zawieraj¹ca podci¹gi utworzone przez podzia³a ca³ego ci¹gu
                  //na podstawie przekazanego znaku (a dok³adniej wyra¿enia regularnego) podzia³u.
                  //W tym wypadku bedzie to tablica sk³adaj¹ca siê z trzech elementów "Ala", "ma", "kota".

//Usuwanie bia³ych znaków
//(deklaracja) -> String trim()
String tekst = " Ala ma kota    ";
tekst.trim(); //zwróci ci¹g pozbiawiony bia³ych znaków znajduj¹cych sie na jego pocz¹tku i koñcu
              //W tym wypadku zwórci "Ala ma kota"


//*****************************************************************************
//Bia³e znaki (znaki niedrukowalne, white space)
//Do bia³ych znaków zalicza siê spacja, tabulator, znak nowej linii,
//znak powrotu kursora na pocz¹tek linii i inne.
//*****************************************************************************


//Ma³e i wielkie litery
//(deklaracja) -> String toLowerCase()
//(deklaracja) -> String toUpperCase()
String tekst = "Ala ma kota";
tekst.toLowerCase() //zwróci "ala ma kota"
tekst.toUpperCase() //zwróci "ALA MA KOTA"



//Przeszukiwanie ci¹gów
//*****************************************************************************
String tekst = "Ala ma kota";

//(deklaracja) -> int indexOf(int ch)
//(deklaracja) -> int lastIndexOf(int ch)
tekst.indexOf('a'); //zwróci pierwszy indeks pod jakim wystêpuje przekazany znak (2)
tekst.lastIndexOf('a'); //zwróci ostatni indeks pod jakim wystêpuje przekazany znak (10)

//(deklaracja) -> int indexOf(String str)
//(deklaracja) -> int lastIndexOf(String str)
String tekst = "Ala ma kota a kot ma Ale";
tekst.indexOf("kot"); //zwróci pierwszy indeks pod jakim wystêpuje przekazany podci¹g (7)
tekst.lastIndexOf("kot"); //zwróci ostatni indeks pod jakim wystêpuje przekazany podci¹g (14)

String tekst = "Ala ma kota";
//(deklaracja) -> boolean contains(string str)
tekst.contains("Ala"); //zwraca true lub false zale¿nie od tego czy przekazany podci¹g znajduje siê w danym ci¹gu.
					   //zwróci true
tekst.contains("ala"); //zwróci false (wielkoœæ liter ma znaczenie)

//Sprawdza czy ci¹g posiada przekazany podci¹g na jego pocz¹tku lub koñca
String tekst = "Ala ma kota"
//(deklaracja) -> boolean endsWith(string suffix)
tekst.endsWith("kota") //zwróci true

//(deklaracja) -> boolean startsWith(string prefix)
tekst.startsWith("Ala") //zwróci true


//Podmiana ci¹gu
//*****************************************************************************
String tekst = "Ala ma kota";

//(deklaracja) -> String replace(char oldChar, char newChar)
tekst.replace('a', 'o')	//Zwraca ci¹g z zamienionymi znakiami 'a' na 'o' ("Alo mo koto")

//(deklaracja) -> String replace(String regex, String replacement)
tekst.replace("ma", "nie ma")	//Zwraca ci¹g z podmienionymi podci¹gami "ma" na "nie ma" ("Ala nie ma kota")


String tekst = "Ala ma kota a kot ma Ale";

//(deklaracja) -> String replaceAll(String regex, String replacement)
tekst.replaceAll("kot", "pies") //Podmienia wszystkie wyst¹pienia podci¹gu "kot" na "pies" i zwraca nowy ci¹g
                                //"Ala ma piesa a pies ma Ale"

//(deklaracja) -> String replaceFirst(String regex, String replacement)
tekst.replaceFirst("kot", "ps") //Podmienia pierwsze wyst¹penie podci¹gu "kot" na "ps" i zwraca nowy ci¹g
								  ////"Ala ma psa a kot ma Ale"




//Wsztstkie typy, które mo¿e przyj¹æ metoda print
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