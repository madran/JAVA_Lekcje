import java.util.ArrayList;
import java.util.Collections;

public class ImplementacjaListyTablicowej {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();

		System.out.println("Pocz�tkowy rozmiar listy: " + lista.size());

		lista.add("Zielony");
		lista.add("Niebieski");
		lista.add("Czerwony");

		System.out.println("Rozmiar listy po dodaniu element�w: " + lista.size());

		System.out.println("Elementy listy: " + lista);
		lista.add(1, "R�owy");
		System.out.println("Elementy lity po dodaniu r�owego na pozycj� 1: " + lista);

		System.out.println("Czy lista zawiera element 'R�owy': " + lista.contains("R�owy"));

		System.out.println("Na pozycji 2 znajduje si�: " + lista.get(2));

		System.out.println("Czerwony znajduje si� na pozycji: " + lista.indexOf("Czerwony"));

		Collections.sort(lista);
		System.out.println("Elementy listy po sortowaniu: " + lista);

		lista.remove("Czerwony");
		lista.remove(0);
		System.out.println("Elementy listy po usuni�ciu dw�ch element�w: " + lista);

		System.out.println("Czy lista jest pusta: " + lista.isEmpty());


	}

}
