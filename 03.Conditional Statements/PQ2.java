import java.util.*;

public class PQ2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // double temp = 103.5;
    System.out.print("Enter Your Body temperature: ");
    double temp = sc.nextDouble();
    
    if(temp >= 100){
      System.out.println("You have a fever");
    }
    else{
      System.out.println("You don't have a fever");
    }
  }
}