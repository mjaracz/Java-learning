import java.util.Scanner;

public class Dzialaj{
  public static void main(String[] args) {
    Punkt punkt = new Punkt();
    Scanner odczyt = new Scanner(System.in);

    System.out.println("Podaj wspolrzedna ktora chcesz inkrementowac: (wpisz dla x -true, dla y -false) ");
    boolean wybierz = odczyt.nextBoolean();

    System.out.println(punkt.increment(wybierz));
    System.out.println("Wpisz lidzbe o jaka chcesz zmienic wybrana wspolrzedna, wybierz poprzez wpisanie: true -x, false -y: ");
    int lidzba = odczyt.nextInt();
    boolean wybierz1 = odczyt.nextBoolean();
    punkt.zmiana(lidzba, wybierz1);

    punkt.wyswietl();
  }
}