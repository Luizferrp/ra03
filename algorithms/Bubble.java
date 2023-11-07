package algorithms;;
import estruturas.Lista;

public class Bubble {
  public int interact;
  public int troca;

  public void bsort(Lista array){
    interact = 0;
    troca = 0;
    bsort(array.ret(), array.length());
  }
  public void bsort(int array[], int n) {
    int j = 0;
    interact++;
    for (; 0 < n-1; n--) {
      interact++;
      for (; j < n-1; j++) {
        interact++;
        if (array[j] > array[j+1]) {
          swap(array, j, j+1);
        }
      }
    }
  }
  public void swap(int[] array, int i, int j){
    int swap = array[j];
    array[j] = array[i];
    array[i] = swap;
    troca++;
  }
}
