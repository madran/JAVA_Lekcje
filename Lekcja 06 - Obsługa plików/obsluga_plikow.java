//*****************************************************************************
//Obs�uga plik�w tekstowych                                                  *
//*****************************************************************************


//File ---> https://docs.oracle.com/javase/7/docs/api/java/io/File.html
//*****************************************************************************
//Podstawowym elementem potzebnym do odczytywania plik�w jest klasa File, kt�ra
//reprezentuje plik.
File plik = new File("Sciezka/do/pliku.txt");
//Do konstruktora mo�na przekazac scie�k� do pliku relatwyn� jak i absolutn�.


//*****************************************************************************
//�cie�ka relatywna to �ciezka prowadz�ca od pliku w kt�rym jest zawarta
//do pliku, kt�ry chcemy otworzy�.
//W przypadku projektu w eclipse poprawnym miejsciem dla plik�w jest
//g��wny katlog projektu:

//Projekt_1
//|
//|---src
//|   |---ObslugaPlikow.java
//|---kontaky.txt

//W takim przypadku:
File plik = new File("kontaky.txt");
//plik kontakty.txt znajduje si� w tym samym katalogu co ObslugaPlikow.java
//to powinno dzia���.

//�cie�ka absolutna (bezwzgl�dna) to �cie�ka od samego szczytu drzewa katalog�w np.:
//"C:/sciezka/do/jakiegos/pliku.txt"
//*****************************************************************************



//Path  ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Path.html
//Paths ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Paths.html
//*****************************************************************************
//Czasami b�dzie potrzebny obiekt klasy Path. Obiekty tej klasy reprezentuj� scie�k� do pliku.
//Klasa ta nie ma konstruktora. Wykorzystuje si� jedynie jej metody statyczne
//(metody statyczhne mo�na wywo�ywa� bez tworzenia obiektu danej klasy).
//Sama klasa Path nie dostarcza metody, kt�ra by przyjmowa�a do niej przekazan� scie�k� w postaci ci�gu,
//do tego celu s�u�y klasa Paths. Klasa Paths dysponuje metod� get(), do kt�rej przekazuje si� scie�k� do
//pliku:
Path scieżka = Paths.get("sciezka/do/pliku.txt");



//Scaner ---> https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
//*****************************************************************************
//Klasa Scaner s�u�y do odczytywania (i tylko do odczytywania) danych ze �r�de�� takich jak
//dane wprowadzanie przez u�ytkownika, pliki czy ci�gi (String). Nale�y do pakietu java.util.
//Klasa Scaner dostarcza metody umo�liwiaj�ce rozpoznywanie podstawowych typ�w danych:

//boolean hasNextLine() - zwraca true je�eli istnieje nast�pna linia w pliku
//String nextLine() - zwraca kolejn� lini� pliku

//boolean hasNext() - zwraca warto�� true je�li nast�pna warto�� dowolnego typu jest dost�pna do odczytu.
//String next() - zwraca odczytan� nast�pn� warto�� dowolnego typu.

//boolean hasNextInt() - zwraca warto�� true je�li nast�pna wartość jest typu Integer.
//int nextInt() - zwraca nast�pn� odczytan� warto�� typu int.

//boolean hasNextDouble() - zwraca warto�� true jje�li nast�pna warto�� jest typu Double.
//double nextDouble() - zwraca nast�pn� odczytan� warto�� typu Double.



//Files ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Files.html
//*****************************************************************************
//Klasa Files dostarcza szereg statycznych metod (metody statyczne mo�na wywo�ywa�
//bez tworzenia obiektu danej klasy), kt�re umo�liwiaj� wykonywanie r�nych operacji na plikach.



//�adowanie ca�ych plik�w do pami�ci /\ ---> u�ywane gdy mo�emy za�adowa� ca�y plik do pami�ci
//                                   ||      (nie jest za du�y)
//*****************************************************************************
//                            ||
//Buforowane �adowanie plik�w \/ ---> u�ywane do czytania du�ych plik�w (np. > 1gb)



//FileReader     ---> https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html
//BufferedReader ---> https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html
//*****************************************************************************
//Klasa FileReader i BufferedReader s�u�� do czytania plik�w tekstowych w postaci strumienia znak�w.
//Umo�liwia to �adowanie fragmentu pliku do bufora danych, gdzie jest przetrzymywany. Gdy ten fragment
//pliku nie jest ju� potrzebny, to jest usuwany z bufora i zapisywany jest do niego kolejny fragment pliku.
//Dzi�ki takiemu podej�ciu mo�liwe jest przetwarzenie du�ych plik�w, kt�re s� zbyt du�e by za�adowac je
//w ca�o�ci do pami�ci RAM.
