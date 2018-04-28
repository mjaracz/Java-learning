public class UstawPunkt{
  public static void main(String[] args) {
    Punkt punkt = new Punkt();

    punkt.ustawX(25.4);
    punkt.ustawY(57.9);

    System.out.println("Wspolrzedne X wynosza: "+punkt.podajX());
    System.out.println("Wspolrzedne Y wynosza: "+punkt.podajY());    
  }
}