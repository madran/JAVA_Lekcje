

public class najwiêkszyWspólnyDzielnik {

	public static void main(String[] args) {
		int a = 18;
		int b = 48;

		int d1 = gcd(a, b);
		int d2 = gcd2(a, b);

		System.out.println("gcd(" + a + ", " + b + ") = " + d1);
		System.out.println("gcd(" + a + ", " + b + ") = " + d2);
	}

	// recursive implementation
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		else
			return gcd(q, p % q);
	}

	// non-recursive implementation
	public static int gcd2(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
}
