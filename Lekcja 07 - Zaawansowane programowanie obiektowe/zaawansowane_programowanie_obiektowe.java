//*****************************************************************************
//Dziedziczenie                                                               *
//*****************************************************************************
//Dziedziczenie to podstawowy mechanizm zwi¹zany z programowaniem obiektowym.
//Polega on na tym, ¿e jedna klasa mo¿e dziedziczyæ atrybuty oraz metody od innej klasy.
//Przyk³ad:
class Pojazd {
	public String rodzaj;
	
	public void uruchomSilinik();
}

class Samochód extends Pojazd {
	public String model; //Obiekty klasy Samochód bêd¹ posiadaæ atrybut rodzaj oraz metodê uruchomSilnik()
}

Samochód bmw = new Samochód();
bmw.rodzaj = "du¿y";
bmw.uruchomSilnik();

//'Samochód extends Pojazd' oznacza ¿e klasa Samochód dziedziczy po klasie Pojazd
//(klasa Samochód rozszerza klase Pojazd).
//W takiej relacji klasê, która dziedziczy, nazywa siê podklas¹
//a klasê po której jest dziedziczone nadklas¹ (superklas¹ ang. superclass).

//UWAGA! -> Dana klasa moze dziedziczyæ jedynie po jednej klasie.

//Dziedziczenie wykorzystuje siê gdy chcemy wykorzystaæ implementacjê jednej klasy (jej kod) w innej.
//Np. mo¿emy miec w systemie klasê U¿ytkownik, która posiada jakiœ zestaw atrybutów i metod
//oraz klasê U¿ytkownikVIP, która bêdzie posiadaæ identyczne metody i atrybuty co klasa U¿ytkownik
//oraz jakieœ dodatkowe atrybuty i metody przeznaczone tylko dla u¿ytkowników ze statusem vipa.
//Dziêki dziedziczeniu unikamy koniecznoœci powielania tych samych metod w obu klasach.


//Nadpisywanie metod nadklasy
//*****************************************************************************
//Je¿eli zadeklarujemy w podklasie metodê, któr¹ dziedziczy po nadklasie to przes³oni ona dziedziczon¹ metodê:
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


//Wywo³ywanie metod nadklasy
//*****************************************************************************
//Mo¿lilwe jest wywo³ywanie metod nadklasy w podklasie. Wykorzystuje siê do tego s³owo super
class B extends A {
	public void wypisz() {
		super.wypisz(); //wywo³anie meotdy wypisz() zaimplementowanej w klasie A
	}
}

B b = new B();
b.wypisz() // -> Wypisze "Jestem klasa A"

//Wszystkie klasy (te utworzone przez u¿ytkownika te¿) dziedzicz¹ po klasie Object (mimo ¿e tego nie widaæ).


//Konstruktor w dziedziczeniu
//*****************************************************************************
//Aby wywo³aæ konstruktor nadklasy w podklasie równiez u¿ywa siê s³owa super:
class A {
	A(int parametr) {
		//...
	}
}
class B extends A {
	B(int parametr) {
		super(parametr); //wywo³anie konstruktora klasy A
	}
}

//Konstruktor nadklasy zawsze jest wywo³ywany w podklasie.
//Wywo³anie konstruktora nadklasy musi nast¹piæ w pierwszej linijce konstruktora podklasy.
//(konstruktory nie s¹ dziedziczone)
//Je¿eli tego nie zrobimy to zrobi to za nas kompilator.
//Je¿eli konstruktor nadklasy ma parametry a my go nie wywo³amy w podklasie z tymi
//parametrami (lub wcale go nie wywo³amy) to bêdzie b³¹d.


//Hierarchia typów
//*****************************************************************************
//Kiedy wykorzystujemy dziedziczenie to nie tylko udostêpniamy metody i atrybuty nadklasy podklasie
//ale i równiez tworzymy heriarchê typów.
//Oznacza to ¿e w przypadku klasy Pojazd oraz Samochód bêdziemy mogli mówiæ ¿e typ Samochód jest podtypem klasy Pojazd.
//Podtypy umo¿liwiaj¹ nam taki zapis:

class Pojazd {
	public String rodzaj;
	
	public void uruchomSilinik() {
		//...
	}
}

class Samochód extends Pojazd {
	public String model;
	
	public void model() { System.out.print(model); )
}

Pojazd samochód = new Samochód();

