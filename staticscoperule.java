class Box{
    double x=10.0;
    double y=20.0;
    double w=15.0;
    double area(){
        return(2*(x*y + y*w + w*x ));
    }
}

class Circle{
    double x=0.0;
    double y=0.0;
    double r=5.0;
    double area(){
        return(22/7*r*r);
    }
}

public class staticscoperule{
    float x=50;
    float y=60;
    public static void main(String[] args){
        Box b= new Box();
        Circle c=new Circle();
        //System.out.println("Data of staticscoperule:"+ x);
        //System.out.println("Data of staticscoperule:"+ y);
        System.out.println("Box Data:"+ b.x);
        System.out.println("Circle Data:"+ c.x);
        System.out.println("Box area:"+ b.area());
        System.out.println("Circle area:"+ c.area());

    }
}