//*****************************************************************************
//Dziedziczenie                                                               *
//*****************************************************************************
//Dziedziczenie to podstawowy mechanizm zwi�zany z programowaniem obiektowym.
//Polega on na tym, �e jedna klasa mo�e dziedziczy� atrybuty oraz metody od innej klasy.
//Przyk�ad:
class Pojazd {
	public String rodzaj;
	
	public void uruchomSilinik();
}

class Samoch�d extends Pojazd {
	public String model; //Obiekty klasy Samoch�d b�d� posiada� atrybut rodzaj oraz metod� uruchomSilnik()
}

Samoch�d bmw = new Samoch�d();
bmw.rodzaj = "du�y";
bmw.uruchomSilnik();

//'Samoch�d extends Pojazd' oznacza �e klasa Samoch�d dziedziczy po klasie Pojazd
//(klasa Samoch�d rozszerza klase Pojazd).
//W takiej relacji klas�, kt�ra dziedziczy, nazywa si� podklas�
//a klas� po kt�rej jest dziedziczone nadklas� (superklas� ang. superclass).

//UWAGA! -> Dana klasa moze dziedziczy� jedynie po jednej klasie.

//Dziedziczenie wykorzystuje si� gdy chcemy wykorzysta� implementacj� jednej klasy (jej kod) w innej.
//Np. mo�emy miec w systemie klas� U�ytkownik, kt�ra posiada jaki� zestaw atrybut�w i metod
//oraz klas� U�ytkownikVIP, kt�ra b�dzie posiada� identyczne metody i atrybuty co klasa U�ytkownik
//oraz jakie� dodatkowe atrybuty i metody przeznaczone tylko dla u�ytkownik�w ze statusem vipa.
//Dzi�ki dziedziczeniu unikamy konieczno�ci powielania tych samych metod w obu klasach.


//Nadpisywanie metod nadklasy
//*****************************************************************************
//Je�eli zadeklarujemy w podklasie metod�, kt�r� dziedziczy po nadklasie to przes�oni ona dziedziczon� metod�:
class A {
	public void wypisz() {
		System.out.print("Jestem klasa A");
	}
}

class B extends A {
	public void wypisz() {
		System.out.print("Jestem klasa B);
	}
}

class C extends A {
}

A a = new A();
a.wypisz() // -> Wypisze "Jestem klasa A"

B b = new B();
b.wypisz() // -> Wypisze "Jestem klasa B"

C c = new c();
c.wypisz() // -> Wypisze "Jestem klasa A"


//Wywo�ywanie metod nadklasy
//*****************************************************************************
//Mo�lilwe jest wywo�ywanie metod nadklasy w podklasie. Wykorzystuje si� do tego s�owo super
class B extends A {
	public void wypisz() {
		super.wypisz(); //wywo�anie meotdy wypisz() zaimplementowanej w klasie A
	}
}

B b = new B();
b.wypisz() // -> Wypisze "Jestem klasa A"

//Wszystkie klasy (te utworzone przez u�ytkownika te�) dziedzicz� po klasie Object (mimo �e tego nie wida�).


//Konstruktor w dziedziczeniu
//*****************************************************************************
//Aby wywo�a� konstruktor nadklasy w podklasie r�wniez u�ywa si� s�owa super:
class A {
	A(int parametr) {
		//...
	}
}
class B extends A {
	B(int parametr) {
		super(parametr); //wywo�anie konstruktora klasy A
	}
}

//Konstruktor nadklasy zawsze jest wywo�ywany w podklasie.
//Wywo�anie konstruktora nadklasy musi nast�pi� w pierwszej linijce konstruktora podklasy.
//(konstruktory nie s� dziedziczone)
//Je�eli tego nie zrobimy to zrobi to za nas kompilator.
//Je�eli konstruktor nadklasy ma parametry a my go nie wywo�amy w podklasie z tymi
//parametrami (lub wcale go nie wywo�amy) to b�dzie b��d.


//Hierarchia typ�w
//*****************************************************************************
//Kiedy wykorzystujemy dziedziczenie to nie tylko udost�pniamy metody i atrybuty nadklasy podklasie
//ale i r�wniez tworzymy heriarch� typ�w.
//Oznacza to �e w przypadku klasy Pojazd oraz Samoch�d b�dziemy mogli m�wi� �e typ Samoch�d jest podtypem klasy Pojazd.
//Podtypy umo�liwiaj� nam taki zapis:

class Pojazd {
	public String rodzaj;
	
