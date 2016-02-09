
public class Palindrom {

	public static void main(String[] args) {
		char [] palindrom1 = {'A', 'L', 'A'};
		char [] palindrom2 = { 'a', 'b', 'c', 'c', 'b', 'a' };
		char [] niepalindrom1 = { 'a', 'b', 'c', 'd', 'b', 'a' };
		char [] niepalindrom2 = { 'a', 'b', 'c', 'd', 'a' };

		System.out.println (jestPalindromem(palindrom1));
		System.out.println(palindrom2);
		System.out.println(sprawdŸPalindrom(palindrom2));
		System.out.println(niepalindrom1);
		System.out.println(sprawdŸPalindrom(niepalindrom1));
		System.out.println(niepalindrom2);
		System.out.println(sprawdŸPalindrom(niepalindrom2));


	}

	static boolean jestPalindromem (char [] s³owo) {

		boolean jestPalindromem = true;

		for (int i = 0; i < s³owo.length; i++){
			if (s³owo [i] != s³owo [s³owo.length - 1 - i]){
				jestPalindromem = false;
			}

		}

		return jestPalindromem;

	}

	static char[] sprawdŸPalindrom (char [] s³owo) {

		char [] poprawnoœæ = new char [s³owo.length];

		for (int i = 0; i < s³owo.length; i++){
			if (s³owo [i] == s³owo [s³owo.length - 1 - i]){
				poprawnoœæ [i] = '*';
				poprawnoœæ [s³owo.length -1 - i] = '*';
			}

			else {
				poprawnoœæ [i] = 'x';
				poprawnoœæ [s³owo.length - 1 - i] = 'x';
			}

		}

		return poprawnoœæ;

	}

}
