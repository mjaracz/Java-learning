public class String2 {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("a");
    long start = System.nanoTime();
    for(int i=0; i < 100000; i++) {
      s.append("a");
    }
    s.toString();
    System.out.println("Time: "+ (System.nanoTime()-start));
  }
}