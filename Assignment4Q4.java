package lambdaAssignment;
import java.util.*;
public class Assignment4Q4{
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList)
    {
      employeeList.removeIf(x->x.length()%2!=0);
      return employeeList;
    }
    public static void main(String[] args)
     {
       ArrayList<String>list=new ArrayList<>();
       list.add("hello");
       list.add("Welcome");
       list.add("guys");
       list.add("hello World");
       list.add("how are you");
       ArrayList<String>list1 = removeOddLength(list);
       for(String i:list1)
       {
         System.out.println(list1);
       }
    }
}
