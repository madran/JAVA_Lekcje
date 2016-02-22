import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrzykladyFiles {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("dane"); //Klasa Path reprezentuje œcie¿kê do pliku

		//Metoda readAllLines() przyjmuje jako argument jedynie obiekty typu Path
		List<String> lines = Files.readAllLines(path);

		for(String line : lines) {
			System.out.println(line);
		}

	}

}
