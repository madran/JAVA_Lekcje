//*****************************************************************************
//Obs³uga plikó³w tekstowych                                                  *
//*****************************************************************************


//File ---> https://docs.oracle.com/javase/7/docs/api/java/io/File.html
//*****************************************************************************
//Podstawowym elementem potzebnym do odczytywania plikó³w jest klasa File, któ³ra
//reprezentuje plik.
File plik = new File("Sciezka/do/pliku.txt");
//Do konstruktora mo¿na przekazac scie¿kê do pliku relatwyn¹ jak i absolutn¹.


//*****************************************************************************
//Œcie¿ka relatywna to œciezka prowadz¹ca od pliku w którym jest zawarta
//do pliku, który chcemy otworzyæ.
//W przypadku projektu w eclipse poprawnym miejsciem dla plików jest
//g³ówny katlog projektu:

//Projekt_1
//|
//|---src
//|   |---ObslugaPlikow.java
//|---kontaky.txt

//W takim przypadku:
File plik = new File("kontaky.txt");
//plik kontakty.txt znajduje siê w tym samym katalogu co ObslugaPlikow.java
//to powinno dzia³¹æ.

//Œcie¿ka absolutna (bezwzglêdna) to œcie¿ka od samego szczytu drzewa katalogów np.:
//"C:/sciezka/do/jakiegos/pliku.txt"
//*****************************************************************************



//Path  ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Path.html
//Paths ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Paths.html
//*****************************************************************************
//Czasami bêdzie potrzebny obiekt klasy Path. Obiekty tej klasy reprezentuj¹ scie¿kê do pliku.
//Klasa ta nie ma konstruktora. Wykorzystuje siê jedynie jej metody statyczne
//(metody statyczhne mo¹na wywo³ywaæ bez tworzenia obiektu danej klasy).
//Sama klasa Path nie dostarcza metody, która by przyjmowa³a do niej przekazan¹ scie¿kê w postaci ci¹gu,
//do tego celu s³u¿y klasa Paths. Klasa Paths dysponuje metod¹ get(), do której przekazuje siê scie¿kê do
//pliku:
Path scieÅ¼ka = Paths.get("sciezka/do/pliku.txt");



//Scaner ---> https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
//*****************************************************************************
//Klasa Scaner s³u¿y do odczytywania (i tylko do odczytywania) danych ze Ÿróde³‚ takich jak
//dane wprowadzanie przez u¿ytkownika, pliki czy ci¹gi (String). Nale¿y do pakietu java.util.
//Klasa Scaner dostarcza metody umo¿liwiaj¹ce rozpoznywanie podstawowych typów danych:

//boolean hasNextLine() - zwraca true je¿eli istnieje nastêpna linia w pliku
//String nextLine() - zwraca kolejn¹ liniê pliku

//boolean hasNext() - zwraca wartoœæ true je¿li nastêpna wartoœæ dowolnego typu jest dostêpna do odczytu.
//String next() - zwraca odczytan¹ nastêpn¹ wartoœæ dowolnego typu.

//boolean hasNextInt() - zwraca wartoœæ true je¿li nastêpna wartoÅ›Ä‡ jest typu Integer.
//int nextInt() - zwraca nastêpn¹ odczytan¹ wartoœæ typu int.

//boolean hasNextDouble() - zwraca wartoœæ true jje¿li nastêpna wartoœæ jest typu Double.
//double nextDouble() - zwraca nastêpn¹ odczytan¹ wartoœæ typu Double.



//Files ---> https://docs.oracle.com/javase/7/docs/api/java/nio/file/Files.html
//*****************************************************************************
//Klasa Files dostarcza szereg statycznych metod (metody statyczne mo¿na wywo³ywaæ
//bez tworzenia obiektu danej klasy), które umo¿liwiaj¹ wykonywanie ró¿nych operacji na plikach.



//£adowanie ca³ych plików do pamiêci /\ ---> u¿ywane gdy mo¿emy za³adowaæ ca³y plik do pamiêci
//                                   ||      (nie jest za du¿y)
//*****************************************************************************
//                            ||
//Buforowane ³adowanie plików \/ ---> u¿ywane do czytania du¿ych plik¿w (np. > 1gb)



//FileReader     ---> https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html
//BufferedReader ---> https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html
//*****************************************************************************
//Klasa FileReader i BufferedReader s³u¿¹ do czytania plików tekstowych w postaci strumienia znaków.
//Umo¿liwia to ³adowanie fragmentu pliku do bufora danych, gdzie jest przetrzymywany. Gdy ten fragment
//pliku nie jest ju¿ potrzebny, to jest usuwany z bufora i zapisywany jest do niego kolejny fragment pliku.
//Dziêki takiemu podejœciu mo¿liwe jest przetwarzenie du¿ych plików, które s¹ zbyt du¿e by za³adowac je
//w ca³oœci do pamiêci RAM.
