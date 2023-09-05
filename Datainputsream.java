import java.io.DataInputStream;

public class Datainputsream{
    public static void main(String[] args){
       // Float Principleamt = new Float(0.0f);
       // Float interestrate= new Float(0.0f);
       Float Principleamt = Float.valueOf(0.0f);
       Float interestrate = Float.valueOf(0.0f);
        int noofyears;
        DataInputStream input= new DataInputStream(System.in);
        String tempString;
        
        // PRINCIPLE AMOUNT
        System.out.println("Principle amount:");
        System.out.flush();
        tempString=input.readLine();
        Principleamt=Float.valueOf(tempString);
        
        // RATE OF INTEREST
        System.out.println("Rate of Interst:");
        System.out.flush();
        tempString=input.readLine();
        interestrate=Float.valueOf(tempString);

        //TIME OR NO. OF YEARS
        System.out.println("No. of Years:");
        System.out.flush();
        tempString=input.readLine();
        noofyears=Integer.parseInt(tempString);


        Float TotalInterest=(Principleamt*interestrate*noofyears)/100;

        System.out.println("Total Interest="+ TotalInterest);



    }
}