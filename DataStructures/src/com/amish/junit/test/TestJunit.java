package com.amish.junit.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
   
   @Test  
   public void testFindMax(){  
       assertEquals(4,MessageUtil.findMax(new int[]{1,3,4,2}));  
       assertEquals(-1,MessageUtil.findMax(new int[]{-12,-1,-3,-4,-2}));  
   }  
}