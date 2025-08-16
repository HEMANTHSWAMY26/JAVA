import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("teen");
        }
        scanner.close();
    }

}
