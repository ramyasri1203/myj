import java.util.Scanner;
public class Triangle {
  public static void main(String args[]) {
  float a;
  float b;
  float c;
  System.out.println("enter a number");
  Scanner in=new Scanner (System.in);
  a =in.nextFloat();
  b=in.nextFloat();
  c=in.nextFloat();
  if(a+b>c && b+c>a && a+c>b){
      if(a==b && b==c){
          System.out.println("Equaliteral");
      }
      else if(a==b || b==c || c==a){
          System.out.println("Isosceles");
      }
      else{
          System.out.println("Scalene");
      }
  }
  else{
      System.out.println("Not a valid triangle");
  }
 }
}