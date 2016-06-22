
public class Fibonacci {
	public static void main(String[] args) {
		int N = 10;
		for (int i = 0; i < N; i++)
			System.out.println(i + 1 + ": " + fib(i));
		int [] tablica = fibonacciIteracyjny(N);
		
		System.out.println();
		
		for (int i = 0; i < N; i++){
			System.out.println(i + 1 + ": " + tablica [i]);
		}
	}

	public static long fib(int n) {
		if (n <= 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

	static int [] fibonacciIteracyjny (int n){
		int [] tablica = new int [n];
		
		tablica [0] = 0;
			
		if (tablica.length > 1){
			tablica [1] = 1;	
			
			if (tablica.length > 2){
				for (int i = 2; i < n; i++){
					tablica [i] = tablica [i - 1] + tablica [i - 2];
				}
			}
		
		}

	return tablica;
}

}
