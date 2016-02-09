
public class Algorytmy {

	public static void main(String[] args) {

		int [] tablica = {0, 1, 1, 3, 0, 1, 2, 1, 0, 0, 1, 3, 1, 0, 1};

		System.out.println(zliczCyfra (tablica, 1));

	}


	static int zliczCyfra (int [] tablica, int cyfra) {
		
		int c = 0;
		
		for (int i = 0; i < tablica.length; i++) {
			
			if (cyfra == tablica [i]){
				
				c++;
				
			}
			
		}

		return c;

	}

}
