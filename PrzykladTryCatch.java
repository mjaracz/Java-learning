import java.util.Scanner;

public class PrzykladTryCatch{
  public static void main(String[] args) {
    int tab[] = {2,4,5,6, 39, 48};
    int index;
    Scanner odczyt = new Scanner(System.in);

    System.out.println("Podaj index, elementu ktory chcesz zobaczyc: ");
    index = odczyt.nextInt();
    odczyt.close();

    try {
      System.out.println("Element tablicy o podanym indeksie to:"+ " "+ tab[index]);
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Zostal podany element z poza zakresu, dlugosc tablicy to: "+ tab.length);
    }
  }
}