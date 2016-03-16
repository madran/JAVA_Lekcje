//*****************************************************************************
//Programowanie zorientowane obiektowo                                        *
//*****************************************************************************
//Programowanie zorientowane obiektowo to paradygmat programistyczny, w którym g³ównymi elementami programu s¹ obiekty.
//Obiekty (ang. object) mog¹ reprezentowaæ w programie 
//byty fizyczne
//(np.: u¿ytkownik systemu, produkt w sklepie internetowym, pokój w systemie rezerwacji hotelu),
//byty abstrakcyjne
//(np.: wpis w blogu, liczby)
//byty programistyczne
//(np.: kontenery (obiekt przechowuj¹cych w sobie wiele obiektów), 


//*****Obiekty*****
//Obiekt to struktura danych, która sk³ada siê z atrybutów oraz metod.
//Atrybuty (w³œciwoœci, pola) okreœlaja cechy obiektu a metody okreœlaj¹ akcje, jakie obiekt mo¿e wykonaæ.
//Aby tworzyæ obiekty, nale¿y zdefiniowac ich strukturê.


//*****Klasy******
//Do tego s³u¿y 'klasa' (ang. class) w której opisujemy atrybuty jakie bêd¹ posiadaæ obiekty
//i jakie akcje bêd¹ mog³y wykonaæ.
//Na podstawie tego opisu bêd¹ tworzeone obiekty (bêd¹ tworzone instancje danej klasy).
//Klasê nalezy rozumieæ jako abstrakt opisuj¹cy konkretne byty nale¿¹ce do tej klasy np.
//do klasy Pies bêdzie nale¿eæ Odie, Pluto i Scooby Doo (to konkretne psy czyli obiekty klasy Pies (Pluto nale¿y do klasy Pies))
//Przyk³ad klasy:

class Car {
	String brand;         //  \
	String model;         //  | __\   Atrybuty klasy Car. Ka¿dy obiekt bêdzie posiadaæ takie atrybuty
	String color;         //  |   /   jednak dla kazdego obiektu bêdzie mo¿na przypisaæ inne wartoœci tym atrybutom.
	int productionYear;   //  /
	
	void startEngine() {                   //  \
		//procedura uruchamiania silnika   //  |->  Metoda klasy Car. Ka¿dy obiekt bedzie móg³ wykonaæ procedurê
	}                                      //  /    któr¹ realizuje ta metoda.
}


//*****Tworzenie nowego obiektu*****
//Do tworzenia obiektu wykorzystuje siê operator 'new':

//  /Typ zmiennej
//  |   /Nazwa zmiennej
//  |   |      /Operator tworzenia nowej klasy
//  |   |      |   /Klasa obiektu jaki potrzebujemy + nawiasy okr¹g³e
//  |   |      |   |
   Car car1 = new Car();

//Linia ta oznacza, ¿e tworzony jest nowy obiekt nale¿¹cy do klasy Car,
//który przypisywany jest do zmiennej 'car1' typu Car
//Ka¿da klasa jest traktowana jako nowy typ danych.  <- Wa¿ne!


//*****Atrybuty i metody obiektu*****
//Dostêp do atrybutów i metod obiektu uzyskuje siê przez u¿ycie operatora '.':

car1.brand = "BMW";          //  \
car1.model = "E30 M3";       //  |__\  Przypisanie wartoœci do atrybutów obiektu klasy Car
car1.color = "black";        //  |  /
car1.productionYear = 1990;  //  /

car1.startEngine(); // Wywo³anie metody


//*****Wiele obiektów tej samej klasy*****
//W czasie dzia³ania programu mo¿e istnieæ wiele obiektów klasy Car

Car car2 = new Car();
car2.brand = "Polonez";
car2.model = "Caro";
car2.color = "green";
car2.productionYear = 1992;

Car car3 = new Car()
car3.brand = "Fiat";
car3.model = "126p";
car3.color = "pink";
car3.productionYear = 1991;

//W tym momencie w programie istniej¹ 3 obiekty klasy Car, które s¹ przetrzymywane w zmiennych 'car1', 'car2', 'car3'.





//*****************************************************************************
//Zmienne, atrybuty, metody, parametry.                                       *
//*****************************************************************************

