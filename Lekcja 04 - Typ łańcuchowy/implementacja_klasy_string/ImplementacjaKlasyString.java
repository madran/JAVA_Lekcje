
public class ImplementacjaKlasyString {

	public static void main(String[] args) {

		char [] tablica1 = {'a', 's', 'd', 'f'};
		char [] tablica2 = {'j', 'k', 'l', ';'};
		
		�a�cuch �a�cuch1 = new �a�cuch (tablica1);
		�a�cuch �a�cuch2 = new �a�cuch (tablica2);
		
		System.out.println(�a�cuch1.d�ugo��());
		System.out.println(�a�cuch2.znakNaPozycji(2));
		System.out.println(�a�cuch1.do��cz(�a�cuch2).naString());
		
	}

}
