import java.io.*; 
import java.util.*; 

/* REFER README FOR QUESTION */

class Main {
public static void main (String[] args) {

Scanner sc = new Scanner(System.in);
String N = sc.nextLine();

if (N.length() == 1)
{
System.out.println("000".concat(N));
}
else if( N.length() == 2 )
{
System.out.println("00".concat(N));
}
else if( N.length() == 3 )
{
System.out.println("0".concat(N));
}
else
{  System.out.println((N)); }

 }
}
