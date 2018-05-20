import java.util.Arrays;

public class Test {
	public static void main(String args[]){
		Pracownik krzysiek = new Pracownik("Krzysiek", "Wiejskowy", 3000);
		Pracownik kasia = new Pracownik("Kasia", "Mezowa", 2500);
		Pracownik edziu = new Pracownik("Edziu", "Rozlinski", 2000);

		Pracownik[] prac = {krzysiek, kasia, edziu};

		Komparator komp = new Komparator();

		Arrays.sort(prac, komp);
		wyswietl(prac);
	}

	public static void wyswietl(Pracownik[] prac){
		for(Pracownik p : prac) {
			System.out.println(p.zamienNaString());
		}
	}
}