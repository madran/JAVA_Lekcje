package lekcja_02;

public class ImplementacjaKlasyInteger {
	
	
	public static void main(String[] args) {
		
		Integer a = new Integer (1);
		Integer b = new Integer (2);
		Integer c = new Integer (3);
		Integer d = new Integer (4);
		Integer e = new Integer (5);
		
		Integer sumaaa = a.dodaj(a);
		Integer iloczyneb = e.pomn�(b);
		Integer r�nicadc = d.odejmij(c);
		Integer sumaabcde = a.dodaj(b.dodaj(c.dodaj(d.dodaj(e))));
		
		System.out.println(sumaaa.warto��);
		System.out.println(r�nicadc.warto��);
		System.out.println(iloczyneb.warto��);
		System.out.println(sumaabcde.warto��);
		
		char $ = '\u00A7'; //znaczki z Unicode, niezwi�zane z reszt� :D
		System.out.println($);
		
	}

	
}