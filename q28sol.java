import java.io.*; 
import java.util.*;

/* REFER README FOR QUESTION */

class Main {
public static void main (String[] args)
{

Scanner sc = new Scanner(System.in);
int k = sc.nextInt();
int hour = 21 + k  / 60;
int minute = k  % 60;
System.out.printf("%02d:%02d", hour, minute);
  
  }
}
