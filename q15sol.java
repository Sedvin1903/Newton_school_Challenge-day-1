import java.io.*; 
import java.util.*; 

/* REFER README FOR QUESTION */

class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String T = sc.nextLine();
        int lenS = S.length();
        int lenT = T.length();
        int res = 1000 ;       // MAXIMUM SIZE OF THE STRING [ i/p] 
       
                /* BRUTE FORCE */
        for (int i = 0; i <= lenS - lenT; i++) 
        {
             int count = 0 ;
            for (int j = 0; j < lenT; j++) {
                if (S.charAt(i + j) != T.charAt(j)) {
                    count++;
                }
            }
            res = Math.min(res, count);
        }
       System.out.println(res);

    }
}
