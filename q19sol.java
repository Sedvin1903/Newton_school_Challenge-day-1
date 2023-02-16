import java.io.*; 
import java.util.*;

/* REFER README FOR QUESTION */

class Main {
public static void main (String[] args)
{
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int t = 0;
  int sum = 0, r = 0;
  t = N;
  while(t>0)
  {
     r = t % 10;
     sum += r;
     t = t / 10 ;
   }

  if( N % sum == 0)
   System.out.println("Yes");
  else
   System.out.println("No");
  }
}
