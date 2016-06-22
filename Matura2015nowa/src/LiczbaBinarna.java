public class LiczbaBinarna {
	String wartoœæ;
	int liczbaJedynek;
	int liczbaZer;

	LiczbaBinarna(String liczbaBinarna) {
		wartoœæ = liczbaBinarna;
		liczbaJedynek = liczbaJedynek();
		liczbaZer = wartoœæ.length() - liczbaJedynek;
	}

	private int liczbaJedynek() {
		int liczbaJedynek = 0;

		for(int i = 0; i < wartoœæ.length(); i++) {
			if(wartoœæ.charAt(i) == '1') {
				liczbaJedynek++;
			}
		}

		return liczbaJedynek;
	}

	boolean czyPodzielnaPrzez2() {
		if(wartoœæ.charAt(wartoœæ.length() - 1) == '0') return true;
		else return false;
	}

	boolean czyPodzielnaPrzez8() {
		if(wartoœæ.charAt(wartoœæ.length() - 2) == '0' && wartoœæ.charAt(wartoœæ.length() - 3) == '0') return true;
		else return false;
	}
}
