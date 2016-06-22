import java.util.Arrays;

public class Dominanta {

	public static void main(String[] args) {
		
		int [] tablica = {1, 2, 2, 3, 3, 3, 1, 1, 2, 3, 3, 4};
		System.out.print (policzDominant�(tablica));
	}

	static int policzDominant� (int [] tablica){
		
		int najwy�szaWarto�� = sprawd�Najwy�sz�Warto�� (tablica);
		int [] kube�kiDodatnie = new int [najwy�szaWarto�� + 1];
		int dominanta = 0;
		for (int i = 0; i < tablica.length; i++){
			kube�kiDodatnie [tablica[i]] += 1; 
		}
		System.out.println(Arrays.toString(kube�kiDodatnie));
		
		for (int i = 0; i < kube�kiDodatnie.length; i++){
			if (kube�kiDodatnie [i] > dominanta) dominanta = i;
		}
		
		
		return dominanta;
	}
	
	static int sprawd�Najwy�sz�Warto�� (int [] tablica){
		
		int najwy�szaWarto�� = tablica [0];
		
		for (int i = 0; i < tablica.length; i++){
			if (najwy�szaWarto�� < tablica [i]){
				najwy�szaWarto�� = tablica [i];
			}
		}
		
		return najwy�szaWarto��;
	}
	
}