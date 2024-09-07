package J01013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long total = 0;
        while (t-- > 0) {
            long num = scanner.nextLong();
            total += sumOfDivisors(num);
        }
        System.out.println(total);
    }

    static long sumOfDivisors(long num) {
        long sum = 0;
        long exponentOfTwo = 0;
        while (num % 2 == 0) {
            num /= 2;
            exponentOfTwo++;
        }
        if (exponentOfTwo > 0) sum += 2 * exponentOfTwo;

        for (long i = 3; i * i <= num; i += 2) {
            long exponent = 0;
            while (num % i == 0) {
                num /= i;
                exponent++;
            }
            if (exponent > 0) sum += exponent * i;
        }
        if (num > 1) {
            sum += num;
        }
        return sum;
    }
}
