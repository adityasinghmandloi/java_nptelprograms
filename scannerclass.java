import java.util.Scanner;

public class scannerclass{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first elemeent:");
        a=sc.nextInt();
        System.out.print("Enter second elemeent:");
        b=sc.nextInt();
        int sum= a+b;
        System.out.println("Sum is:"+ sum);

    }
}