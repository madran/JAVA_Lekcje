//*****************************************************************************
//Programowanie zorientowane obiektowo                                        *
//*****************************************************************************
//Programowanie zorientowane obiektowo to paradygmat programistyczny, w kt�rym g��wnymi elementami programu s� obiekty.
//Obiekty (ang. object) mog� reprezentowa� w programie 
//byty fizyczne
//(np.: u�ytkownik systemu, produkt w sklepie internetowym, pok�j w systemie rezerwacji hotelu),
//byty abstrakcyjne
//(np.: wpis w blogu, liczby)
//byty programistyczne
//(np.: kontenery (obiekt przechowuj�cych w sobie wiele obiekt�w), 


//*****Obiekty*****
//Obiekt to struktura danych, kt�ra sk�ada si� z atrybut�w oraz metod.
//Atrybuty (w��ciwo�ci, pola) okre�laja cechy obiektu a metody okre�laj� akcje, jakie obiekt mo�e wykona�.
//Aby tworzy� obiekty, nale�y zdefiniowac ich struktur�.


//*****Klasy******
//Do tego s�u�y 'klasa' (ang. class) w kt�rej opisujemy atrybuty jakie b�d� posiada� obiekty
//i jakie akcje b�d� mog�y wykona�.
//Na podstawie tego opisu b�d� tworzeone obiekty (b�d� tworzone instancje danej klasy).
//Klas� nalezy rozumie� jako abstrakt opisuj�cy konkretne byty nale��ce do tej klasy np.
//do klasy Pies b�dzie nale�e� Odie, Pluto i Scooby Doo (to konkretne psy czyli obiekty klasy Pies (Pluto nale�y do klasy Pies))
//Przyk�ad klasy:

class Car {
	String brand;         //  \
	String model;         //  | __\   Atrybuty klasy Car. Ka�dy obiekt b�dzie posiada� takie atrybuty
	String color;         //  |   /   jednak dla kazdego obiektu b�dzie mo�na przypisa� inne warto�ci tym atrybutom.
	int productionYear;   //  /
	
	void startEngine() {                   //  \
		//procedura uruchamiania silnika   //  |->  Metoda klasy Car. Ka�dy obiekt bedzie m�g� wykona� procedur�
	}                                      //  /    kt�r� realizuje ta metoda.
}


//*****Tworzenie nowego obiektu*****
//Do tworzenia obiektu wykorzystuje si� operator 'new':

//  /Typ zmiennej
//  |   /Nazwa zmiennej
//  |   |      /Operator tworzenia nowej klasy
//  |   |      |   /Klasa obiektu jaki potrzebujemy + nawiasy okr�g�e
//  |   |      |   |
   Car car1 = new Car();

//Linia ta oznacza, �e tworzony jest nowy obiekt nale��cy do klasy Car,
//kt�ry przypisywany jest do zmiennej 'car1' typu Car
//Ka�da klasa jest traktowana jako nowy typ danych.  <- Wa�ne!


//*****Atrybuty i metody obiektu*****
//Dost�p do atrybut�w i metod obiektu uzyskuje si� przez u�ycie operatora '.':

car1.brand = "BMW";          //  \
car1.model = "E30 M3";       //  |__\  Przypisanie warto�ci do atrybut�w obiektu klasy Car
car1.color = "black";        //  |  /
car1.productionYear = 1990;  //  /

car1.startEngine(); // Wywo�anie metody


//*****Wiele obiekt�w tej samej klasy*****
//W czasie dzia�ania programu mo�e istnie� wiele obiekt�w klasy Car

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

//W tym momencie w programie istniej� 3 obiekty klasy Car, kt�re s� przetrzymywane w zmiennych 'car1', 'car2', 'car3'.





//*****************************************************************************
//Zmienne, atrybuty, metody, parametry.                                       *
//*****************************************************************************

