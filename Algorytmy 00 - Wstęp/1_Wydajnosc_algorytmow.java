//Ocenê wydajnoœci algorytmu okreœla funkcja T(n). Reprezentuje ona iloœæ czasu jaka jest potrzebna do jego wykonania
//dla ka¿dego przypadku o rozmiarze n.
//Uwagi:
//1. Chcemy zbadaæ czas dla najgorszego przypadku (najd³u¿szy czas dzia³ania)
//2. Interesuje nas tylko rodzaj funkcji (czy jest liniowa, kwadratowa, logarytmiczna)
//   a nie dok³adne wartoœci (czy sta³e), które mog¹ zale¿eæ od rodzaju procesora czy kompilatora.
//3. Interesuj¹ nas tylko du¿e wartoœci n.

static char [] po³¹czTablicêTablic (char tablica [] []){
    int d³ugoœæ = 0;                                        // 1
            
    for (int i = 0; i < tablica.length; i++){               // n
        d³ugoœæ = d³ugoœæ + tablica[i].length;              //  3
    }
            
    char [] tablicaPo³¹czona = new char [d³ugoœæ];          // 2
    int k = 0;                                              // 1
            
    for (int i = 0; i < tablica.length; i++){               // n
        for (int j = 0; j < tablica[i].length; j++){        //  n
            tablicaPo³¹czona [k] = tablica [i] [j];         //   1
            k++;                                            //   1
        }
    }
           
    return tablicaPo³¹czona;                                // 1
}


//1 + n * ( 3 ) + 2 + 1 + n * ( n * ( 1 * 1) ) + 1 = 
//1 + 3n + 2 + 1 + n^2 + 1 = n^2 + 3n + 5

//f(n) = n^2 + 3n + 5

//Do okreœlenia z³o¿onoœci obliczeniowej wykorzystuje siê asymptotyczne temp wzrostu, które opisuje
//jak szybko dana funkcja roœnie lub maleje.

//n - liczba operacji, d¹¿y do nieskoñczonoœci
//f(n) - funkcja czasowa
//g(n) - funkcja wyznaczaj¹ca rz¹d z³o¿onoœci funkcji f(n)
//c - sta³a, która spe³nia warunki notacji
//n0 - wartoœæ n powy¿ej, której warunek jest spe³niony.

//f(n) nale¿y do O(g(n)) wtedy i tylko wtedy gdy istnieje sta³a c > 0 i sta³a n0 gdzie dla ka¿dego n>=n0
//jest spe³niona nierównoœæ 0 <= f(n) <= c*g(n).