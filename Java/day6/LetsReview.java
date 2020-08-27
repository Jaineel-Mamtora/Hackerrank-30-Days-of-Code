package Java.day6;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // throw away the \n not consumed by nextInt()
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            letsReview(s);
        }
        scanner.close();
    }

    public static void letsReview(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                stringBuilder.append(s.charAt(i));
            }
        }
        stringBuilder.append(' ');
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                stringBuilder.append(s.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}