//Mo¿liwe jest przypisanie obiektu klasy Samochód do zmiennej typu Pojazd poniewa¿ ka¿dy Samochód
//jest pewnym rodzajem Pojazdu. Relacja ta nie dzia³a w druga stronê poniewa¿ nie ka¿dy Pojazd musi byæ Samochodem
//(np. innym rodzajem Pojazdu mo¿e byæ Motor).

//UWAGA!!!
//Przypisuj¹c obiekt podklasy do zmiennej typu nadklasy, tracimy dostêp do tych metod podklasy jakie nie
//zosta³y zadeklarowane w nadklasie.

Pojazd samochód = new Samochód();
samochód.model() //LE -> klasa pojazd nie zawera metody model() dlatego nie mo¿e byæ wywo³ana



//*****************************************************************************
//Kontrola dostêpu do elementów obiektu                                       *
//*****************************************************************************
//Deklaruj¹c metody i atrybuty mo¿na dodaæ modyfikator dostêpu, który okreœla kiedy mo¿emy
//skorzystaæ z danej metody lub atrybutu. Istniej¹ cztery poziomy dostepu:
//----------------------------------------------------------------------
//|modyfikatory|wewn¹trz klasy|w pakiecie|w podklasie|w dowolnej klasie|
//|------------|--------------|----------|-----------|-----------------|
//|public      |       +      |     +    |     +     |        +        | element publiczny
//|protected   |       +      |     +    |     +     |        -        | element chroniony
//|(brak)      |       +      |     +    |     -     |        -        |
//|private     |       +      |     -    |     -     |        -        | element prywatny
//----------------------------------------------------------------------
//Pierwsza kolumna 4 rodzaje modyfikatorów (przy czym 'brak' oznacza deklaracjê bez modyfikatora).
//Druga kolumna okreœla czy mo¿na wywo³ywaæ motedy/atrybuty wewn¹trz klasy w której zosta³y zadeklarowane.
//Trzecia kolumna okreœla czy mo¿na wywo³ywaæ motedy/atrybutu w tym samym pakiecie.
//(innych klasach nale¿¹cych do tego samego pakietu) 
//Czwarta kolumna okreœla czy mo¿na wywo³ywaæ metody/atrybutu przez podklasy.
//Pi¹ta kolumna okreœla czy mo¿na wywo³ywaæ metody/atrybutu w dowolnej klasie.

//(Metody/atrybuty prywatne jak i bez modyfikatora nie s¹ dziedziczone.)

//Przyk³ady
class Przodek {
	private int szyfrDoSejfu = 554877459;
	protected String rodzinnaTajemnica = "sejf w piwnicy";
	
	String masz = "to";
	
	public zdradŸSzyfr() {
		return szyfrDoSejfu;
	}
}

class Potomek extends Przodek {
	public obwieszczenie = "dsdfdsa";
	
	public String zdradŸRodzinn¹Tajemnicê() {
		return rodzinnaTajemnica;
	}
}

Przodek edek = new Przodek();
Potomek tomek = new Potomek();

System.out.print(edek.szyfrDoSejfu); //B£¥D! -> atrybut szyfrDoSejfu jest prywatny i nie mo¿e byæ u¿ywany poza klas¹

System.out.print(edek.rodzinnaTajemnica); //UWAGA! -> rodzinnaTajemnica jest choroniona i mo¿na uzyskaæ do niej dostep
                                          //          w tym samym pakiecie, w przciwnym wypadku jest to b³¹d.

System.out.print(edek.zdradŸSzyft()); //DOBRZE! -> metoda zdradŸSzyfr() jest publiczna i mo¿na j¹ wywo³aæ w dowolnym miejscu
                                      //           (metoda ta zwraca wartoœæ prywatn¹, jest to mo¿liwe poniewa¿ nie uzyskujemy
                                      //           do niej dostêpu bezpoœrednio a zwracamy jej wartoœæ poprzez metodê)
                                      //           (prywatny atrybut i zwracaj¹ca metoda nale¿¹ do tej samej klasy)

System.out.print(tomek.obiwieszczenie) //DOBRZE! -> atrybut obiwieszczenie jest publiczny i mo¿na uzyskoaæ do niego dostêp
                                       //           w dowolnym miejscu

System.out.print(tomek.zdradŸRodzinn¹Tajemnicê()) //DOBRZE! -> zdradŸRodzinn¹Tajemnicê() jest metod¹ publiczn¹ i mo¿e byæ u¿yta
                                                  //           w dowolnym miejscu. Zwraca ona atrybut chroniony nale¿¹cy do Nadklasy
                                                  //           jednak wszystkie elementy chronione s¹ widoczne w Podklasie

