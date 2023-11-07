package estruturas;

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
