package Java.day14;

import java.util.Scanner;

public class ScopeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] a) {
        this.elements = a;
    }

    int maxDifference = 0;

    void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                if (i == j) {
                    continue;
                }
                int individualDifference = Math.abs(elements[i] - elements[j]);
                if (individualDifference > maxDifference) {
                    maxDifference = individualDifference;
                }
            }
        }
        maximumDifference = maxDifference;
    }

}