package Java.day11;

import java.util.Scanner;

public class TwoDArrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        // Space separated 2D Array input
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1]
                        + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.print(maxSum);

        scanner.close();
    }
}