package estruturas;
import java.util.Random;

public class Registro {
  private int value;
  public Registro(){
    Random gen = new Random();
    for (int i = 9; i >= 1; i--){
      int tmp = gen.nextInt(9);
      this.value +=  expoente(10, i)* ((tmp > 0) ? tmp : 1);    
    }
  }
  public int value(){
    return this.value;
  }
  public int expoente(int base, int expoente){
    return (expoente == 1) ? 1 : base * expoente(base, expoente -1);
  }
}