System.out.print(tomek.zdradŸSzyfr()) //DOBRZE! -> metoda zdradŸSzyfr() jest publiczna i dziedziczona z Nadklasy

System.out.print(tomek.masz) //B£¥D! -> atrybut masz nie jest dziedziczony


//Hermetyzacja
//*****************************************************************************
//Modyfikatory dostêpu do elementów obiektu umo¿liwiaj¹ budowanie tak zwanego interfejsu programistycznego
//(ang. application programming interface (API)). API to procedury, struktury danych oraz protoko³y
//komunikacyjne, dzieki którym programy moga komunikowaæ siê ze sob¹.
//Za interfejs programistyczny bêdziemy m. in. uznawaæ wszystkie metody publiczne danej klasy. Publiczne, poniwa¿
//tylko one bêd¹ mog³y byæ wywo³ywane poza klas¹ i poza pakietem w jakim siê znajduj¹.
//Metody oraz atrybuty prywatne czy chronione s¹ ukryte przed "œwiatem zewnêtrznym" (nie s¹ widoczne poza klas¹ czy pakietem). 
//Takie elementy klas stanowi¹ t¹ czêœæ implementacji ró¿nych procedur, do których inne programy (i programista)
//nie powinien mieæ dostêpu.
//Wszystkie atrybuty powinny byæ prywatne lub chronione. Chroni to dane przed modyfikacj¹ ich wartoœci 
//bez naszej kontroli (wartoœæ atrybutów bêdzie siê zmieniaæ w wyniku operacji wykonywanych przez
//metody a nie przez bespoœredni do nich dostêp).

//Metody prywatne pos³u¿¹ do tworzenia czytelnej struktury klasy. Mog¹ pos³u¿yæ do wydzielenia
//powtarzanego kodu w wielu metodach, oraz do dzielenia metody publicznej na kilka mniejszych (prywatnych)
//metod, co u³atwi jej czytanie i zrozumienie.

//Przyk³ady:
class RównanieKwadratowe {
	public int[] obliczRównanieKwadratowe() { // \
		int[] wynik = new int[2];             // |
		int delta;                            // |
		                                      // \   Obliczanie równania kwadratowego sk³ada siê z kilku etapów,
		delta = liczDeltê();                  //  \  dlatego mo¿na podziliæ metodê obliczRównanieKwadratowe()
		wynik[0] = liczX1(delta);             //  /  na kilka prwatnych metod.
		wynik[1] = liczX2(delta);             // /
		                                      // |
		return wynik;                         // |
	}                                         // /
	
	private int liczDeltê() {}
	private int liczX1(int delta) {}
	private int liczX2(int delta) {}
}

//Hermetyzacja (enkapsulacja z ang. encapsulation) to pojêcie nazywaj¹ce ukrywanie danych przed mo¿liwoœæi¹ ich
//bezpoœredniego modyfikowania i udostêpnienie metod, które bêd¹ to robiæ.

class KontoBankowe {
	private int stanKonta;
	
	public int sprawdŸDostêpneŒrodki() {
		return stanKonta;
	}
	
	public int dodajŒrodki(int iloœæ) {
		stanKonta = stanKonta + iloœæ;
	}
}

//Mutatory i selektory
//*****************************************************************************
//Mutatory (ang. setters) i seletory (ang. getters) (inczej okreœla siê je jako akcesory ang. accessors)
//to standardowa praktyka w przypadku uzyskiwania dostepu do prywatnych atrybutów klasy.
//Stosuje siê w klasach, które s¹ jedynie kontenerami dla danych (nie wykonuj¹ operacji na tych danych).
//Przyk³ad:
class U¿ytkownik {
	String imiê;
	String nazwisko;
	String email;
	
	String getImiê() {
		return imiê;
	}
	
	void setImiê(String _imiê) {
		imiê = _imiê;
	}
	
	//...
}

//Klasy, które nie s¹ jedynie kontenerami dla danych (wyoknuj¹ na nich bardziej z³o¿one operacje) równie¿ mog¹ posiadaæ
//akcesory. Jednak w takim przypadku powinno nadawaæ siê im bardziej opisowe nazwy (przyk³ad KontoBankowe).





//*****************************************************************************
//Klasy abstrakcyjne                                                          *
//*****************************************************************************
//Klasa abstrakcyjna to specjalny rodzaj klasy, przy u¿yciu której nie da siê tworzyæ obiektów.
//Posiada jednak takie same mo¿liwoœci jak klasy normalne.
//U¿ywana jest jako nadklasa dla zwyk³ych klas dziedzicz¹cych po niej.
//Deklarujê siê j¹ przy u¿yciu s³owa abstract:
abstract class User {}
class NormalUser extends User {}
class VipUser extends User {}

