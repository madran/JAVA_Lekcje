public class LiczbaBinarna {
	String warto��;
	int liczbaJedynek;
	int liczbaZer;

	LiczbaBinarna(String liczbaBinarna) {
		warto�� = liczbaBinarna;
		liczbaJedynek = liczbaJedynek();
		liczbaZer = warto��.length() - liczbaJedynek;
	}

	private int liczbaJedynek() {
		int liczbaJedynek = 0;

		for(int i = 0; i < warto��.length(); i++) {
			if(warto��.charAt(i) == '1') {
				liczbaJedynek++;
			}
		}

		return liczbaJedynek;
	}

	boolean czyPodzielnaPrzez2() {
		if(warto��.charAt(warto��.length() - 1) == '0') return true;
		else return false;
	}

	boolean czyPodzielnaPrzez8() {
		if(warto��.charAt(warto��.length() - 2) == '0' && warto��.charAt(warto��.length() - 3) == '0') return true;
		else return false;
	}
}
