
public class LiczbySuperPierwsze {

	public static void main(String[] args) {

		System.out.println(zadanie1(2, 1000));
		System.out.println(zadanie1(100, 10000));
		System.out.println(zadanie1(1000, 100000));
		
		System.out.println(zadanie2(100, 10000));
		
		System.out.println(zadanie3(100, 10000));
	}

	static int zadanie1(int a, int b) {
		int liczbyBpierwsze = 0;

		for (int i = a; i <= b; i++) {
			if (czyLiczbaSuperBpierwsza(i))
				liczbyBpierwsze++;
		}

		return liczbyBpierwsze;
	}

	static int zadanie2(int a, int b) {
		int liczbyPierwsze = 0;

		for (int i = a; i <= b; i++) {
			int liczba = i;
			int sumaCyfr = 0;
			int reszta = 0;
			
			while (liczba > 0) {
				reszta = liczba % 10;
				liczba = liczba / 10;
				sumaCyfr += reszta;
			}
			
			if (czyLiczbaPierwsza(sumaCyfr)) liczbyPierwsze++;
		}

		return liczbyPierwsze;
	}
	
	static boolean zadanie3 (int a, int b){
		int suma = 0;
		
		for (int i = a; i <= b; i++){
			if (czyLiczbaSuperBpierwsza(i)) suma += i;
		}
		
		if (czyLiczbaPierwsza(suma)){
			return true;
		}
		
		return false;
		
	}

	static boolean czyLiczbaPierwsza(int liczba) {
		boolean pierwsza = true;

		if (liczba == 0 || liczba == 1)
			pierwsza = false;

		for (int i = 2; i < liczba / 2 + 1; i++) {
			if (liczba % i == 0)
				pierwsza = false;
		}

		return pierwsza;
	}

	static boolean czyLiczbaSuperPierwsza(int liczba) {

		if (czyLiczbaPierwsza(liczba)) {

			int reszta = 0;
			int sumaCyfr = 0;

			while (0 < liczba) {
				reszta = liczba % 10;
				liczba = liczba / 10;
				sumaCyfr += reszta;

			}

			if (czyLiczbaPierwsza(sumaCyfr))
				return true;
		}

		return false;
	}

	static boolean czyLiczbaSuperBpierwsza(int liczba) {

		if (czyLiczbaSuperPierwsza(liczba)) {

			String liczbaBinarna = Integer.toBinaryString(liczba);

			int sumaCyfr = 0;

			for (int i = 0; i < liczbaBinarna.length(); i++) {

				sumaCyfr += Integer.parseInt(("" + liczbaBinarna.charAt(i)));
			}

			if (czyLiczbaPierwsza(sumaCyfr))
				return true;
		}

		return false;
	}

}
