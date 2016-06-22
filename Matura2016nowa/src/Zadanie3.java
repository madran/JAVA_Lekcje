import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File dane = new File ("dane_6_3.txt");
		Scanner skaner = new Scanner(dane);
		ArrayList <String> s這wa = new ArrayList <> ();
		ArrayList <String> szyftogramy = new ArrayList <> ();
		
		while (skaner.hasNextLine()){
			s這wa.add(skaner.next());
			szyftogramy.add(skaner.next());
		}
		
		skaner.close();
	
		scezaruj(s這wa, szyftogramy);

	}

	static void scezaruj (ArrayList <String> s這wa, ArrayList <String> szyftogramy) {
		
		for (int i = 0; i < s這wa.size(); i++){
			String s這wo = s這wa.get(i);
			String szyftogram = szyftogramy.get(i);
			String noweS這wo = "";
			
			int k = (int) szyftogram.charAt(0) - (int) s這wo.charAt(0);
			
			for (int j = 0; j < s這wo.length(); j++){
				int nowyZnak =(char) ((int) s這wo.charAt(j) + k);
				if (nowyZnak > 90) noweS這wo += (char) (nowyZnak - 26);
				else if (nowyZnak < 65) noweS這wo += (char) (nowyZnak + 26);
				else noweS這wo += (char) nowyZnak;
			}
			
			if (!noweS這wo.equals(szyftogram)) System.out.println(s這wo);
			
		}
		
	}
	
}