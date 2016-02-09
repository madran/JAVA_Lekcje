//*****************************************************************************
//Liczby ca�kowite                                                            *
//*****************************************************************************
//Integer -> liczba ca�kowita
long val_1;   //zakres od �9 223 372 036 854 775 808 do 9 223 372 036 854 775 807 (64 bity)
int val_2;    //zakres od �2 147 483 648 do 2 147 483 647 (nieco ponad 2 miliardy)(32 bity)
short val_3;  //zakres od �32 768 do 32 767 (16 bit�w)
byte val_4;   //zakres od �128 do 127 (8 bit�w)

//W przypadku typu long nalezy dopisa� 'L' lub 'l' po przypisaywanej liczbie:
long val_1 = 1000000000L;



//Dzielenie liczb ca�kowitych
//*****************************************************************************
//Wynik dzielenie liczb ca�kowitych daje zawsze warto�� ca�kowit�
//(warto�� dziesi�tna jest odcinana)
//19 / 7 = 2 (2.7)
//19 / 8 = 2 (2.375)
//-19 / 7 = -2
//-19 / 8 = -2
//Aby wynik by� zapisany w postaci dziesi�tnej to nalezy rzutowa� jedn� z liczb na typ float
float f =  (float)19 / 8 //f==2.375

//Rzutowanie -> patrz plik wyklad_rzutowanie.java



//Kodowanie liczb ca�kowitych
//*****************************************************************************
int val_1 = 75   //liczba dziesi�tna
int val_2 = 013  //liczba �semkowa (75)
int val_3 = 0x4B //liczba szesnastkowa (75)
int val_4 = 0b1001011 //liczba binarna (75)
//wszystkie liczby przetrzymywane s� jako liczby dziesi�tne.





//*****************************************************************************
//Liczby zmiennoprzeciwnkowe                                                  *
//*****************************************************************************
float val_1 = 1.0f;  //Zakres oko�o �3,40282347E+38F (6 � 7 znacz�cych cyfr dziesi�tnych).
                     //Przypisuj�c do zmiennej float warto�� to nale�y dopisa� do niej liter� 'f'.
double val_2 = 1.0; //Zakres oko�o �1,79769313486231570E+308 (15 znacz�cych cyfr dziesi�tnych).

//B��d precyzji
//Binarna reprezentacja liczb zmiennioprzecinkowych nie jest precyzyjna, nie ka�d� liczb� dziesi�tn� da si�
//poprawnie zapisa�. Typy te nie nadaj� si� do precyzyjnych oblicze� ale je�eli z nich korzystamy to zawsze
//lepiej korzysta� z typu double (wi�ksza precyzja).



//***********************************************************************************
//Podkre�lenia                                                                      *
//Mi�dzy cyframi mo�na doda� znak podkere�lenia '_' u�atwiajacy czytanie liczby.    *
//Podkre�lenie musi zawsze znajdowa� sie mi�dzy dwoma cyframi.                      *
int val_1 = 801_802_803;  //                                                        *
//***********************************************************************************





//*****************************************************************************
//Typ znakowy                                                                 *
//*****************************************************************************
char a = 'a';
char b = 'b';
char uniChar = '\u039A';





//*****************************************************************************
//Typ logiczny                                                                *
//*****************************************************************************
//S�u�y do sprawdzania warunk�w.
boolean isDone = true;
boolean isDone = false;





//*****************************************************************************
//Tablice                                                                     *
//*****************************************************************************
//Tablic (array) to kontener dla danych konkretnego typu. Przetrzymuje ona z g�ry okre�lon� liczb� element�w.
// / nawiasy kwadratowy [] przy typie danych m�wi �e jest to tablica sk�adaj�ca si� z element�w danego typu
// |
int[] myArray = new int[10];  //deklaracja i inicjalizacji tablicy liczb ca�kowitch sk�adaj�ca si� z 10 element�w
int[] myArray = {1, 2, 3, 4}; //skr�cona deklaracja i inicjalizacja tablicy
//Tablice s� obiektami. <-- Wa�ne!

//Dost�p do kom�rek tablicy uzyskuje si� przez indeks numeryczny (indeks liczony jest od 0):
myArray[0] = 10;
myArray[1] = 11;

//Wewn�trz kom�rki mo�na wykona� proste wyra�enia arytmetyczne
int a = 1
myArray[1+a] = 12;
//       |
//       \indeks == 2

//D�ugo�� tablicy
int length = myArray.length; //atrybut 'length' przechowuj� liczb� zadeklarowanych element�w w tablicy



//Tablice wielowymiarowe
//*****************************************************************************
//W jave tablice wielowymiarowe to tablica, kt�ra posiada w swych kom�rkach wska�niki do innych tablic:
int[][] myArray = new int[5][3]; //tablica typu int, sk�adaj�ca si� z 5 kom�rek
                                 //w ka�dej z tych 5 kom�rek jest utworzona tablica sk�adaj�ca sie z 3 kom�rek
//Takie rozwi�zanie umo�liwia towrzenie postrz�pionych tablic, czyli tablic wielowymiarowych o r�nej ilo�ci element�w:
int[][] myArray {
	{1, 2, 3, 4, 5},
	{1, 2, 3},
	{1, 2, 3, 4},
	{1, 2, 3},
	{1, 2}
};


//Ci�gi
//Ci�g (string) to typ danych, kt�ry przetrzymuje �a�cuch znak�w (czyli tablica typu 'char').
String text = "Gdyby nie wyj�tkowa uroda Kamilki, kt�ra promienieje na ca�y �wiat, �ycie by�oby sm�tne i ponure."

//Ci�g to obiekt.
char[] letters = {'a', 'b', 'c'};
String text = new String(letters);

//Przyk�adowe metody
text.substring(0, 5);  //wycina ci�g od pozycji 0 do pozycji 5
text.lenght(); //zwraca d�ugo�� ci�gu
text.split(",") //zwraca tablic� podci�g�w, kt�re powstaj� po rozdzieleniu ci�gu okreslonym ci�giem

//Typ wyliczeniowy (enum)
enum Rozmiar { MA�Y, �REDNI, DU�Y, EKSTRA_DU�Y };

Rozmiar s = Rozmiar.�REDNI;