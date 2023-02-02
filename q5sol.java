import java.io.*;
import java.util.*;

/* REFER  README FILE FOR QUESTION  */

class Main {
    public static void main (String[] args) {
        
	    Scanner sc = new Scanner(System.in);

        String S = sc.nextLine(); 
        
        String[] s = S.split(" ");
        long A = Long.valueOf(s[0]);        // Get splited of 2 integers from single line 
        long B = Long.valueOf(s[1]);
        long a,b;

        while(B != 0)
        {
            a =  A%10;                 // Get rightmost digit and check the sum is greater than 9 or not 
            b =   B%10;                             /*  a+b> 9 -> Carry =1     a+b< 9 -> Carry =0    */
            if(a+b> 9)                   
            {
                System.out.println("Hard");
                System.exit(0);
            }
             A =  A/10;
             B = B/10;                 // shortening the input by one digit per step 
        }
        System.out.println("Easy");
    }
}