//Klasa abstrakcyjna mo¿e byæ wyposa¿ona w metody abstrakcyjne. Metodê deklaruje siê
//jako abstrakcyjn¹, je¿eli ka¿da podklasa powinna mieæ w³asn¹ implementacjê tej metody.
//(kazda klasa potomna bedzie posiadaæ inna implementacjê tej metody i jedna wspó³na
//nie istnieje/nie jest potrzebna). Je¿eli w pdklasie nie zaimplementuje siê funkcji
//abstrakcyjnej to pojawi siê b³¹d.
abstract class Zwierze {
	public void siadaj() {
		//implementacja
	}
	
	public abstract void dajG³os(); //Ka¿da podklasa klasy Zwierze musi mieæ w³asn¹ implementacjê metody dajG³os()
}

class Pies extends Zwierze {
	public void dajG³os() {
		System.out.print("Hau, hau");
	}
}

class Kot extends Zwierze {
	public void dajG³os() {
		System.out.print("Miau, miau");
	}
}

//Klasy abstrakcyjnej bêdziemy przewa¿nie u¿ywaæ gdy chcemy aby powi¹zane ze sob¹ klasy dziedziczy³y wspólny kod
//(je¿eli klasy dziedzicz¹ce po klasie abstrakcyjnej miaj¹ wiele wspólnych metod i atrybutów).



//*****************************************************************************
//Interfejsy                                                                  *
//*****************************************************************************
//Interfejsy to struktury podobne do klas z t¹ ro¿nic¹, ¿e zawieraj¹ jedynie sta³e oraz
//deklaracje metod.
//Nie jest równiez mo¿liwe tworzenie instancji interfejsu.
//Domyœlnie wszystkie metody w interfejsie s¹ publiczne.
//Przyk³ad:
interface Kolekcja<T> {         // \   Nazwê interfejsu poprzedzamy s³owem interface
	boolean dodaj(T element);   // |   Deklaracje metod nie maja cia³a w nawiasach klamorowych
	T pobierz(int indeks);      //  >  i s¹ dzielone œrednikiem.
	void usun(index);           // |
	void wyczyœæ();             // /
}

//Poni¿sza deklaracja oznacza ¿e klasa Lista impelemntuje wszystkie metody zadeklarowane w interfejsie Kolekcja
//(wszystkie metody musz¹ byæ zaimplementowane w klasie Lista).
class Lista implements Kolekcja {
	//implementacja wszystkich metod z interfejsu Kolekcja
}

//Klasa mo¿e implementowaæ wiele interfejsów:

class Klasa implements Interfejs1, Interfejs2, Interfejs3 {
	//..
}

//Mo¿na ³¹czyæ dziedziczenie z interfejsami

class Klasa extends SuperKlasa implements Interfejs1, Interfejs2, Interfejs3 {
	//..
}

//Interfejsy bêd¹ u¿ywane gdy chcemy aby niepowi¹zane ze sob¹ klasy posiada³y ten sam zestaw metod
//realizuj¹cych konkretne zadanie. Interfejs bêdzie wymusza³ jakieœ zachowanie (zestaw metod), jednak nie jest
//istotne to jakie klasy b¹d¹ go implementowaæ. Mo¿e byæ równiez traktowany jako metoda na wielodziedziczenie.


//*****************************************************************************
//Podtypy i polimifrizm                                                       *
//*****************************************************************************
//Tak samo jak w przypadku klas tak i interfejsów klasa implementuj¹ca interfejs staje siê podtypem,
//dlatego mo¿liwy jest taki zapis:

Lista lista1 = new Lista();
Kolekcja lista2 = new Lista();

//Tak samo te¿ dla obiektu zapisanym w zmiennej lista2 iloœæ metod ograniczona jest do tych zawartych w klasie Kolekcja
//pomimo ¿e przypisujemy do tej zmiennej obiekt klasy Lista.

//Takie zjawisko nazywane jest polimorfizmem. Jest to wa¿ny mechanizm w programowaniu obiektowym.
//Przyj³ad:

interface Daj¹cySiêNarysowaæObiekt {
	void rysuj();
}

class Kwadrat implements Daj¹cySiêNarysowaæObiekt {
	void rysuj() {
		//implementacja
	}
}

class Trójk¹t implements Daj¹cySiêNarysowaæObiekt {
	void rysuj() {
		//implementacja
	}
}

