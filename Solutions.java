import java.util.*;

public class Solutions {
    public void Adult(int age) {
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solutions solution = new Solutions();
        System.out.println("enter ur age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        solution.Adult(age);

    }
}