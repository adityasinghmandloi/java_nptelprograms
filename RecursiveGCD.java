/*class RecursiveGCD{
    int m, n;
    
    int gcd(int m, int n){
        if(m>n){
            return gcd(m, n);
        }
        if(m==n){
            return m;
        }
        if(m==0){
            return n;
        }
        if(m==1){
            return 1;
        }
        return gcd(m, n%m);
    
    }
    public static void main(String []args){

        if(args.length >= 2){

            RecursiveGCD g= new RecursiveGCD();
            g.m=Integer.parseInt(args[0]);
            g.n=Integer.parseInt(args[1]);
            System.out.println("GCD of "+  g.m + "&" + g.n + "is" + g.gcd(g.m, g.n) );

        }
        else {
            System.out.println("Please provide two integers as command line arguments.");
        }


       
    }
}*/

public class RecursiveGCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: when b becomes zero, return a as the GCD
        } else {
            return gcd(b, a % b); // Recursive call with updated arguments
        }
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 48;
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}