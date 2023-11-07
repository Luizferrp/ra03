package algorithms;
import estruturas.Node;
import estruturas.ListaLigada;

public class HashTable2 {
  public int size;
  private ListaLigada[] hashs;

  public HashTable2(int size){
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
    return ((key ^ (key >> 16))%this.size);
  }
  public int colisao(){
    int sum = 0;
    for (int i = 0; i < this.size; i++) { sum = sum + hashs[i].colisao(); }
    return sum;
  }
}

