package Java.day2;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();

        System.out.println(i + a);
        System.out.println(String.format("%.1f", d + b));
        System.out.print(s + c);

        scan.close();
    }
}