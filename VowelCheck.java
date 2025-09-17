import java.util.Scanner;
public class VowelCheck {
  public static void main(String args[]) {
      char ch;
      System.out.println("enter a letter");
      Scanner in=new Scanner(System.in);
      ch=in.next().charAt(0);
      if(ch=='a'||ch=='A'||
         ch=='e'||ch=='E'||
         ch=='i'||ch=='I'||
         ch=='o'||ch=='O'||
         ch=='u'||ch=='U'){
             System.out.println(ch +"is a vowel");
         }
      else{
          System.out.println(ch +"is a consonant" );
      }
  }
}