	public void uruchomSilinik() {
		//...
	}
}

class Samoch�d extends Pojazd {
	public String model;
	
	public void model() { System.out.print(model); )
}

Pojazd samoch�d = new Samoch�d();

//Mo�liwe jest przypisanie obiektu klasy Samoch�d do zmiennej typu Pojazd poniewa� ka�dy Samoch�d
//jest pewnym rodzajem Pojazdu. Relacja ta nie dzia�a w druga stron� poniewa� nie ka�dy Pojazd musi by� Samochodem
//(np. innym rodzajem Pojazdu mo�e by� Motor).

//UWAGA!!!
//Przypisuj�c obiekt podklasy do zmiennej typu nadklasy, tracimy dost�p do tych metod podklasy jakie nie
//zosta�y zadeklarowane w nadklasie.

Pojazd samoch�d = new Samoch�d();
samoch�d.model() //�LE -> klasa pojazd nie zawera metody model() dlatego nie mo�e by� wywo�ana



//*****************************************************************************
//Kontrola dost�pu do element�w obiektu                                       *
//*****************************************************************************
//Deklaruj�c metody i atrybuty mo�na doda� modyfikator dost�pu, kt�ry okre�la kiedy mo�emy
//skorzysta� z danej metody lub atrybutu. Istniej� cztery poziomy dostepu:
//----------------------------------------------------------------------
//|modyfikatory|wewn�trz klasy|w pakiecie|w podklasie|w dowolnej klasie|
//|------------|--------------|----------|-----------|-----------------|
//|public      |       +      |     +    |     +     |        +        | element publiczny
//|protected   |       +      |     +    |     +     |        -        | element chroniony
//|(brak)      |       +      |     +    |     -     |        -        |
//|private     |       +      |     -    |     -     |        -        | element prywatny
//----------------------------------------------------------------------
//Pierwsza kolumna 4 rodzaje modyfikator�w (przy czym 'brak' oznacza deklaracj� bez modyfikatora).
//Druga kolumna okre�la czy mo�na wywo�ywa� motedy/atrybuty wewn�trz klasy w kt�rej zosta�y zadeklarowane.
//Trzecia kolumna okre�la czy mo�na wywo�ywa� motedy/atrybutu w tym samym pakiecie.
//(innych klasach nale��cych do tego samego pakietu) 
//Czwarta kolumna okre�la czy mo�na wywo�ywa� metody/atrybutu przez podklasy.
//Pi�ta kolumna okre�la czy mo�na wywo�ywa� metody/atrybutu w dowolnej klasie.

//(Metody/atrybuty prywatne jak i bez modyfikatora nie s� dziedziczone.)

//Przyk�ady
class Przodek {
	private int szyfrDoSejfu = 554877459;
	protected String rodzinnaTajemnica = "sejf w piwnicy";
	
	String masz = "to";
	
	public zdrad�Szyfr() {
		return szyfrDoSejfu;
	}
}

class Potomek extends Przodek {
	public obwieszczenie = "dsdfdsa";
	
