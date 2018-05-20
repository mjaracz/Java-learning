public class String1 {
  public static void main (String[] args) {
    String s = "a";
    long start = System.nanoTime();
    for(int i = 0; i < 100000; i++) {
      s = s+ "a";
      //s = new StringBuilder(s).append("a").toString();
    }
    System.out.println("Time: " + (System.nanoTime() - start));
  }
}