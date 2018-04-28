import static java.lang.Math.*;

public class Kalkulator{
    public static void main(String[] args){
        int a, b;
        a = 402;
        b = -543;

        double potega = pow(a, b);
        double bezwgledna = abs(b);

        System.out.println("potega: " + potega);
        System.out.println("wartosc bezwgledna z lidzby:" + b + " wartosc: " + bezwgledna);


    }
}