	public String zdrad�Rodzinn�Tajemnic�() {
		return rodzinnaTajemnica;
	}
}

Przodek edek = new Przodek();
Potomek tomek = new Potomek();

System.out.print(edek.szyfrDoSejfu); //B��D! -> atrybut szyfrDoSejfu jest prywatny i nie mo�e by� u�ywany poza klas�

System.out.print(edek.rodzinnaTajemnica); //UWAGA! -> rodzinnaTajemnica jest choroniona i mo�na uzyska� do niej dostep
                                          //          w tym samym pakiecie, w przciwnym wypadku jest to b��d.

System.out.print(edek.zdrad�Szyft()); //DOBRZE! -> metoda zdrad�Szyfr() jest publiczna i mo�na j� wywo�a� w dowolnym miejscu
                                      //           (metoda ta zwraca warto�� prywatn�, jest to mo�liwe poniewa� nie uzyskujemy
                                      //           do niej dost�pu bezpo�rednio a zwracamy jej warto�� poprzez metod�)
                                      //           (prywatny atrybut i zwracaj�ca metoda nale�� do tej samej klasy)

System.out.print(tomek.obiwieszczenie) //DOBRZE! -> atrybut obiwieszczenie jest publiczny i mo�na uzyskoa� do niego dost�p
                                       //           w dowolnym miejscu

System.out.print(tomek.zdrad�Rodzinn�Tajemnic�()) //DOBRZE! -> zdrad�Rodzinn�Tajemnic�() jest metod� publiczn� i mo�e by� u�yta
                                                  //           w dowolnym miejscu. Zwraca ona atrybut chroniony nale��cy do Nadklasy
                                                  //           jednak wszystkie elementy chronione s� widoczne w Podklasie

System.out.print(tomek.zdrad�Szyfr()) //DOBRZE! -> metoda zdrad�Szyfr() jest publiczna i dziedziczona z Nadklasy

System.out.print(tomek.masz) //B��D! -> atrybut masz nie jest dziedziczony


//Hermetyzacja
//*****************************************************************************
//Modyfikatory dost�pu do element�w obiektu umo�liwiaj� budowanie tak zwanego interfejsu programistycznego
//(ang. application programming interface (API)). API to procedury, struktury danych oraz protoko�y
//komunikacyjne, dzieki kt�rym programy moga komunikowa� si� ze sob�.
//Za interfejs programistyczny b�dziemy m. in. uznawa� wszystkie metody publiczne danej klasy. Publiczne, poniwa�
//tylko one b�d� mog�y by� wywo�ywane poza klas� i poza pakietem w jakim si� znajduj�.
//Metody oraz atrybuty prywatne czy chronione s� ukryte przed "�wiatem zewn�trznym" (nie s� widoczne poza klas� czy pakietem). 
//Takie elementy klas stanowi� t� cz�� implementacji r�nych procedur, do kt�rych inne programy (i programista)
//nie powinien mie� dost�pu.
//Wszystkie atrybuty powinny by� prywatne lub chronione. Chroni to dane przed modyfikacj� ich warto�ci 
//bez naszej kontroli (warto�� atrybut�w b�dzie si� zmienia� w wyniku operacji wykonywanych przez
//metody a nie przez bespo�redni do nich dost�p).

//Metody prywatne pos�u�� do tworzenia czytelnej struktury klasy. Mog� pos�u�y� do wydzielenia
//powtarzanego kodu w wielu metodach, oraz do dzielenia metody publicznej na kilka mniejszych (prywatnych)
//metod, co u�atwi jej czytanie i zrozumienie.

//Przyk�ady:
class R�wnanieKwadratowe {
	public int[] obliczR�wnanieKwadratowe() { // \
		int[] wynik = new int[2];             // |
		int delta;                            // |
		                                      // \   Obliczanie r�wnania kwadratowego sk�ada si� z kilku etap�w,
		delta = liczDelt�();                  //  \  dlatego mo�na podzili� metod� obliczR�wnanieKwadratowe()
		wynik[0] = liczX1(delta);             //  /  na kilka prwatnych metod.
		wynik[1] = liczX2(delta);             // /
		                                      // |
		return wynik;                         // |
	}                                         // /
	
	private int liczDelt�() {}
	private int liczX1(int delta) {}
	private int liczX2(int delta) {}
}

//Hermetyzacja (enkapsulacja z ang. encapsulation) to poj�cie nazywaj�ce ukrywanie danych przed mo�liwo��i� ich
//bezpo�redniego modyfikowania i udost�pnienie metod, kt�re b�d� to robi�.

class KontoBankowe {
	private int stanKonta;
	
	public int sprawd�Dost�pne�rodki() {
		return stanKonta;
	}
	
	public int dodaj�rodki(int ilo��) {
		stanKonta = stanKonta + ilo��;
	}
}

//Mutatory i selektory
//*****************************************************************************
//Mutatory (ang. setters) i seletory (ang. getters) (inczej okre�la si� je jako akcesory ang. accessors)
//to standardowa praktyka w przypadku uzyskiwania dostepu do prywatnych atrybut�w klasy.
//Stosuje si� w klasach, kt�re s� jedynie kontenerami dla danych (nie wykonuj� operacji na tych danych).
//Przyk�ad:
class U�ytkownik {
	String imi�;
	String nazwisko;
	String email;
	
	String getImi�() {
		return imi�;
	}
	
	void setImi�(String _imi�) {
		imi� = _imi�;
	}
	
