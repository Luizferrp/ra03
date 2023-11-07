package algorithms;
import estruturas.Lista;

public class Quick{

  public static int interact;
  public static int troca;
  
  public static void sort(Lista array){
    interact = 0; troca = 0;
    sort(array.ret(), 0, array.length()-1);
  }
  public static void sort(int[] array, int startIndex, int finalIndex) {
    interact++;
    if (startIndex < finalIndex) { //(...)? ordene : não há itens a serem ordenados;
      int localIndex = startIndex - 1;
      int swap;
      for (int j = startIndex; j <= finalIndex - 1; j++) {
        interact++;
        if (array[j] < array[finalIndex]) {
          localIndex++;
          swap = array[localIndex];
          array[localIndex] = array[j];
          array[j] = swap;
        }
      }
      swap = array[localIndex+1];
      array[localIndex+1] = array[finalIndex];
      array[finalIndex] = swap;
      localIndex++;
      troca++;
      sort(array, startIndex, localIndex - 1);
      sort(array, localIndex + 1, finalIndex);
    }

  }
}

