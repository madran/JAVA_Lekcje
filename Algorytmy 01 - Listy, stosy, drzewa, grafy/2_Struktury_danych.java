//Stos (ang. stack)
//*****************************************************************************
//Stos to struktura danych, która mo¿e s³u¿yæ jako kolekcja. Dostêp do elementów tej kolekcji
//odbywa siê na zasadzie LIFO (last-in first-out) czyli ostatni dodany element
//jest pierwszy pobierany.
//Stos mo¿na porównaæ do talii kart, na któr¹ odrzuca siê karty w czasie gry.
//A gdy trzeba pobraæ kartê, to bierze sie j¹ z wierzchu tej talii.
//Charakterystyczne operacje dla stosu to push, która s³u¿y do umieszczania wartoœci
//na szczycie stosu i pop do jej œci¹gania.
//Stos wykorzystuje siê np.: do zapamiêtywania kolejnych wykonywanych operacji w jakimœ programie.
//Kolejne operacje "wrzucane" s¹ na stos, gdy chcemy siê cofn¹æ o kilka operacji, to œci¹gamy je ze stosu.



//Kolejka (ang. queue)
//*****************************************************************************
//Kolejka to struktura danych, która mo¿e s³u¿yæ jako kolekcja. Dostêp do elemetnów tej kolekcji
//odbywa siê na zasadzie FIFO (first-in first-out), czyli pierwszy element, który zosta³ dodany
//do kolejki, pierwszy zostanie z niej pobrany.
//Kolejka, jak sama nazwa wskazuje, dzia³a jak kolejka.
//Kolejka mo¿e byæ wykorzystywana jako bufor danych. Na przyk³ad sp³wyaj¹ce zamówienia ze sklepu
//internetowego s¹ one realizowane, zgodnie kolejnoœci¹ w jakiej dociera³y.



//Lista (ang. list)
//*****************************************************************************
//Lista to struktura danych w której elementy (wêz³y ang. node) tworz¹ sekwencjê. Ka¿dy element tej sekwncji
//zawiera wskaŸnik na element wystêpuj¹cy po nim. W przeciwieñstwie do poprzednich kolekcji mo¿liwe jest
//dodawanie i usuwanie elementów w dowolnym miejscu.
//Listy mog¹ byæ jednokierunkowe. Ka¿dy element takiej listy wskazuje na elemet nastêpuj¹cy po nim.
//Listy mogê te¿ byæ dwukierunkowe. W takiej liœcie ka¿dy element wskazuje na element nastêpuj¹cy i poprzedzaj¹cy.
//Lista to kolekcja ogólnego przeznaczenia i mo¿e byæ podstaw¹ implementacji takich kolekcji jak kolejka i stos.



//Drzewo (ang. tree)
//*****************************************************************************
//Drzew to struktura, która przedstawia dane w sposób hierarchiczny. Drzewo sk³ada siê z wêz³ów oraz ³¹cz¹cych
//je krawêdzi. Na samym szczycie drzewa jest wêze³ nazywany korzeniem, natomist wêz³y które nie posiadaj¹ ¿adnego
//potomka nazywane sa liœæmi.
//Drzewa charakteryzuje wiele w³aœciwoœci:
//Ci¹g krawêdzi ³¹cz¹cych wêz³y nazywa siê œcie¿k¹. Istnieje dok³adnie jedna œcie¿ka ³¹cz¹ca korzeñ
//z ka¿dym pozosta³ym wierzcho³kiem. Liczba krawêdzi w œcie¿ce od korzenia do wêz³a jest nazywana d³ugoœci¹.
//Najd³u¿sza sciezka wyznacza wysokoœæ drzewa. D³ugoœæ te¿ wyznacza poziom drzewa.
//Ka¿dy weze³ mo¿e mieæ po³¹czone z nim inne wê¿³y, które nazywa siê dzieæmi. Wêze³, od którego takie po³¹czenia
//id¹ (le¿¹cy poziom wy¿ej) nazywa siê rodzicem.
//Wêz³y tego samego rodzica nazywa siê rodzeñstwem.
//Ka¿dy wêze³ (nie bêd¹cy korzeniem) mo¿e byæ traktowany jako pocz¹tek poddrzewa.
//Charakterystycznem rodzajem drzewa jest drzewo binarne. W takim drzewie ka¿dy wêze³ mo¿e posiadaæ najwy¿ej dwoje dzieci,
//prawe i lewe. Tego typu drzewa wykorzysuje siê w algorytmach do szybikiego wyszukiwania i sortowania elementów.



