public class Pracownik{
  private String imie;
  private String nazwisko;
  private double wyplata;

  public Pracownik(String imie, String nazwisko, double wyplata) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wyplata = wyplata;
  }

  public String getImie() {
    return imie;
  }
  public String getNazwisko() {
    return nazwisko;
  }
  public double getWyplata() {
  	  return wyplata;
  }

  public String zamienNaString() {
    String string = "Imie: "+ this.imie + " Nazwisko: " + this.nazwisko + " Wyplata: "+   Double.toString(wyplata);
    return string;
  }
}