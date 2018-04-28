import java.util.Scanner;

public class PobierzMnie{
    public static void main(String[] args){
        System.out.println("Potrzebujemy dwoch lidz, a i b, porowanienie gwarantowane");
        double a, b;
        String imie;

        Scanner odczyt = new Scanner(System.in);

        a = odczyt.nextDouble();
        b = odczyt.nextDouble();

        boolean porownanie = (a == b);

        if(porownanie) {
            System.out.println("Lidzby sa rowne."+ porownanie);
        }
        else {
            System.out.println("Lidzby nie sa rowne."+ porownanie);            
        }


        System.out.println("Znowu potrzebujmy kolejnych danych od ciebie, podaj imie, a my sprawdzimy czy cie ktos zna: ");
        imie = odczyt.next();

        
            if("Karol".equals(imie)) System.out.println("Twoje imie jest w bazie, witaj Karolu");
            else if ("Marek".equals(imie)) System.out.println("Twoje imie jest w bazie, czesc Marku");
            else System.out.println("Twojego imienia nie ma w bazie");
    } 
}