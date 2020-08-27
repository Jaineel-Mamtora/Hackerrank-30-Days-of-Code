package Java.day10;

import java.util.Scanner;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int count = 0;
        int maxCount = 0;
        int result = getBinaryDigit(n, count, maxCount);
        System.out.print(result);
        scanner.close();
    }

    public static int getBinaryDigit(int n, int count, int maxCount) {
        if (n == 0) {
            return maxCount;
        }
        int digit = n % 2;
        if (digit == 1) {
            count += 1;
        } else {
            count = 0;
        }
        if (count > maxCount) {
            maxCount = count;
        }
        return getBinaryDigit(n / 2, count, maxCount);
    }
}