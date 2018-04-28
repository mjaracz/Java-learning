public class Konwersia{
    public static void main(String[] args){
        int a = 10;
        double b = 48.90;

        double c = b / a;

        long d = (long) b / a;

        System.out.println("Rzutowanie type char " + d);
        System.out.println("Konwersia type int " + c);
        
        char znak = 98;
        char j = 'j';
        int h = j;

        System.out.println(znak +" "+ h);
    }
}