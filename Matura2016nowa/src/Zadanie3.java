import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File dane = new File ("dane_6_3.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList <String> s�owa = new ArrayList <> ();
		ArrayList <String> szyftogramy = new ArrayList <> ();
		
		while (skaner.hasNextLine()){
			s�owa.add(skaner.next());
			szyftogramy.add(skaner.next());
		}
		
		skaner.close();
	
		scezaruj(s�owa, szyftogramy);

	}

	static void scezaruj (ArrayList <String> s�owa, ArrayList <String> szyftogramy) {
		
		for (int i = 0; i < s�owa.size(); i++){
			String s�owo = s�owa.get(i);
			String szyftogram = szyftogramy.get(i);
			String noweS�owo = "";
			
			int k = (int) szyftogram.charAt(0) - (int) s�owo.charAt(0);
			
			for (int j = 0; j < s�owo.length(); j++){
				int nowyZnak =(char) ((int) s�owo.charAt(j) + k);
				if (nowyZnak > 90) noweS�owo += (char) (nowyZnak - 26);
				else if (nowyZnak < 65) noweS�owo += (char) (nowyZnak + 26);
				else noweS�owo += (char) nowyZnak;
			}
			
			if (!noweS�owo.equals(szyftogram)) System.out.println(s�owo);
			
		}
		
	}
	
}