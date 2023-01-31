import java.io.*; 
import java.util.*; 

/* Refer README file for Question DAY - 3 */
 
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String T = sc.nextLine();


        if(T.startsWith(S))  // Prefix  
         System.out.println("Yes");
        else
         System.out.println("No");



    }
}
