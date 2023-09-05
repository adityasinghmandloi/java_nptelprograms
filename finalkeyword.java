final class Bike{}

public class Honda extends Bike{
    void run(){
        System.out.println("Running safely with 100 kmph");
    }
}

final class finalkeyword{
    public static void main(String []args){
        Honda honda = new Honda();
        honda.run();

    }
}