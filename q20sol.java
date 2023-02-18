import java.io.*; 
import java.util.*; 

/* REFER README FOR QUESTION */

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int A[] = new int[N];

        for(int i = 0 ; i < N ; i++)
        {
            A[i] = sc.nextInt();
        }

        int c =0;
      
       boolean alleven = true;
        do
        {
          for(int i = 0 ; i < N ; i++)
         {
           if( A[i] % 2 == 0)
            {
              A[i] = A[i] / 2;
            }
            else
            {
            alleven = false;
            }
         }
         if( alleven == true)
            c++;
        }while( alleven ); 
    
    System.out.println(c);
    }
}
