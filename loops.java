import java.util.*;
public class loops {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the value for n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = i + sum;
        }
        System.out.println("Sum is:" + sum);
    }
}
