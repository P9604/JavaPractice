import java.util.*;

public class ifelsecond {
    public static void main(String args[]) {
        System.out.println("Please enter the age of person:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Person is adult!");
        } else {
            System.out.println("Person is children!");
        }
    }
}
