import java.io.*; 
import java.util.*; 

/* REFER README FOR QUESTION */

class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

      String S = sc.nextLine();

      String[] s = S.split(" ");
      long A = Long.valueOf(s[0]);
      long B = Long.valueOf(s[1]);
      long C = Long.valueOf(s[2]);
      long D = Long.valueOf(s[3]);

 
 long max1 = Math.max(A, B);
         long  max2 = Math.max(C, D);
         long  min1 = Math.min(A, B);
         long  min2 = Math.min(C, D);

         long  res1 = max1 * max2;           //     Get the minimum possible product 
         long  res2 = min1 * min2;          //     Get the maximum possible product 

        System.out.println(Math.max(res1, res2));         //    choose  the maximum of them to get max possible product 

    }
}
