import java.util.*;
class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        int r=0;
        for (int i = 2; i < n/2; i++) {
            if (n%i == 0) {
            System.out.println("NP");
            r=1;
        }
        }
        if(r==0){
            System.out.println("P");
        }
}}