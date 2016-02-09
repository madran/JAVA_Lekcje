
public class Anagram {

	public static void main(String[] args) {

		char [] tablica = {'K', 'A', 'M', 'I', 'L', 'K', 'A'};


		System.out.println (tablica);
		System.out.println ();
		System.out.println (odwracanie(tablica));

	}

	static char [] odwracanie (char [] tablica) {

		char [] nowaTablica = new char [tablica.length];

		for (int i = 0; i < tablica.length; i++){
			nowaTablica [i] = tablica [tablica.length - 1 - i];
		}


		return nowaTablica;

	}

}
