public class Recursivefibonacci{
    int n;
    public static void main(String []args){
        int n=Integer.parseInt(args[0]);
        int fibo=0;
        int fibo1=0;
        int fibo2=1;
        System.out.println(fibo1+" "+ fibo2);
        while(n>1){
            fibo=fibo1+fibo2;
            System.out.println(" "+ fibo);
            fibo1=fibo2;
            fibo2=fibo;
            n++;
            
        }
       
    }
}