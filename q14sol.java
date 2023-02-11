import java.io.*; 
import java.util.*; 

class Main {
    public static void main (String[] args) {
        Scanner  sc = new Scanner(System.in);

        String S = sc.nextLine();

        String[] s = S.split(" ");
        long N = Long.valueOf(s[0]);
        long K = Long.valueOf(s[1]);
         
    
    for(int i = 0 ; i < (int)K ; i++)
    {    
        if( N % 200 == 0 )
        {
           N /=  200;                     // N = N / 200 
        }
        else
        {
            N = (N*1000)+200;             // To concatenate 200 at end [ For eg. 389 in N then (389 * 1000) = 389000+200 = 389200
        }

    }
   System.out.println(N);
    
 }
}
