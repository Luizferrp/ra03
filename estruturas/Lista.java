package estruturas;

import java.util.Random;

public class Lista {
  Random gen = new Random(12345);
  private int[] lista;
  private int length;

  public Lista(int n){
    this.length = n;
    lista = new int[this.length];
  }
  public Lista(int[] n){
    this.lista = n;
  }
  public int i(int n){
    return this.lista[n];
  }
  public void i(int n, int i){
    this.lista[i] = n;
  }
  public void print(){
    System.out.print("[");
    for (int i = 0; i < this.length; i++){
      System.out.print(" ");
      System.out.print(this.lista[i]);
    }
    System.out.println("]");
  }
  public int length(){
    return this.length;
  }
  public void fullOfRandom(int n){
    for (int i = 0; i < this.length; i++) { this.lista[i] = gen.nextInt(n); }
  }
}

class Main{
  public static void main(String[] args) {
    System.out.println("olá mundo");
  }
}
