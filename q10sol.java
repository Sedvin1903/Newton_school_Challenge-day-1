import java.io.*; 
import java.util.*; 

/* REFER README  FOR QUESTION */

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[4 * n];
        LinkedList<Integer>[] lists = new LinkedList[n + 1];    // Initializng a LLT only for the  memory limit in question
        for (int i = 0; i <= n; i++) 
        {
            lists[i] = new LinkedList<>();
        }
        for (int i = 0; i < 4 * n - 1; i++) 
        {
            cards[i] = sc.nextInt();
            lists[cards[i]].add(cards[i]);
        }
        for (int i = 1; i <= n; i++) 
        {
            if (lists[i].size() == 3) // check odd that's it LOL
            {   System.out.println(i);
                break;
            }
        }
    }
}

/*

This also gives the same result but not satisifes the memory limit constraint of question so i got with above approach .AS ,

Collection	Performance	Default capacity	Empty size	10K entry overhead	Accurately sized?	Expansion algorithm
HashMap	         O(1)	        16	         128	          360K	                    No	           x2
LinkedList	     O(n)	        1	            48	          240K	                    Yes	           +1


Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 4 * n - 1; i++) {
            int a = sc.nextInt();
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (map.get(i) % 4 == 3) {
                System.out.println(i);
                break;
            }
        }
