import java.util.Scanner;

public class Arr{
    public static void main(String[] args){
        String[] arr = new String[5];
        Scanner pobierz = new Scanner(System.in);

        System.out.println("podaj piec imion");
        for(int i = 0; i < 5; i++) {
            arr[i] = pobierz.next();
        };
        
        for(int i = 0; i < 5; i++) {
          System.out.println(" imie o indeksie: "+i +" "+ arr[i]);
        };
        
        System.out.println("Podaj dlugosc tablicy:");
        int n = pobierz.nextInt();
        pobierz.close();

        int[] arrInt = new int[n];

        int i = 0;
        while(i < n) {
          System.out.println(arrInt[i] = i);
          i++;
        };
    }
}