
public class SortowanieKube�kowe {

	public static void main(String[] args) {
		
		int [] tablicaDoPosortowania = {7, 2, 2, 5, 1, 3, 6, 4, 9};
		int [] tablicaPosortowana = sortujKube�kowo (tablicaDoPosortowania);
		
		for (int i = 0; i < tablicaPosortowana.length; i++){
			for (int j = 0; j < tablicaPosortowana [i]; j++){
				System.out.print(i + ", ");
			}
		}
	}

	static int [] sortujKube�kowo (int [] tablica){
		
		int najwy�szaWarto�� = sprawd�Najwy�sz�Warto�� (tablica);
		int [] kube�ki = new int [najwy�szaWarto�� + 1];
		
		for (int i = 0; i < tablica.length; i++){
			kube�ki [tablica[i]] += 1; 
		}
		
		return kube�ki;
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
