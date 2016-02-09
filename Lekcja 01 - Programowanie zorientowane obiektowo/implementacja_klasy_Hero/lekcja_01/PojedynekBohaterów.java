package lekcja_01;

public class PojedynekBohaterów {

	public static void main(String[] args) {
		Bohater bohater1 = new Bohater (50, 50, 200, "£ukasz");
		Bohater bohater2 = new Bohater (75, 100, 100, "Kamilka");
		
		System.out.println(bohater1.HP);
		System.out.println(bohater2.HP);
		
		while (bohater1.HP>1 && bohater2.HP>1){
			bohater1.atakuj(bohater2);
			System.out.println("bohater2=" + bohater2.HP);
			
			bohater2.atakuj(bohater1);
			System.out.println("bohater1=" + bohater1.HP);
		}

	}
}