//Zmienna
//*****************************************************************************
//Zmienne jest miejscem przetrzymywania danych. Sk�ada si� z dw�ch element�w:
//nazwy symbolicznej, kt�rej celem jest nazwanie danych przetrzymywanych w zmiennej
//oraz z odresu pamieci, w kt�rej przetrzymywane s� te dane.
//Zmienne mo�na wyobrazi� sobie jako pude�ka. Jest tyle r�nych pude�ek ile jest r�nych typ�w danych.
//W pude�ku przetrzymywana jest konkretna warto��, np. w pude�ku dla integer�w znajdowa� si� b�dzie jaka�
//liczba typu ca�kowitego np. 10.
//Aby zadeklarowa� zmienn� (utworzy� now� zmienn�) nalezy poda� jej typ i nazw�.
//  /typ zmiennej
//  |
//  |   /nazwa zmiennej
//  |   |
   int number;
//Typ zmiennej deklaruje jakiego typu dane bed� mog�y by� do niej przypisane. W tym przyk��dzie jest to typ 'int'
//(ang. ineger) czyli typ ca�kowitoliczbowy (liczba ca�kowita). Pr�ba przypisania danych innego typu spoowduje b��d.
//Nazwa zmiennej s�u�y programi�cie do zorientowania si� jakie dane s� w niej przetrzymywane,
//dlatego nazwy powinny dok�adnie nazywa� czym jest ta zmienna.
//Nazwa zmiennej powi�zana jest z adresem w pami�ci,
//pod kt�rym przechowywana jest przypisana do zmiennej warto��.

   
//*****Przypisanie warto�ci do zmiennej*****
//Zapisanie danych odbywa si� przy u�yciu operatora '=' (operator przypisania).
int number; //deklaracja zmiennej 'number' typu integer (liczba ca�kowita)
number = 5; //przypisanie do zmiennej 'number' warto�ci 5
int number_3, number_4, number_5; //mo�na zadeklarowa� wiele zmiennych na raz tego samego typu

int number_1 = 4; //deklaracja z przypisaniem
int number_2 = 6; //deklaracja z przypisaniem

int sum = number_1 + number_2; //do zmiennej 'sum' przypisana jest warto�� sumy
//        |                 |  //liczb zapisanych w zmiennych 'number_1' i 'number_2'.
//        -------------------
//                |
//                -> Najpierw wykonaj� si� obliczenia, a potem wynik zostanie przypisany do zmiennej.
//Zasada jest taka, �e najpier wykonuje si� kod po prawej stronie od operatora przypisania.
//Dopiero po jego wykonaniu ostateczna warto�� zostanie przypisana do zmiennej.
//                        -> Najpier zostanie wykonana metoda random() a potem, zwr�cona przez ni� warto�� zostanie przypisana do zmiennej.
//                        |
double randomValue = Math.random(); //metoda random() zwraca losow� liczb� z przedzia�u 0.0 do 1.0
                                    //kt�ra jest przypisywana do zmiennej 'randomValue'

Car car = new Car(); //do zmiennej 'car' typu 'Car' przypisywany jest nowy obiekt klasy 'Car'
                     //w takim przypadku u�ywa si� skr�tu my�lowego, wed��g kt�rego m�wi si�
                     //o zmiennej car, �e jest obiektem.


//*****Zmienna mo�e si� zmienia�*****
//Zmienna, jak jej nazwa wskazuje, mo�e si� zmienia�. Oznacza to, �e mo�na zmienia� warto�� zapisanej
//w zmiennej poprzez nowe przypisanie.

int number = 5; //Do zmiennej umber przypisana jest warto�� 5.
number = 10; //W zmiennej number zapisana jest teraz warto�� 10.



//Atrybuty
//*****************************************************************************
//Atrybuty obiekt�w s� zmiennymi, kt�re s� zwi�zane z danym obiektem.
//Dostep do nich umo�liwia operator kropki:

Car car = new Car(); //Tworzymy obiekt klasy Car i przypisujemy go do zmiennej car typu Car.
car.brand = "BMW";   //Aby uzyska� dost�p do atrybutu 'brand' tego obiektu nale�y po zmiennej 'car'
                     //(a ta zmienna to obiekt klasy Car)
                     //postawi� kropke i poda� nazw� atrybut tego obiektu.



