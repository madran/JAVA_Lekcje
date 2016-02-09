public class ŚredniaLiczbCałkowitych {

	public static void main(String[] args) {

		int [] tablica = {1, -2, 4, 0, -46, 1, 9, 2, 12, 52, -85};
		double [] tablicaZwracana = średnia(tablica);
		double ŚredniaDodatnich = tablicaZwracana [0];
		double ŚredniaUjemnych = tablicaZwracana [1];

		System.out.println("Średnia Dodatnich: " + ŚredniaDodatnich);
		System.out.println();
		System.out.println("Średnia Ujemnych: " + ŚredniaUjemnych);

	}

	static double [] średnia (int [] tablica){

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

		double średniaDodatnich =  (double) sumaDodatnich /d;
		double średniaUjemnych = (double) sumaUjemnych / u;

		double [] obieŚrednie = new double [2];

		obieŚrednie [0] = średniaDodatnich;
		obieŚrednie [1] = średniaUjemnych;


		return obieŚrednie;
	}

}
