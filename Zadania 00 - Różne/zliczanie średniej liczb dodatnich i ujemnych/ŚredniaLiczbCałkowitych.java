public class ŒredniaLiczbCa³kowitych {

	public static void main(String[] args) {

		int [] tablica = {1, -2, 4, 0, -46, 1, 9, 2, 12, 52, -85};
		double [] tablicaZwracana = œrednia(tablica);
		double ŒredniaDodatnich = tablicaZwracana [0];
		double ŒredniaUjemnych = tablicaZwracana [1];

		System.out.println("Œrednia Dodatnich: " + ŒredniaDodatnich);
		System.out.println();
		System.out.println("Œrednia Ujemnych: " + ŒredniaUjemnych);

	}

	static double [] œrednia (int [] tablica){

		int d = 0;
		int u = 0;
		int sumaDodatnich = 0;
		int sumaUjemnych = 0;

		for (int i = 0; i < tablica.length; i++){
			if (tablica [i] > 0){
				sumaDodatnich = sumaDodatnich + tablica [i];
				d++;
			}

			else if (tablica[i] < 0) {
				sumaUjemnych = sumaUjemnych + tablica [i];
				u++;
			}

		}

		double œredniaDodatnich =  (double) sumaDodatnich /d;
		double œredniaUjemnych = (double) sumaUjemnych / u;

		double [] obieŒrednie = new double [2];

		obieŒrednie [0] = œredniaDodatnich;
		obieŒrednie [1] = œredniaUjemnych;


		return obieŒrednie;
	}

}
