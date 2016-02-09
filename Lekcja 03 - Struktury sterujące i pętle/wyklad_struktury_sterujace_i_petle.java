//***********************************************************************
//Zasiêg zmiennych                                                      *
//***********************************************************************
int a = 10; //                                                          *
if(a > b) { //                                                          *
    System.out.println(a); //Wypisze 10                                 *
//                                                                      *
    int a = 15; //B³¹d, nie mo¿na przes³aniaæ zmiennych wewn¹trz bloku  *
//                                                                      *
//                                                                      *
    int c = 25; //Zmienna loklna bloku                                  *
} //                                                                    *
//                                                                      *
System.out.println(c); //B³¹d, zmienna c nie jest widoczna poza blokiem.*
//***********************************************************************



//***********************************************************************
//Struktury steruj¹ce                                                   *
//***********************************************************************



//if
//***********************************************************************
//Przy pomocy tej struktury mo¿emy wykonaæ wybrany blok kodu
//zale¿nie od tego czy warunek zosta³ spe³niony czy te¿ nie.
int a = 10;
int b = 20;

//   /Warunek. Wa¿ne! -> warunek musi zwracaæ typ logiczny (boolean (true albo false))
//   |
if(a > b) { //Bolok kodu który podlaga warunkowi musi byæ oczywiœcie otoczony nawiasami klamrowymi
	
    System.out.println(a); //ten blok zostanie wykonany je¿eli warunek bêdzie spe³niony
    
} else { //je¿eli warunek nie zostanie spe³niony wykonany zostanie ten blok (blok 'else' nie jest on obowi¹zkowy)
	
    System.out.println(b);
    
}

//Mo¿liwe jest sk³adanie wielu warunków nastêpuj¹cych po sobie:
if(a > b) { //je¿eli a jest wiêksze od b to
	//wykonaj ten blok
} else if(a < b) { //w przeciwnym wypadku je¿eli a jest mniejsze od b to
	//wykonaj ten blok
} else if(a == b) { //...
	
} else {
	
}

//Je¿eli nie podamy nawiasów klamorowych to warunkowi bedzie podlegaæ jedna linia (do œrednika)
if(a > b) System.out.println(a); //Wypisze siê wartoœæ zmiennej 'a' lub nie

if(a > b)
System.out.println(a); //to jest ca³y czas jedna linia (linia koñczy siê œrednikiem)
System.out.println(b); //to ju¿ nie podlego warunkowi bo to kolejna linia


//operatory zwracaj¹ce wartoœæ logiczn¹:
>, <, ==, <=, >=, != // != ró¿ne


//Operatory logiczne
//Suma logiczna
|| //lub
//1 || 0 -> 1
//1 || 1 -> 1               1 to prawda, 0 to fa³sz w £ukaszowym programistycznym jezyku
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

//Przyk³ady
if(a < b) //je¿eli a jest mniejsze od b to ...
if(a < b && a < c) //je¿eli a jest mniejsze od b i a jest mniejsze od c to ...
if(a != b) //je¿eli a jest ró¿ne od b to ...
if(!(a < b)) //je¿eli a nie jest mniejsze od b (inaczej jest a >= b)
if(a < c || a < b || (a < c && a < b)) //je¿eli a jest mniejsze od c lub a jest mniejsze od b lub a jest mniejsze od b i c

//Metody tez mo¿na wykorzystaæ w warunkach je¿eli zwracaj¹ typ logiczny
if(isNumber(1)) //Metoda 'isNumber' sprawdza czy przekazana wartoœæ jest liczb¹ czy nie (zwraca true lub false)



//switch
//***********************************************************************
//Struktura która umo¿liwia wybór jednej z wielu opcji na podstawie przekazanej wartoœci.

int a = 3;

//     /przekazana wartoœæ na podstawie której bêdziemy wybieraæ kod do wykonania
//     |
switch(a) {

//       /wartoœæ do jakiej bêdziemy porównywaæ prekazan¹ zmienn¹ 'a'
//       |
    case 1:
        //instrukcje
        break; //'break' koñczy wykonywanie instrukcji i wyjœcie z bloku
    case 2:
        //instrukcje
        break;
    case 3:
        //instrukcje (a == 3 wiêc wykonak¹ siê instrukcje pomiêdzy 'case 3:' a 'break'
        break;
    default:
        //te instrukcje zostan¹ wykonane gdy ¿adna opcja nie pêdzie pasowaæ
        //do przekazanej wartoœci

}

//Struktura switch mo¿e przyjmowaæ liczby ca³kowite (int) oraz ci¹gi (String).
//U¿ywanie tej struktory to z³a praktyka w programowaniu obiektowym.




//***********************************************************************
//Petle                                                                 *
//***********************************************************************
//Petle s³u¿¹ do iteracyjnego wykonywania bloku kodu (powtarzania bloku)
//je¿eli spe³niony jest podany warunek.



