
public class NajmniejszaWspólnaWielokrotnoœæ {

	public static void main(String[] args) {
		int a = 8;
		int b = 3;

		System.out.println(lcm(a, b));

	}

	private static long lcm(int a, int b)
	{
	    return a * (b / gcd(a, b));
	}


	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}

}
