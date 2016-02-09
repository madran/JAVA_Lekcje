public class �redniaLiczbCa�kowitych {

	public static void main(String[] args) {

		int [] tablica = {1, -2, 4, 0, -46, 1, 9, 2, 12, 52, -85};
		double [] tablicaZwracana = �rednia(tablica);
		double �redniaDodatnich = tablicaZwracana [0];
		double �redniaUjemnych = tablicaZwracana [1];

		System.out.println("�rednia Dodatnich: " + �redniaDodatnich);
		System.out.println();
		System.out.println("�rednia Ujemnych: " + �redniaUjemnych);

	}

	static double [] �rednia (int [] tablica){

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

		double �redniaDodatnich =  (double) sumaDodatnich /d;
		double �redniaUjemnych = (double) sumaUjemnych / u;

		double [] obie�rednie = new double [2];

		obie�rednie [0] = �redniaDodatnich;
		obie�rednie [1] = �redniaUjemnych;


		return obie�rednie;
	}

}
