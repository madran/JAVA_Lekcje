
public class WiszukiwanieWzorcaWTek�cie {

	public static void main(String[] args) {
		szukaj("ab", "fddabfrg");

	}

	static boolean szukaj(String wzorzec, String tekst)
	{
		int d�ugo��Wzorca = wzorzec.length();
		int d�ugo��Tekstu = tekst.length();

	    for (int i = 0; i <= d�ugo��Tekstu - d�ugo��Wzorca; i++)
	    {
	        int j;

	        for (j = 0; j < d�ugo��Wzorca; j++)
	            if (tekst.charAt(i+j) != wzorzec.charAt(j))
	                break;

	        if (j == d�ugo��Wzorca) { // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
	           System.out.println("Pattern found at index " + i + " \n");
	           return true;
	        }
	    }

	    return false;
	}

}
