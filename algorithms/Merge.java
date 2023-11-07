package algorithms;

import java.util.Random;
import estruturas.Lista;

public class Merge {
  public static int interact;
  public static int troca ;
  
  public void sort(Lista array){
    troca = 0; interact = 0;
    msort(array.ret(), 0, array.length()-1);
  }

  private void msort(int array[], int start, int end) {
    interact++;
    if (start < end) {
      int meio = (start + end) / 2;
      msort(array, start, meio);
      msort(array, meio + 1, end);
      combine(array, start, meio, end);
    }
  }

  private void combine(int array[], int start, int meio, int end) {
    int aleft = meio - start + 1;
    int arigth = end - meio;
    int i = 0, j = 0, k = 0;
    int finalArray[] = new int[aleft + arigth];
    
    for (; i <aleft && j < arigth; k++)
      finalArray[k] = (array[start + i] <= array[meio + 1 + j]) ? (array[start + i++]) : (array[meio + 1 + j++]);

    for (; i<aleft; i++)
      finalArray[k++] = array[start + i];
    
    for (; j< arigth; j++)
      finalArray[k++] = array[meio + 1 + j];
    
    interact += i;
    for (i = 0; i < k; i++) 
      array[start + i] = finalArray[i];
  }

  public void print(int[] array){
    System.out.print("[");
    for (int i: array){
      System.out.print(" "+i);
    }
    System.out.println(" ]");
  }
}