//Metody
//*****************************************************************************
//Metody to czynno�ci/operacje/procedury, kt�re mo�e wykona� obiekt.
//Sk�ada si� z nazwy (analogicznie jak nazwa zmiennej) typu jaki zwraca,
//parametr�w jakie przyjmuje oraz bloku kodu, kt�ry b�dzie wykonywany po wywo�aniu metody.
class Hero {
	int attackValue = 100; //je�eli zadeklarujemy zmienn� w klasie i przypiszemy do niej warto��
	int defenseValue = 50; //w tej samej linii to atrybuty wszystkich obiekt�w tej klasy b�d� mia�y t� sam� warto��
	
//   /deklaracja zwracanego typu                                            \
//   |    /nazwa metody                                                     |
//   |	  |                                                                 |-> deklarcja metody
//   |    |      /typ przekazywanego parametru                              |
//   |    |      |    /nazwa parametru jaka bedzie u�ywana w bloku metody   /
//   |    |      |    |	
	int attack(Hero enemy) {
	  int damage = attackValue - enemy.defenseValue; //blok zawieraj�cy procedur� w nawiasach klamrowych
	  return damage;                                 //jest definicj� metody
	}
}
//Wewn�trz metody mo�emy deklarowa� zmienne, kt�re b�da lokalne wzgl�dem tej metody, czyli
//nie b�d� widoczne poza t� metod� (np.: zmienna 'damage')/


//*****Wywo�anie metody*****
//Metody wywo�uje si� podobnie jak uzyskuje si� dost�p do atrybut�w.
Hero hero1 = new Hero();
Hero hero2 = new Hero();

hero1.attack(hero2); //wywo�ujemy metod� 'attack' obiektu 'hero1' i przekazujemy do niej obiekt 'hero2'.

//Po podaniu nazwy wywo�ywanej metody nale�y u�y� nawias�w okr�g�ych,
//nawet je�eli nie przyjmuje �adnych parametr�w (to wyr�nia metod� od parmetru).


//*****Parametry*****
//Parametry s�u�� do przekazania metodzie warto�ci, do kt�rych nie ma ona dost�pu (instniej� poza obiektem
//czyli nie s� zapisane w atrybutach obiekt�w lub nie zosta�y utworzone wewn�trz metody jako zmienna lokalna).
//Metoda nie musi przyjmoawa� �adnych parametr�w, mo�e przyjmowac jeden parametr lub wi�cej.
//Je�eli metoda przymuje wi�cej ni� jeden parametr to kolejne parametry musza by� oddzielone przecinkiem.
//Nale�y poda� typ parametr�w, tak jak robi si� przy zmiennych.
//Parametry meotdy b�d� zmiennymi wewn�trz bloku metody.

//Do metody mo�emy przekazywa�:
obiekt.metoda(100); //warto�� lilteraln� (litera� - ustalona warto��),
int number = 100;
obiekt.metoda(number); //warto�� zapisan� w zmiennej
obiekt.metoda(innyObiekt.metoda()); //warto�� zwracan� przez inn� metod�

//Litera�y to kokretne warto�ci
//dla typu int b�d� do liczby np.: 1, 5, 234
//dla typu double i float b�d� to liczby z rozwini�ciem dziesi�tnym np.: 1.4, 2.554
//dla typu char b�dzie to pojedynczy znak np. 'u' lub warto�� zwi�zana ze znakiem z tabeli unicode np. '\u0075'
//dla typu String b�dzie to tekst w pod�wjnym cudzys�owi np.: "Kamilka"


//*****Metody i atrybuty*****
//Metoda posiada bezpo�redni dost�p do atrybut�w swojego obiektu (np. atrybut 'attackValue')
//i mo�e u�ywa� ich wewn�trz bloku metody tak jak zmiennych.
//Jezeli utworzymy zmienn� lokaln� o takiej samej nazwie jak atrybut to atrybut ten b�dzie przes�oni�ty przez
//przez now� zmienn�. Taka sama sytuacja nast�pi gdy zadeklarujemy parametry metody
//o takich samych nazwach jak metody (poniewa� niejawnie tworzone sa zmienne o takich nazwach jak parametry).
class A {
	int value = 100;
	