class SilnikGraficzny {
	ArrayList<Daj¹cySiêNarysowaæObiekt> obiekty = new ArrayList<Daj¹cySiêNarysowaæObiekt>
	
	void dodajObiekt(Daj¹cySiêNarysowaæObiekt obiekt) {
		obiekty.add(obiekt);
	}
	
	void renderujObraz() {
		for(Daj¹cySiêNarysowaæObiekt obiekt : obiekty) {
			obiekt.rysuj();
		}
	}
}

SilnikGraficzny silnik = new SilnikGraficzny;
Daj¹cySiêNarysowaæObiekt kwadrat = new Kwadrat();
Daj¹cySiêNarysowaæObiekt trójk¹t = new Trójk¹t();

silnik.dodajObiekt(kwadrat);
silnik.dodajObiekt(trójk¹t);
silnik.renderujObraz()



//*****************************************************************************
//Metody i atrybuty statyczne                                                 *
//*****************************************************************************
//Metoda statyczna to metoda, któr¹ mo¿na wywo³aæ bez koniecznoœci tworzenia instancji danej klasy.
//Deklaracja metody statycznej:
class KlasaA {
	static int wartoœæStatyczna = 5;
	int wartoœæInstancji = 7;
	
	static public void przedstawSiê() {
		System.out.print("jestem KlasaA);
	}
	
	static public void wypiszWartoœæ() {
		System.out.print(wartoœæStatyczna);
		System.out.print(wartoœæInstancji); //B£¥D! -> atrybut wartosæInstancji nie istnieje dopóki nie utworzymy
		                                    //         obiektu danej klasy, dlatego nie mo¿emy u¿ywaæ ich w metodzie
		                                    //         statycznej, do której mamy dostêp bez tworzenia obiektów danej klasy
	}
}

KlasaA.przedstawSiê();

//Uwaga! -> w metodach statycznych nie mo¿na u¿ywaæ zwyk³ych atrybutów.

//Atrybuty statyczne dzia³aj¹ tak samo jak metody statyczne. Aby korzystaæ z atrybutów statycznych nie potrzebna
//jest instancja danej klasy. Dostêp do nich uzyskuje siê przez nazwê klasy, która zawiera taki atrybut.
//Przyk³ad:
class Liczba {
	static int wartoœæ = 5;
}

System.out.print(Liczba.wartoœæ); //wypisze 5

//Atrybuty statyczne s¹ wspólne dla ka¿dego obiektu. Nie mo¿na w nich przechowywaæ indywidualnych w³aœciwoœci jak w zwyk³ych
//atrybutach (np. obiekty klasy Kot bêd¹ mieæ inne wartoœci atrybutu rasa).

//WA¯NE -> metody statyczne i atrybuty statyczne zwi¹zane s¹ z klas¹ a nie z obiektem.

//Kiedy nale¿y stosowaæ metody statyczne? Wtedy kiedy ich wywo³anie nie wi¹¿e siê z operowaniem na indywidualnch elementach
//obiektu. Np. klasa Math wyposa¿ona jest w szereg metod staycznych takich jak abs() (wyliczenie wartoœci bezwzglêdnej),
//rand() (zwraca wartoœæ losow¹) i wiele innych. Metody te nie operuj¹ na atrybutach klasy Math a na wartoœciach przekazanych
//do tych metod. Innym przyk³adem mo¿e byæ metoda statyczna, która generuje kolekcjê obiektów swojej klasy (coœ jakby dodatkowy
//konstruktor, który zwraca wiele obiektów danej klasy).
//Je¿eli operujemy na zwyk³ych atrybutach to musimy u¿ywaæ te¿ metod zwyk³ych. Np. klasa String która posiada atrybut
//reprezentuj¹cy ci¹g. Dla ka¿dego obiektu ci¹g ten bêdzie inny co wymusza stosowanie zwyk³ych metod.



//*****************************************************************************
//Metody i atrybuty finalne (sta³e)                                           *
//*****************************************************************************
//Je¿eli deklarujemy jakiœ element ze s³owem final to oznacza to ¿e nie mo¿e byæ zmieniany przez program.
//Przyk³ad:

class DataCzas {
	final int LICZBA_GODZIN = 24;
	
	final public void aktualnaGodzina() {
		//...
	}
}

//W przypadku finalnych atrybutów próba przypisania innej wartoœci spowoduje b³¹d. Taki atrybut nazywamy sta³¹
//i w ramach ogólne konwencji zapisuje siê jej nazwê wielkimi literami.
//W przypadku zadeklarowania metody jako finalnej oznacza to ¿e nie da siê jej nadpisaæ w podklasie.