//Zmienna
//*****************************************************************************
//Zmienne jest miejscem przetrzymywania danych. Sk³ada siê z dwóch elementów:
//nazwy symbolicznej, której celem jest nazwanie danych przetrzymywanych w zmiennej
//oraz z odresu pamieci, w której przetrzymywane s¹ te dane.
//Zmienne mo¿na wyobraziæ sobie jako pude³ka. Jest tyle ró¿nych pude³ek ile jest ró¿nych typów danych.
//W pude³ku przetrzymywana jest konkretna wartoœæ, np. w pude³ku dla integerów znajdowaæ siê bêdzie jakaœ
//liczba typu ca³kowitego np. 10.
//Aby zadeklarowaæ zmienn¹ (utworzyæ now¹ zmienn¹) nalezy podaæ jej typ i nazwê.
//  /typ zmiennej
//  |
//  |   /nazwa zmiennej
//  |   |
   int number;
//Typ zmiennej deklaruje jakiego typu dane bed¹ mog³y byæ do niej przypisane. W tym przyk³¹dzie jest to typ 'int'
//(ang. ineger) czyli typ ca³kowitoliczbowy (liczba ca³kowita). Próba przypisania danych innego typu spoowduje b³¹d.
//Nazwa zmiennej s³u¿y programiœcie do zorientowania siê jakie dane s¹ w niej przetrzymywane,
//dlatego nazwy powinny dok³adnie nazywaæ czym jest ta zmienna.
//Nazwa zmiennej powi¹zana jest z adresem w pamiêci,
//pod którym przechowywana jest przypisana do zmiennej wartoœæ.

   
//*****Przypisanie wartoœci do zmiennej*****
//Zapisanie danych odbywa siê przy u¿yciu operatora '=' (operator przypisania).
int number; //deklaracja zmiennej 'number' typu integer (liczba ca³kowita)
number = 5; //przypisanie do zmiennej 'number' wartoœci 5
int number_3, number_4, number_5; //mo¿na zadeklarowaæ wiele zmiennych na raz tego samego typu

int number_1 = 4; //deklaracja z przypisaniem
int number_2 = 6; //deklaracja z przypisaniem

int sum = number_1 + number_2; //do zmiennej 'sum' przypisana jest wartoœæ sumy
//        |                 |  //liczb zapisanych w zmiennych 'number_1' i 'number_2'.
//        -------------------
//                |
//                -> Najpierw wykonaj¹ siê obliczenia, a potem wynik zostanie przypisany do zmiennej.
//Zasada jest taka, ¿e najpier wykonuje siê kod po prawej stronie od operatora przypisania.
//Dopiero po jego wykonaniu ostateczna wartoœæ zostanie przypisana do zmiennej.
//                        -> Najpier zostanie wykonana metoda random() a potem, zwrócona przez ni¹ wartoœæ zostanie przypisana do zmiennej.
//                        |
double randomValue = Math.random(); //metoda random() zwraca losow¹ liczbê z przedzia³u 0.0 do 1.0
                                    //która jest przypisywana do zmiennej 'randomValue'

Car car = new Car(); //do zmiennej 'car' typu 'Car' przypisywany jest nowy obiekt klasy 'Car'
                     //w takim przypadku u¿ywa siê skrótu myœlowego, wed³óg którego mówi siê
                     //o zmiennej car, ¿e jest obiektem.


//*****Zmienna mo¿e siê zmieniaæ*****
//Zmienna, jak jej nazwa wskazuje, mo¿e siê zmieniaæ. Oznacza to, ¿e mo¿na zmieniaæ wartoœæ zapisanej
//w zmiennej poprzez nowe przypisanie.

int number = 5; //Do zmiennej umber przypisana jest wartoœæ 5.
number = 10; //W zmiennej number zapisana jest teraz wartoœæ 10.



//Atrybuty
//*****************************************************************************
//Atrybuty obiektów s¹ zmiennymi, które s¹ zwi¹zane z danym obiektem.
//Dostep do nich umo¿liwia operator kropki:

Car car = new Car(); //Tworzymy obiekt klasy Car i przypisujemy go do zmiennej car typu Car.
car.brand = "BMW";   //Aby uzyskaæ dostêp do atrybutu 'brand' tego obiektu nale¿y po zmiennej 'car'
                     //(a ta zmienna to obiekt klasy Car)
                     //postawiæ kropke i podaæ nazwê atrybut tego obiektu.



