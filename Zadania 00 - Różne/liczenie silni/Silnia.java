
public class Silnia {

	public static void main(String[] args) {

		System.out.println(policzSilni�(20));

	}

	static long policzSilni� (long n){

		long x = 1;

		for (long i = 1; i <= n; i++) {

			x = x * i;

		}

		return x;

	}
}
