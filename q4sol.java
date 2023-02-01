import java.io.*; // for handling input/output
import java.util.*; 


class Main {
    public static void main (String[] args) {
        
      try
      {  
        Scanner sc = new Scanner(System.in);

        String lr = sc.nextLine();
        String S = sc.nextLine(); 
        
        String[] s = lr.split(" ");
        int L = Integer.parseInt(s[0]);        // Get splited of 2 integers from single line 
        int R = Integer.parseInt(s[1]);  

        String r = S.substring(L-1,R); //  Get the substring r to be reversed and pasted in S
        char[] rev = r.toCharArray();
        char[] rev1 =  new char[rev.length];  ;         // To reverse r we use chararray and 
         
        for(int j = 0 ; j< rev.length ; j++)
            { 
               rev1[j] = rev[(rev.length)-j-1];              //then traverse revert and store in new char array and 
            }
      
        String ver  = new String(rev1);          // stringfy the reversed array 

        String reverse =  S.replaceAll(r,ver);             //  Replace the substring with reverse in S
       
        System.out.println(reverse);
      }
      catch(Exception e)
      { System.out.println(); }
    }
}