	void printValue() {
		System.out.println(value); //wypisze 100
		int value = 200; //atrybut 'value' zostaje przes�oni�ty przez zmienn� lokaln�
		System.out.println(value); //wypisze 200
		
		this.printFakeValue(250); //wypisze 250
		printFakeValue(250); //to samo co wy�ej
	}
	
	void printFakeVal(int value) { //parametr przes�oni atrybut 'value'
		System.out.println(value); //wypisze warto�� jaka zosta�a przekazana przez parametr
	}
}


//*****Zwracanie warto�ci*****
//Operator return okre�la warto��, jak� chcemy, aby zwr�ci�a funkcja.
//Kod po u�yciu operatora return nie jest wykonywany (operator return ko�czy dzia�anie metody).
//W przypadku metody 'attack' zwracana jest warto�� zapisana w zmiennej 'damage'.





//*****************************************************************************
//Konstruktor                                                                 *
//*****************************************************************************
//Konstruktor to specjalna metoda, kt�ra jest wywo�ywana w momencie tworzenia nowego obiektu.
//Nazwa tej metody jest taka sama jak nazwa klasy, w kt�rej si� znajduje.

class Hero {	
	int attackValue;
	int defenseValue;
	
	Hero(int attack, int defense) { //  \
		attackValue = attack;       //  |-> Konstruktor
		defenseValue = defense;     //  |
	}                               //  /
}

Hero ranger = new Hero(100, 50);  //W tym przypadku przekazujemy do konstruktora nie zmienn�
Hero warrior = new Hero(75, 100); //a litera� (konkretn� warto��)
//Konstruktor nie zwraca �adnej warto�ci.
//Konstruktor mo�na przeci��y�.
//Je�eli nie utworzymy w�asnego konstruktora to kompilator sam doda domy�lny konstruktor,
//kt�ry nie przyjmuje �adnych parametr�w.





//*****************************************************************************
//Typy proste vs obiekty (typy z�o�one)                                       *
//*****************************************************************************
//Warto�ci zapisane w zmiennych typ�w prostych przechowywane sa inaczej ni� obiekty.
//Zmienne typ�w prostych przechowywuj� (w pami�ci) warto�� tego typu (np warto�� 5).
//Nazwa zmiennej typu prostego jest powi�zana z adresem w pami�ci, a pod tym adresem mo�emy znale�� przypisan� warto��:
//nazwa <=> adres pami�ci --> warto��
//                              /\
//                               \ To co jest przekazywane przez parametr

//Zmienna do k�rej przypisany jest obiekt, nie przechowuje samego obiektu (jak w typach prostych warto��)
//a warto�� adresu pami�ci pod kt�r� ten obiekt jest zapisany.
//Nazwa zmiennej typu z�o�onego jest powi�zana z adresm w pami�ci,
//pod tym adresem zapisany jest inny adres, kt�ry wskazuje na miejsce przetrzymywania obiektu.
//nazwa <=> adres pami�ci --> adres pami�ci obiektu --> obiekt
//                                     /\
//                                      \ To co jest przekazywane przez parametr



//Przekzaywanie parametr�w
//*****************************************************************************
//Przekazywanie zmiennych do metody odbywa si� przez warto��.
//Oznacza to, �e wewn�trz metody warto�ci przekazane przez parametry s� przypisywane do
//nowych zmiennych o takich samych nazwach jak parametry metody.

//Deklaracje
class Hero {
	int attackValue;
	int defenseValue;
	
	setAttackAndDefense(int attack, int defense) {
		//na pocz�tku dzia�ania tej metody niejawnie tworzone s� zmienne 'attack' i 'defense'
		//kt�re posiadaj� warto�ci jakie zosta�y przekazane do tej metody w momencie jej wywo�ania
		
		attackValue = attack;    // __\  przypisanie do atrybut�w nowych warto�ci
		defenseValue = defense;  //   /
	}
}

//Wywo�anie
int attack = 100;  //W czasie dzia�ania pogramu tworzone s� zmienne,
int defense = 100; //kt�re przechowuj� warto�ci ataku i obrony naszego bohatera

Hero hero = new Hero();  //Tworzymy obiekt klasy Hero
hero.setAttackAndDefense(attack, defense); //wywo�ujemy metod� 'setAttackAndDefense' do kt�rej przekzujemy zmienne
										   //zawieraj�ce warto�ci ataku i obrony bohatera

