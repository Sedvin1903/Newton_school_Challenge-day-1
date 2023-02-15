import java.io.*
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sockets = 1; // initial socket
        int powerStrips = 0; // initial power strip count

        while (sockets < B) {
            sockets += A-1; // add A-1 sockets with each power strip
            powerStrips++;
        }

        System.out.println(powerStrips);
    }
}
