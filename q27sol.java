import java.io.*; 
import java.util.*; 

/* REFER README FOR QUESTION */

class Main {
public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] cards = new int[5];
        for (int i = 0; i < 5; i++) {
            cards[i] = sc.nextInt();
        }
        sc.close();

        boolean fullHouse = false;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    if (cards[i] == cards[j] && cards[j] == cards[k]) {
                        for (int x = 0; x < 5; x++) {
                            for (int y = x + 1; y < 5; y++) {
                                if (x != i && x != j && x != k && y != i && y != j && y != k && cards[x] == cards[y]) {
                                    fullHouse = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (fullHouse) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
