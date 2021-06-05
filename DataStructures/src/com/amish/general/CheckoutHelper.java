package com.amish.general;

import java.util.concurrent.TimeUnit;

public final class CheckoutHelper {

	public static void getHelper(int c, long id) {
		
		System.out.println(" starting now ");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("value of i====="+c + ":: Thread ID ====="+id);
		System.out.println("ending now");

	}

}