//Metody
//*****************************************************************************
//Metody to czynnoœci/operacje/procedury, które mo¿e wykonaæ obiekt.
//Sk³ada siê z nazwy (analogicznie jak nazwa zmiennej) typu jaki zwraca,
//parametrów jakie przyjmuje oraz bloku kodu, który bêdzie wykonywany po wywo³aniu metody.
class Hero {
	int attackValue = 100; //je¿eli zadeklarujemy zmienn¹ w klasie i przypiszemy do niej wartoœæ
	int defenseValue = 50; //w tej samej linii to atrybuty wszystkich obiektów tej klasy bêd¹ mia³y t¹ sam¹ wartoœæ
	
//   /deklaracja zwracanego typu                                            \
//   |    /nazwa metody                                                     |
//   |	  |                                                                 |-> deklarcja metody
//   |    |      /typ przekazywanego parametru                              |
//   |    |      |    /nazwa parametru jaka bedzie u¿ywana w bloku metody   /
//   |    |      |    |	
	int attack(Hero enemy) {
	  int damage = attackValue - enemy.defenseValue; //blok zawieraj¹cy procedurê w nawiasach klamrowych
	  return damage;                                 //jest definicj¹ metody
	}
}
//Wewn¹trz metody mo¿emy deklarowaæ zmienne, które bêda lokalne wzglêdem tej metody, czyli
//nie bêd¹ widoczne poza t¹ metod¹ (np.: zmienna 'damage')/


//*****Wywo³anie metody*****
//Metody wywo³uje siê podobnie jak uzyskuje siê dostêp do atrybutów.
Hero hero1 = new Hero();
Hero hero2 = new Hero();

hero1.attack(hero2); //wywo³ujemy metodê 'attack' obiektu 'hero1' i przekazujemy do niej obiekt 'hero2'.

//Po podaniu nazwy wywo³ywanej metody nale¿y u¿yæ nawiasów okr¹g³ych,
//nawet je¿eli nie przyjmuje ¿adnych parametrów (to wyró¿nia metodê od parmetru).


//*****Parametry*****
//Parametry s³u¿¹ do przekazania metodzie wartoœci, do których nie ma ona dostêpu (instniej¹ poza obiektem
//czyli nie s¹ zapisane w atrybutach obiektów lub nie zosta³y utworzone wewn¹trz metody jako zmienna lokalna).
//Metoda nie musi przyjmoawaæ ¿adnych parametrów, mo¿e przyjmowac jeden parametr lub wiêcej.
//Je¿eli metoda przymuje wiêcej ni¿ jeden parametr to kolejne parametry musza byæ oddzielone przecinkiem.
//Nale¿y podaæ typ parametrów, tak jak robi siê przy zmiennych.
//Parametry meotdy bêd¹ zmiennymi wewn¹trz bloku metody.

//Do metody mo¿emy przekazywaæ:
obiekt.metoda(100); //wartoœæ lilteraln¹ (litera³ - ustalona wartoœæ),
int number = 100;
obiekt.metoda(number); //wartoœæ zapisan¹ w zmiennej
obiekt.metoda(innyObiekt.metoda()); //wartoœæ zwracan¹ przez inn¹ metodê

//Litera³y to kokretne wartoœci
//dla typu int bêd¹ do liczby np.: 1, 5, 234
//dla typu double i float bêd¹ to liczby z rozwiniêciem dziesiêtnym np.: 1.4, 2.554
//dla typu char bêdzie to pojedynczy znak np. 'u' lub wartoœæ zwi¹zana ze znakiem z tabeli unicode np. '\u0075'
//dla typu String bêdzie to tekst w podówjnym cudzys³owi np.: "Kamilka"


//*****Metody i atrybuty*****
//Metoda posiada bezpoœredni dostêp do atrybutów swojego obiektu (np. atrybut 'attackValue')
//i mo¿e u¿ywaæ ich wewn¹trz bloku metody tak jak zmiennych.
//Jezeli utworzymy zmienn¹ lokaln¹ o takiej samej nazwie jak atrybut to atrybut ten bêdzie przes³oniêty przez
//przez now¹ zmienn¹. Taka sama sytuacja nast¹pi gdy zadeklarujemy parametry metody
//o takich samych nazwach jak metody (poniewa¿ niejawnie tworzone sa zmienne o takich nazwach jak parametry).
class A {
	int value = 100;
	
