import java.util.Arrays;

public class Dominanta {

	public static void main(String[] args) {
		
		int [] tablica = {1, 2, 2, 3, 3, 3, 1, 1, 2, 3, 3, 4};
		System.out.print (policzDominantê(tablica));
	}

	static int policzDominantê (int [] tablica){
		
		int najwy¿szaWartoœæ = sprawdŸNajwy¿sz¹Wartoœæ (tablica);
		int [] kube³kiDodatnie = new int [najwy¿szaWartoœæ + 1];
		int dominanta = 0;
		for (int i = 0; i < tablica.length; i++){
			kube³kiDodatnie [tablica[i]] += 1; 
		}
		System.out.println(Arrays.toString(kube³kiDodatnie));
		
		for (int i = 0; i < kube³kiDodatnie.length; i++){
			if (kube³kiDodatnie [i] > dominanta) dominanta = i;
		}
		
		
		return dominanta;
	}
	
	static int sprawdŸNajwy¿sz¹Wartoœæ (int [] tablica){
		
		int najwy¿szaWartoœæ = tablica [0];
		
		for (int i = 0; i < tablica.length; i++){
			if (najwy¿szaWartoœæ < tablica [i]){
				najwy¿szaWartoœæ = tablica [i];
			}
		}
		
		return najwy¿szaWartoœæ;
	}
	
}