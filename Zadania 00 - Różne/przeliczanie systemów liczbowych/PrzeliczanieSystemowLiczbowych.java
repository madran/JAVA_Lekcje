public class PrzeliczanieSystemowLiczbowych{

	public static void main(String[] args) {
		char [] liczbaBinarna = {'1', '0', '0', '1', '0', '1', '1'};
		char [] liczba�semkowa = {'1', '0'};
		int liczbaDziesi�tna = 1476;
		char [] liczbaSzestnastkowa = {'5', 'C', '4'};

		System.out.println(binarnaNaDziesi�tn�(liczbaBinarna));
		dziesi�tnaNaBinarn�(liczbaDziesi�tna);
		System.out.println(" (czyta� od ty�u)");
		System.out.println(�semkowaNaDziesi�tn�(liczba�semkowa));
		dziesi�tnaNa�semkow�(liczbaDziesi�tna);
		System.out.println("( czyta� od ty�u)");
		System.out.println(szestnastkowaNaDziesi�tn�(liczbaSzestnastkowa));
		dziesi�tnaNaSzesnastkow�(liczbaDziesi�tna);
		System.out.println(" czyta� od ty�u");
		binarnyNa�semkowy(liczbaBinarna);
		�semkowyNaBinarny(liczba�semkowa);


//		System.out.println(Character.getNumericValue('1'));
	}

	static int binarnaNaDziesi�tn� (char [] liczba){
		double liczbaDziesi�tna = 0;
		double to = 0;
		double l = 0;

		for (int i = liczba.length - 1; i >= 0; i--){
			double t = Character.getNumericValue(liczba [i]);
			to = Math.pow(2.0,l) * t;
			liczbaDziesi�tna = liczbaDziesi�tna + to;
			l++;
		}

		return (int) liczbaDziesi�tna;
	}

	static void dziesi�tnaNaBinarn� (int liczba){
		int reszta = 0;

		while (liczba > 0){
			reszta = liczba % 2;
			liczba = liczba/2;
			System.out.print(reszta);
		}

	}

	static int �semkowaNaDziesi�tn� (char [] liczba){
		double liczbaDziesi�tna = 0;
		int cyfra = 0;
		int pozycja = 0;
		double to = 0;

		for (int i = liczba.length - 1; i >= 0; i--){
			cyfra = Character.getNumericValue(liczba [i]);
			to = Math.pow(8, pozycja) * cyfra;
			liczbaDziesi�tna = liczbaDziesi�tna + to;
			pozycja ++;
		}

		return (int) liczbaDziesi�tna;
	}

	static void dziesi�tnaNa�semkow� (int liczba){
		int reszta = 0;

		while (liczba > 0){
			reszta = liczba % 8;
			liczba = liczba / 8;
			System.out.print(reszta);
		}

	}

	static int szestnastkowaNaDziesi�tn� (char [] liczba){	
		double liczbaDziesi�tna = 0;
		int cyfra = 0;
		int pozycja = 0;
		double to = 0;

		for (int i = liczba.length - 1; i >= 0; i--){
			cyfra = Character.getNumericValue(liczba [i]);
				to = Math.pow(16, pozycja) * cyfra;
				liczbaDziesi�tna = liczbaDziesi�tna + to;
				pozycja ++;
		}

		return (int) liczbaDziesi�tna;
	}

	static void dziesi�tnaNaSzesnastkow� (int liczba){			
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

	static void binarnyNa�semkowy (char [] liczba){
		int liczbaDziesi�tna = binarnaNaDziesi�tn�(liczba);
		dziesi�tnaNa�semkow�(liczbaDziesi�tna);
		System.out.println(" (czyta� od ty�u)");
	}

	static void �semkowyNaBinarny (char [] liczba){
		int liczbaDziesi�tna = �semkowaNaDziesi�tn�(liczba);
		dziesi�tnaNaBinarn�(liczbaDziesi�tna);
		System.out.println(" (czyta� od ty�u)");
	}
}