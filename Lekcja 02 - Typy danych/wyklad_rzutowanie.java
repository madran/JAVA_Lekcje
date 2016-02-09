//******************************************************************************************************
//Rzutowanie                                                                                           *
//******************************************************************************************************
//Rzutowanie to konwersja jednego typu na drugi.
//Rzutowanie jest mo¿liwe w przypadku typów prostych.
//Rzutowanie mo¿e byæ jawne lub niejawne.



//Rzutowanie niejawne
//******************************************************************************************************                                                                    
//Rzutowanie niejawne odbywa siê automatycznie podczas wykonywania ró¿nych operacji:
//Rzutowanie niejawne odbywa siê od typu bardziej szeczegó³owego do typu mniej szczegó³owego,
//oznacza to ¿e je¿eli przy rzutowaniu mog³aby nast¹piæ utrata danych, to nie bêdzie ona mo¿liwa np.:
//rzutowanie z long na int jest niemo¿liwe poniewa¿ long mo¿e przechowywaæ wiêksz¹ wartoœæ
//ni¿ mog³by typ int
//rzutowanie z float na int jest niemo¿liwe poniewa¿ usunieta by by³a wartoœæ dziesiêtna typu float,
//Kierunek rzutowania niejwanego (od mniej do bardziej szcegó³owego)
//byte -> short -> char -> int -> long -> float -> double
int i = 1;              //
long l = 2L;            //
double d = 2.0;         //
float f = 3.0f;         //

//Niejawne rzutowanie nast¹pi przy:
//przypisaniu                                                                                          
l = i; //nastêpuje rzutowanie zmiennej 'i' typu int na typ long poniewa¿ typ int jest mniejszy od long
i = l; //rzutowanie nie nastapi (zostanie wyœwietlony b³¹d) poniewa¿ typ long jest wiêkszy ni¿ int
       //i mog³aby nast¹piæ utrata danych

//przekazaniu parametru do metody
int a = 5;
obiekt.start(a); //Metoda start przyjmuje parametr typu double;

//obliczeñ arytetycznych
//wszystkie zmienne bêd¹ zrzutowane do typu zmiennej najbardziej szczegó³owej czyli double
double s = i + l + d + f;   //


//Rzutowanie jawne
//******************************************************************************************************                                                                           
//Rzutownie jawne nastêpuje przy pomocy operatora rzutowania.
//Umo¿liwia ono rzutowanie typu bardziej szczegó³owego na mniej szczegó³owy np.: z long na int
i = (int)l
//    |
//    \Operator rzutowania - typ na który rzutujemy w nawiasach okr¹g³ych
//Konwersja z typów bardziej szczegó³owych do mniej szczegó³owych wi¹¿e siê z utrat¹ danych:
long l = 123456789123456789L;
int i = (int)l;
System.out.println(i); //Wypisana zostanie -1395630315
double f = 1.25;
int i = (int)f;
System.out.println(i); //Wypisane zostanie 1 (czêœæ dziesiêtna jest odcinana a nie zaokr¹glana)