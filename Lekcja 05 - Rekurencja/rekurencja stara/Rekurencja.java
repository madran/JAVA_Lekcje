public class Rekurencja {

	public static void main(String[] args) {
		rekurencja(10);

		System.out.println(sumaIteracyjne(3));
	}

	static int rekurencja(int a) {
		if (a > 0) {
//			System.out.println(a);
			return rekurencja(a - 1);
		} else
			return 0;
	}

	static int suma(int a) {
		if(a < 1) return 0;

		return a + suma(a-1);
	}

	static int sumaIteracyjne(int a) {
		int suma = 0;
		while(a > 0) {
			suma = suma + a--;
		}

		return suma;
	}

}

// rekurencja(10) ->                                                                                       -> 0
//                    rekurencja(9)                                                                 -> 0
//                                   -> ... ->                                            -> ... ->
//                                              rekurencja(1) ->                    -> 0
//                                                               rekurencja(0) -> 0