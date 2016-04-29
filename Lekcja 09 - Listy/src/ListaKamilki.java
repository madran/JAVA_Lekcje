
public interface ListaKamilki <T> {
	
	void dodaj(T element);
	T usuñ(int indeks); // T bo jakbyœmy sobie chcieli zwróciæ usuniêty element
	T pobierz(int indeks);
	int d³ugoœæ();
	
}
