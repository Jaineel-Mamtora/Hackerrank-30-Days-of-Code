package Java.day9;

import java.util.Scanner;

public class Recursion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int result = factorial(n);
        System.out.print(result);

        scanner.close();
    }

    static int factorial(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}