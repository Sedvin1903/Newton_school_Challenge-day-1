import java.io.*; 
import java.util.*; 

/* REFRR README FOR QUESTION  */

class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == N) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
