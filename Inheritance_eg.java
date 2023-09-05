class Person{
    String name;
    int dob;
    int mobileno;
    void read_data(String n, int d, int m){
        name=n;
        dob=d;
        mobileno=m;
    }
    void print_data(){
        System.out.println("Name :" + name);
       // dob.PrintDate;
        System.out.println("Mobileno.:"+ mobileno);
    }
}

class Student extends Person{
    String Institution;
    int[] qualification = new int[20];
    int[] marks= new int[5];
    int rollno;
    void PrintBiodata(){
        //printData();
        System.out.println("Institution" + Institution + "Roll no." + rollno);

        for(int q=0; q<qualification.length; q++){
            System.out.println("Qualification" + q + "." + qualification[q] );
        }

        for(int m=0; m<marks.length; m++){
            System.out.println("Marks" + m + "." + marks[m] );
        }
    }
}

class Employee extends Person{
    int Empno;
    int[] Salary = new int[20];
    String Organization;
    String Designation;
    void Print_Salary(){
       

        for(int s=0; s<Salary.length; s++){
            System.out.println("Salary" + s + "." + Salary[s] );
        }

        
    }
}



class Inheritance_eg{
    public static void main(String []args){

        Person[] p=new Person[15];
        Student[] s=new Student[100];
        Employee[] e=new Employee[50];





        /*    // Call methods and print values for Person objects
        p[0] = new Person();
        p[0].read_data("John", 19800101, 1234567890);
        p[0].print_data();

        // Call methods and print values for Student objects
        s[0] = new Student();
        s[0].read_data("Alice", 19950228, 9876543210);
        s[0].Institution = "ABC School";
        s[0].rollno = 1;
        s[0].PrintBiodata();

        // Call methods and print values for Employee objects
        e[0] = new Employee();
        e[0].read_data("Bob", 19850415, 8765432109);
        e[0].Empno = 1001;
        e[0].Organization = "XYZ Corp";
        e[0].Designation = "Manager";
        e[0].Print_Salary();
        */

    }
}