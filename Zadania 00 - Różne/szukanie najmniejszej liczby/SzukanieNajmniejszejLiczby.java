
public class SzukanieNajmniejszejLiczby {

	public static void main(String[] args) {
		
		int [] tablica = {50, 42, 65, 39, 87, 23, 91, 24, 73, 15, 28, 47, 64};
		
		System.out.println(znajd�Najmniejsz�Liczb�(tablica));

	}
	
	static int znajd�Najmniejsz�Liczb� (int tablica []){
	
		int liczba = tablica [0];
		
		for (int i = 1; i < tablica.length; i++){
			
			if (liczba > tablica [i]) {
				liczba = tablica [i];
			}
			
		}
			
		return liczba;
	}
	
}
