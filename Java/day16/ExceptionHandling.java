package Java.day16;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        validate(S);
        in.close();
    }

    static void validate(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.print(num);
        } catch (Exception m) {
            System.out.print("Bad String");
        }
    }
}