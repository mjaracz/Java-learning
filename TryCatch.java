import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TryCatch{

  public static void main(String[] args) {
    int tab[] = {23, 43, 54, 34, 54, 5, 34};
    BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
    
    boolean czyWpisana = false;
    
    System.out.println("Ktory element chcesz zobaczyc: ");

    int index = -1;
    
    while(!czyWpisana) {

      try{
        index = Integer.parseInt(odczyt.readLine());
        System.out.println("Element tab o podanym indeksie: "+tab[index]);
      }
      catch(NumberFormatException e) {
        System.out.println("Podales, nie lidzbe. \n ktory element chcesz zobaczyc");
      }
      catch(IOException e) {
        System.out.println("Bledne dane");
      }
      catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("podales indeks z poza zakresu. Dlugosc tablicy to: " + tab.length);
      }
      
      czyWpisana = (index==-1 || index >= tab.length)? false: true;


    }


  }

}