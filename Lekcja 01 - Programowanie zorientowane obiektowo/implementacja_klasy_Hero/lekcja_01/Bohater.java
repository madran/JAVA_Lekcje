package lekcja_01;

public class Bohater {

	int atak;
	int obrona;
	int HP;
	String imi�;
		
	Bohater (int _atak, int _obrona, int _HP, String _imi�) { //dodano _ �eby parametry nie przys�oni�y atrybut�w, bo wychodza g�upoty
		
		atak = _atak;
		obrona = _obrona;
		HP = _HP;
		imi� = _imi�;
		
	}
	
	void atakuj (Bohater przeciwnik) {	
			double x = (double) przeciwnik.obrona / (double) atak;
			double obra�enia = atak / x;
			przeciwnik.HP = przeciwnik.HP - (int) obra�enia;
							
	}
	
}