//W przypadku obiekt�w przekazywany jest nie sam obiekt (jak wato�� w przyadku typ�w prostych)
//a zapisany w zmiennej adres.
//To oznacza �e wewn�trz bloku tworzona jest niejawnie nowa zmienna z przypisanym adresem pami�ci
//wskazujacym na ten sam obiekt co przekazany przez parametr a nie jest tworzona kopia tego obiektu.
//To powoduje �e zmiana atrybut�w obiektu wewn�trz metody bedzie widoczna poza ni�, jednak przypisanie nowego obiektu
//do nowej zmiennej w metodzie nie spowoduje widocznych zmian poza t� metod�.

//Deklaracje
class A {           //Klasa A posiada jedynie jeden atrybut typu int
	int atrybut;
}

class B {	
	void zmianaAtrybutu(A obiekt) {
		obiekt.atrybut = 10;  //Metoda ta zmienia warto�� atrybutu przekazanego obiektu
	}
	
	void zmianaObiektu(A obiekt) {  
		obiekt = new A();    //Metoda ta przypisuje nowy obiekt do zmiennej zawieraj�cym przekazany obiekt        
		obiekt.atrybut = 15; //i przypisuje mu now� warto�� do atrybutu
	}
}

//Wywo�anie
A obiektA = new A();
B obiektB = new B();

obiektA.atrybut = 5;                  //Prypisujemy do atrybutu obiektu 'obiektB' warto�� 5.
obiektB.zmianaAtrybutu(obiektA);      //Przekazujemy 'obiektB' do metody 'zmianaAtrybutu'.
                                      //Metoda ta zmienia warto�� atrybutu na 10.
System.out.print(obiektA.atrybut);    //Wypisana zostanie warto�� 10.

obiektB.zmianaObiektu(obiektA);       //Tutaj do metody 'zmianaObiektu' przekazujemy ten sam obiekt obiektB/
                                      //Metoda ta przypisuje nowy obiekt do 'obiektB' i nadaje jego atrybutowi warto�� 15/
System.out.print(obiektA.atrybut);    //Pomimo przypisania nowego obiektu z atrybutem o innej warto�ci
                                      //to zostanie wypisana warto�� 10.


//Przeci��anie metod
//*****************************************************************************
//Przci��anie metod to mo�liwo�� tworzenia wielu implementacji jednej metody, kt�re s� zale�ne od:
//*ilo�ci paramwtr�w,
//*typ�w parametr�w,
//*kolejno�ci parametr�w

class PolePowierzchni {
	int polePowierzchniProstok�ta(int a, int b) {
		return a * b;
	}
	
	int polePowierzchniProstok�ta(int a) {
		return a*a;
	}
}

PolePowierzchni obliczacz = new PolePowierzchni();
obliczacz.polePowierzchniProstok�ta(2, 3) //Wykona si� metoda, kt�ra zosta�a zadeklarowana z dwoma parametrami
obliczacz.polePowierzchniProstok�ta(2) //Wykona si� metoda, kt�ra zosta�a zadeklarowana z jednym parametrem

class WypisywaczTyp�w {
	void wypiszTyp(int a) {
		System.out.println("To jest typ integer: " + a);
	}
	
	void wypiszTyp(char a) {
		System.out.println("To jest typ char: " + a);
	}
	
	void kolejno��Typ�w(int a, char b) {
		System.out.println("" + a + b);
	}
	
	void kolejno��Typ�w(char a, int b) {
		System.out.println("" + a + b);
	}
}

WypisywaczTyp�w wypisywaczTyp�w = new WypisywaczTyp�w();
wypisywaczTyp�w.wypiszTyp(1); //metoda wypisze w konsoli "To jest typ integer: 1"
wypisywaczTyp�w.wypiszTyp('a'); //metoda wypisze w konsoli "To jest typ char: a"
wypisywaczTyp�w.wypiszTyp(1, 'a'); //wypize 1a
wypisywaczTyp�w.wypiszTyp('a', 1); //wypisze a1





