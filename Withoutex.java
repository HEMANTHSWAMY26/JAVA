package exceptions;

import java.util.Scanner;

public class Withoutex {
    public static void main(String[] agrs) {

        System.out.println("process started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numberator: ");
        int num = sc.nextInt();

        System.out.println("enter denominator: ");
        int de = sc.nextInt();

        int res = num / de;

        System.out.println(res);

        System.out.println("process ended");

    }
}
