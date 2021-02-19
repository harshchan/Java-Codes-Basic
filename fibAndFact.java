package com.company;

//Implement a menu-driven Java program (like fib or factorial) to implement these
// input methods in java (command lineargs, Scanner, BufferedReader,
// DataInputStream, Console )
import java.io.*;
import java.util.Scanner;

public class fibAndFact {
    static void fibonacci()
    {int n=0,first=0,second=1,th;
        DataInputStream inp=new DataInputStream(System.in);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of terms in fibonacci series");
/
        n=in.nextInt();

        //n=Integer.parseInt(inp.readLine());
        System.out.println("Your Fibonacci series is ");
        System.out.println(first);
        System.out.println(second);
        for(int i=2;i<n;i++)
        {
            th=first;
            first=second;
            second=th+first;
            System.out.println(second);
        }
    }

    static void factorial()  {
        int fact=1,n=1;
        BufferedReader bfinp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number to find factorial");

        try {
            n = Integer.parseInt(bfinp.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(n>1)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("The factorial is "+fact);

    }
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        int x;

        do{
            System.out.println("enter your choice \n 1.fibonacci series\n 2. factorial of a number\n 3. Exit");
            x=in.nextInt();
            if(x==1)
            {fibonacci();}
            if(x==2)
            { factorial(); }
        }while(x<3 && x>0);
    }
}
