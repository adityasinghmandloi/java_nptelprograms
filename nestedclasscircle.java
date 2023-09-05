class nestedclasscircle{
    static double x, y, r;
    nestedclasscircle(double r){
        this.r=r;
    }
    public static class Point{
        double x, y;
        void display(){
            System.out.println("(x, y): (" + this.x + "," + this.y+ ")");
        }
        Point(double a, double b){
            this.x=a;
            this.y=b;
        }
    }
    public boolean isInside(Point p){
        double dx=p.x-x;
        double dy=p.y-y;
        double distance=Math.sqrt((dx*dx)+(dy*dy));
        if(distance<r){
            return true;
        }
        else 
        return false;
    }
    public static void main(String []args){
        nestedclasscircle a= new nestedclasscircle(2.0);
        Point Pa= new Point(1.0, 2.0);
        Pa.display();
        System.out.println("Inside with radius:"+ a.isInside(Pa));
        nestedclasscircle b= new nestedclasscircle(3.0);
        Point Pb= new Point(9.0, 8.0);
        Pb.display();
        System.out.println("Inside with radius:"+ b.isInside(Pa));
    }
}