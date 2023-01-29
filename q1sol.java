import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.lang.*; // For string API

class Main {
    public static void main (String[] args) {

      try 
       {
         Scanner sc =  new Scanner(System.in);
         String s = " ";
         s = sc.nextLine();
         s.toLowerCase();
     
        int a=0 ;
        a = s.lastIndexOf('a');
        if( a == -1)
          System.out.println("-1");
        else
         System.out.println(a+1);
       }
      catch(Exception e)
      {
          System.out.println("-1");
      }
    }
}
