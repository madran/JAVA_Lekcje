public class PrzeliczanieSystemowLiczbowych{

	public static void main(String[] args) {
		char [] liczbaBinarna = {'1', '0', '0', '1', '0', '1', '1'};
		char [] liczbaÓsemkowa = {'1', '0'};
		int liczbaDziesiêtna = 1476;
		char [] liczbaSzestnastkowa = {'5', 'C', '4'};

		System.out.println(binarnaNaDziesiêtn¹(liczbaBinarna));
		dziesiêtnaNaBinarn¹(liczbaDziesiêtna);
		System.out.println(" (czytaæ od ty³u)");
		System.out.println(ósemkowaNaDziesiêtn¹(liczbaÓsemkowa));
		dziesiêtnaNaÓsemkow¹(liczbaDziesiêtna);
		System.out.println("( czytaæ od ty³u)");
		System.out.println(szestnastkowaNaDziesiêtn¹(liczbaSzestnastkowa));
		dziesiêtnaNaSzesnastkow¹(liczbaDziesiêtna);
		System.out.println(" czytaæ od ty³u");
		binarnyNaÓsemkowy(liczbaBinarna);
		ósemkowyNaBinarny(liczbaÓsemkowa);


//		System.out.println(Character.getNumericValue('1'));
	}

	static int binarnaNaDziesiêtn¹ (char [] liczba){
		double liczbaDziesiêtna = 0;
		double to = 0;
		double l = 0;

		for (int i = liczba.length - 1; i >= 0; i--){
			double t = Character.getNumericValue(liczba [i]);
			to = Math.pow(2.0,l) * t;
			liczbaDziesiêtna = liczbaDziesiêtna + to;
			l++;
		}

		return (int) liczbaDziesiêtna;
	}

	static void dziesiêtnaNaBinarn¹ (int liczba){
		int reszta = 0;

		while (liczba > 0){
			reszta = liczba % 2;
			liczba = liczba/2;
			System.out.print(reszta);
		}

	}

	static int ósemkowaNaDziesiêtn¹ (char [] liczba){
		double liczbaDziesiêtna = 0;
		int cyfra = 0;
		int pozycja = 0;
		double to = 0;

		for (int i = liczba.length - 1; i >= 0; i--){
			cyfra = Character.getNumericValue(liczba [i]);
			to = Math.pow(8, pozycja) * cyfra;
			liczbaDziesiêtna = liczbaDziesiêtna + to;
			pozycja ++;
		}

		return (int) liczbaDziesiêtna;
	}

	static void dziesiêtnaNaÓsemkow¹ (int liczba){
		int reszta = 0;

		while (liczba > 0){
			reszta = liczba % 8;
			liczba = liczba / 8;
			System.out.print(reszta);
		}

	}

	static int szestnastkowaNaDziesiêtn¹ (char [] liczba){	
		double liczbaDziesiêtna = 0;
		int cyfra = 0;
		int pozycja = 0;
		double to = 0;

		for (int i = liczba.length - 1; i >= 0; i--){
			cyfra = Character.getNumericValue(liczba [i]);
				to = Math.pow(16, pozycja) * cyfra;
				liczbaDziesiêtna = liczbaDziesiêtna + to;
				pozycja ++;
		}

		return (int) liczbaDziesiêtna;
	}

	static void dziesiêtnaNaSzesnastkow¹ (int liczba){			
		int reszta = 0;

			while (liczba > 0){
				reszta = liczba % 16;
				liczba = liczba/16;
				
				if (reszta >= 0 && reszta <= 9){
					System.out.print(reszta);
				}
				else {
					reszta = reszta + 55;
					System.out.print((char)reszta);
				}
	
			}
	}

	static void binarnyNaÓsemkowy (char [] liczba){
		int liczbaDziesiêtna = binarnaNaDziesiêtn¹(liczba);
		dziesiêtnaNaÓsemkow¹(liczbaDziesiêtna);
		System.out.println(" (czytaæ od ty³u)");
	}

	static void ósemkowyNaBinarny (char [] liczba){
		int liczbaDziesiêtna = ósemkowaNaDziesiêtn¹(liczba);
		dziesiêtnaNaBinarn¹(liczbaDziesiêtna);
		System.out.println(" (czytaæ od ty³u)");
	}
}