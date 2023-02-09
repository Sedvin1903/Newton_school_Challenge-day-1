import java.io.*;
import java.util.*; 

class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);

       String I = sc.nextLine();

       char s[] = I.toCharArray();
       int d[] = new int[s.length];    // Original digits 
       int D[] = new int[s.length];    //  Remainders of  (Original digits) % 3
       int digits= 0;
       int e = 0;

       for(int i =0 ; i<s.length ; i++)
       {
            d[i] = Character.digit(s[i],10);
           digits += d[i];                    //  Sum of Original digits  is divisible by 3 
       }

       if(digits % 3 == 0 )
        { System.out.println(e);
             System.exit(0);
        } 
        else if(s.length == 1 )           // One no. other than multiple of 3 can't be divisible by 3
       {  
        System.out.println(-1); 
       }
        for(int i =0 ; i<s.length ; i++)
          {
             D[i] =  d[i] % 3;
          }
          for(int i =0 ; i<s.length ; i++)
          {
             if( (digits  % 3) == D[i] )     // One no. other than multiple of 3 matches the total sum modulo 
                  {  e ++; 
                    System.out.println(e);
                    System.exit(0);
                  }
            }
       if(s.length == 2 )
       {  
        System.out.println(-1); 
       }
      /* else
        {
        System.out.println(2);    
        }  */
    }   
}
