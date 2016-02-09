
public class Palindrom {

	public static void main(String[] args) {
		char [] palindrom1 = {'A', 'L', 'A'};
		char [] palindrom2 = { 'a', 'b', 'c', 'c', 'b', 'a' };
		char [] niepalindrom1 = { 'a', 'b', 'c', 'd', 'b', 'a' };
		char [] niepalindrom2 = { 'a', 'b', 'c', 'd', 'a' };

		System.out.println (jestPalindromem(palindrom1));
		System.out.println(palindrom2);
		System.out.println(sprawd�Palindrom(palindrom2));
		System.out.println(niepalindrom1);
		System.out.println(sprawd�Palindrom(niepalindrom1));
		System.out.println(niepalindrom2);
		System.out.println(sprawd�Palindrom(niepalindrom2));


	}

	static boolean jestPalindromem (char [] s�owo) {

		boolean jestPalindromem = true;

		for (int i = 0; i < s�owo.length; i++){
			if (s�owo [i] != s�owo [s�owo.length - 1 - i]){
				jestPalindromem = false;
			}

		}

		return jestPalindromem;

	}

	static char[] sprawd�Palindrom (char [] s�owo) {

		char [] poprawno�� = new char [s�owo.length];

		for (int i = 0; i < s�owo.length; i++){
			if (s�owo [i] == s�owo [s�owo.length - 1 - i]){
				poprawno�� [i] = '*';
				poprawno�� [s�owo.length -1 - i] = '*';
			}

			else {
				poprawno�� [i] = 'x';
				poprawno�� [s�owo.length - 1 - i] = 'x';
			}

		}

		return poprawno��;

	}

}
