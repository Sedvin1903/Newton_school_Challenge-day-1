import java.io.*;
import java.util.*; 

/* REFER README FOR QUESTION */
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine(); 
        
        String[] s = S.split(" ");
        long A = Long.valueOf(s[0]);        // Get splited of 2 integers from single line 
        long B = Long.valueOf(s[1]);
        long C = Long.valueOf(s[2]);        // Get splited of 2 integers from single line 
        long D = Long.valueOf(s[3]);

        long ans  = -1;

    for (int i = 0; i <= 100000 ;i++)        // Constraint 10^5 :')
    {
      long x = A + i *B;
      long  y = i * C;
      if (x <= D * y) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
    }
}
