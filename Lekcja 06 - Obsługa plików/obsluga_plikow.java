//*****************************************************************************
//Obsługa plików tekstowych                                                   *
//*****************************************************************************


//File ---> https://docs.oracle.com/javase/7/docs/api/java/io/File.html
//*****************************************************************************
//Podstawowym elementem potzebnym do odczytywania plików jest klasa File, która
//reprezentuje plik.
File plik = new File("Sciezka/do/pliku.txt");
//Do konstruktora można przekazac scieżkę relatwyną jak i absolutną do pliku.


//*****************************************************************************
//Ścieżka relatywna to ściezka względna do pliku wykonywalnego.
//W przypadku projektu w eclipse poprawnym miejsciem dla plików jest
//głowny katlog projektu:

//Projekt_1
//│
//├───src
//│   └───ObslugaPlikow.java
//└───kontaky.txt

//W takim przypadku:
File plik = new File("kontaky.txt"); //relatywnie do ObslugaPlikow.java
//to powinno działać.

//Ścieżka absolutna (bezwzględna) to ścieżka od samego szczytu drzewa katalogów np.:
//"C:/sciezka/do/jakiegos/pliku.txt"
//*****************************************************************************



//Path  ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Path.html
//Paths ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Paths.html
//*****************************************************************************
//Czasami będzie potrzebny obiekt klasy Path. Obiekty tej klasy reprezentują scieżkę do pliku.
//Klasa ta nie ma konstruktora. Wykorzystuje się jedynie jej metody statyczne
//(metody statyczhne można wywołać bez tworzenia obiektu danej klasy).
//Sama klasa Path nie dostarcza metody, która by przyjmowała do niej przekazaną scieżkę w postaci ciągu,
//do tego celu służy klasa Paths. Klasa Paths dysponuje metodą get(), do której przekazuje się scieżkę do
//pliku:
Path scieżka = Paths.get("ścieżka/do/pliku.txt");



//Scaner ---> https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
//*****************************************************************************
//Klasa Scaner służy do odczytywania (i tylko do odczytywania) danych ze źródeł takich jak
//dane wprowadzanie przez użytkownika, pliki czy ciągi (String). Należy do pakietu java.util.
//Klasa Scaner dostarcza metody umożliwiające rozpoznywanie podstawowych typów danych:

//boolean hasNextLine() - zwraca true jeżeli istnieje następna linia w pliku
//String nextLine() - zwraca kolejną linię pliku

//boolean hasNext() - zwraca wartość true jeśli następna wartość dowolnego typu jest dostępna do odczytu.
//String next() - zwraca odczytaną następną wartość dowolnego typu.

//boolean hasNextInt() - zwraca wartość true jeśli następna wartość jest typu Integer.
//int nextInt() - zwraca następną odczytaną wartość typu int.

//boolean hasNextDouble() - zwraca wartość true jeśli następna wartość jest typu Double.
//double nextDouble() - zwraca następną odczytaną wartość typu Double.



//Files ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Files.html
//*****************************************************************************
//Klasa Files dostarcza szereg statycznych metod (metody statyczne można wywołać
//bez tworzenia obiektu danej klasy), które umożliwiają wykonywanie różnych operacji na plikach.



//Ładowanie całych plików do pamięci /\ ---> używane gdy możemy załadować cały plik do pamięci
//                                   ||      (nie jest za duży)
//*****************************************************************************
//                            ||
//Buforowane ładowanie plików \/ ---> używane do czytania dużych plików (np. > 1gb)



//FileReader     ---> https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html
//BufferedReader ---> https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html
//*****************************************************************************
//Klasa FileReader i BufferedReader służą do czytania plików tekstowych w postaci strumienia znaków.
//Umożliwia to ładowanie fragmentu pliku do bufora danych, gdzie jest przetrzymywany. Gdy ten fragment
//pliku nie jest już potrzebny, to jest usuwany z bufora i zapisywany jest do niego kolejny fragment pliku.
//Dzięki takiemu podejściu możeliwe jest przetwarzenie dużych plików, które są zbyt duże by załadowac je
//w całości do pamięci RAM.
