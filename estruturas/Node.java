package estruturas;

public class Node {
  private Node prev;
  private Node next;
  private int value;
  
  public Node prev(){ return this.prev; }
  public Node next(){ return this.next; }
  public int value(){ return this.value; }

  public void prev(Node prev){ this.prev = prev; }
  public void next(Node next){ this.next = next; }
  public void value(int value){ this.value = value; }

  public Node(int value){ 
    this.prev = prev;
    this.value = value;
    this.next = next;
  }
}
