package algorithms;
import estruturas.Lista;
import estruturas.Registro;
 class Main2 {
  public static void main(String[] args) {
    
    long tt = 0, st = 0;

    Registro[] rr = new Registro[5000000];
    for (int i = 0; i<=4999999;i++){ rr[i] = new Registro();}
    
    HashTable0[] H0 = {new HashTable0(10), new HashTable0(100), new HashTable0(1000), new HashTable0(10000), new HashTable0(1000000)};
    HashTable1[] H1 = {new HashTable1(10), new HashTable1(100), new HashTable1(1000), new HashTable1(10000), new HashTable1(1000000)};
    HashTable2[] H2 = {new HashTable2(10), new HashTable2(100), new HashTable2(1000), new HashTable2(10000), new HashTable2(1000000)};
    int[] data = {20000, 100000, 500000, 1000000, 5000000};
   
    for (int i = 0; i < 5; i++){
      st = System.currentTimeMillis();
      for (int j = 0; j < data[i]; j++){
        H0[i].insert(rr[j].value());
      }
      tt = System.currentTimeMillis() - st;
      System.out.println("HashTable0 para " + data[i] + " itens com " + H0[i].colisao()  + " colisões: " + tt + " milisegundos");
    }

    for (int i = 0; i < 5; i++){
      st = System.currentTimeMillis();
      for (int j = 0; j < data[i]; j++){
        H1[i].insert(rr[j].value());
      }
      tt = System.currentTimeMillis() - st;
      System.out.println("HashTable1 para " + data[i] + " itens com " + H1[i].colisao()  + " colisões: " + tt + " milisegundos"); //+ data[i] + " itens: " + tt + " milisegundos");
    }

    for (int i = 0; i < 5; i++){
      st = System.currentTimeMillis();
      for (int j = 0; j < data[i]; j++){
        H2[i].insert(rr[j].value());
      }
      tt = System.currentTimeMillis() - st;
      System.out.println("HashTable2 para " + data[i] + " itens com " + H2[i].colisao()  + " colisões: " + tt + " milisegundos"); //+ data[i] + " itens: " + tt + " milisegundos");
    }


    for (int i = 0; i < 15; i++){
      st = System.currentTimeMillis();
      for (int j = 0; j < data[i%5]; j++){
        H0[i%5].search(rr[j].value());
      }
      tt = System.currentTimeMillis() - st;
      System.out.println("HashTable0 para busca de " + data[i%5] + " itens com " + H0[i%5].colisao()  + " colisões: " + tt + " milisegundos");//+ data[i%5] + " itens: " + tt + " milisegundos");
    }

    
    for (int i = 0; i < 15; i++){
      st = System.currentTimeMillis();
      for (int j = 0; j < data[i%5]; j++){
        H1[i%5].search(rr[j].value());
      }
      tt = System.currentTimeMillis() - st;
      System.out.println("HashTable1 para " + data[i%5] + " itens com " + H1[i%5].colisao()  + " colisões: " + tt + " milisegundos");//+ data[i%5] + " itens: " + tt + " milisegundos");
    }

    
    for (int i = 0; i < 15; i++){
      st = System.currentTimeMillis();
      for (int j = 0; j < data[i%5]; j++){
        H2[i%5].search(rr[j].value());
      }
      tt = System.currentTimeMillis() - st;
      System.out.println("HashTable2 para " + data[i%5] + " itens com " + H2[i%5].colisao()  + " colisões: " + tt + " milisegundos");//+ data[i%5] + " itens:" + tt + " milisegundos");
    }

    System.out.println("finish");
  }
}
class Main{
  public static void main(String[] args) {
    
    Lista array1 = new Lista(50);    Lista array2 = new Lista(500);     Lista array3 = new Lista(1000);    Lista array4 = new Lista(5000);     Lista array5 = new Lista(10000);
    array1.fullOfRandom(500);array2.fullOfRandom(5000);array3.fullOfRandom(10000);array4.fullOfRandom(50000);array5.fullOfRandom(100000);
    Lista[] arrs = {array1, array2, array3, array4, array5};
    long[][] results = new long[3][15];
    long st, et, tt = 0;
    int j;
    
    System.out.println("iniciando quicksort");
    Quick quick = new Quick();
    for (Lista i: arrs){
      System.out.print("teste com "+i.length()+" itens:"); j = -1;
      for (int k = 0; k < 5; k++){
        array1.fullOfRandom(500);array2.fullOfRandom(5000);array3.fullOfRandom(10000);array4.fullOfRandom(50000);array5.fullOfRandom(100000);
        st = System.nanoTime();
        quick.sort(i);
        tt = System.nanoTime() - st;
        results[1][++j] = quick.interact;
        results[1][++j] = quick.troca;
        results[1][++j] = tt;
      }
      System.out.println(quick.interact + " interações," + quick.troca +" trocas, " + ((results[1][2]+results[1][5]+results[1][8]+results[1][11]+results[1][14])/5) + " nano segundos");
    }

    System.out.println("iniciando mergesort");
    Merge merge = new Merge();
    for (Lista i: arrs){
      System.out.print("teste com "+i.length()+" itens:"); j = -1;
      for (int k = 0; k < 5; k++){
        array1.fullOfRandom(500);array2.fullOfRandom(5000);array3.fullOfRandom(10000);array4.fullOfRandom(50000);array5.fullOfRandom(100000);
        st = System.nanoTime();
        merge.sort(i);
        tt = System.nanoTime() - st;
        results[2][++j] = quick.interact;
        results[2][++j] = quick.troca;
        results[2][++j] = tt;
      }
      System.out.println(merge.interact + " interações," + merge.troca +" trocas, " + ((results[2][2]+results[2][5]+results[2][8]+results[2][11]+results[1][14])/5) + " nano segundos");
    }

    System.out.println("iniciando bubblesort");
    Bubble bubble = new Bubble();
    for (Lista i: arrs){
      System.out.print("teste com "+i.length()+" itens:"); j = -1;
      for (int k = 0; k < 5; k++){
        array1.fullOfRandom(500);array2.fullOfRandom(5000);array3.fullOfRandom(10000);array4.fullOfRandom(50000);array5.fullOfRandom(100000);
        st = System.nanoTime();
        bubble.bsort(i);
        tt = System.nanoTime() - st;
        results[0][++j] = quick.interact;
        results[0][++j] = quick.troca;
        results[0][++j] = tt;
      }
      System.out.println(bubble.interact + " interações," + bubble.troca +" trocas, " + ((results[0][2]+results[0][5]+results[0][8]+results[0][11]+results[0][14])/5) + " nano segundos");
    }
  }
  public static void print(int[] array){
    System.out.print("[");
    for (int i : array){
      System.out.print(" " + i);
    }
    System.out.println("]");
  }
}
