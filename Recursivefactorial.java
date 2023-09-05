public class Recursivefactorial{
    int n;
    public static void main(String []args){
        int Factorial(int n){}
        if(n==0){
            return (1);
        }
        else{
            return(n*Factorial(n-1));
        }
    }
    public static void main(String []args){
        Recursivefactorial x= new Recursivefactorial();
        int result = x.Factorial(num);
        System.out.println("Factorial of "+ num + ":"+ result);
    }
}