//***********************************************************************
//Zasi�g zmiennych                                                      *
//***********************************************************************
int a = 10; //                                                          *
if(a > b) { //                                                          *
    System.out.println(a); //Wypisze 10                                 *
//                                                                      *
    int a = 15; //B��d, nie mo�na przes�ania� zmiennych wewn�trz bloku  *
//                                                                      *
//                                                                      *
    int c = 25; //Zmienna loklna bloku                                  *
} //                                                                    *
//                                                                      *
System.out.println(c); //B��d, zmienna c nie jest widoczna poza blokiem.*
//***********************************************************************



//***********************************************************************
//Struktury steruj�ce                                                   *
//***********************************************************************



//if
//***********************************************************************
//Przy pomocy tej struktury mo�emy wykona� wybrany blok kodu
//zale�nie od tego czy warunek zosta� spe�niony czy te� nie.
int a = 10;
int b = 20;

//   /Warunek. Wa�ne! -> warunek musi zwraca� typ logiczny (boolean (true albo false))
//   |
if(a > b) { //Bolok kodu kt�ry podlaga warunkowi musi by� oczywi�cie otoczony nawiasami klamrowymi
	
    System.out.println(a); //ten blok zostanie wykonany je�eli warunek b�dzie spe�niony
    
} else { //je�eli warunek nie zostanie spe�niony wykonany zostanie ten blok (blok 'else' nie jest on obowi�zkowy)
	
    System.out.println(b);
    
}

//Mo�liwe jest sk�adanie wielu warunk�w nast�puj�cych po sobie:
if(a > b) { //je�eli a jest wi�ksze od b to
	//wykonaj ten blok
} else if(a < b) { //w przeciwnym wypadku je�eli a jest mniejsze od b to
	//wykonaj ten blok
} else if(a == b) { //...
	
} else {
	
}

//Je�eli nie podamy nawias�w klamorowych to warunkowi bedzie podlega� jedna linia (do �rednika)
if(a > b) System.out.println(a); //Wypisze si� warto�� zmiennej 'a' lub nie

if(a > b)
System.out.println(a); //to jest ca�y czas jedna linia (linia ko�czy si� �rednikiem)
System.out.println(b); //to ju� nie podlego warunkowi bo to kolejna linia


//operatory zwracaj�ce warto�� logiczn�:
>, <, ==, <=, >=, != // != r�ne


//Operatory logiczne
//Suma logiczna
|| //lub
//1 || 0 -> 1
//1 || 1 -> 1               1 to prawda, 0 to fa�sz w �ukaszowym programistycznym jezyku
//0 || 1 -> 1
//0 || 0 -> 0

//Iloczyn logiczny
&& //i
//1 && 0 -> 0
//1 && 1 -> 1
//0 && 1 -> 0
//0 && 0 -> 0

//Negacja
!
//!0 -> 1
//!1 -> 0

//Przyk�ady
if(a < b) //je�eli a jest mniejsze od b to ...
if(a < b && a < c) //je�eli a jest mniejsze od b i a jest mniejsze od c to ...
if(a != b) //je�eli a jest r�ne od b to ...
if(!(a < b)) //je�eli a nie jest mniejsze od b (inaczej jest a >= b)
if(a < c || a < b || (a < c && a < b)) //je�eli a jest mniejsze od c lub a jest mniejsze od b lub a jest mniejsze od b i c

//Metody tez mo�na wykorzysta� w warunkach je�eli zwracaj� typ logiczny
if(isNumber(1)) //Metoda 'isNumber' sprawdza czy przekazana warto�� jest liczb� czy nie (zwraca true lub false)



//switch
//***********************************************************************
//Struktura kt�ra umo�liwia wyb�r jednej z wielu opcji na podstawie przekazanej warto�ci.

int a = 3;

//     /przekazana warto�� na podstawie kt�rej b�dziemy wybiera� kod do wykonania
//     |
switch(a) {

//       /warto�� do jakiej b�dziemy por�wnywa� prekazan� zmienn� 'a'
//       |
    case 1:
        //instrukcje
        break; //'break' ko�czy wykonywanie instrukcji i wyj�cie z bloku
    case 2:
        //instrukcje
        break;
    case 3:
        //instrukcje (a == 3 wi�c wykonak� si� instrukcje pomi�dzy 'case 3:' a 'break'
        break;
    default:
        //te instrukcje zostan� wykonane gdy �adna opcja nie p�dzie pasowa�
        //do przekazanej warto�ci

}

//Struktura switch mo�e przyjmowa� liczby ca�kowite (int) oraz ci�gi (String).
//U�ywanie tej struktory to z�a praktyka w programowaniu obiektowym.




