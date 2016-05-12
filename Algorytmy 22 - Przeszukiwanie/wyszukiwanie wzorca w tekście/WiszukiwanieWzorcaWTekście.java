
public class WiszukiwanieWzorcaWTekœcie {

	public static void main(String[] args) {
		szukaj("ab", "fddabfrg");

	}

	static boolean szukaj(String wzorzec, String tekst)
	{
		int d³ugoœæWzorca = wzorzec.length();
		int d³ugoœæTekstu = tekst.length();

	    for (int i = 0; i <= d³ugoœæTekstu - d³ugoœæWzorca; i++)
	    {
	        int j;

	        for (j = 0; j < d³ugoœæWzorca; j++)
	            if (tekst.charAt(i+j) != wzorzec.charAt(j))
	                break;

	        if (j == d³ugoœæWzorca) { // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
	           System.out.println("Pattern found at index " + i + " \n");
	           return true;
	        }
	    }

	    return false;
	}

}
