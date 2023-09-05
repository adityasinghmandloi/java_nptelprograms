import java.io.DataInputStream;
import java.io.IOException;

class Datainputstraeamclass{
    public static void main(String []args){
        
       // Float Principalamount= new Float(0);
       //Float Rateofinterest= new Float(0);

        Float Principalamount = Float.valueOf(0);
        Float Rateofinterest = Float.valueOf(0);

        int noofyears=0;

        DataInputStream in= new DataInputStream(System.in);

        // Declare string
        String tempString;

        // For Principal amount
        try{
            System.out.println("Enter the principal amount:");
            System.out.flush();
            tempString= in.readLine();
            Principalamount=Float.valueOf(tempString);

        } 
        catch(IOException e){
            System.out.println("Difficulty in reading the following principal amount input");
            return;
        }

        //For Rate of interest


        try{

            System.out.println("Enter the rate of interest:");
            System.out.flush();
            tempString= in.readLine();
            Rateofinterest=Float.valueOf(tempString);
        }

        catch(IOException e){
            System.out.println("Difficulty in reading the following rate of interest input");
            return;
        }
        

        //For the no. of years

        try{

            System.out.println("Enter the no. of Years:");
            System.out.flush();
            tempString= in.readLine();
            noofyears= Integer.parseInt(tempString);

        }

        catch(IOException e){
            System.out.println("Difficulty in reading the following no. of years input");
            return;
        }

        

        Float TotarInterest= (Principalamount*Rateofinterest*noofyears)/100;

        System.out.println("Total Interset: " + TotarInterest);



    }
}