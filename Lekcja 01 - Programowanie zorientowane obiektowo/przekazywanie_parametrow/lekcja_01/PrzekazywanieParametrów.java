package lekcja_01;

public class PrzekazywanieParametrów {

	public static void main(String[] args) {
		
		int zmienna = 1;
		
		KlasaA obiekta = new KlasaA();

		obiekta.metoda1(zmienna);
		
		System.out.println("po wykonaniu metody zmienna=" + zmienna);
		
		
		KlasaB obiektb = new KlasaB();
		
		obiektb.atrybut = 9;
		
		obiekta.metoda2(obiektb); // PRZEKAZUJEMY obiektb do metody
		
		System.out.println(obiektb.atrybut);
		
	}


	
}
