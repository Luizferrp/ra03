package algorithms;

import java.util.Random;
import estruturas.*;

class Main{
  public static void main(String[] args){
    //System.out.println("olá mundo");
    Random gen = new Random(1234);
    Lista array1 = new Lista(50);
    Lista array2 = new Lista(500);
    Lista array3 = new Lista(1000);
    Lista array4 = new Lista(5000);
    Lista array5 = new Lista(10000);
    array1.fullOfRandom(500);
    array2.fullOfRandom(5000);
    array3.fullOfRandom(10000);
    array4.fullOfRandom(50000);
    array5.fullOfRandom(100000);
    array1.print();
  }
}
