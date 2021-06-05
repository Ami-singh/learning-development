package com.amish.general;

import java.util.HashMap;
import java.util.Map;

public class Test{

/*static{

System.out.print("Hello World");
System.exit(1);
}*/
public static void main(String[] args)	
{
	/*List a = new ArrayList();
	a.add(20);
	a.add(30);
	a.add(3);
	a.add(4);
	Collections.sort(a);
	Map m = new HashMap();
	m.put(new Integer(10), "Amish");
	m.put(new Integer(10), "ABC");
	System.err.println(m);*/
	
	        /*ArrayList<String> arrayListObject = new ArrayList<>(); 
	        ArrayList<Object> arrayListClone = new ArrayList<>();
	        arrayListObject.add("A");
	        arrayListObject.add("B");
	        arrayListObject.add("C");
	        arrayListObject.add("D");
	         
	        System.out.println(arrayListObject);   
	         
	        arrayListClone.add(arrayListObject.clone());
	        
	        //System.out.println(arrayListClone);  
	        
	        arrayListObject.add("E");
	        arrayListObject.remove("A");
	        System.out.println(arrayListObject);
	        arrayListClone.add(arrayListObject.clone());
	        System.err.println(arrayListClone);*/
 abc();
	
	
	       
	    }

private static void abc() {
	// TODO Auto-generated method stub
	try{
		String test = null;
		Map<String,String> m = new HashMap<>();
		m.put("String", "使用条款");
		System.err.println("test ====" + test+" Amish");
		if(test.equals("xyz")){
			System.err.println("check");
			return ;
		}
		
	}catch(Exception e)
	{
		System.err.println("catch block");
	}finally{
		System.err.println("Test1");
	}
	
	
}
}