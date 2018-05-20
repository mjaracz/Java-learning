import java.util.Comparator;


public class Komparator implements Comparator<Pracownik>{
	@Override
	public int compare(Pracownik pl, Pracownik p2){
		if(p2 == null) return -1;
		if(pl.getWyplata() > p2.getWyplata()) return 1;
		else if(pl.getWyplata() < p2.getWyplata()) return -1;
		else return 0;
	}
}