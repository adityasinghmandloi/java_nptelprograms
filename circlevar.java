// circle
public class circlevar{
    static int circlecount=0;
    public double x, y, r;
    // circle
    public circlevar(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.r=r;
    }
    public circlevar(double r){
        this(0.0, 0.0, r);
        circlecount++;
    }
    public circlevar(circlevar c){
        this(c.x, c.y, c.r);
        circlecount++;
    }
    public circlevar(){
        this(0.0, 0.0, 0.0);
        circlecount++;
    }
    public double circumference(){
        return(2*3.14*r);
    }
    public double area(){
        return(3.14*r*r);
    }
    public static void main(String[] args){
        circlevar c1= new circlevar();
        circlevar c2= new circlevar(30);
        circlevar c3= new circlevar(c1);
        System.out.println("c1:"+ c1.circlecount + "\nc2:"+ c2.circlecount + "\nc3:"+ c3.circlecount);
    }
}