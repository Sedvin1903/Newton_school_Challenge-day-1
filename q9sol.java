import java.io.*; 
import java.util.*; 

/* REFER  README FILE FOR QUESTION  */

class Main {
    public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String n = sc.nextLine();
    int N = Integer.parseInt(n);         /* Get input values an integer and string   */

    String SA = sc.nextLine();

    char[] sa = SA.toCharArray();

    for(int i = 0 ; i< sa.length ; i++)
    { 
       if( (int)((sa[i])+N) > 90)
           sa[i] = (char)( (int)(((sa[i])+N)-26) ) ;   /* Map the Letter Z from beginning itself */
        else
           sa[i] = (char)((int)((sa[i])+N));    
    }

    String AS = new String(sa);    /* Method to conver char array to  String */

    System.out.println(AS);
    }
}
