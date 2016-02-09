
public class Numerologia {

	public static void main(String[] args) {
		
		int dzieñ = Integer.parseInt (args [0]);
		int miesi¹c = Integer.parseInt (args [1]);
		int rok = Integer.parseInt (args [2]);
		int liczbaUrodzenia = liczbaUrodzenia(dzieñ, miesi¹c, rok);

		System.out.println(liczbaUrodzenia);

	}

	static int liczbaUrodzenia(int dzieñ, int miesi¹c, int rok) {

		int liczba = dzieñ + miesi¹c + rok;

		int reszta = liczba % 10; // 7;

		int liczbaUrodzenia = reszta;

		while (liczba > 10) {
			liczba = (liczba - reszta) / 10; // 198; 19; 1
			reszta = liczba % 10; // 8; 9; 1
			liczbaUrodzenia = liczbaUrodzenia + reszta; // 8; 17; 18

			while (liczba < 10 && liczbaUrodzenia > 10){
				liczba = liczbaUrodzenia;
				reszta = liczba % 10;
				liczbaUrodzenia = reszta;
			}
			
		}

		return liczbaUrodzenia;
	}

}
