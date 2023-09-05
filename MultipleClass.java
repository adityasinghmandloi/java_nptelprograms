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

class Box{
    double depth, width, height;
    double area(){
        double a;
        a=2*(width*height + height*depth + width*depth);
        return a;
    }
    double Volume(){
        double v;
        v=width*height*depth;
        return v;
    }

}

public class MultipleClass{
    public static void main(String []args){
        Circle c= new Circle();
        Box b= new Box();
        c.r=5.6;
        b.width=8.0;
        b.height=9.0;
        b.depth=7.5;
        System.out.println("Circumference:"+ c.circumference());
        System.out.println("Area of circle:"+ c.area());
        System.out.println("Area of box:"+ b.area());
        System.out.println("Volume:"+ b.Volume());
    }
}