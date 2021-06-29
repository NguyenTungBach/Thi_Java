package Cau2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizertest {
    public StringTokenizertest() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringTokenizer string = new StringTokenizer(scanner.nextLine());
        System.out.println("Result:");
        while (string.hasMoreTokens()) { // nếu vẫn còn thì tiếp
            System.out.println(string.nextToken()); // in tiếp cách nhau dấu phẩy

        }
    }

}