	//...
}

//Klasy, kt�re nie s� jedynie kontenerami dla danych (wyoknuj� na nich bardziej z�o�one operacje) r�wnie� mog� posiada�
//akcesory. Jednak w takim przypadku powinno nadawa� si� im bardziej opisowe nazwy (przyk�ad KontoBankowe).





//*****************************************************************************
//Klasy abstrakcyjne                                                          *
//*****************************************************************************
//Klasa abstrakcyjna to specjalny rodzaj klasy, przy u�yciu kt�rej nie da si� tworzy� obiekt�w.
//Posiada jednak takie same mo�liwo�ci jak klasy normalne.
//U�ywana jest jako nadklasa dla zwyk�ych klas dziedzicz�cych po niej.
//Deklaruj� si� j� przy u�yciu s�owa abstract:
abstract class User {}
class NormalUser extends User {}
class VipUser extends User {}

//Klasa abstrakcyjna mo�e by� wyposa�ona w metody abstrakcyjne. Metod� deklaruje si�
//jako abstrakcyjn�, je�eli ka�da podklasa powinna mie� w�asn� implementacj� tej metody.
//(kazda klasa potomna bedzie posiada� inna implementacj� tej metody i jedna wsp�na
//nie istnieje/nie jest potrzebna). Je�eli w pdklasie nie zaimplementuje si� funkcji
//abstrakcyjnej to pojawi si� b��d.
abstract class Zwierze {
	public void siadaj() {
		//implementacja
	}
	
	public abstract void dajG�os(); //Ka�da podklasa klasy Zwierze musi mie� w�asn� implementacj� metody dajG�os()
}

class Pies extends Zwierze {
	public void dajG�os() {
		System.out.print("Hau, hau");
	}
}

class Kot extends Zwierze {
	public void dajG�os() {
		System.out.print("Miau, miau");
	}
}

//Klasy abstrakcyjnej b�dziemy przewa�nie u�ywa� gdy chcemy aby powi�zane ze sob� klasy dziedziczy�y wsp�lny kod
//(je�eli klasy dziedzicz�ce po klasie abstrakcyjnej miaj� wiele wsp�lnych metod i atrybut�w).



//*****************************************************************************
//Interfejsy                                                                  *
//*****************************************************************************
//Interfejsy to struktury podobne do klas z t� ro�nic�, �e zawieraj� jedynie sta�e oraz
//deklaracje metod.
//Nie jest r�wniez mo�liwe tworzenie instancji interfejsu.
//Domy�lnie wszystkie metody w interfejsie s� publiczne.
//Przyk�ad:
interface Kolekcja<T> {         // \   Nazw� interfejsu poprzedzamy s�owem interface
	boolean dodaj(T element);   // |   Deklaracje metod nie maja cia�a w nawiasach klamorowych
	T pobierz(int indeks);      //  >  i s� dzielone �rednikiem.
	void usun(index);           // |
	void wyczy��();             // /
}

//Poni�sza deklaracja oznacza �e klasa Lista impelemntuje wszystkie metody zadeklarowane w interfejsie Kolekcja
//(wszystkie metody musz� by� zaimplementowane w klasie Lista).
class Lista implements Kolekcja {
	//implementacja wszystkich metod z interfejsu Kolekcja
}

//Klasa mo�e implementowa� wiele interfejs�w:

class Klasa implements Interfejs1, Interfejs2, Interfejs3 {
	//..
}

//Mo�na ��czy� dziedziczenie z interfejsami

class Klasa extends SuperKlasa implements Interfejs1, Interfejs2, Interfejs3 {
	//..
}

//Interfejsy b�d� u�ywane gdy chcemy aby niepowi�zane ze sob� klasy posiada�y ten sam zestaw metod
//realizuj�cych konkretne zadanie. Interfejs b�dzie wymusza� jakie� zachowanie (zestaw metod), jednak nie jest
//istotne to jakie klasy b�d� go implementowa�. Mo�e by� r�wniez traktowany jako metoda na wielodziedziczenie.


//*****************************************************************************
//Podtypy i polimifrizm                                                       *
//*****************************************************************************
//Tak samo jak w przypadku klas tak i interfejs�w klasa implementuj�ca interfejs staje si� podtypem,
//dlatego mo�liwy jest taki zapis:

Lista lista1 = new Lista();
Kolekcja lista2 = new Lista();

//Tak samo te� dla obiektu zapisanym w zmiennej lista2 ilo�� metod ograniczona jest do tych zawartych w klasie Kolekcja
//pomimo �e przypisujemy do tej zmiennej obiekt klasy Lista.

//Takie zjawisko nazywane jest polimorfizmem. Jest to wa�ny mechanizm w programowaniu obiektowym.
//Przyj�ad:

interface Daj�cySi�Narysowa�Obiekt {
	void rysuj();
}

class Kwadrat implements Daj�cySi�Narysowa�Obiekt {
	void rysuj() {
		//implementacja
	}
}

class Tr�jk�t implements Daj�cySi�Narysowa�Obiekt {
	void rysuj() {
		//implementacja
	}
}

class SilnikGraficzny {
	ArrayList<Daj�cySi�Narysowa�Obiekt> obiekty = new ArrayList<Daj�cySi�Narysowa�Obiekt>
	
