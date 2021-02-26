package com.company;

import java.util.Scanner;

class laptop
{
    int laptopID;
    String name;
    float price;
     laptop(int x, String y,float p)
     {
         laptopID=x;
         name=y;
         price=p;
     }
     laptop()
     {
         laptopID=0;
         name="";
         price=0;
     }
     void inputdata()
     {int x;
     String y;
     float z;
         Scanner in=new Scanner(System.in);
         System.out.println("Enter Laptop ID");
         x=in.nextInt();
         System.out.println("Enter Laptop name");
         y=in.next();
         System.out.println("enter Price");
         z=in.nextFloat();

     }
    void display()
    {
        System.out.println("laptop Id is"+laptopID);
        System.out.println("laptop name is"+name);
        System.out.println("laptop cost is"+price);
    }
};
public class arrayOfObj {
    public static void main(String args[]) throws IndexOutOfBoundsException

    {String x="200.02";
    double d;
    d=Double.parseDouble(x);
    System.out.println("string to double using wrapper claasses is "+d);
        Scanner in=new Scanner(System.in);
        laptop l[]=new laptop[10];//array of 10 objects
        System.out.println("how many data to enter");
        int f=in.nextInt();
        for(int i=0;i<f;i++)//allocation of memory to all the objects of the class
        {
            l[i]=new laptop();
        }
        for(int i=0;i<f;i++)
        {//forced allocation of memory
            //1l[i]=new laptop();
            l[i].inputdata();
        }
        for(int i=0;i<f;i++)
        {
            l[i].display();
        }
    }

}

