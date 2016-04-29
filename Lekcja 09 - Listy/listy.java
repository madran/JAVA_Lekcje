//*****************************************************************************
//Tablice                                                                     *
//*****************************************************************************
//Zalety:
//*wydajnoœæ (sta³y czas dostêpu do elementów)
//*wsparcie dla typów prostych
//
//Wady:
//*sta³a d³ugoœæ

//Klasa pomocnicza java.util.Arrays dostarcza szereg metod umo¿liwiaj¹cych manipulowanie tablicami.
//Posiada takie metody jak:
//binarySearch() - przeszukuje tablicê metod¹ binarn¹ (tablica musi byæ posortowana by algorytm dzia³a³ poprawnie)
//copyOf() - zwraca kopiê przekazanej tablicy
//copyOfRange() - zwraca kopiê z wybranego zakresu przekazanej tablicy
//equals() - porównuje tablice
//fill() - wype³nia tablicê przekazan¹ wartoœci¹
//sort() - sortuje tablicê
//Dok³adna dokumentacja:
//https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html



//*****************************************************************************
//Kolekcje                                                                    *
//*****************************************************************************
//https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html

//Struktura klas kolekcji
//*****************************************************************************

//Podstaw¹ kolekcji w Javie jest interfejs Collection
//https://docs.oracle.com/javase/7/docs/api/java/util/Collection.html
//Jest to interfejs ogólnego przeznaczenia, który umo¿liwia implementacje kolecji dowolnego rodzaju.

//Java zawiera 3 implementacje tego interfejsu w postaci klas HashSet, TreeSet i LinkedHashSet.

//List (lista)
//*****************************************************************************
//Lista to uporz¹dkowana kolekcja umo¿liwiaj¹ca dostêp do elementu poprzez wartoœæ jego indeksu.
//Umo¿liwia dodanie lub usuniêcie elementu w dowolnym miejscu.

//Map
//*****************************************************************************
//Map to interfejs, który umo¿liwia przyporz¹dkowywanie wartoœci do klucza.
//Nie mo¿na wykorzystaæ dwa razy tego samego klucza. Jeden klucz mo¿e byæ powi¹zany z jedn¹ wartoœci¹.
//Przyk³ad:
Map(K, V) collection = new HashMap<K, V>();

Map<String, String> osoba = new HashMap<String, String>();
osoba.put('imiê', 'Kamilka');
osoba.put('nazwisko', 'Struszczak');
osoba.Put('wiek', '18');

Map<String, Integer> wyst¹pieniaS³ów = new HashMap<String, Integer>();
wyst¹pieniaS³ów.put('pies', 6);
wyst¹pieniaS³ów.put('kot', 7);

//https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

//Dwa obiekty klast Map s¹ takie same gdy posiadaj¹ identyczne powi¹zania klucz wartoœæ.
//Java zawiera 3 implementacje tego interfejsu HashMap, TreeMap i LinkedHashMap

//*****************************************************************************
//Hash table
//Tablica mieszaj¹ca to rodzaj struktóry umo¿liwiaj¹cej tworzenie relacji klucz wartoœæ.
//Relacja taka powstajê dziêki funkcji mieszajacej. Umo¿liwia ona przeliczenie wartoœci klucza
//na pozycjê w tabeli, w której zachowana jest wartoœæ. Funkcja mieszaj¹ca zwraca t¹ sam¹ wartoœæ.
//Przyk³ad:
//Klucz imiê = 'Kamilka'
//funkcjaChaszuj¹ca('imiê') -> zwraca 42
//tablica[42] = 'Kamilka'
//*****************************************************************************

//Set (zbiór)
//*****************************************************************************
//Interfejs Set dziedzyczy po interfejsie Collection. Nie dodaje ¿adnych nowych metod.
//Podstawow¹ ide¹ tej kolekcji jest odwzorowanie dzia³ania zbiorów matematycznych.
//Nie jest mo¿liwe te¿ dodanie do niej dwóch takich samych elementów.
//Dwa zbiory sa takie same gdy posiadaj¹ te same elementy.
//Metody dodawania i odejmowania kolekcji dzia³aj¹ na zaszadzie zbiorów matematycznych (unie, przeciêcie itp.).
//Nie ma mo¿liwoœci wyboru elementu poprzez klucz lub indeks. Zwracanie elementów odbywa siê jedynie przez iteracjê.