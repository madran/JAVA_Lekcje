import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrzykladyFileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("dane");

		BufferedReader br = new BufferedReader(fr);

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
	}

}
