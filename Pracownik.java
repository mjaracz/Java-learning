public class Pracownik{
  
  String nick;
  String imie;
  String nazwisko;
  int wiek;

  public Pracownik() {
    nick = "PythonWymiatacz";
    imie = "Jan";
    nazwisko = "Kowalski";
    wiek = 43;
  };


  public Pracownik(String n, String im, String naz, int wie){
    nick = n;
    imie = im;
    nazwisko = naz;
    wiek = wie;
  }

  public Pracownik(Pracownik prac) {
    nick = prac.nick;
    imie = prac.imie;
    nazwisko = prac.nazwisko;
    wiek = prac.wiek;
  }

}