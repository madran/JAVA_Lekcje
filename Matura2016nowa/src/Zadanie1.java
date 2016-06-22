import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File dane = new File ("dane_6_1.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList <String> s�owa = new ArrayList <> ();
		
		while (skaner.hasNextLine()){
			s�owa.add(skaner.nextLine());
		}
		
		skaner.close();

		zaszyfruj(s�owa, 107);
		

		}
		
	
	static void zaszyfruj (ArrayList <String> s�owa, int k){
		
		while (k >= 26) {
			k = k - 26;
		}

		for (String s�owo : s�owa){
			String noweS�owo = "";
			for (int i = 0; i < s�owo.length(); i++){
				int nowyZnak =(char) ((int) s�owo.charAt(i) + k);
				if (nowyZnak > 90) noweS�owo += (char) (nowyZnak - 26);
				else noweS�owo += (char) nowyZnak;
			}
			System.out.println(noweS�owo);
		}
	}
	
	
}
