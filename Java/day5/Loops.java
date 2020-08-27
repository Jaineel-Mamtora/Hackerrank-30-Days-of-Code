package Java.day5;

import java.util.Scanner;

public class Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }

        scanner.close();
    }
}