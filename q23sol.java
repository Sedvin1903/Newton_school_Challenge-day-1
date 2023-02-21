import java.io.*; 
import java.util.*; 

/* REFER README FOR QUESTION  */

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int c  = N % 10;
        int b = (N / 10) % 10;
        int a = N / 100;

        int bca  = (  b *100)+( c *10)+a;
        int cab = (c*100)+(a*10)+b;
      System.out.println(bca+cab+N);
    }
}
