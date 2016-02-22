//*****************************************************************************
//Rekurencja                                                                  *
//*****************************************************************************
//Rekurencja (rekursja) to technika programistyczna polegaj¹ca na wywo³ywaniu funkcji przez sam¹ siebie.
//Przyk³ad: funkcja 'suma' zwraca sume wszystkich liczb z przedzia³u od 1 do wartoœci przekazanej przez parametr

int suma(int liczba) {
	if(liczba == 1) return 1;
	return liczba + suma(liczba - 1);
}

System.out.println(suma(5)); //wypisze 15

//Dzia³anie metydy suma

// /suma(5)
// |    /suma(4)
// |    |    /suma(3)
// |    |    |    /suma(2)
// |    |    |    |    /suma(1)
// |    |    |    |    \->    return 1
// |    |    |    |                 ||
// |    |    |    |                 \/
// |    |    |    \->    return 2 + 1 (=3)
// |    |    |                 ||
// |    |    |                 \/
// |    |    \->    return 3 + 3 (=6)
// |    |                 ||
// |    |                 \/
// |    \->    return 4 + 6 (=10)
// |                 ||
// |                 \/
// \->    return 5 + 10 (=15)