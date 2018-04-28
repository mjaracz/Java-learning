public class Firma{
  public static void main(String[] args) {
    
    
    Pracownik[] pracownicy = new Pracownik[3];
    pracownicy[0] = new Pracownik();
    pracownicy[1] = new Pracownik("JavaScriptMaster", "Staszek", "Krolowski", 87);
    pracownicy[2] = new Pracownik(pracownicy[1]);


    int i = 0;
    for(Pracownik x : pracownicy) {
      if(i == 3) System.out.println("wiek naszego czlowieka: "+ x);
      else System.out.println("Imie, nazwisko i Ksywka: "+x.imie + " " + x.nazwisko + " " + x.nick + " " + x.wiek);
    }
   
  }
}