	void printValue() {
		System.out.println(value); //wypisze 100
		int value = 200; //atrybut 'value' zostaje przes³oniêty przez zmienn¹ lokaln¹
		System.out.println(value); //wypisze 200
		
		this.printFakeValue(250); //wypisze 250
		printFakeValue(250); //to samo co wy¿ej
	}
	
	void printFakeVal(int value) { //parametr przes³oni atrybut 'value'
		System.out.println(value); //wypisze wartoœæ jaka zosta³a przekazana przez parametr
	}
}


//*****Zwracanie wartoœci*****
//Operator return okreœla wartoœæ, jak¹ chcemy, aby zwróci³a funkcja.
//Kod po u¿yciu operatora return nie jest wykonywany (operator return koñczy dzia³anie metody).
//W przypadku metody 'attack' zwracana jest wartoœæ zapisana w zmiennej 'damage'.





//*****************************************************************************
//Konstruktor                                                                 *
//*****************************************************************************
//Konstruktor to specjalna metoda, która jest wywo³ywana w momencie tworzenia nowego obiektu.
//Nazwa tej metody jest taka sama jak nazwa klasy, w której siê znajduje.

class Hero {	
	int attackValue;
	int defenseValue;
	
	Hero(int attack, int defense) { //  \
		attackValue = attack;       //  |-> Konstruktor
		defenseValue = defense;     //  |
	}                               //  /
}

Hero ranger = new Hero(100, 50);  //W tym przypadku przekazujemy do konstruktora nie zmienn¹
Hero warrior = new Hero(75, 100); //a litera³ (konkretn¹ wartoœæ)
//Konstruktor nie zwraca ¿adnej wartoœci.
//Konstruktor mo¿na przeci¹¿yæ.
//Je¿eli nie utworzymy w³asnego konstruktora to kompilator sam doda domyœlny konstruktor,
//który nie przyjmuje ¿adnych parametrów.





//*****************************************************************************
//Typy proste vs obiekty (typy z³o¿one)                                       *
//*****************************************************************************
//Wartoœci zapisane w zmiennych typów prostych przechowywane sa inaczej ni¿ obiekty.
//Zmienne typów prostych przechowywuj¹ (w pamiêci) wartoœæ tego typu (np wartoœæ 5).
//Nazwa zmiennej typu prostego jest powi¹zana z adresem w pamiêci, a pod tym adresem mo¿emy znaleŸæ przypisan¹ wartoœæ:
//nazwa <=> adres pamiêci --> wartoœæ
//                              /\
//                               \ To co jest przekazywane przez parametr

//Zmienna do kórej przypisany jest obiekt, nie przechowuje samego obiektu (jak w typach prostych wartoœæ)
//a wartoœæ adresu pamiêci pod któr¹ ten obiekt jest zapisany.
//Nazwa zmiennej typu z³o¿onego jest powi¹zana z adresm w pamiêci,
//pod tym adresem zapisany jest inny adres, który wskazuje na miejsce przetrzymywania obiektu.
//nazwa <=> adres pamiêci --> adres pamiêci obiektu --> obiekt
//                                     /\
//                                      \ To co jest przekazywane przez parametr



//Przekzaywanie parametrów
//*****************************************************************************
//Przekazywanie zmiennych do metody odbywa siê przez wartoœæ.
//Oznacza to, ¿e wewn¹trz metody wartoœci przekazane przez parametry s¹ przypisywane do
//nowych zmiennych o takich samych nazwach jak parametry metody.

//Deklaracje
class Hero {
	int attackValue;
	int defenseValue;
	
	setAttackAndDefense(int attack, int defense) {
		//na pocz¹tku dzia³ania tej metody niejawnie tworzone s¹ zmienne 'attack' i 'defense'
		//które posiadaj¹ wartoœci jakie zosta³y przekazane do tej metody w momencie jej wywo³ania
		
		attackValue = attack;    // __\  przypisanie do atrybutów nowych wartoœci
		defenseValue = defense;  //   /
	}
}

//Wywo³anie
int attack = 100;  //W czasie dzia³ania pogramu tworzone s¹ zmienne,
int defense = 100; //które przechowuj¹ wartoœci ataku i obrony naszego bohatera

