package Java.day20;

import java.util.Scanner;

public class SortingProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        in.close();
        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    totalSwaps += 1;
                }
            }
        }
        System.out.printf("Array is sorted in %d swaps.\nFirst Element: %d\nLast Element: %d", totalSwaps, a[0],
                a[n - 1]);
    }
}