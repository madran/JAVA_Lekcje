//Stos (ang. stack)
//*****************************************************************************
//Stos to struktura danych, kt�ra mo�e s�u�y� jako kolekcja. Dost�p do element�w tej kolekcji
//odbywa si� na zasadzie LIFO (last-in first-out) czyli ostatni dodany element
//jest pierwszy pobierany.
//Stos mo�na por�wna� do talii kart, na kt�r� odrzuca si� karty w czasie gry.
//A gdy trzeba pobra� kart�, to bierze sie j� z wierzchu tej talii.
//Charakterystyczne operacje dla stosu to push, kt�ra s�u�y do umieszczania warto�ci
//na szczycie stosu i pop do jej �ci�gania.
//Stos wykorzystuje si� np.: do zapami�tywania kolejnych wykonywanych operacji w jakim� programie.
//Kolejne operacje "wrzucane" s� na stos, gdy chcemy si� cofn�� o kilka operacji, to �ci�gamy je ze stosu.



//Kolejka (ang. queue)
//*****************************************************************************
//Kolejka to struktura danych, kt�ra mo�e s�u�y� jako kolekcja. Dost�p do elemetn�w tej kolekcji
//odbywa si� na zasadzie FIFO (first-in first-out), czyli pierwszy element, kt�ry zosta� dodany
//do kolejki, pierwszy zostanie z niej pobrany.
//Kolejka, jak sama nazwa wskazuje, dzia�a jak kolejka.
//Kolejka mo�e by� wykorzystywana jako bufor danych. Na przyk�ad sp�wyaj�ce zam�wienia ze sklepu
//internetowego s� one realizowane, zgodnie kolejno�ci� w jakiej dociera�y.



//Lista (ang. list)
//*****************************************************************************
//Lista to struktura danych w kt�rej elementy (w�z�y ang. node) tworz� sekwencj�. Ka�dy element tej sekwncji
//zawiera wska�nik na element wyst�puj�cy po nim. W przeciwie�stwie do poprzednich kolekcji mo�liwe jest
//dodawanie i usuwanie element�w w dowolnym miejscu.
//Listy mog� by� jednokierunkowe. Ka�dy element takiej listy wskazuje na elemet nast�puj�cy po nim.
//Listy mog� te� by� dwukierunkowe. W takiej li�cie ka�dy element wskazuje na element nast�puj�cy i poprzedzaj�cy.
//Lista to kolekcja og�lnego przeznaczenia i mo�e by� podstaw� implementacji takich kolekcji jak kolejka i stos.



//Drzewo (ang. tree)
//*****************************************************************************
//Drzew to struktura, kt�ra przedstawia dane w spos�b hierarchiczny. Drzewo sk�ada si� z w�z��w oraz ��cz�cych
//je kraw�dzi. Na samym szczycie drzewa jest w�ze� nazywany korzeniem, natomist w�z�y kt�re nie posiadaj� �adnego
//potomka nazywane sa li��mi.
//Drzewa charakteryzuje wiele w�a�ciwo�ci:
//Ci�g kraw�dzi ��cz�cych w�z�y nazywa si� �cie�k�. Istnieje dok�adnie jedna �cie�ka ��cz�ca korze�
//z ka�dym pozosta�ym wierzcho�kiem. Liczba kraw�dzi w �cie�ce od korzenia do w�z�a jest nazywana d�ugo�ci�.
//Najd�u�sza sciezka wyznacza wysoko�� drzewa. D�ugo�� te� wyznacza poziom drzewa.
//Ka�dy weze� mo�e mie� po��czone z nim inne w꿳y, kt�re nazywa si� dzie�mi. W�ze�, od kt�rego takie po��czenia
//id� (le��cy poziom wy�ej) nazywa si� rodzicem.
//W�z�y tego samego rodzica nazywa si� rodze�stwem.
//Ka�dy w�ze� (nie b�d�cy korzeniem) mo�e by� traktowany jako pocz�tek poddrzewa.
//Charakterystycznem rodzajem drzewa jest drzewo binarne. W takim drzewie ka�dy w�ze� mo�e posiada� najwy�ej dwoje dzieci,
//prawe i lewe. Tego typu drzewa wykorzysuje si� w algorytmach do szybikiego wyszukiwania i sortowania element�w.



