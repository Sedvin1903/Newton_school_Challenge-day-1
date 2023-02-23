import java.io.*; 
import java.util.*; 

/* REFER README FOR QUESTION */

class Main {
    public static void main (String[] args) {
     
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

    int start = (a + c - 1) / c; // Round up to nearest multiple of c
   
    int ans = start * c;

    if (ans > b) 
    {
        System.out.println("-1");
    } 
    else
    {  System.out.println(ans);   }
  }
}
