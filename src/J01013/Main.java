package J01013;

import java.util.Scanner;

public class Main {
    // Using pre-calculate with position
    // Still not optimize
    public static final int MAX_SIZE = 2000001;
    static long[] preCalRes = new long[MAX_SIZE];

    public static void main(String[] args) {
        for (int i = 0; i < MAX_SIZE; i++) {
            preCalRes[i] = 0;
            int limit = (int) Math.sqrt(i);
            for (int j = 2; j <= limit; j++) {
                if (i % j == 0) {
                    preCalRes[i] = preCalRes[j] + preCalRes[i / j];
                    break;
                }
            }
            if (preCalRes[i] == 0) preCalRes[i] = i;
        }

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long total = 0;
        while (t-- > 0) {
            int num = scanner.nextInt();
            total += preCalRes[num];
        }
        System.out.println(total);
    }
}
