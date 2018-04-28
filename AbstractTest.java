public class AbstractTest{
  public static void main(String[] args) {
    AbstractEmeryt czlowiek = new AbstractDziecko();
    
    System.out.println(czlowiek.krzyczy());
    System.out.println("Ilosc galek ocznych: "+ czlowiek.OCZY);
    czlowiek.biegnieDoSklepu(44, 34);
    ((AbstractDziecko)czlowiek).chodzi(450);
  }
}