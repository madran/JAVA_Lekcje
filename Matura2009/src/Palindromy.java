import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Palindromy {

	public static void main(String[] args) throws FileNotFoundException {

		File dane = new File ("dane2.txt");
		Scanner skaner = new Scanner (dane);
		ArrayList <String> s�owa = new ArrayList <> ();
		
		while (skaner.hasNextLine()){
			s�owa.add(skaner.nextLine());
		}
		
		skaner.close();
		
		System.out.println("ZADANIE 1");
		System.out.println("Ilo�� palindrom�w " + zadanie1(s�owa));
		
	}
	
	static int zadanie1 (ArrayList <String> s�owa){
		
		int ilo��Palindrom�w = 0;
		
		for (String s : s�owa){
			String [] jednaLinijka = s.split(" ");
			int l = 0;
			
			if (jednaLinijka[0].length() == jednaLinijka[1].length()){;
				for (int m = 0, n = jednaLinijka[0].length() - 1; m < jednaLinijka[0].length(); m++, n--){
					if (jednaLinijka[0].charAt(m) == jednaLinijka[1].charAt(n)){
						l++;
					}
					
					if (l == jednaLinijka[0].length()){
						ilo��Palindrom�w ++;
					}
				}
			}
			
		}
	
		return ilo��Palindrom�w;
		
	}

}