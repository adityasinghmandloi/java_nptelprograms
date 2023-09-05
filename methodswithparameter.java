class Circle{
    private double x;
    private double y;
    private double r;
    void setCircle(double a, double b, double c){
        x=a;
        y=b;
        r=c;

    }
    double cicumference(){
        return 2*3.14*r;
    }
}

public class methodswithparameter{
    public static void main(String []args){
        Circle c1= new Circle();
        c1.setCircle(0.0, 0.0, 7.89);
        System.out.println("Circumference:"+c1.cicumference());
    }

}