import java.io.*; 
import java.util.*; 

/* REFER README FILE */

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        String[] s = S.split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int K = Integer.parseInt(s[3]);

         if( A >= K)
         {
            System.out.println(K);
         } 
        else if( (A+B) >= K)
         {
            System.out.println(A);
         } 
        else if( (A+B+C) >= K)     //  K <= A+B+C Condition satisfied 
         {
            System.out.println(A - (K - (A+B) ) );
         } 
    }
}

/* 
    SOLUTION  [ Memory Limit  Exceed ]

   int[] result = new int[A+B+C];

             for(int i = 0 ; i < (A) ; i++ )
            {
               result[i] = 1;
            }
            for(int i = 0 ; i < (B) ; i++ )
            {
               result[i] = 0;
            }
            for(int i = 0 ; i < (C) ; i++ )
            {
               result[i] = -1;
            }
        

    int res = 0, len = result.length;
        for (int start = len - K, i = start, win = 0; i < len + K; ++i) 
        {
            win += result[i % len];
            if (i - start >= K) 
            { 
                win -= result[(i - K) % len];
            }
            res = Math.max(win, res);
        }
        System.out.println(res);


*/
