//******************************************************************************************************
//Rzutowanie                                                                                           *
//******************************************************************************************************
//Rzutowanie to konwersja jednego typu na drugi.
//Rzutowanie jest mo�liwe w przypadku typ�w prostych.
//Rzutowanie mo�e by� jawne lub niejawne.



//Rzutowanie niejawne
//******************************************************************************************************                                                                    
//Rzutowanie niejawne odbywa si� automatycznie podczas wykonywania r�nych operacji:
//Rzutowanie niejawne odbywa si� od typu bardziej szeczeg�owego do typu mniej szczeg�owego,
//oznacza to �e je�eli przy rzutowaniu mog�aby nast�pi� utrata danych, to nie b�dzie ona mo�liwa np.:
//rzutowanie z long na int jest niemo�liwe poniewa� long mo�e przechowywa� wi�ksz� warto��
//ni� mog�by typ int
//rzutowanie z float na int jest niemo�liwe poniewa� usunieta by by�a warto�� dziesi�tna typu float,
//Kierunek rzutowania niejwanego (od mniej do bardziej szceg�owego)
//byte -> short -> char -> int -> long -> float -> double
int i = 1;              //
long l = 2L;            //
double d = 2.0;         //
float f = 3.0f;         //

//Niejawne rzutowanie nast�pi przy:
//przypisaniu                                                                                          
l = i; //nast�puje rzutowanie zmiennej 'i' typu int na typ long poniewa� typ int jest mniejszy od long
i = l; //rzutowanie nie nastapi (zostanie wy�wietlony b��d) poniewa� typ long jest wi�kszy ni� int
       //i mog�aby nast�pi� utrata danych

//przekazaniu parametru do metody
int a = 5;
obiekt.start(a); //Metoda start przyjmuje parametr typu double;

//oblicze� arytetycznych
//wszystkie zmienne b�d� zrzutowane do typu zmiennej najbardziej szczeg�owej czyli double
double s = i + l + d + f;   //


//Rzutowanie jawne
//******************************************************************************************************                                                                           
//Rzutownie jawne nast�puje przy pomocy operatora rzutowania.
//Umo�liwia ono rzutowanie typu bardziej szczeg�owego na mniej szczeg�owy np.: z long na int
i = (int)l
//    |
//    \Operator rzutowania - typ na kt�ry rzutujemy w nawiasach okr�g�ych
//Konwersja z typ�w bardziej szczeg�owych do mniej szczeg�owych wi��e si� z utrat� danych:
long l = 123456789123456789L;
int i = (int)l;
System.out.println(i); //Wypisana zostanie -1395630315
double f = 1.25;
int i = (int)f;
System.out.println(i); //Wypisane zostanie 1 (cz�� dziesi�tna jest odcinana a nie zaokr�glana)