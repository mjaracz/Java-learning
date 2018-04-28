import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Odczyt {
    public static void main(String[] args) throws FileNotFoundException {
        String zdanie;

        System.out.println("Podaj zdanie ktore chcesz zapisac w dokumencie ala.txt: ");
        Scanner odczytZdania = new Scanner(System.in);
        zdanie = odczytZdania.next();


        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println(zdanie);
        zapis.close();
        
        
        File file = new File("ala.txt");
        Scanner odczyt = new Scanner(file);

        String tekst = odczyt.nextLine();
        System.out.println(tekst);
        odczyt.close();
    }
}