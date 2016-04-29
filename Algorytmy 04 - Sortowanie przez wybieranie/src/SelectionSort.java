
public class SelectionSort {

	public static void main(String[] args) {
		int[] tab = {4, 2, 7, 5, 9};

		selectionSort(tab);

		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
	}

	public static void selectionSort(int[] tab) {
	      int i, j, minIndex, tmp;
	      int n = tab.length;
	      for (i = 0; i < n - 1; i++) {
	            minIndex = i;
	            for (j = i + 1; j < n; j++)
	                  if (tab[j] < tab[minIndex])
	                        minIndex = j;
	            if (minIndex != i) {
	                  tmp = tab[i];
	                  tab[i] = tab[minIndex];
	                  tab[minIndex] = tmp;
	            }
	      }
	}

}
