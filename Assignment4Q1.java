package bharat;
import java.util.*;
interface Arithmatic {
    int operation(int a, int b);
}
public class Assignment4Q1{
    public static void main(String[] args)
    {
      Assignment4Q1 a1=new Assignment4Q1();
      Arithmatic addition=(int a,int b)->a+b;
      Arithmatic subtraction=(int a,int b)->{
      if(a>b)
        {
          return a-b;        }
        else
        {
          return b-a;
        }
      };
      Arithmatic multiplication=(int a,int b)->a*b;

      Arithmatic division=(int a, int b)->{
      if(b==0)
        {
          return 0;
        }
        else
        {
          return a/b;
        }
      };
      System.out.println("Enter the number a and b");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Addition"+" "+addition.operation(a,b));
      System.out.println("Subtraction"+" "+subtraction.operation(a,b));
      System.out.println("Multiplication"+" "+multiplication.operation(a,b));
      System.out.println("Division"+" "+division.operation(a,b));
    }
}
