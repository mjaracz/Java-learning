import java.util.ArrayList;
import java.util.List;


public class Lista{
  public static void main(String[] args) {
    List<String> lista = new ArrayList<String>();
    lista.add("Rudolf");
    lista.add("Gienek");
    lista.add("Waclaw");
    lista.add("Morelna");
    lista.add("Waclawa");
    lista.add("Hawana");

    System.out.println("Rozmiar listy to: "+ lista.size());
    lista.remove("Waclawa");
    lista.remove(3);
    System.out.println("Rozmiar tablicy po usunieciu elemntu: "+ lista.size());
    System.out.println("Element listy o indeksie 3: "+ lista.get(3));
    int i = 0;
    for (String x : lista) {
      System.out.println("Element o indeksie: "+i+": "+ x);
      i++;
    }
  }
}