//*****************************************************************************
//this                                                                        *
//*****************************************************************************
//this jest specjaln� zmienn� (jest niemodyfikalna), kt�ra mo�e by� wykorzystana tylko wewn�trz klasy
//i wskazuje na aktualn� instancj� (obiekt) tej klasy. Umozliwia ona dost�p do atrybut�w i metod klasy wewn�trz tej klasy.
class A {
	int value = 100;
	
	void printValue() {
		System.out.println(value); //wypisze 100
		int value = 200; //atrybut 'value' zostaje przes�oni�ty przez zmienn� lokaln�
		System.out.println(value); //wypisze 200
		System.out.println(this.value); //wypisze 100
		
		this.printFakeValue(250); //wypisze 250
		printFakeValue(250); //to samo co wy�ej
	}
	
	void printFakeVal(int value) { //parametr przes�oni atrybut 'value'
		System.out.println(value); //wypisze warto�� jaka zosta�a przekazana przez parametr
	}
}

A object = new A();
object.printValue();





//*****************************************************************************
//Konwencje                                                                   *
//*****************************************************************************

//Nazwy
//*****************************************************************************
//Wszelkie nazwy zapisuje si� w notacji wielb��dziej (camel case). W notacji tej nie ma odst�p�w mi�dzy s�owami.
//Aby zaznaczy� pocz�tek s�owa to zaczyna si� go du�� liter� np.
//
//    KamilkaToNajpi�kniejszaDziewczynaJak�KiedykolwiekWidzia�em
//
//Nale�y przy tym pami�ta�, �e nazwy zmiennych, atrybut�w i metod zaczyna si� ma�� lilter�.
//Natomiast nazwy klas zaczyna si� wielk� liter�.





//*****************************************************************************
//Java                                                                        *
//*****************************************************************************
//Java to platforma, kt�ra dostarcza �rodowisko umo�liwiaj�ce tworzenie i uruchamianie program�w. W jego sk�ad
//wchodz� m. in.: wirtualna maszyna javy (JVM - Java Virtual Machine), j�zyk programowania, kompilator, zestaw bibliotek.

//Dzia�anie program�w
//Kod �r�d�owy napisany w Javie jest zapisywany w plikach z rozszerzeniem .java
//Przed uruchomieniem programu, kod ten jest kompilowany przy pomocy kompilatora i wynik kompilacji
//zapisywany jest w plikach z rozszerzeniem .class

//Kompilator to program, kt�ry zamienia kod �r�d�owy napisany w jakims j�zyku programowania na inny kod.
//Wynikiem pracy kompilatora b�dzie kod zapisanyw w jezyku programowania niekiego poziomu (np. assembler)
//lub kod maszynowy, kt�ry mo�e by� bezpo�rednio wykonany przez procesor. Kompilatory mo�na podzieli� na
//JIT (just-in-time) i AOT (ahead-of-time).

//W przypadku j�zyka Java kompilator (AOT) zamienia kod �r�d�owy do tak zwanego kodu bajtowego (bytecode).
//Jest to specjalny rodzaj kodu, kt�ry jest wykonywany przez wirtualn� maszyn� javy.
//Nast�pnie w czasie dzia�ania programu kod bajtowy jest interpretowany i, je�eli jest taka potrzeba,
//kompilowany do kodu maszynowego (JIT).

//Interpreter to program, kt�ry zczytuje kolejn� linie kodu �r�d�owego i niezw�ocznie j� wykonuje.
//Takie podej�cie wymaga t�umaczenia kodu �r�d�owego na kod maszynowy w czasie dzia�ania programu,
//czego konsekwencj� jest wolniejsze jego wykonywanie.

//Wirtualna maszyna javy jest programem, kt�ry umo�liwia uruchamianie program�w napisanych w j�zyku java.
//Id� ca�ej platformy jest mozliwo�� uruchamiania program�w niezaleznie od systemu na kt�rym s� uruchamiane.
//Wirtualna maszyna javy jest po�rednikiem mi�dzy systemem a programem, kt�ry niweluje wszelkie r�nice mi�dzy systemami.
//Sama JVM nie jest niezle�na od systmu, ka�dy ma w�asn� wersj� tego programu.