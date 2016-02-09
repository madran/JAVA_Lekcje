package lekcja_02;

public class ImplementacjaKlasyInteger {
	
	
	public static void main(String[] args) {
		
		Integer a = new Integer (1);
		Integer b = new Integer (2);
		Integer c = new Integer (3);
		Integer d = new Integer (4);
		Integer e = new Integer (5);
		
		Integer sumaaa = a.dodaj(a);
		Integer iloczyneb = e.pomnó¿(b);
		Integer róŸnicadc = d.odejmij(c);
		Integer sumaabcde = a.dodaj(b.dodaj(c.dodaj(d.dodaj(e))));
		
		System.out.println(sumaaa.wartoœæ);
		System.out.println(róŸnicadc.wartoœæ);
		System.out.println(iloczyneb.wartoœæ);
		System.out.println(sumaabcde.wartoœæ);
		
		char $ = '\u00A7'; //znaczki z Unicode, niezwi¹zane z reszt¹ :D
		System.out.println($);
		
	}

	
}