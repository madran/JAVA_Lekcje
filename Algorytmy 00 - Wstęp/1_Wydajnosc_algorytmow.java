//Ocen� wydajno�ci algorytmu okre�la funkcja T(n). Reprezentuje ona ilo�� czasu jaka jest potrzebna do jego wykonania
//dla ka�dego przypadku o rozmiarze n.
//Uwagi:
//1. Chcemy zbada� czas dla najgorszego przypadku (najd�u�szy czas dzia�ania)
//2. Interesuje nas tylko rodzaj funkcji (czy jest liniowa, kwadratowa, logarytmiczna)
//   a nie dok�adne warto�ci (czy sta�e), kt�re mog� zale�e� od rodzaju procesora czy kompilatora.
//3. Interesuj� nas tylko du�e warto�ci n.

static char [] po��czTablic�Tablic (char tablica [] []){
    int d�ugo�� = 0;                                        // 1
            
    for (int i = 0; i < tablica.length; i++){               // n
        d�ugo�� = d�ugo�� + tablica[i].length;              //  3
    }
            
    char [] tablicaPo��czona = new char [d�ugo��];          // 2
    int k = 0;                                              // 1
            
    for (int i = 0; i < tablica.length; i++){               // n
        for (int j = 0; j < tablica[i].length; j++){        //  n
            tablicaPo��czona [k] = tablica [i] [j];         //   1
            k++;                                            //   1
        }
    }
           
    return tablicaPo��czona;                                // 1
}


//1 + n * ( 3 ) + 2 + 1 + n * ( n * ( 1 * 1) ) + 1 = 
//1 + 3n + 2 + 1 + n^2 + 1 = n^2 + 3n + 5

//f(n) = n^2 + 3n + 5

//Do okre�lenia z�o�ono�ci obliczeniowej wykorzystuje si� asymptotyczne temp wzrostu, kt�re opisuje
//jak szybko dana funkcja ro�nie lub maleje.

//n - liczba operacji, d��y do niesko�czono�ci
//f(n) - funkcja czasowa
//g(n) - funkcja wyznaczaj�ca rz�d z�o�ono�ci funkcji f(n)
//c - sta�a, kt�ra spe�nia warunki notacji
//n0 - warto�� n powy�ej, kt�rej warunek jest spe�niony.

//f(n) nale�y do O(g(n)) wtedy i tylko wtedy gdy istnieje sta�a c > 0 i sta�a n0 gdzie dla ka�dego n>=n0
//jest spe�niona nier�wno�� 0 <= f(n) <= c*g(n).