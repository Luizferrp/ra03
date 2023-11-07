package algorithms;
import estruturas.Node;
import estruturas.ListaLigada;

public class HashTable1 {
  public int size;
  private ListaLigada[] hashs;

  public HashTable1(int size){
    this.size = size;
    this.hashs = new ListaLigada[this.size];
    for (int i = 0; i < this.size; i++) {hashs[i]=new ListaLigada();}
  }
  public void insert(int key){
    hashs[hash(key)].insert(key);    
  }
  public void search(int key){
    hashs[hash(key)].search(key);
  }
  public void delete(int key){
    hashs[hash(key)].delete(key);
  }
  public int hash(int key){
    int key2 = key;
    while (key2 > size) {
      key2 = key2/this.size;
    }
    return key%this.size;
  }
  public int colisao(){
    int sum = 1;
    for (int i = 0; i < this.size; i++) { sum = sum + hashs[i].colisao(); }
    return sum;
  }

}

