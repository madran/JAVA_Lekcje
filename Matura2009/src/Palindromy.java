import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Palindromy {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File ("dane2.txt");
		Scanner skaner = new Scanner (dane);
		ArrayList <String> s³owa = new ArrayList <> ();
		
		while (skaner.hasNextLine()){
			s³owa.add(skaner.nextLine());
		}
		
		skaner.close();
		
		System.out.println("ZADANIE 1");
		System.out.println("Iloœæ palindromów " + zadanie1(s³owa));
		
	}
	
	static int zadanie1 (ArrayList <String> s³owa){
		
		int iloœæPalindromów = 0;
		
		for (String s : s³owa){
			String [] jednaLinijka = s.split(" ");
			int l = 0;
			
			if (jednaLinijka[0].length() == jednaLinijka[1].length()){;
				for (int m = 0, n = jednaLinijka[0].length() - 1; m < jednaLinijka[0].length(); m++, n--){
					if (jednaLinijka[0].charAt(m) == jednaLinijka[1].charAt(n)){
						l++;
					}
					
					if (l == jednaLinijka[0].length()){
						iloœæPalindromów ++;
					}
				}
			}
			
		}
	
		return iloœæPalindromów;
		
	}

}