Hero hero = new Hero();  //Tworzymy obiekt klasy Hero
hero.setAttackAndDefense(attack, defense); //wywo³ujemy metodê 'setAttackAndDefense' do której przekzujemy zmienne
										   //zawieraj¹ce wartoœci ataku i obrony bohatera

//W przypadku obiektów przekazywany jest nie sam obiekt (jak watoœæ w przyadku typów prostych)
//a zapisany w zmiennej adres.
//To oznacza ¿e wewn¹trz bloku tworzona jest niejawnie nowa zmienna z przypisanym adresem pamiêci
//wskazujacym na ten sam obiekt co przekazany przez parametr a nie jest tworzona kopia tego obiektu.
//To powoduje ¿e zmiana atrybutów obiektu wewn¹trz metody bedzie widoczna poza ni¹, jednak przypisanie nowego obiektu
//do nowej zmiennej w metodzie nie spowoduje widocznych zmian poza t¹ metod¹.

//Deklaracje
class A {           //Klasa A posiada jedynie jeden atrybut typu int
	int atrybut;
}

class B {	
	void zmianaAtrybutu(A obiekt) {
		obiekt.atrybut = 10;  //Metoda ta zmienia wartoœæ atrybutu przekazanego obiektu
	}
	
	void zmianaObiektu(A obiekt) {  
		obiekt = new A();    //Metoda ta przypisuje nowy obiekt do zmiennej zawieraj¹cym przekazany obiekt        
		obiekt.atrybut = 15; //i przypisuje mu now¹ wartoœæ do atrybutu
	}
}

//Wywo³anie
A obiektA = new A();
B obiektB = new B();

obiektA.atrybut = 5;                  //Prypisujemy do atrybutu obiektu 'obiektB' wartoœæ 5.
obiektB.zmianaAtrybutu(obiektA);      //Przekazujemy 'obiektB' do metody 'zmianaAtrybutu'.
                                      //Metoda ta zmienia wartoœæ atrybutu na 10.
System.out.print(obiektA.atrybut);    //Wypisana zostanie wartoœæ 10.

obiektB.zmianaObiektu(obiektA);       //Tutaj do metody 'zmianaObiektu' przekazujemy ten sam obiekt obiektB/
                                      //Metoda ta przypisuje nowy obiekt do 'obiektB' i nadaje jego atrybutowi wartoœæ 15/
System.out.print(obiektA.atrybut);    //Pomimo przypisania nowego obiektu z atrybutem o innej wartoœci
                                      //to zostanie wypisana wartoœæ 10.


//Przeci¹¿anie metod
//*****************************************************************************
//Przci¹¿anie metod to mo¿liwoœæ tworzenia wielu implementacji jednej metody, które s¹ zale¿ne od:
//*iloœci paramwtrów,
//*typów parametrów,
//*kolejnoœci parametrów

class PolePowierzchni {
	int polePowierzchniProstok¹ta(int a, int b) {
		return a * b;
	}
	
	int polePowierzchniProstok¹ta(int a) {
		return a*a;
	}
}

PolePowierzchni obliczacz = new PolePowierzchni();
obliczacz.polePowierzchniProstok¹ta(2, 3) //Wykona siê metoda, która zosta³a zadeklarowana z dwoma parametrami
obliczacz.polePowierzchniProstok¹ta(2) //Wykona siê metoda, która zosta³a zadeklarowana z jednym parametrem

class WypisywaczTypów {
	void wypiszTyp(int a) {
		System.out.println("To jest typ integer: " + a);
	}
	
	void wypiszTyp(char a) {
		System.out.println("To jest typ char: " + a);
	}
	
	void kolejnoœæTypów(int a, char b) {
		System.out.println("" + a + b);
	}
	
	void kolejnoœæTypów(char a, int b) {
		System.out.println("" + a + b);
	}
}

WypisywaczTypów wypisywaczTypów = new WypisywaczTypów();
wypisywaczTypów.wypiszTyp(1); //metoda wypisze w konsoli "To jest typ integer: 1"
wypisywaczTypów.wypiszTyp('a'); //metoda wypisze w konsoli "To jest typ char: a"
wypisywaczTypów.wypiszTyp(1, 'a'); //wypize 1a
wypisywaczTypów.wypiszTyp('a', 1); //wypisze a1





