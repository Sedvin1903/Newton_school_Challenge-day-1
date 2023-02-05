import java.io.*; 
import java.util.*; 
import java.lang.*;

/* REFER README FOR QUESTION */

class Main {
    public static void main (String[] args) {
    
        /* String[] bin ={'0','1'};
        String[] oct ={'0','1','2','3','4','5','6','7'};  
        */
        
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(); 
        
        String[] s = S.split(" ");
        int A = Integer.parseInt(s[0]);        // Get splited of 2 integers from single line 
        int B = Integer.parseInt(s[1]);

        String a = Integer.toString​(A);
        int digits = 0 ;

      for(int i = 0 ; i< na.length ; i++ )
      {
             
        if ( B == 10)
        {
            digits =  a.length()-1;
            System.out.println(digits);
            break;
        }
        else
        {
            while(A != 0)
               {
                  int r = A / B; 
                  digits++;
                  A = r;
               }
               System.out.println(digits);
               break;
        }
      }
    }
}
