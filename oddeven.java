import java.util.*;

class oddeven {
    public static void main(String args[]) {
        System.out.println("Enter the Integer to check whether no. is even or odd:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {

            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}