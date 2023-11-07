package estruturas;
import estruturas.Nodin;
class Main {
  public static void main(String[] args) {
    System.out.println("olá mundo"); 
    ListaLigada teste = new ListaLigada();
    teste.insert(10);
    teste.insert(20);
    teste.insert(20);
    System.out.println(teste.search(10));
  } 
}

public class ListaLigada {
  private int coli;
  private Nodin index;

  public Boolean search(int value){
    if (this.index == null) System.out.println("index error");
    Nodin tmp = this.index;
    while (tmp.value() != value ) {
      if (tmp.next() == null) return false;
      tmp = tmp.next();
    } 
    return true;
  }
  public Nodin nsearch(int value){
    System.out.println("1");
    Nodin tmp = this.index;
    System.out.println("2");
    while (tmp.value() != value ) {
      if (tmp.next() == null) tmp.next(new Nodin(0));
      tmp = tmp.next();
    } 
    return tmp;
  }

  public void insert(int value){
    if (this.index != null){
      Nodin tmp = this.index;
      while (tmp.next() != null) {
        tmp = tmp.next();
      }
      tmp.next(new Nodin(value));
      tmp.next().prev(tmp);
      coli++;
    } else {
    this.index = new Nodin(value);
    }
  }
  public void delete(int value){
    Nodin tmp = nsearch(value);
    if (tmp.next() != null ){
      if (tmp.prev() != null){
        tmp.prev().next(tmp.next());
        tmp.next().prev(tmp.prev());
        tmp = null;
      } else {
        if (this.index.value() == value){
          tmp = this.index;
          this.index = this.index.next();
          tmp = null;
        }
      }
    } else {
      if (tmp.prev() != null){
        tmp.prev().next(null);
        tmp = null;
      }
    }
  }
  public int colisao(){
    return this.coli;
  }
}
/*

//package estruturas;

public class Nodin {
  private Nodin prev;
  private Nodin next;
  private int value;
  
  public Nodin prev(){ return this.prev; }
  public Nodin next(){ return this.next; }
  public int value(){ return this.value; }

  public void prev(Nodin prev){ this.prev = prev; }
  public void next(Nodin next){ this.next = next; }
  public void value(int value){ this.value = value; }

  public Nodin(int value){
    this.value = value;
  }
}

*/
