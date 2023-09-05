class switch_case{
    public static void main(String []args) throws java.io.IOException{
        char choice;
        do{
            System.out.println("Help on.....:");
            System.out.println("1. The if ");
            System.out.println("2. The switch ");
            System.out.println("3. The while ");
            System.out.println("4. The do while ");
            System.out.println("5. The for ");
            System.out.println("Choose one among the following ");
            choice=(char)System.in.read();

        }while(choice<'1' || choice>'5');
        System.out.println("\n");

        switch(choice){
            case '1':
            System.out.println("The if:");
            System.out.println("if(condition)  statement");
            System.out.println("else  statement");
            break;

            case '2':
            System.out.println("The switch");
            System.out.println("switch(expression) {");
            System.out.println("case constant");
            System.out.println("Sttement seequence");
            break;

            case '3':
            System.out.println("The while:");
            System.out.println("while(condition)  statement");
            break;

            case '4':
            System.out.println("The do while:");
            System.out.println("do{ statement }");
            System.out.println("while (condition)");
            break;

            case '5':
            System.out.println("The for loop:");
            System.out.println("for(initialization; condition; iteration){ statement } ");
            break;

        }
    }
}