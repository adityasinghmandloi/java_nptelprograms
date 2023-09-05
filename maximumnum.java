import java.util.Scanner;

public class maximumnum{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int max= Integer.MIN_VALUE;

        System.out.println("Enter the input:");

        while(input.hasNext()){
            int num = input.nextInt();
            if(num > max){
                max=num;

            }
        }
        System.out.println("Maximum number is:"+ max);
    }
}