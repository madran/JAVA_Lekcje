
public class Silnia {

	public static void main(String[] args) {

		System.out.println(policzSilnię(20));

	}

	static long policzSilnię (long n){

		long x = 1;

		for (long i = 1; i <= n; i++) {

			x = x * i;

		}

		return x;

	}
}
