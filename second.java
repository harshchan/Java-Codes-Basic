package com.company;
class sum
{int n1=10;
int n2=20;
    sum(int n1,int n2)
    {//keyword this points towards the current object and this.n1 changes value of that object
        System.out.println("Number 1 is "+n1);
        System.out.println("Number 2 is "+n2);
        this.n1=n1;
        this.n2=n2;
        System.out.println("Number 1 is (after this keywrd)"+n1);
        System.out.println("Number 2 is (after this keywrd)"+n2);

    }
    void display(int n1,int n2)
    {
        System.out.println("Number 1 is(in display fn) "+n1);//10
        System.out.println("Number 2 is (in display fn)"+n2);//20
        System.out.println("Number 1 is (in display fn this)"+this.n1);
        System.out.println("Number 2 is (in display fn this)"+this.n2);



    }
}
public class second {
    public static void main(String args[])
    {
       sum s=new sum(10,20);
       s.display(100,200);
    }
}
