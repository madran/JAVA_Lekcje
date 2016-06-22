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
		
		ArrayList <Integer> ci퉓1 = new ArrayList <> ();
		ArrayList <Integer> ci퉓2 = new ArrayList <> ();
		ArrayList <Integer> ci퉓3 = new ArrayList <> ();
		
		Scanner skaner1 = new Scanner (dane1);
		while (skaner1.hasNextLine()){
			ci퉓1.add(Integer.parseInt(skaner1.nextLine()));
		}
		skaner1.close();
		
		Scanner skaner2 = new Scanner (dane2);
		while (skaner2.hasNextLine()){
			ci퉓2.add(Integer.parseInt(skaner2.nextLine()));
		}
		skaner2.close();
		
		Scanner skaner3 = new Scanner (dane3);
		while (skaner3.hasNextLine()){
			ci퉓3.add(Integer.parseInt(skaner3.nextLine()));
		}
		skaner3.close();
		
		System.out.println(zadanie1(ci퉓1));
		System.out.println(zadanie1(ci퉓2));
		System.out.println(zadanie1(ci퉓3));
		
		System.out.println(zadanie2(ci퉓1));
		System.out.println(zadanie2(ci퉓2));
		System.out.println(zadanie2(ci퉓3));
		
	}
	
	static int zadanie1 (ArrayList <Integer> ci퉓){
		
		int najlepszaSuma = ci퉓.get(0);
		if (ci퉓.get(ci퉓.size() - 1) > najlepszaSuma){
			najlepszaSuma = ci퉓.get(ci퉓.size() - 1);
		}

		
		for (int i = 0; i < ci퉓.size(); i++){
			int suma = 0;
			for (int j = 0 + i; j < ci퉓.size(); j++){
					suma += ci퉓.get(j);
					if (suma > najlepszaSuma) najlepszaSuma = suma;
			}

		}
		
		return najlepszaSuma;
		
	}
	
	
	static int zadanie2 (ArrayList <Integer> ci퉓){
		
		HashMap <Integer, Integer> ci퉓Wymieszany = new HashMap <> ();
		int najpopularniejszyElement = 0;
		int wyst퉝ieniaNajpopularniejszegoElementu = 1;
		
		for (Integer c : ci퉓){

			if (ci퉓Wymieszany.containsKey(c)) {
				ci퉓Wymieszany.put(c, ci퉓Wymieszany.get(c) + 1);
			
			}
			else ci퉓Wymieszany.put(c, 1);
		}
		
		
		for (Entry <Integer, Integer> element : ci퉓Wymieszany.entrySet()){
			if (element.getValue() > wyst퉝ieniaNajpopularniejszegoElementu) {
				najpopularniejszyElement = element.getKey();
				wyst퉝ieniaNajpopularniejszegoElementu = element.getValue();
			}
		}
		
		return najpopularniejszyElement;
	}

}
