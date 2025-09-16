package exceptions;

import java.util.Scanner;
import java.util.*;

public class Withex {

    public static void main(String[] agrs) {
        try {
            System.out.println("process started");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter numberator: ");
            int num = sc.nextInt();

            System.out.println("enter denominator: ");
            int de = sc.nextInt();

            int res = num / de;

            System.out.println(res);

        } catch (Exception e) {
            System.out.println("can't use zero as denominator");
        }

        System.out.println("process ended");

    }
}
