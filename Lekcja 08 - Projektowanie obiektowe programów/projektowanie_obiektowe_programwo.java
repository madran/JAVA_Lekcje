//*****************************************************************************
//Dziedziczenie                                                               *
//*****************************************************************************
//Dziedziczenie to relacja typu 'is a' (jest). Mo¿na to t³umaczyæ na zasadzie, ¿e BMW jest samochodem czy
//kot jest zwierzêciem. Jest to relacja, w której jeden element jest podtypem drugiego np. do ogólnej klasy
//zwierze, bedzie nale¿eæ konkretny przypadek jakim, jest klasa kot. Mówi¹c inaczej klasa kot jest podtypem
//klasy zwierzê (klasa kot dziedziczy wszystkie cechy klasy zwierzê oraz posiada w³asne indywidualne cechy wyró¿niaj¹ce
//j¹ spoœród innych klas).

//Generalizacja
//*****************************************************************************
//Generalizacja to proces polagaj¹cy na wyszukaniu wspólnych cech/zachowañ kilku klas i "wyci¹gnieciu"
//ich do wspólnej klasy. Przyk³ad: mamy szereg klas reprezentj¹cych produkty sprzedawane w sklepie internetowym.
//Generalizacja bêdzie polegaæ na tym, ¿e wyci¹gniemy wspólne cechy tych produktów, takie jak cena oraz, nazwa
//oraz nr identyfikacyjny.

//Specjalizacja
//*****************************************************************************
//Specjalizacja to proces polegaj¹cy na tworzeniu szczególnych przypadków dla danej klasy. Np. w systemie
//istnieje klasa U¿ytkownik, która reprezentuje u¿ytkowników systemu. Z czasem zostaje dodana funkcjonalnoœæ,
//która bêdzie mog³a byæ wykorzystana tylko przez uprzywilejowanych u¿ytkownków. Dlatego tworzymy wyspecjalizowan¹
//klasê U¿ytkownikVip, która posiada cechy identyczne z cechami klasy u¿ytkownik oraz w³asne specyficzne
//dla u¿ytkownków ze statusem vip.

//Realizacja
//*****************************************************************************
//Realizacja do zwi¹zek pomiêdzy klas¹ a interfejsem. Dana klasa realizuje metody zawarte w interfejsie.


//******************************************************************************************************************************
//Kolejne relacje reprezentuj¹ relacjê typu 'has a' (posiada). Jest to rodzaj relacji, w której jedna klasa ma dostep do
//metod i atrubutów innej klasy lub sk³ada siê z tych klas (s¹ niezbêdne do jej dzia³ania)(relacja czêœæ ca³oœæ).
//Przyk³adem mo¿e byæ klasa samochód, która sk³ada sie z takich elementów jak silnik czy ko³a.
//Wszytstkie te podzespo³y bêda reprezentowane przez inne klasy, które bêda istnieæ wewn¹trz klasy samochód.
//Bêdziemy mogli wtedy mówiæ, ¿e Samochód posiada Silnik itd. 


//*****************************************************************************
//Asocjacja                                                                   *
//*****************************************************************************
//Asocjacja to relacja miêdzy obiektami, w której dany obiekt, do realizacji jakiejœ metody, potrzebuje funkcji
//dostarczanej przez inny obiekt. W takiej relacji jeden obiekt u¿ywa drugiego, jadnak istniej¹ niezaleznie od
//siebie.

class Autoryzator {
	public int zwróæPoziomDostêpu(Uzytkownik uzytownik) { //autoryzator potrzebuje obiekt uzytkownika aby sprawdziæ
		//...                                               jaki posiada poziom dostêpu
	}
}

class U¿ytkownik {
	int id;
	String nazwaU¿ytkownika;
	String imiê;
	String nazwisko;
}

User pracownik = new User();
Autoryzator autoryzator = new Autoryzator();

if(autoryzator.zwróæPoziomDostêpu(pracownik) >= 2) {
	//wykonaj to
}



//*****************************************************************************
//Kompozycja                                                                  *
//*****************************************************************************
//Kompozycja to rodzaj relacji, w której dana klasa sk³ada siê z innych klas (jest posiadaczem innych klas)
//(do jej dzia³ania potrzebne s¹ inne klasy). Jest to œcis³e powi¹zanie
//w którym klasy sk³adowe instniej¹ tylko wewn¹trz klasy g³ównej i nie s¹ udostepnianie na zewn¹trz.
//Kiedy obiekt g³ówny zostanie usuniêty, to usuwane s¹ obiekty sk³adowe.
//Obiekty sk³adowe w relacji agregacji mo¿na traktowaæ jako klasy pomocniczne poniwa¿ nie maj¹ znaczenia
//w systemie jako niezale¿ne elementy.



//*****************************************************************************
//Agregacja                                                                   *
//*****************************************************************************
//Agregacja to relacja podobna do kompozycji, z t¹ ró¿nic¹ ¿e miêdzy obiektami nie ma takiego œcis³ego
//powi¹zania. Obiekty sk³adowe mog¹ byæ udostêpiniane innym obiektom. Ich czas ¿ycia jest niezalezny
//od czasu ¿ycia g³ównej klasy (usuniêcie g³ównego obiektu nie oznacza automatycznie usuniêcie obiektów
//sk³adowych). Przyk³adem mo¿e byæ uczelnia na której s¹ ró¿ne wydzia³y. Na tych wydzia³a³ach pracuj¹
//profesorowie. Likwidaja wydzia³u przez uczelnie nie oznacza automatycznie zwolnienie jego pracowników.



//*****************************************************************************
//Licznoœæ                                                                    *
//*****************************************************************************
//Licznoœæ to dodatkowa informacja wystêpuj¹ca w przypadku relacji 'has a'. Odnosi siê do iloœci elementów
//bior¹ych w niej udzia³.



//*****************************************************************************
//UML                                                                         *
//*****************************************************************************
//UML (Unified Modeling Language) zunifikowany jêzyk modelowania który s³u¿y do tworzenia modeli projektowanych systemów.
//UML dostarcza szereg ró¿nych rodzajów diagramów umo¿liwiaj¹cych modelowanie systemu pod wzglêdem jego struktury czy zachowania.
//Jednym z podstawowych rodzajów diagramów s¹ diagramy klas, które reprezentuj¹ relacje miêdzy klasami.