//while
//***********************************************************************
//W pêtli 'while' warunek sprawdzany jest przed wykonaniem kodu w bloku pêtli.
int a = 0;

while(a < 10) {
    a = a + 1; //ten blok bêdzie wykonywany dopóki wartoœæ zmiennej 'a' bêdzie mniejszy od 10
}

//W przypadku tej pêtli blok mo¿e siê ani raz nie wykonaæ je¿eli warunek nie zostanie spe³niony



//do
//***********************************************************************
//Pêtla 'do' jest podobna do pêtli 'while' z t¹ ró¿nic¹, ¿e warunek jest sprawdzany po wykonaniu bloku

int a = 0;

do {
    a = a + 1;
} while(a < 10);

//Sprawdzanie warunku po wykonaniu bloku powoduje, ¿e blok ten zostanie wykonany conajmniej raz



//for
//***********************************************************************
//Pêtla 'for' dzia³a podobnie do pêtli 'while' ale posiada dodatkowe opcje. Sprawiaj¹ one, ¿e jest wygodna do
//przechodzenia po kolejnych elementach tablicy (kolekcji).

char[] letters = {'a', 'b', 'c', 'd', 'e'};

//    /czêœæ inicjalizuj¹ca, wykonywana jest tylko raz przed wszystkimi iteracjami,
//    |najczêœciej wykorzystywana jest do inicjalizacji zmiennej bêd¹cej licznikiem.
//    |Wed³ug przyjêtej konwencji nazw¹ dla licznika jest litera 'i' (skrót od 'index'),
//    |je¿eli w pêtli jest zagnie¿d¿ona pêtla to dla niej licznikiem bêdzie 'j' (itd.)
//    |
//    |          /warunek sprawdzany przed wykonaniem bloku
//    |          |
//    |          |                  /czêœæ wykonywana za ka¿dym razem po wykonaniu bloku
//    |          |                  |najczêœciej inkrementuje siê w tym miejscu licznik
for(int i = 0; i < letters.lenght; i++) {
    System.out.println(letters[i])
}



//Inkrementacja zmiennych (operatory ++, --)
//***********************************************************************
//Operator inkretmentacji albo dekrementacji zwiêksza lub zmniejsza wartoœæ zmiennej o 1.
//Oznacza to ¿e zmienna bedzie mia³a przypisan¹ now¹ wartoœæ o 1 wiêksza lub mniejsz¹.
//i++ jest tym samym co i = i + 1;

//Dzia³a dla typów int (i inne ca³kowitoliczbowe), float, dobule oraz char
//(dla char zmienia znak wed³ug pozycji w tablicy standardu kodowania znaków unicode)

//Operatory inkrementacji moga byæ zapisane przd lub za zmienn¹.
//Je¿eli operator zosta³ zapisany za zmienn¹ (i++) oznacza to ¿e zmienna ta najpier zostanie wykorzystana
//w obliczeniach/przekazana do metody/u¿yta jako indeks tablicy a potem zostanie zwiêkszona o 1
//(wykorzystana zostanie jej wartoœæ przed inkremantcj¹).
//Je¿eli operator zosta³ zapisany przed zmienn¹ (++i) oznacza to ¿e zmienna ta zostanie powiêkszona o 1
//przed wykorzystaniem jej w obliczeniach/przekazaniu do metody/u¿yciu jako indeks tablicy
//(wykorzystana zostanie jej wartoœæ po inkremantcji).

int a = 0;
System.out.print(a++); //przeka¿ zmienn¹ 'a' do metody a nastêpnie zwiêksz jej wartoœæ o 1 (wypisze 0)
System.out.print(a); //wypisze 1 (bo 'a' zosta³o zwiêkszone liniê wy¿ej
System.out.print(++a); //zwiêksz wartoœæ zmiennej 'a' o 1 a nastêpnie przeka¿ j¹ do metody (wypisze 2)


//Operatory inkrementacji dzia³aj¹ tylko przy zmienneych co powinno siê wydawaæ logiczne poniewa¿ zapis
//i++ jest rozwijany w i = i + 1, czyli zapis 1++ jest b³êdny.



//foreach
//***********************************************************************
//Pêtle foreach mo¿na wykorzystaæ jedynie do przechodzenia po tablicach (kolekcjach).

char[] letters = {'a', 'b', 'c', 'd', 'e'};

//    /Deklaracja zmiennej jaka bêdzie przechowywaæ kolejne elementy tablicy
//    |(do zmiennej 'c' bêd¹ niejawnie przypisywane kolejne elementy tablicy 'letters'
//    |w kolejnych iterach).
//    |
//    |       /tablica z której bêd¹ pobierane kolejne elementy
for(char c : letters) {
    System.out.print(c);
}