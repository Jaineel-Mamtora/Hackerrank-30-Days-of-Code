package Java.day26;

import java.util.Scanner;

class BookReturnDate {
    public int day;
    public int month;
    public int year;

    BookReturnDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class NestedLogic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookReturnDate actual = new BookReturnDate(scan.nextInt(), scan.nextInt(), scan.nextInt());
        BookReturnDate expected = new BookReturnDate(scan.nextInt(), scan.nextInt(), scan.nextInt());
        scan.close();

        int fine = 0;

        if (expected.year == actual.year) {
            if (expected.month < actual.month) {
                fine = (actual.month - expected.month) * 500;
            } else if ((expected.month == actual.month) && (expected.day < actual.day)) {
                fine = (actual.day - expected.day) * 15;
            }
        } else if (expected.year < actual.year) {
            fine = 10000;
        }

        System.out.println(fine);
    }
}