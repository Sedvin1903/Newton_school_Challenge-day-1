import java.util.Scanner;
import java.util.*;

/* REFER  README FILE FOR QUESTION  */

class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int totalNuts = 0;

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (a > 10) {
        totalNuts += (a - 10);       // Takes only nut less than the count 10 
      }
    }

    System.out.println(totalNuts);
  }
}

