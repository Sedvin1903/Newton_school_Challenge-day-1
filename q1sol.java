import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.lang.*; // For string API

class Main {
    public static void main (String[] args) {

      try 
       {   /* get i/p from user and convert to lowercase */
         Scanner sc =  new Scanner(System.in);
         String s = " ";
         s = sc.nextLine();
         s.toLowerCase();
     
        int a=0 ;
        a = s.lastIndexOf('a');       /* Check the last occurence  of 'a' in string */
        if( a == -1)
          System.out.println("-1");
        else
         System.out.println(a+1);  /* Since index  was conditioned to be start from 1 */
       }
      catch(Exception e)
      {
          System.out.println("-1");
      }
    }
}
