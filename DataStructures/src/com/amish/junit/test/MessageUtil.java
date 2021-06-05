package com.amish.junit.test;

/*
* This class prints the given message on console.
*/

public class MessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
   
   public static int findMax(int arr[]){  
       int max=0;  
       for(int i=1;i<arr.length;i++){  
           if(max<arr[i])  
               max=arr[i];  
       }  
       return max;  
   }  
	
}  