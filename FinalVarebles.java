public class FinalVarebles{
    public static void main(String[] args){
        final int Number = 4;
        final int number3;

        number3=7;

        String witaj = "witaj";
        String swiecie = "swiecie";
        String krolik = "kroliku";
        String kopniety = "kopniety";
        String powitanie = witaj+" "+swiecie+" "+krolik+" "+kopniety;

        System.out.println(powitanie);

        String substring = powitanie.substring(0, 5);

        System.out.println(substring);
        System.out.println(Number+number3);

    }
}