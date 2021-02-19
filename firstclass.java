package com.company;

//import java.io.DataInputStream;
import java.util.Scanner;

class Box
{private
    int boxWidth;
    int boxLength;
    public
    Box()                   // default constructor
    {boxLength=0;
    boxWidth=0;}
    Box(int a,int b)        //parameterised constructor
    {
        boxWidth=a;boxLength=b;
    }
    Box(Box B1)             //copy constructor
    {
        boxLength=B1.boxLength;
        boxWidth=B1.boxWidth;
    }

    int area(int x,int y)
    {
        return (x*y);
    }
}

class Student
{
    int rollNo;
    int year;
    String branch ;
    int grades;

    void inputRecords()
    {Scanner in=new Scanner(System.in);
        System.out.println("enter rollno of studentt");
        rollNo=in.nextInt();
        System.out.println("enter year of studentt");
        year=in.nextInt();
        System.out.println("enter branch of studentt");
        branch=in.next();
        System.out.println("enter grades of studentt");
        grades=in.nextInt();
    }
    void printRecords()
    {
        System.out.println("rollno of student is "+rollNo);
        System.out.println("year of student is "+year);
        System.out.println("branch of Student is "+ branch);
        System.out.println("grades of Student is "+grades);
    }

}
public class firstclass {
    public static void main(String args[])
    {
        //Box b1; // declaration of objext
        //b1=new Box();  // initialisation of object
        //orr
        Box b1=new Box();//default
        Box b2=new Box(20,30);//parameterised
        Box b3=b2;//copy
        Student s1=new Student();
        Student s2=new Student();
        //in java 4 accesss specifiers private,dafaukt,protected,public
        //DataInputStream in = new DataInputStream(System.in);
        Scanner in=new Scanner(System.in);
//        System.out.println(" Enter two numbers ");
//        int x=in.nextInt();
//        int y=in.nextInt();

//        System.out.println("The area is "+b1.area(x,y));

        s1.inputRecords();
        //s1.printRecords();
        s2=s1;
        s2.rollNo=34;
        System.out.println("Is object s1 and s2 same ?"+s1.equals(s2));
        s2.printRecords();
        s1.printRecords();
        //so here rollnumber of s1 and s2 both changes
        //it just dont create a copy but refers it to the object

    }
}
