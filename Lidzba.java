import java.util.Scanner;

public class Lidzba{

    public static void main(String[] args) {
        double a, b, wynik;

        Scanner odczyt = new Scanner(System.in);
    
        System.out.println("podaj dwie lidzby, a i b, a my zajmiemy sie reszta:");
        a = odczyt.nextDouble();
        b = odczyt.nextDouble();
    
        wynik = (a / b)*a;
    
        System.out.println("wynik dzialania (a/b)*a = "+wynik);
    };
}