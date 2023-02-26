import java.io.*; 
import java.util.*; 

/* REFER  README FILE FOR QUESTION  */

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        String ans = "";
         
       for (int i = 0; i < 26; i++)
      {
        for (int j = 0; j < n; j++) 
        {
           ans += (char)('A' + i);
        }
      }

    System.out.println(ans.charAt(x - 1));
  }
}
