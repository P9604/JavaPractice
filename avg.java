//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
class avg{
    public static int avg(int a , int b , int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers for average:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //int d = avg(a,b,c);
        System.out.println("Average of the given numbers is:"+avg(a,b,c));
    }
}