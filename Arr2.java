public class Arr2 {
  public static void main(String[] args) {
    int[][] arr = new int[2][3];
    int nr = 0;
    int nrIndex = 0;

    for(int i = 0; i < arr.length; i++){
      for(int x : arr[i]){
        x = nr;

        nr++;
        System.out.println("tab["+i+","+nrIndex+"] = "+ x);
        nrIndex++;
        if(nrIndex > 2) {
          nrIndex = 0;
        }

      }
      
    }
  }
}