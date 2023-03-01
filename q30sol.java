import java.io.*; 
import java.util.*; 


/* REFER  README FILE FOR QUESTION  [ To run the code in your system  change the class name to be same as the file name*/

class Main3 {
    public static void main (String[] args) {                                         /* Alexa and Air Conditioner */
         Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        if( X >= 30)
          System.out.println("Yes");
        else
          System.out.println("No");
    }
}

class Main2 {                                                                 /* Squares and Cubes */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a+(a*a)+(a*a*a));
    }
}

class Main1 {                                                               /* Digits Printing */
    public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    long N = n; 

    if( N >= 100 && N <= 109)
     System.out.println("0"+(N%100));
    else if( N<= 999)
     System.out.printl( "%02d\n" ,N%100);

    }
}
