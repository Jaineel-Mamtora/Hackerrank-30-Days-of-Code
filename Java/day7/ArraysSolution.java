package Java.day7;

import java.util.Scanner;

public class ArraysSolution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}