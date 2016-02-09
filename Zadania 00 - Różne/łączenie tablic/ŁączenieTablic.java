
public class ŁączenieTablic {

	public static void main(String[] args) {
		char [] cyfry = {'1', '2', '3', '4', '5'};
		char [] litery = {'A','B', 'C', 'D', 'E'};
		char [] tablicaPołączona = połączTablice(cyfry, litery);
		char [] [] tablicaTablic = {
			{'0', '1', '2'},
			{'3', '4'},
			{'5', '6', '7', '8'},
			{'9'}
		};
		char [] tablicaTablicPołączona = połączTablicęTablic(tablicaTablic);
		
			System.out.print(tablicaPołączona);
			System.out.println( );
			System.out.print(tablicaTablicPołączona);
	}
	
		static char [] połączTablice (char [] tablica1, char [] tablica2){
			char [] tablicaPołączona = new char [tablica1.length + tablica2.length];
			
			for (int i = 0; i < tablica1.length; i++){
				tablicaPołączona [i] = tablica1 [i];
			}
			
			for (int i = 0; i < tablica2.length; i++){
				tablicaPołączona [tablica1.length + i] = tablica2[i];
			}
			
			return tablicaPołączona;
		}
			
		static char [] połączTablicęTablic (char tablica [] []){
			int długość = 0;
			
			for (int i = 0; i < tablica.length; i++){
				długość = długość + tablica[i].length;
			}
			
			char [] tablicaPołączona = new char [długość];
			int k = 0;
			
			for (int i = 0; i < tablica.length; i++){
				for (int j = 0; j < tablica[i].length; j++){
					tablicaPołączona [k] = tablica [i] [j];
					k++;
				}
			}
			
			return tablicaPołączona;
		}

}
