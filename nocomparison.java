import java.util.*;

class nocomparison {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second numbers:");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Numbers are equal.");
        } else if (a > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }
    }
}
