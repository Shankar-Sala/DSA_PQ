public class PQ3{
  public static void main(String[] args){
    int x, y,z;
    x = y = z = 2;
    x += y; //4
    y -= z;//0
    z /= (x + y);//0.5 ~ 0
    System.out.println(x +" "+y+" "+z);
  }
}