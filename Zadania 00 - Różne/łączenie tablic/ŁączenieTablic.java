
public class ��czenieTablic {

	public static void main(String[] args) {
		char [] cyfry = {'1', '2', '3', '4', '5'};
		char [] litery = {'A','B', 'C', 'D', 'E'};
		char [] tablicaPo��czona = po��czTablice(cyfry, litery);
		char [] [] tablicaTablic = {
			{'0', '1', '2'},
			{'3', '4'},
			{'5', '6', '7', '8'},
			{'9'}
		};
		char [] tablicaTablicPo��czona = po��czTablic�Tablic(tablicaTablic);
		
			System.out.print(tablicaPo��czona);
			System.out.println( );
			System.out.print(tablicaTablicPo��czona);
	}
	
		static char [] po��czTablice (char [] tablica1, char [] tablica2){
			char [] tablicaPo��czona = new char [tablica1.length + tablica2.length];
			
			for (int i = 0; i < tablica1.length; i++){
				tablicaPo��czona [i] = tablica1 [i];
			}
			
			for (int i = 0; i < tablica2.length; i++){
				tablicaPo��czona [tablica1.length + i] = tablica2[i];
			}
			
			return tablicaPo��czona;
		}
			
		static char [] po��czTablic�Tablic (char tablica [] []){
			int d�ugo�� = 0;
			
			for (int i = 0; i < tablica.length; i++){
				d�ugo�� = d�ugo�� + tablica[i].length;
			}
			
			char [] tablicaPo��czona = new char [d�ugo��];
			int k = 0;
			
			for (int i = 0; i < tablica.length; i++){
				for (int j = 0; j < tablica[i].length; j++){
					tablicaPo��czona [k] = tablica [i] [j];
					k++;
				}
			}
			
			return tablicaPo��czona;
		}

}