//***********************************************************************
//Petle                                                                 *
//***********************************************************************
//Petle s�u�� do iteracyjnego wykonywania bloku kodu (powtarzania bloku)
//je�eli spe�niony jest podany warunek.



//while
//***********************************************************************
//W p�tli 'while' warunek sprawdzany jest przed wykonaniem kodu w bloku p�tli.
int a = 0;

while(a < 10) {
    a = a + 1; //ten blok b�dzie wykonywany dop�ki warto�� zmiennej 'a' b�dzie mniejszy od 10
}

//W przypadku tej p�tli blok mo�e si� ani raz nie wykona� je�eli warunek nie zostanie spe�niony



//do
//***********************************************************************
//P�tla 'do' jest podobna do p�tli 'while' z t� r�nic�, �e warunek jest sprawdzany po wykonaniu bloku

int a = 0;

do {
    a = a + 1;
} while(a < 10);

//Sprawdzanie warunku po wykonaniu bloku powoduje, �e blok ten zostanie wykonany conajmniej raz



//for
//***********************************************************************
//P�tla 'for' dzia�a podobnie do p�tli 'while' ale posiada dodatkowe opcje. Sprawiaj� one, �e jest wygodna do
//przechodzenia po kolejnych elementach tablicy (kolekcji).

char[] letters = {'a', 'b', 'c', 'd', 'e'};

//    /cz�� inicjalizuj�ca, wykonywana jest tylko raz przed wszystkimi iteracjami,
//    |najcz�ciej wykorzystywana jest do inicjalizacji zmiennej b�d�cej licznikiem.
//    |Wed�ug przyj�tej konwencji nazw� dla licznika jest litera 'i' (skr�t od 'index'),
//    |je�eli w p�tli jest zagnie�d�ona p�tla to dla niej licznikiem b�dzie 'j' (itd.)
//    |
//    |          /warunek sprawdzany przed wykonaniem bloku
//    |          |
//    |          |                  /cz�� wykonywana za ka�dym razem po wykonaniu bloku
//    |          |                  |najcz�ciej inkrementuje si� w tym miejscu licznik
for(int i = 0; i < letters.lenght; i++) {
    System.out.println(letters[i])
}



//Inkrementacja zmiennych (operatory ++, --)
//***********************************************************************
//Operator inkretmentacji albo dekrementacji zwi�ksza lub zmniejsza warto�� zmiennej o 1.
//Oznacza to �e zmienna bedzie mia�a przypisan� now� warto�� o 1 wi�ksza lub mniejsz�.
//i++ jest tym samym co i = i + 1;

//Dzia�a dla typ�w int (i inne ca�kowitoliczbowe), float, dobule oraz char
//(dla char zmienia znak wed�ug pozycji w tablicy standardu kodowania znak�w unicode)

//Operatory inkrementacji moga by� zapisane przd lub za zmienn�.
//Je�eli operator zosta� zapisany za zmienn� (i++) oznacza to �e zmienna ta najpier zostanie wykorzystana
//w obliczeniach/przekazana do metody/u�yta jako indeks tablicy a potem zostanie zwi�kszona o 1
//(wykorzystana zostanie jej warto�� przed inkremantcj�).
//Je�eli operator zosta� zapisany przed zmienn� (++i) oznacza to �e zmienna ta zostanie powi�kszona o 1
//przed wykorzystaniem jej w obliczeniach/przekazaniu do metody/u�yciu jako indeks tablicy
//(wykorzystana zostanie jej warto�� po inkremantcji).

int a = 0;
System.out.print(a++); //przeka� zmienn� 'a' do metody a nast�pnie zwi�ksz jej warto�� o 1 (wypisze 0)
System.out.print(a); //wypisze 1 (bo 'a' zosta�o zwi�kszone lini� wy�ej
System.out.print(++a); //zwi�ksz warto�� zmiennej 'a' o 1 a nast�pnie przeka� j� do metody (wypisze 2)


//Operatory inkrementacji dzia�aj� tylko przy zmienneych co powinno si� wydawa� logiczne poniewa� zapis
//i++ jest rozwijany w i = i + 1, czyli zapis 1++ jest b��dny.



//foreach
//***********************************************************************
//P�tle foreach mo�na wykorzysta� jedynie do przechodzenia po tablicach (kolekcjach).

char[] letters = {'a', 'b', 'c', 'd', 'e'};

//    /Deklaracja zmiennej jaka b�dzie przechowywa� kolejne elementy tablicy
//    |(do zmiennej 'c' b�d� niejawnie przypisywane kolejne elementy tablicy 'letters'
//    |w kolejnych iterach).
//    |
//    |       /tablica z kt�rej b�d� pobierane kolejne elementy
for(char c : letters) {
    System.out.print(c);
}