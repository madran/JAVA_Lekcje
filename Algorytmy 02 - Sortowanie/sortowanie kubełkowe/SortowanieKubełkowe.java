
public class SortowanieKube³kowe {

	public static void main(String[] args) {
		
		int [] tablicaDoPosortowania = {7, 2, 2, 5, 1, 3, 6, 4, 9};
		int [] tablicaPosortowana = sortujKube³kowo (tablicaDoPosortowania);
		
		for (int i = 0; i < tablicaPosortowana.length; i++){
			for (int j = 0; j < tablicaPosortowana [i]; j++){
				System.out.print(i + ", ");
			}
		}
	}

	static int [] sortujKube³kowo (int [] tablica){
		
		int najwy¿szaWartoœæ = sprawdŸNajwy¿sz¹Wartoœæ (tablica);
		int [] kube³ki = new int [najwy¿szaWartoœæ + 1];
		
		for (int i = 0; i < tablica.length; i++){
			kube³ki [tablica[i]] += 1; 
		}
		
		return kube³ki;
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
