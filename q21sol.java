import java.io.*; 
import java.util.*; 

/* REFER README FRO QUESTION */ 

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int m = Math.min(A,B);
        int min1 = Math.min(m,C);
        
        int min2 = 0;

        if(min1 == A)
           min2 = Math.min(B,C);
        else if( min1 == B )
           min2 = Math.min(A,C);
        else
           min2 = Math.min(A,B);

      System.out.println(min1+min2);

    }
}