//*****************************************************************************
//this                                                                        *
//*****************************************************************************
//this jest specjaln¹ zmienn¹ (jest niemodyfikalna), która mo¿e byæ wykorzystana tylko wewn¹trz klasy
//i wskazuje na aktualn¹ instancjê (obiekt) tej klasy. Umozliwia ona dostêp do atrybutów i metod klasy wewn¹trz tej klasy.
class A {
	int value = 100;
	
	void printValue() {
		System.out.println(value); //wypisze 100
		int value = 200; //atrybut 'value' zostaje przes³oniêty przez zmienn¹ lokaln¹
		System.out.println(value); //wypisze 200
		System.out.println(this.value); //wypisze 100
		
		this.printFakeValue(250); //wypisze 250
		printFakeValue(250); //to samo co wy¿ej
	}
	
	void printFakeVal(int value) { //parametr przes³oni atrybut 'value'
		System.out.println(value); //wypisze wartoœæ jaka zosta³a przekazana przez parametr
	}
}

A object = new A();
object.printValue();





//*****************************************************************************
//Konwencje                                                                   *
//*****************************************************************************

//Nazwy
//*****************************************************************************
//Wszelkie nazwy zapisuje siê w notacji wielb³¹dziej (camel case). W notacji tej nie ma odstêpów miêdzy s³owami.
//Aby zaznaczyæ pocz¹tek s³owa to zaczyna siê go du¿¹ liter¹ np.
//
//    KamilkaToNajpiêkniejszaDziewczynaJak¹KiedykolwiekWidzia³em
//
//Nale¿y przy tym pamiêtaæ, ¿e nazwy zmiennych, atrybutów i metod zaczyna siê ma³¹ lilter¹.
//Natomiast nazwy klas zaczyna siê wielk¹ liter¹.





//*****************************************************************************
//Java                                                                        *
//*****************************************************************************
//Java to platforma, która dostarcza œrodowisko umo¿liwiaj¹ce tworzenie i uruchamianie programów. W jego sk³ad
//wchodz¹ m. in.: wirtualna maszyna javy (JVM - Java Virtual Machine), jêzyk programowania, kompilator, zestaw bibliotek.

//Dzia³anie programów
//Kod Ÿród³owy napisany w Javie jest zapisywany w plikach z rozszerzeniem .java
//Przed uruchomieniem programu, kod ten jest kompilowany przy pomocy kompilatora i wynik kompilacji
//zapisywany jest w plikach z rozszerzeniem .class

//Kompilator to program, który zamienia kod Ÿród³owy napisany w jakims jêzyku programowania na inny kod.
//Wynikiem pracy kompilatora bêdzie kod zapisanyw w jezyku programowania niekiego poziomu (np. assembler)
//lub kod maszynowy, który mo¿e byæ bezpoœrednio wykonany przez procesor. Kompilatory mo¿na podzieliæ na
//JIT (just-in-time) i AOT (ahead-of-time).

//W przypadku jêzyka Java kompilator (AOT) zamienia kod Ÿród³owy do tak zwanego kodu bajtowego (bytecode).
//Jest to specjalny rodzaj kodu, który jest wykonywany przez wirtualn¹ maszynê javy.
//Nastêpnie w czasie dzia³ania programu kod bajtowy jest interpretowany i, je¿eli jest taka potrzeba,
//kompilowany do kodu maszynowego (JIT).

//Interpreter to program, który zczytuje kolejn¹ linie kodu Ÿród³owego i niezw³ocznie j¹ wykonuje.
//Takie podejœcie wymaga t³umaczenia kodu Ÿród³owego na kod maszynowy w czasie dzia³ania programu,
//czego konsekwencj¹ jest wolniejsze jego wykonywanie.

//Wirtualna maszyna javy jest programem, który umo¿liwia uruchamianie programów napisanych w jêzyku java.
//Idê¹ ca³ej platformy jest mozliwoœæ uruchamiania programów niezaleznie od systemu na którym s¹ uruchamiane.
//Wirtualna maszyna javy jest poœrednikiem miêdzy systemem a programem, który niweluje wszelkie ró¿nice miêdzy systemami.
//Sama JVM nie jest niezle¿na od systmu, ka¿dy ma w³asn¹ wersjê tego programu.