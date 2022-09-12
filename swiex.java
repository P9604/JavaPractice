import java.util.*;

class swiex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice from 1 to 3: ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("oops! Invalid choice");
                break;
        }

    }
}