package lekcja_01;

public class Bohater {

	int atak;
	int obrona;
	int HP;
	String imiê;
		
	Bohater (int _atak, int _obrona, int _HP, String _imiê) { //dodano _ ¿eby parametry nie przys³oni³y atrybutów, bo wychodza g³upoty
		
		atak = _atak;
		obrona = _obrona;
		HP = _HP;
		imiê = _imiê;
		
	}
	
	void atakuj (Bohater przeciwnik) {	
			double x = (double) przeciwnik.obrona / (double) atak;
			double obra¿enia = atak / x;
			przeciwnik.HP = przeciwnik.HP - (int) obra¿enia;
							
	}
	
}
