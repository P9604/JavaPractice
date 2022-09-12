import java.util.*;
public class homework4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice:(0 or 1)");
        int n = sc.nextInt();
        switch(n){
            case 1 : {
                System.out.println("Please enter the marks out of 100:");
                int m = sc.nextInt();
                if (m >= 90) {
                    System.out.println("This is good");
                } else if (m >= 80 && m >= 60) {
                    System.out.println("this is also good");
                } else
                    System.out.println("This is good as well");
               }
               break;
            case 0 :
                break;
            default:
                System.out.println("Invalid choice!!");
        }
    }
}
