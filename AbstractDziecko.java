public class AbstractDziecko extends AbstractEmeryt{
  @Override
  public String krzyczy() {
    return "Wle wle wle skonczysz pod mostem jak bedziesz tak olewal szkole";
  };

  public void chodzi(int kroki) {
    System.out.println("przeszedl o "+ kroki + "krokow");
  }
}