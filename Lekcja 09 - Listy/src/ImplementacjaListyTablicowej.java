import java.util.ArrayList;
import java.util.Collections;

public class ImplementacjaListyTablicowej {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();

		System.out.println("Pocz¹tkowy rozmiar listy: " + lista.size());

		lista.add("Zielony");
		lista.add("Niebieski");
		lista.add("Czerwony");

		System.out.println("Rozmiar listy po dodaniu elementów: " + lista.size());

		System.out.println("Elementy listy: " + lista);
		lista.add(1, "Ró¿owy");
		System.out.println("Elementy lity po dodaniu ró¿owego na pozycjê 1: " + lista);

		System.out.println("Czy lista zawiera element 'Ró¿owy': " + lista.contains("Ró¿owy"));

		System.out.println("Na pozycji 2 znajduje siê: " + lista.get(2));

		System.out.println("Czerwony znajduje siê na pozycji: " + lista.indexOf("Czerwony"));

		Collections.sort(lista);
		System.out.println("Elementy listy po sortowaniu: " + lista);

		lista.remove("Czerwony");
		lista.remove(0);
		System.out.println("Elementy listy po usuniêciu dwóch elementów: " + lista);

		System.out.println("Czy lista jest pusta: " + lista.isEmpty());


	}

}
