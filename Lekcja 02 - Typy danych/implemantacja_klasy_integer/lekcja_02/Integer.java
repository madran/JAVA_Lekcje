package lekcja_02;

public class Integer {
	
	int wartoœæ;
	
	Integer (int liczba) {
		wartoœæ=liczba;
	}
	
	Integer dodaj (Integer liczba) {
		int suma1 = wartoœæ + liczba.wartoœæ;
		Integer suma2 = new Integer (suma1);
		return suma2;
	}

	
	Integer odejmij (Integer liczba){
		int ró¿nica1 =  wartoœæ - liczba.wartoœæ;
		Integer ró¿nica2 = new Integer (ró¿nica1);
		return ró¿nica2;		
	}

	Integer pomnó¿ (Integer liczba){
		int iloczyn1 = wartoœæ * liczba.wartoœæ;
		Integer iloczyn2 = new Integer (iloczyn1);
		return iloczyn2;
	}
	
}