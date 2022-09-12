import java.util.*;
public class fact{
    public static void fact(int n){
        int f = 1;
        if(n==0 || n== 1){
            System.out.println("Factorial is 1");
        }else{
            for(int i=1;i<=n;i++){
                f = f * i;
            }
            System.out.println("Factorial for the number is : "+f);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for its factorial:");
        int n = sc.nextInt();
        fact(n);
    }
}