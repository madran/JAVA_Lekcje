//*****************************************************************************
//Dziedziczenie                                                               *
//*****************************************************************************
//Dziedziczenie to relacja typu 'is a' (jest). Mo�na to t�umaczy� na zasadzie, �e BMW jest samochodem czy
//kot jest zwierz�ciem. Jest to relacja, w kt�rej jeden element jest podtypem drugiego np. do og�lnej klasy
//zwierze, bedzie nale�e� konkretny przypadek jakim, jest klasa kot. M�wi�c inaczej klasa kot jest podtypem
//klasy zwierz� (klasa kot dziedziczy wszystkie cechy klasy zwierz� oraz posiada w�asne indywidualne cechy wyr�niaj�ce
//j� spo�r�d innych klas).

//Generalizacja
//*****************************************************************************
//Generalizacja to proces polagaj�cy na wyszukaniu wsp�lnych cech/zachowa� kilku klas i "wyci�gnieciu"
//ich do wsp�lnej klasy. Przyk�ad: mamy szereg klas reprezentj�cych produkty sprzedawane w sklepie internetowym.
//Generalizacja b�dzie polega� na tym, �e wyci�gniemy wsp�lne cechy tych produkt�w, takie jak cena oraz, nazwa
//oraz nr identyfikacyjny.

//Specjalizacja
//*****************************************************************************
//Specjalizacja to proces polegaj�cy na tworzeniu szczeg�lnych przypadk�w dla danej klasy. Np. w systemie
//istnieje klasa U�ytkownik, kt�ra reprezentuje u�ytkownik�w systemu. Z czasem zostaje dodana funkcjonalno��,
//kt�ra b�dzie mog�a by� wykorzystana tylko przez uprzywilejowanych u�ytkownk�w. Dlatego tworzymy wyspecjalizowan�
//klas� U�ytkownikVip, kt�ra posiada cechy identyczne z cechami klasy u�ytkownik oraz w�asne specyficzne
//dla u�ytkownk�w ze statusem vip.

//Realizacja
//*****************************************************************************
//Realizacja do zwi�zek pomi�dzy klas� a interfejsem. Dana klasa realizuje metody zawarte w interfejsie.


//******************************************************************************************************************************
//Kolejne relacje reprezentuj� relacj� typu 'has a' (posiada). Jest to rodzaj relacji, w kt�rej jedna klasa ma dostep do
//metod i atrubut�w innej klasy lub sk�ada si� z tych klas (s� niezb�dne do jej dzia�ania)(relacja cz�� ca�o��).
//Przyk�adem mo�e by� klasa samoch�d, kt�ra sk�ada sie z takich element�w jak silnik czy ko�a.
//Wszytstkie te podzespo�y b�da reprezentowane przez inne klasy, kt�re b�da istnie� wewn�trz klasy samoch�d.
//B�dziemy mogli wtedy m�wi�, �e Samoch�d posiada Silnik itd. 


//*****************************************************************************
//Asocjacja                                                                   *
//*****************************************************************************
//Asocjacja to relacja mi�dzy obiektami, w kt�rej dany obiekt, do realizacji jakiej� metody, potrzebuje funkcji
//dostarczanej przez inny obiekt. W takiej relacji jeden obiekt u�ywa drugiego, jadnak istniej� niezaleznie od
//siebie.

class Autoryzator {
	public int zwr��PoziomDost�pu(Uzytkownik uzytownik) { //autoryzator potrzebuje obiekt uzytkownika aby sprawdzi�
		//...                                               jaki posiada poziom dost�pu
	}
}

class U�ytkownik {
	int id;
	String nazwaU�ytkownika;
	String imi�;
	String nazwisko;
}

User pracownik = new User();
Autoryzator autoryzator = new Autoryzator();

if(autoryzator.zwr��PoziomDost�pu(pracownik) >= 2) {
	//wykonaj to
}



//*****************************************************************************
//Kompozycja                                                                  *
//*****************************************************************************
//Kompozycja to rodzaj relacji, w kt�rej dana klasa sk�ada si� z innych klas (jest posiadaczem innych klas)
//(do jej dzia�ania potrzebne s� inne klasy). Jest to �cis�e powi�zanie
//w kt�rym klasy sk�adowe instniej� tylko wewn�trz klasy g��wnej i nie s� udostepnianie na zewn�trz.
//Kiedy obiekt g��wny zostanie usuni�ty, to usuwane s� obiekty sk�adowe.
//Obiekty sk�adowe w relacji agregacji mo�na traktowa� jako klasy pomocniczne poniwa� nie maj� znaczenia
//w systemie jako niezale�ne elementy.



//*****************************************************************************
//Agregacja                                                                   *
//*****************************************************************************
//Agregacja to relacja podobna do kompozycji, z t� r�nic� �e mi�dzy obiektami nie ma takiego �cis�ego
//powi�zania. Obiekty sk�adowe mog� by� udost�piniane innym obiektom. Ich czas �ycia jest niezalezny
//od czasu �ycia g��wnej klasy (usuni�cie g��wnego obiektu nie oznacza automatycznie usuni�cie obiekt�w
//sk�adowych). Przyk�adem mo�e by� uczelnia na kt�rej s� r�ne wydzia�y. Na tych wydzia�a�ach pracuj�
//profesorowie. Likwidaja wydzia�u przez uczelnie nie oznacza automatycznie zwolnienie jego pracownik�w.



//*****************************************************************************
//Liczno��                                                                    *
//*****************************************************************************
//Liczno�� to dodatkowa informacja wyst�puj�ca w przypadku relacji 'has a'. Odnosi si� do ilo�ci element�w
//bior�ych w niej udzia�.



//*****************************************************************************
//UML                                                                         *
//*****************************************************************************
//UML (Unified Modeling Language) zunifikowany j�zyk modelowania kt�ry s�u�y do tworzenia modeli projektowanych system�w.
//UML dostarcza szereg r�nych rodzaj�w diagram�w umo�liwiaj�cych modelowanie systemu pod wzgl�dem jego struktury czy zachowania.
//Jednym z podstawowych rodzaj�w diagram�w s� diagramy klas, kt�re reprezentuj� relacje mi�dzy klasami.