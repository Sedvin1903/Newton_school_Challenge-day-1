import java.io.*; 
import java.util.*; 

/* REFER  README FILE FOR QUESTION  */

class Main {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int ans = 0;
   while( a>=0 && b<=7 )
   {   if( a == b )
        { System.out.println(a);  }
        else if( a == 0 || b== 0 )
        {  ans = ( a != 0) ? a : b;
           System.out.println(ans);
        }
        else       // Bitwise OR operator - at least one of Alexa and Edward and failed to solve any of the problems solved by, neither of them.
        { ans = a|b;  // truth table of OR
          System.out.println(ans);
        }
        break;
    }
}}
