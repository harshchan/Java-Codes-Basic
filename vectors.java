package com.company;

import java.util.Vector;

public class vectors {

    public static void main(String args[])
    {
        Vector v1=new Vector();
        System.out.println("initial capaacity is "+v1.capacity());//capacity is maximum value
        System.out.println("Initial size is "+v1.size());
        //size depends of number of elements
        //if 1 object then size=1 but capacity can be greater than 1
        //size<capacity
        for(int i=0;i<10;i++)
        {
            v1.addElement(i);
            //System.out.println(" capaacity is "+v1.capacity());//capacity is maximum value
            //System.out.println("size is "+v1.size());
        }
        System.out.println(" capaacity is "+v1.capacity());//capacity is maximum value
        System.out.println(" size is "+v1.size());
//if size is<capacity nearabout capacity then capaccity automatically increments by 10
        v1.removeElement(2);
        v1.removeElement(3);
        System.out.println(v1);
        System.out.println(" size is "+v1.size());

        //copy all the vector objects into whole arrayof objects
//        int size=v1.size();
//        Object obj1=new Object[size];
//        v1.copyInto(new Object[]{obj1});

//        for(int i=0;i<size;i++)
//        {
//            System.out.println(obj1[i]);
//        }
        System.out.println("does vector contain 2? "+v1.contains(2));
        System.out.println("does vector contain 7? "+v1.contains(7));
    }
}
