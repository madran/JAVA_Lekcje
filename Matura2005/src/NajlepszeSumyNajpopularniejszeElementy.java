import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class NajlepszeSumyNajpopularniejszeElementy {

	public static void main(String[] args) throws FileNotFoundException {
	
		File dane1 = new File ("dane5-1.txt");
		File dane2 = new File ("dane5-2.txt");
		File dane3 = new File ("dane5-3.txt");
		
		ArrayList <Integer> ci�g1 = new ArrayList <> ();
		ArrayList <Integer> ci�g2 = new ArrayList <> ();
		ArrayList <Integer> ci�g3 = new ArrayList <> ();
		
		Scanner skaner1 = new Scanner (dane1);
		while (skaner1.hasNextLine()){
			ci�g1.add(Integer.parseInt(skaner1.nextLine()));
		}
		skaner1.close();
		
		Scanner skaner2 = new Scanner (dane2);
		while (skaner2.hasNextLine()){
			ci�g2.add(Integer.parseInt(skaner2.nextLine()));
		}
		skaner2.close();
		
		Scanner skaner3 = new Scanner (dane3);
		while (skaner3.hasNextLine()){
			ci�g3.add(Integer.parseInt(skaner3.nextLine()));
		}
		skaner3.close();
		
		System.out.println(zadanie1(ci�g1));
		System.out.println(zadanie1(ci�g2));
		System.out.println(zadanie1(ci�g3));
		
		System.out.println(zadanie2(ci�g1));
		System.out.println(zadanie2(ci�g2));
		System.out.println(zadanie2(ci�g3));
		
	}
	
	static int zadanie1 (ArrayList <Integer> ci�g){
		
		int najlepszaSuma = ci�g.get(0);
		if (ci�g.get(ci�g.size() - 1) > najlepszaSuma){
			najlepszaSuma = ci�g.get(ci�g.size() - 1);
		}

		
		for (int i = 0; i < ci�g.size(); i++){
			int suma = 0;
			for (int j = 0 + i; j < ci�g.size(); j++){
					suma += ci�g.get(j);
					if (suma > najlepszaSuma) najlepszaSuma = suma;
			}

		}
		
		return najlepszaSuma;
		
	}
	
	
	static int zadanie2 (ArrayList <Integer> ci�g){
		
		HashMap <Integer, Integer> ci�gWymieszany = new HashMap <> ();
		int najpopularniejszyElement = 0;
		int wyst�pieniaNajpopularniejszegoElementu = 1;
		
		for (Integer c : ci�g){

			if (ci�gWymieszany.containsKey(c)) {
				ci�gWymieszany.put(c, ci�gWymieszany.get(c) + 1);
			
			}
			else ci�gWymieszany.put(c, 1);
		}
		
		
		for (Entry <Integer, Integer> element : ci�gWymieszany.entrySet()){
			if (element.getValue() > wyst�pieniaNajpopularniejszegoElementu) {
				najpopularniejszyElement = element.getKey();
				wyst�pieniaNajpopularniejszegoElementu = element.getValue();
			}
		}
		
		return najpopularniejszyElement;
	}

}
