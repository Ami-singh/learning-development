package com.amish.general;

import java.util.Random;

class MultithreadingDemo implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
        	Random r = new Random();
        	int c = r.nextInt();
        	System.out.println("r.nextInt(): "+ c);
        	CheckoutHelper.getHelper(c,Thread.currentThread().getId());
        	System.out.println ("Thread " + 
                    Thread.currentThread().getId() + 
                    " is running"); 
        	
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        }
        System.out.println("Thread " + 
                Thread.currentThread().getId() + 
                " is over");
    } 
   
   
} 
   
public class Multithread 
{ 
    public static void main(String[] args) throws InterruptedException 
    { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            MultithreadingDemo object1 = new MultithreadingDemo();
            Thread obj =new Thread(object);
            Thread obj1 =new Thread(object1);
            obj.start(); 
            obj1.start(); 
            obj.sleep(10000);
    } 
} 