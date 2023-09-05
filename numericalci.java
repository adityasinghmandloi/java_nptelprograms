import java.lang.*; 
class calculator{
    double i;
    double x=Math.sqrt(i);
}
public class numericalci{
    public static void main(String []args){
        calculator a= new calculator();
        a.i=Integer.parseInt(args[0]);
        System.out.println("Square root of "+ a.i+ "is" +a.x);


    }
}