import java.util.*;
public class funcmul{
    public static int mul(int a , int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = mul(a , b);
        System.out.println(res);
    }
}