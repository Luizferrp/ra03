package algorithms;
import estruturas.*;

public class Main{
  public static void main(String[] args) {
    System.out.println("olá mundo");
    //int[] arr = new int[5];
    int[] arr = {4, 8, 2, 1, 9};
    Quick quick = new Quick();
    quick.sort(arr, 0, 4);
    for (int i : arr){
        System.out.println(i);
    }
  }
}

public class Quick{

  private static int interact;
  private static int troca;
  
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


  //**public int[] sort(int[] array, int startIndex, int finalIndex){
  // System.out.println("teste");
  //  int pivo = array[finalIndex];
  // int index = (startIndex -1);
  //  int swap;
  //  for (int j = startIndex; j <= finalIndex -1; j++){
  //    if (array[j] < pivo) {
  //      index++;
  //      swap = array[index];
  //      array[index] = array[j];
  //      array[j] = swap;
  //    }
  //  }
  //  sort(array, startIndex, pivo-1);
  //  sort(array, pivo+1, finalIndex);
  //  return array;
  //} 
}


