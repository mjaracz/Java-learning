public class GrupyArgumentow{
  public void wywolajMnie(int x, int...args) {
    int wynik = x;

    for(int i = 0; i < args.length; i++) {
      wynik *= args[i];
    }

    System.out.println("Wynik to: " + wynik);
  }
}