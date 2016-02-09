package lekcja_01;

public class KlasaA {

	void metoda1 (int parametr) {
		
		System.out.println("w metodzie parametr=" + parametr);
		
		parametr = 5;
		
		System.out.println("w metodzie parametr=" + parametr);
		
		
	}
	
	void metoda2 (KlasaB obiekt){
		
		System.out.println(obiekt.atrybut);
		
		obiekt.atrybut = 10;
		
		System.out.println(obiekt.atrybut);
		
		
	}
	
	
	
	
}
