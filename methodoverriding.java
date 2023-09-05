

//   The Method Overriding



class Point2D{
    int x, y;
    Point2D(int a, int b){
        x=a;
        y=b;
    }
    void display(){
        System.out.println("x:" + x + "\n" + "y:" + y + "\n");
    }
}

class Point3D{
    int x, y, z;
    Point3D(int a, int b, int c){
        x=a;
        y=b;
        z=c;
    }
    void display(){
        System.out.println("x:" + x + "\n" + "y:" + y + "\n" + "z:" + z + "\n" );
    }
}





class methodoverriding{
    public static void main(String []args){

        Point2D p= new Point2D(4, 5);
        p.display();

        Point3D q=new Point3D(7, 8, 9);
        q.display();


        // cast q to an instance of class Point2D

        Point2D x= (Point2D) q;
        x.display();


    }
}