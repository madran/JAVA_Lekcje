//*****************************************************************************
//Tablice                                                                     *
//*****************************************************************************
//Zalety:
//*wydajno�� (sta�y czas dost�pu do element�w)
//*wsparcie dla typ�w prostych
//
//Wady:
//*sta�a d�ugo��

//Klasa pomocnicza java.util.Arrays dostarcza szereg metod umo�liwiaj�cych manipulowanie tablicami.
//Posiada takie metody jak:
//binarySearch() - przeszukuje tablic� metod� binarn� (tablica musi by� posortowana by algorytm dzia�a� poprawnie)
//copyOf() - zwraca kopi� przekazanej tablicy
//copyOfRange() - zwraca kopi� z wybranego zakresu przekazanej tablicy
//equals() - por�wnuje tablice
//fill() - wype�nia tablic� przekazan� warto�ci�
//sort() - sortuje tablic�
//Dok�adna dokumentacja:
//https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html



//*****************************************************************************
//Kolekcje                                                                    *
//*****************************************************************************
//https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html

//Struktura klas kolekcji
//*****************************************************************************

//Podstaw� kolekcji w Javie jest interfejs Collection
//https://docs.oracle.com/javase/7/docs/api/java/util/Collection.html
//Jest to interfejs og�lnego przeznaczenia, kt�ry umo�liwia implementacje kolecji dowolnego rodzaju.

//Java zawiera 3 implementacje tego interfejsu w postaci klas HashSet, TreeSet i LinkedHashSet.

//List (lista)
//*****************************************************************************
//Lista to uporz�dkowana kolekcja umo�liwiaj�ca dost�p do elementu poprzez warto�� jego indeksu.
//Umo�liwia dodanie lub usuni�cie elementu w dowolnym miejscu.

//Map
//*****************************************************************************
//Map to interfejs, kt�ry umo�liwia przyporz�dkowywanie warto�ci do klucza.
//Nie mo�na wykorzysta� dwa razy tego samego klucza. Jeden klucz mo�e by� powi�zany z jedn� warto�ci�.
//Przyk�ad:
Map(K, V) collection = new HashMap<K, V>();

Map<String, String> osoba = new HashMap<String, String>();
osoba.put('imi�', 'Kamilka');
osoba.put('nazwisko', 'Struszczak');
osoba.Put('wiek', '18');

Map<String, Integer> wyst�pieniaS��w = new HashMap<String, Integer>();
wyst�pieniaS��w.put('pies', 6);
wyst�pieniaS��w.put('kot', 7);

//https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

//Dwa obiekty klast Map s� takie same gdy posiadaj� identyczne powi�zania klucz warto��.
//Java zawiera 3 implementacje tego interfejsu HashMap, TreeMap i LinkedHashMap

//*****************************************************************************
//Hash table
//Tablica mieszaj�ca to rodzaj strukt�ry umo�liwiaj�cej tworzenie relacji klucz warto��.
//Relacja taka powstaj� dzi�ki funkcji mieszajacej. Umo�liwia ona przeliczenie warto�ci klucza
//na pozycj� w tabeli, w kt�rej zachowana jest warto��. Funkcja mieszaj�ca zwraca t� sam� warto��.
//Przyk�ad:
//Klucz imi� = 'Kamilka'
//funkcjaChaszuj�ca('imi�') -> zwraca 42
//tablica[42] = 'Kamilka'
//*****************************************************************************

//Set (zbi�r)
//*****************************************************************************
//Interfejs Set dziedzyczy po interfejsie Collection. Nie dodaje �adnych nowych metod.
//Podstawow� ide� tej kolekcji jest odwzorowanie dzia�ania zbior�w matematycznych.
//Nie jest mo�liwe te� dodanie do niej dw�ch takich samych element�w.
//Dwa zbiory sa takie same gdy posiadaj� te same elementy.
//Metody dodawania i odejmowania kolekcji dzia�aj� na zaszadzie zbior�w matematycznych (unie, przeci�cie itp.).
//Nie ma mo�liwo�ci wyboru elementu poprzez klucz lub indeks. Zwracanie element�w odbywa si� jedynie przez iteracj�.