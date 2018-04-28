public abstract class AbstractEmeryt{
  public final static int OCZY = 2;

  public abstract String krzyczy();

  public void biegnieDoSklepu(int czas, int odleglosc) {
    System.out.println("Odleglosc do sklepu: " + odleglosc);
    System.out.println("Ide po farby bede za: "+ czas);    
  } 
}