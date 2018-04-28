import java.util.Scanner;

public class Punkt{
  int wspX = 12;
  int wspY;
  
  int increment(boolean wybierz){
    if(wybierz) {
      int incrementX = wspX + 1;
      return incrementX;
    }
    else {
      int incrementY = wspY + 1;
      return incrementY;
    }
  }

  void zmiana(int x, boolean wybierz) {
    if(wybierz) {
      wspX =+ x;
    }
    else {
      wspY =+ x;
    }
  }

  int zwrocX() {
    return wspX;
  }
  int zwrocY() {
    return wspY;
  }

  void wyswietl() {
    System.out.println("Wspolrzedne odpowiedniow (X, Y):"+wspX+" "+wspY);
  }
}