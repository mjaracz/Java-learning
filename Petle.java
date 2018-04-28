import java.util.Scanner;

public class Petle{
    public static void main(String[] args) {
        int a;
        Scanner pobierz = new Scanner(System.in);

        System.out.println("podaj lidzbe sekund za ile ma wybuchnoac bomba");
        a = pobierz.nextInt();
        pobierz.close();

        for (int i = 0; i <= a; i++) {
            System.out.println("Bomba Wybuchnie za:"+ i);
        }

    }
}