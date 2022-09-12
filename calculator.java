import java.util.*;

class calculator {
    public static void main(String args[]) {
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your choice from:");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                res = a + b;
                System.out.println("Addition:"+res);
                break;
            case 2:
                res = a - b;
                System.out.println("Subtraction:"+res);
                break;
            case 3:
                res = a * b;
                System.out.println("Multiplication:"+res);
                break;
            case 4:
                res = a / b;
                System.out.println("Division:"+res);
                break;
            case 5:
                res = a % b;
                System.out.println("Modulo:"+res);
                break;
            default:
                System.out.println("invalid choice");
                break;
        }

    }
}