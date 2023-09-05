//Single class
//Multiple objects
class Circle{
    double x, y;
    double r;
    double circumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*r*r;

    }
}

public class Circledemo2{
    public static void main(String []args){
        Circle c1= new Circle();
        Circle c2= new Circle();
        c1.x=0.0;
        c1.y=0.0;
        c2.x=0.0;
        c2.y=0.0;
        c1.r=5.0;
        c2.r=7.0;
        System.out.println("Circumference of c1"+c1.circumference());
        System.out.println("Area of c1:"+c1.area());
        System.out.println("Circumference of c2"+c2.circumference());
        System.out.println("Area of c2:"+c2.area());

    }
}