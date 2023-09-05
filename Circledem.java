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

public class Circledem{
    public static void main(String []args){
        Circle c= new Circle();
        c.x=0.0;
        c.y=0.0;
        c.r=5.0;
        System.out.println("Circumgerence is:"+c.circumference());
        System.out.println("Area is :"+c.area());

    }
}