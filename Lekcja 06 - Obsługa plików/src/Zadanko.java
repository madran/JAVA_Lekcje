import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanko {

	public static void main(String[] args) throws IOException {

			FileReader fr = new FileReader("kontakty");
			BufferedReader br = new BufferedReader(fr);

			List<Osoba> osoby = new ArrayList<Osoba>();
			String [] dane = null;;

			String line = null;
			while ((line = br.readLine()) != null) {
				dane = line.split(";");
				osoby.add(new Osoba (dane [0], dane [1], dane [2]));
			}

			br.close();

//			for (Osoba o : osoby){
//				System.out.println(o);
//			}

		;
	}


}
