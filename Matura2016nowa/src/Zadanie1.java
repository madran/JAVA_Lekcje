import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File dane = new File ("dane_6_1.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList <String> s這wa = new ArrayList <> ();
		
		while (skaner.hasNextLine()){
			s這wa.add(skaner.nextLine());
		}
		
		skaner.close();

		zaszyfruj(s這wa, 107);
		

		}
		
	
	static void zaszyfruj (ArrayList <String> s這wa, int k){
		
		while (k >= 26) {
			k = k - 26;
		}

		for (String s這wo : s這wa){
			String noweS這wo = "";
			for (int i = 0; i < s這wo.length(); i++){
				int nowyZnak =(char) ((int) s這wo.charAt(i) + k);
				if (nowyZnak > 90) noweS這wo += (char) (nowyZnak - 26);
				else noweS這wo += (char) nowyZnak;
			}
			System.out.println(noweS這wo);
		}
	}
	
	
}
