package lekcja_02;

public class Integer {
	
	int warto��;
	
	Integer (int liczba) {
		warto��=liczba;
	}
	
	Integer dodaj (Integer liczba) {
		int suma1 = warto�� + liczba.warto��;
		Integer suma2 = new Integer (suma1);
		return suma2;
	}

	
	Integer odejmij (Integer liczba){
		int r�nica1 =  warto�� - liczba.warto��;
		Integer r�nica2 = new Integer (r�nica1);
		return r�nica2;		
	}

	Integer pomn� (Integer liczba){
		int iloczyn1 = warto�� * liczba.warto��;
		Integer iloczyn2 = new Integer (iloczyn1);
		return iloczyn2;
	}
	
}