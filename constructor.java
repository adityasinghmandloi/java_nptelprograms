class Circle{
    private double x;
    private double y;
    private double r;

    Circle(double a, double b, double c){
        x=a;
        y=b;
        r=c;
    }
    double circumference(){
        return 2*3.14*r;
    }
}

public class constructor{
    public static void main(String []args){
        Circle c1= new Circle(0.0, 0.0, 9.5);
        Circle c2= new Circle(0.0, 0.0, 9.4);
        System.out.println("Circumference of c1:" + c1.circumference());
        System.out.println("Circumference of c2:" + c2.circumference());



    }
}