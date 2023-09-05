//this keyword- reduces the name space collision
// refers to an object invoked

class Circle{
    private double x, y, r;
    Circle(double x, double y, double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }
    Circle(double r){
        this.x=0;
        this.y=0;
        this.r=r;
    }
    double circumference(){
        return 2*3.14*r;
    }
}

public class thiskeyword{
    public static void main(String []args){
        Circle c1= new Circle(0.0, 0.0, 7.04);
        System.out.println("Circumference:"+c1.circumference());
    }
}