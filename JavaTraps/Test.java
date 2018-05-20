public class Test{
  public static void main(String[] args){
    String przyklad = "lubiePlacki";
    String przyklad1 = "lubiePlacki";

    System.out.println(przyklad == przyklad1);
    System.out.println(przyklad.equals(przyklad1));

    String s = przyklad;
    String s1 = new String("lubiePlacki");

    System.out.println(s == s1);
    System.out.println(s.equals(s1));
  }
}