//*****************************************************************************
//Liczby ca³kowite                                                            *
//*****************************************************************************
//Integer -> liczba ca³kowita
long val_1;   //zakres od –9 223 372 036 854 775 808 do 9 223 372 036 854 775 807 (64 bity)
int val_2;    //zakres od –2 147 483 648 do 2 147 483 647 (nieco ponad 2 miliardy)(32 bity)
short val_3;  //zakres od –32 768 do 32 767 (16 bitów)
byte val_4;   //zakres od –128 do 127 (8 bitów)

//W przypadku typu long nalezy dopisaæ 'L' lub 'l' po przypisaywanej liczbie:
long val_1 = 1000000000L;



//Dzielenie liczb ca³kowitych
//*****************************************************************************
//Wynik dzielenie liczb ca³kowitych daje zawsze wartoœæ ca³kowit¹
//(wartoœæ dziesiêtna jest odcinana)
//19 / 7 = 2 (2.7)
//19 / 8 = 2 (2.375)
//-19 / 7 = -2
//-19 / 8 = -2
//Aby wynik by³ zapisany w postaci dziesiêtnej to nalezy rzutowaæ jedn¹ z liczb na typ float
float f =  (float)19 / 8 //f==2.375

//Rzutowanie -> patrz plik wyklad_rzutowanie.java



//Kodowanie liczb ca³kowitych
//*****************************************************************************
int val_1 = 75   //liczba dziesiêtna
int val_2 = 013  //liczba ósemkowa (75)
int val_3 = 0x4B //liczba szesnastkowa (75)
int val_4 = 0b1001011 //liczba binarna (75)
//wszystkie liczby przetrzymywane s¹ jako liczby dziesiêtne.





//*****************************************************************************
//Liczby zmiennoprzeciwnkowe                                                  *
//*****************************************************************************
float val_1 = 1.0f;  //Zakres oko³o ±3,40282347E+38F (6 – 7 znacz¹cych cyfr dziesiêtnych).
                     //Przypisuj¹c do zmiennej float wartoœæ to nale¿y dopisaæ do niej literê 'f'.
double val_2 = 1.0; //Zakres oko³o ±1,79769313486231570E+308 (15 znacz¹cych cyfr dziesiêtnych).

//B³¹d precyzji
//Binarna reprezentacja liczb zmiennioprzecinkowych nie jest precyzyjna, nie ka¿d¹ liczbê dziesiêtn¹ da siê
//poprawnie zapisaæ. Typy te nie nadaj¹ siê do precyzyjnych obliczeñ ale je¿eli z nich korzystamy to zawsze
//lepiej korzystaæ z typu double (wiêksza precyzja).



//***********************************************************************************
//Podkreœlenia                                                                      *
//Miêdzy cyframi mo¿na dodaæ znak podkereœlenia '_' u³atwiajacy czytanie liczby.    *
//Podkreœlenie musi zawsze znajdowaæ sie miêdzy dwoma cyframi.                      *
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
//S³u¿y do sprawdzania warunków.
boolean isDone = true;
boolean isDone = false;





//*****************************************************************************
//Tablice                                                                     *
//*****************************************************************************
//Tablic (array) to kontener dla danych konkretnego typu. Przetrzymuje ona z góry okreœlon¹ liczbê elementów.
// / nawiasy kwadratowy [] przy typie danych mówi ¿e jest to tablica sk³adaj¹ca siê z elementów danego typu
// |
int[] myArray = new int[10];  //deklaracja i inicjalizacji tablicy liczb ca³kowitch sk³adaj¹ca siê z 10 elementów
int[] myArray = {1, 2, 3, 4}; //skrócona deklaracja i inicjalizacja tablicy
//Tablice s¹ obiektami. <-- Wa¿ne!

//Dostêp do komórek tablicy uzyskuje siê przez indeks numeryczny (indeks liczony jest od 0):
myArray[0] = 10;
myArray[1] = 11;

//Wewn¹trz komórki mo¿na wykonaæ proste wyra¿enia arytmetyczne
int a = 1
myArray[1+a] = 12;
//       |
//       \indeks == 2

//D³ugoœæ tablicy
int length = myArray.length; //atrybut 'length' przechowujê liczbê zadeklarowanych elementów w tablicy



//Tablice wielowymiarowe
//*****************************************************************************
//W jave tablice wielowymiarowe to tablica, która posiada w swych komórkach wskaŸniki do innych tablic:
int[][] myArray = new int[5][3]; //tablica typu int, sk³adaj¹ca siê z 5 komórek
                                 //w ka¿dej z tych 5 komórek jest utworzona tablica sk³adaj¹ca sie z 3 komórek
//Takie rozwi¹zanie umo¿liwia towrzenie postrzêpionych tablic, czyli tablic wielowymiarowych o ró¿nej iloœci elementów:
int[][] myArray {
	{1, 2, 3, 4, 5},
	{1, 2, 3},
	{1, 2, 3, 4},
	{1, 2, 3},
	{1, 2}
};


//Ci¹gi
//Ci¹g (string) to typ danych, który przetrzymuje ³añcuch znaków (czyli tablica typu 'char').
String text = "Gdyby nie wyj¹tkowa uroda Kamilki, która promienieje na ca³y œwiat, ¿ycie by³oby smêtne i ponure."

//Ci¹g to obiekt.
char[] letters = {'a', 'b', 'c'};
String text = new String(letters);

//Przyk³adowe metody
text.substring(0, 5);  //wycina ci¹g od pozycji 0 do pozycji 5
text.lenght(); //zwraca d³ugoœæ ci¹gu
text.split(",") //zwraca tablicê podci¹gów, które powstaj¹ po rozdzieleniu ci¹gu okreslonym ci¹giem

//Typ wyliczeniowy (enum)
enum Rozmiar { MA£Y, ŒREDNI, DU¯Y, EKSTRA_DU¯Y };

Rozmiar s = Rozmiar.ŒREDNI;