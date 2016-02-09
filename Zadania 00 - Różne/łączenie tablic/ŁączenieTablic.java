
public class £¹czenieTablic {

	public static void main(String[] args) {
		char [] cyfry = {'1', '2', '3', '4', '5'};
		char [] litery = {'A','B', 'C', 'D', 'E'};
		char [] tablicaPo³¹czona = po³¹czTablice(cyfry, litery);
		char [] [] tablicaTablic = {
			{'0', '1', '2'},
			{'3', '4'},
			{'5', '6', '7', '8'},
			{'9'}
		};
		char [] tablicaTablicPo³¹czona = po³¹czTablicêTablic(tablicaTablic);
		
			System.out.print(tablicaPo³¹czona);
			System.out.println( );
			System.out.print(tablicaTablicPo³¹czona);
	}
	
		static char [] po³¹czTablice (char [] tablica1, char [] tablica2){
			char [] tablicaPo³¹czona = new char [tablica1.length + tablica2.length];
			
			for (int i = 0; i < tablica1.length; i++){
				tablicaPo³¹czona [i] = tablica1 [i];
			}
			
			for (int i = 0; i < tablica2.length; i++){
				tablicaPo³¹czona [tablica1.length + i] = tablica2[i];
			}
			
			return tablicaPo³¹czona;
		}
			
		static char [] po³¹czTablicêTablic (char tablica [] []){
			int d³ugoœæ = 0;
			
			for (int i = 0; i < tablica.length; i++){
				d³ugoœæ = d³ugoœæ + tablica[i].length;
			}
			
			char [] tablicaPo³¹czona = new char [d³ugoœæ];
			int k = 0;
			
			for (int i = 0; i < tablica.length; i++){
				for (int j = 0; j < tablica[i].length; j++){
					tablicaPo³¹czona [k] = tablica [i] [j];
					k++;
				}
			}
			
			return tablicaPo³¹czona;
		}

}
