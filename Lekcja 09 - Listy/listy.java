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
//Kolekcje można podzielić na dwa sposoby. Na ich rodzaje:
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
//UWAGA!!! Kolekcja Map nie wykorzystuje interfejsu Collection.
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
//Każdy rodzaj kolekcji może być zaimplementowany na jeden lub więcej sposobów.
//Podatwowe metody implementacji kolekcji to:

//***Hash table (tablica mieszająca (nie mylić z klasą HashTable)
//Tablica mieszająca to rodzaj struktóry umożliwiającej tworzenie relacji klucz wartość.
//Relacja taka powstaję dzięki funkcji mieszajacej. Umożliwia ona przeliczenie wartości klucza
//na pozycję w tabeli, w której zachowana jest wartość. Funkcja mieszająca musi zwracać zawsze tą samą wartość,
//zależenie od przekazanego do niego klucza.
//Przykład:
//Klucz imię = "Kamilka";
//int wartość = funkcjaMieszająca(imię); //Funkcja mieszająca będzie zwracać zawsze tą samą wartość
                                         //gdy przekażemy do niej ciąg "Kamilka"
//tablica[wartość] = "Kamilka";
//Instniej możliwość zajścia sytuacji, w której funkcja mieszająca zwróci taką sama wartość
//dla dwóch różnych kluczy. Wtedy mówi sie o konflikcie i jest wiele metod ich rozstrzygania, którymi
//tutaj sie nie zajmiemy.

//***Linked list (wskaźniki)
//Linked list to struktóra składająca się z dwóch klas List i ListNode. Pierwsza reprezentuje listę, druga jej elementy.
//Każdy obiekt klasy ListNode zawiera dwa atrybuty, które wskazują na element poprzedni i następny (jeżeli takiego
//nie ma to na NULL). Klasa List posiada atrybut wskazujacy na pierwszy element listy.
//Przykład:
//            List head //wskazuje na początek listy
//                  ||
//                  \/
//  NULL <- prev ListNode1 next
//                  /\      ||
//                  ||      \/
//                 prev ListNode2 next
//                         /\      ||
//                         ||      \/
//                        prev ListNode3 next -> NULL
//
//Listy mogą być jedno lub dwukierunkowe, w Javie są dwukierunkowe.
      
//***Tree (drzewa)
//W implemetnacjach kolekcji opartych na drzewach wykorzystuje sie drzewa czerwono-czarne. Jest to rodzaj
//samoorganizującego się binarnego drzewa przeszukiwań.

//***Array (tablica)
//Zwykła tablica, która będzie "powiększać się" gdy zabraknie jej elementów. Powiększanie się tablicy
//polega na utworzeniu nowej większej i skopoiowaniu do niej wartości z wczesniejszej (mniejszej) tablicy.

//***Hash table + Linked list
//

//(jakiej kolekcji używać)
//http://stackoverflow.com/questions/21974361/what-java-collection-should-i-use

//List (lista)
//*****************************************************************************
//Lista to uporządkowana kolekcja umożliwiająca dostęp do elementu poprzez wartość jego indeksu.
//Umożliwia dodanie lub usunięcie elementu w dowolnym miejscu.
//Istnieją dwie podstawowe implementacje listy ArrayList I LinkedList

//ArrayList
//Implementacja ArrayList oparta jest na tablicy. W sytuacji gdy zaczyna brakować miejsca w tablicy
//to tworzona jest nowa tablica większa (dwa razy?), do której kopiowane są wartosci z mniejszej tablicy.
//Metody:
boolean add(E e)
//Dodaje element typu <E> do listy

void add(int index, E element)
//Dodaje element typu <E> do listy na konkretną pozycję

void clear()
//Usuwa szystkie elementy z listy

boolean contains(Object o)
//Sprawdza czy zawiera przekazany obiekt w liście

E get(int index)
//Zwraca element na pozycji o podanym indeksie

int indexOf(Object o)
//Zwraca wartość indeksu danego obiektu

boolean isEmpty()
//Sparawdza czy lista jest pusta

E remove(int index)
//Usuwa element z listy, który znajduje się na podanej pozycji i zwraca go

protected void removeRange(int fromIndex, int toIndex)
//Usuwa elementy z podanego przedziału

int size()
//Zwraca ilość elementów znajdujących się w liście

Object[] toArray()
//Zwraca tablicę utworzoną na podstawie listy


//Użycie:

List<String> lista = new ArrayList<>();

System.out.println("Początkowy rozmiar listy: " + lista.size());

lista.add("Zielony");
lista.add("Niebieski");
lista.add("Czerwony");

System.out.println("Rozmiar listy po dodaniu elementów: " + lista.size());

System.out.println("Elementy listy: " + lista);
lista.add(1, "Różowy");
System.out.println("Elementy lity po dodaniu różoweg na pozycję 1: " + lista);

System.out.println("Czy lista zawiera element 'Różowy': " + lista.contains("Różowy"));

System.out.println("Na pozycji 2 znajduje się: " + lista.get(2));

System.out.println("Czerwony znajduje się na pozycji: " + lista.indexOf("Czerwony"));

Collections.sort(lista);
System.out.println("Elementy listy po sortowaniu: " + lista);

lista.remove("Czerwony");
lista.remove(0);
System.out.println("Elementy listy po usunięciu dwóch elementów: " + lista);

System.out.println("Czy lista jest pusta: " + lista.isEmpty());


//Map
//*****************************************************************************
//Map to kolekcja, która umożliwia przyporządkowywanie wartości do klucza.
//Nie można wykorzystać dwa razy tego samego klucza. Jeden klucz może być powiązany z jedną wartością.
//Przykład:
Map(K, V) collection = new HashMap<K, V>();

Map<String, String> osoba = new HashMap<String, String>();
osoba.put("imię", "Kamilka");
osoba.put("nazwisko", "Struszczak");
osoba.put("wiek", "18");

//Dodawanie elementu
V put(K key, V value)

//Pobieranie elementu
V get(Object key)

//Usuwanie
V remove(Object key)
boolean	remove(Object key, Object value) //Jeżeli do danego klucza przypisana jest dana wartość

//Czyszczenie kolekcji
void clear();

//Sprawdzanie czy istnieje klucz/wartość
boolean containsKey(Object key)
boolean containsValue(Object value)

//Czy lista jest pusta
boolean isEmpty()

//Liczba elementó
int	size()

Map<String, Integer> wystąpieniaSłów = new HashMap<String, Integer>();
wystąpieniaSłów.put('pies', 6);
wystąpieniaSłów.put('kot', 7);

//https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

//Dwa obiekty klast Map są takie same gdy posiadają identyczne powiązania klucz wartość.
//Java zawiera 3 implementacje tego interfejsu HashMap, TreeMap i LinkedHashMap

//Stack
//*****************************************************************************
//Stack to stos. Stack dziedziczy po klasie Vector a Vector po AbstractList co oznacza, że
//Stack jest implementacją listy. Klasa Vector działa podobnie do klasy ArrayList, różnice dotyczą
//działania w przypadku programów wielowątkowch. Ogólnie Vector jest przestażałą klasą i należy
//stosować ArrayList.

//Dostępne metody:
boolean	empty()
//Sprawdza czy stos jest pusty

E peek()
//Zwraca wartość ze szczytu stosu nie usuwając jej (zerkać).

E pop()
//Zwraca wartość ze szczytu sotsu i usuwa ją (ściąganie wartości ze stosu)

E push(E item)
//Wpycha wartość na szczyt stosu

int	search(Object o)
//Zwraca 1 pozycję na stosie przekazanego obiektu.