	void dodajObiekt(Daj�cySi�Narysowa�Obiekt obiekt) {
		obiekty.add(obiekt);
	}
	
	void renderujObraz() {
		for(Daj�cySi�Narysowa�Obiekt obiekt : obiekty) {
			obiekt.rysuj();
		}
	}
}

SilnikGraficzny silnik = new SilnikGraficzny;
Daj�cySi�Narysowa�Obiekt kwadrat = new Kwadrat();
Daj�cySi�Narysowa�Obiekt tr�jk�t = new Tr�jk�t();

silnik.dodajObiekt(kwadrat);
silnik.dodajObiekt(tr�jk�t);
silnik.renderujObraz()



//*****************************************************************************
//Metody i atrybuty statyczne                                                 *
//*****************************************************************************
//Metoda statyczna to metoda, kt�r� mo�na wywo�a� bez konieczno�ci tworzenia instancji danej klasy.
//Deklaracja metody statycznej:
class KlasaA {
	static int warto��Statyczna = 5;
	int warto��Instancji = 7;
	
	static public void przedstawSi�() {
		System.out.print("jestem KlasaA);
	}
	
	static public void wypiszWarto��() {
		System.out.print(warto��Statyczna);
		System.out.print(warto��Instancji); //B��D! -> atrybut wartos�Instancji nie istnieje dop�ki nie utworzymy
		                                    //         obiektu danej klasy, dlatego nie mo�emy u�ywa� ich w metodzie
		                                    //         statycznej, do kt�rej mamy dost�p bez tworzenia obiekt�w danej klasy
	}
}

KlasaA.przedstawSi�();

//Uwaga! -> w metodach statycznych nie mo�na u�ywa� zwyk�ych atrybut�w.

//Atrybuty statyczne dzia�aj� tak samo jak metody statyczne. Aby korzysta� z atrybut�w statycznych nie potrzebna
//jest instancja danej klasy. Dost�p do nich uzyskuje si� przez nazw� klasy, kt�ra zawiera taki atrybut.
//Przyk�ad:
class Liczba {
	static int warto�� = 5;
}

System.out.print(Liczba.warto��); //wypisze 5

//Atrybuty statyczne s� wsp�lne dla ka�dego obiektu. Nie mo�na w nich przechowywa� indywidualnych w�a�ciwo�ci jak w zwyk�ych
//atrybutach (np. obiekty klasy Kot b�d� mie� inne warto�ci atrybutu rasa).

//WA�NE -> metody statyczne i atrybuty statyczne zwi�zane s� z klas� a nie z obiektem.

//Kiedy nale�y stosowa� metody statyczne? Wtedy kiedy ich wywo�anie nie wi��e si� z operowaniem na indywidualnch elementach
//obiektu. Np. klasa Math wyposa�ona jest w szereg metod staycznych takich jak abs() (wyliczenie warto�ci bezwzgl�dnej),
//rand() (zwraca warto�� losow�) i wiele innych. Metody te nie operuj� na atrybutach klasy Math a na warto�ciach przekazanych
//do tych metod. Innym przyk�adem mo�e by� metoda statyczna, kt�ra generuje kolekcj� obiekt�w swojej klasy (co� jakby dodatkowy
//konstruktor, kt�ry zwraca wiele obiekt�w danej klasy).
//Je�eli operujemy na zwyk�ych atrybutach to musimy u�ywa� te� metod zwyk�ych. Np. klasa String kt�ra posiada atrybut
//reprezentuj�cy ci�g. Dla ka�dego obiektu ci�g ten b�dzie inny co wymusza stosowanie zwyk�ych metod.



//*****************************************************************************
//Metody i atrybuty finalne (sta�e)                                           *
//*****************************************************************************
//Je�eli deklarujemy jaki� element ze s�owem final to oznacza to �e nie mo�e by� zmieniany przez program.
//Przyk�ad:

class DataCzas {
	final int LICZBA_GODZIN = 24;
	
	final public void aktualnaGodzina() {
		//...
	}
}

//W przypadku finalnych atrybut�w pr�ba przypisania innej warto�ci spowoduje b��d. Taki atrybut nazywamy sta��
//i w ramach og�lne konwencji zapisuje si� jej nazw� wielkimi literami.
//W przypadku zadeklarowania metody jako finalnej oznacza to �e nie da si� jej nadpisa� w podklasie.