import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WydawanieReszty {

	public static void main(String[] args) {
		int[] monety = { 20, 10, 5, 2, 1 };
		List<Integer> reszta = wydajResztê(74, monety);
		System.out.println(reszta);

		int[] monety2 = { 5, 2 };
		dynamicChange(6, monety2);
	}

	public static List<Integer> wydajResztê(int kwota, int[] monety) {
		List<Integer> reszta = new ArrayList<Integer>();
		for (int i = 0; i < monety.length;) {
			kwota -= monety[i];
			reszta.add(monety[i]);
			if (monety[i] > kwota)
				i++;
		}

		return reszta;
	}

	public static int dynamicChange(int amount, int[] coins) {
		int[] tab = new int[amount + 1];
		tab[0] = 0;

		for (int i = 1; i <= amount; i++) {
			tab[i] = 0;
			System.out.print("i:" + i);
			for (int j = coins.length - 1; j >= 0; j--) {
				System.out.print("--j:" + j + "=" + coins[j]);
				if (i >= coins[j]) {
					int c = 1 + tab[i - coins[j]];
					System.out.print("--c:" + c);
					if (c < tab[i]) {
						tab[i] = c;
						System.out.println("--przypisanie");
					} else {
						System.out.println("--brak przypisania");
					}
				} else {
					System.out.println("");
				}
			}
		}
		System.out.println(Arrays.toString(tab));
	    int j = amount;
	    while(j > 0)
	    {
	    	System.out.print(tab[j]);
	        System.out.print(coins[tab[j]]);
	        j = j - coins[tab[j]];
	    }

		System.out.println(tab[amount]);
		return (tab[amount]);
	}
}
