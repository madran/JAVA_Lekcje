//*****************************************************************************
//Tablice                                                                     *
//*****************************************************************************
//Zalety:
//*wydajność (stały czas dostępu do elementów)
//*wsparcie dla typów prostych
//
//Wady:
//*stała długość

//Klasa pomocnicza java.util.Arrays dostarcza szereg metod umożliwiających manipulowanie tablicami.
//Posiada takie metody jak:
//binarySearch() - przeszukuje tablicę metodą binarną (tablica musi być posortowana by algorytm działał poprawnie)
//copyOf() - zwraca kopię przekazanej tablicy
//copyOfRange() - zwraca kopię z wybranego zakresu przekazanej tablicy
//equals() - porównuje tablice
//fill() - wypełnia tablicę przekazaną wartością
//sort() - sortuje tablicę
//Dokładna dokumentacja:
//https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html



//*****************************************************************************
//Kolekcje                                                                    *
//*****************************************************************************
//kolekcje można podzielić na dwa sposoby. Na ich rodzaje:
//https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
//oraz na posób w jakie zostały zaimplementowane:
//http://docs.oracle.com/javase/tutorial/collections/implementations/index.html

//Wyróżniamy 5 podstawowych rodzajów kolekcji do kótych zaliczamy:
//*Set (zbiór)
//*List (lista)
//*Queue (kolejka)
//*Deque (kolejka dwókierunkowa)
//*Map (mapa)

//Struktura klas kolekcji
//*****************************************************************************
//Podstawą kolekcji w Javie jest interfejs Collection
//https://docs.oracle.com/javase/7/docs/api/java/util/Collection.html
//Jest to interfejs ogólnego przeznaczenia, który umożliwia implementacje kolecji dowolnego rodzaju.
//Kolejne w hierarchii są interfejsy kolekcji konkretnego rodzaju jak Set, List, Queue i Deque.
//UWAGA!!! Kolekcja Map nie wykorzystuje Interfejsu Collection.
//Prócz samych interfejsów Java zawiera ich implementacje w postaci klas abstrakcyjnych np.:
//*dla Collection będzie AbstractCollection
//*dla List będzie AbstractList
//*itd
//Na samym końcu herarchii klas są implementacje poszczególnych kolekcji takich jak ArrayList, LinkedList,
//HashSet, LinkedHashSet itp.

//Przykładowa hierarchia:
interface Collection 
interface List
abstract class AbstractCollection implements Collection
abstract class AbstractList extends AbstractCollection implements List
class ArrayList extends AbstractList
//Klasa ArrayList dziedziczy po dwóch klasach abstrakcyjnych AbstractCollection i AbstractList oraz implemntuje
//dwa interfejsy Collection oaz List

//Metody implementacji kolekcji
//*****************************************************************************
//***Hash table (tablica mieszająca (nie mylić z klasą HashTable)
//Tablica mieszająca to rodzaj struktóry umożliwiającej tworzenie relacji klucz wartość.
//Relacja taka powstaję dzięki funkcji mieszajacej. Umożliwia ona przeliczenie wartości klucza
//na pozycję w tabeli, w której zachowana jest wartość. Funkcja mieszająca zwraca tą samą wartość.
//Przykład:
//Klucz imię = 'Kamilka';
//int wartość = funkcjaMieszająca('imię');
//tablica[42] = 'Kamilka';
//Instniej możliwość zajścia sytuacji, w której funkcja mieszająca zwróci taką sama wartość
//dla dwóch różnych kluczy. Wtedy mówi sie o konflikcie i jest wiele metod ich rozstrzygania, którymi
//tutaj sie nie zamiemy.

//***Linked list (wskaźniki)
//Linked list to struktóra składająca się z dwóch klas List i ListNode. Pierwsza reprezentuje listę, druga jej elementy.
//Każdy obiekt klasy ListNode zawiera dwa atrybuty, które wskazują na element poprzedni i następny (jeżeli takiego
//nie ma to na NULL); Klasa list posiada atrybut wskazujacy na pierwszy element listy.
//            List head //początek listy
//                  ||
//                  \/
//  NULL <- prev ListNode1 next
//                  /\      ||
//                  ||      \/
//                 prev ListNode2 next
//                         /\      ||
//                         ||      \/
//                        prev ListNode3 next -> NULL
      
//***Tree (drzewa)
//W implemetnacjach kolekcji opartych na drzewach wykorzystuje sie drzewa czerwono-czarne. Jest to rodzaj
//samoorganizującego się binarnego drzewa poszukiwań.

//***Array (tablica)
//Zwykła tablica, która będzie "powiększać się" gdy zabraknie jej elementów. Powiększanie powiększania się tablicy
//polega na utworzeniu nowej większej i skopoiowaniu do niej wartości z wczesniejszej (mniejszej) tablicy.

//Hash table + Linked list
//

//List (lista)
//*****************************************************************************
//Lista to uporządkowana kolekcja umożliwiająca dostęp do elementu poprzez wartość jego indeksu.
//Umożliwia dodanie lub usunięcie elementu w dowolnym miejscu.

//Map
//*****************************************************************************
//Map to interfejs, który umożliwia przyporządkowywanie wartości do klucza.
//Nie można wykorzystać dwa razy tego samego klucza. Jeden klucz może być powiązany z jedną wartością.
//Przykład:
Map(K, V) collection = new HashMap<K, V>();

Map<String, String> osoba = new HashMap<String, String>();
osoba.put('imię', 'Kamilka');
osoba.put('nazwisko', 'Struszczak');
osoba.Put('wiek', '18');

Map<String, Integer> wystąpieniaSłów = new HashMap<String, Integer>();
wystąpieniaSłów.put('pies', 6);
wystąpieniaSłów.put('kot', 7);

//https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

//Dwa obiekty klast Map są takie same gdy posiadają identyczne powiązania klucz wartość.
//Java zawiera 3 implementacje tego interfejsu HashMap, TreeMap i LinkedHashMap

//Set (zbiór)
//*****************************************************************************
//Interfejs Set dziedzyczy po interfejsie Collection. Nie dodaje żadnych nowych metod.
//Podstawową ideą tej kolekcji jest odwzorowanie działania zbiorów matematycznych.
//Nie jest możliwe też dodanie do niej dwóch takich samych elementów.
//Dwa zbiory sa takie same gdy posiadają te same elementy.
//Metody dodawania i odejmowania kolekcji działają na zaszadzie zbiorów matematycznych (unie, przecięcie itp.).
//Nie ma możliwości wyboru elementu poprzez klucz lub indeks. Zwracanie elementów odbywa się jedynie przez iterację.
