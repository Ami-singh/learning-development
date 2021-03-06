package com.amish.learning;

import java.lang.reflect.Constructor;
import static java.lang.System.out;
import java.lang.reflect.Type;

public class ConstrutorType {
	
	 public static void main(String... args) {
			try {
			    Class<?> cArg = Class.forName(args[1]);

			    Class<?> c = Class.forName(args[0]);
			    Constructor[] allConstructors = c.getDeclaredConstructors();
			    for (Constructor ctor : allConstructors) {
				Class<?>[] pType  = ctor.getParameterTypes();
				for (int i = 0; i < pType.length; i++) {
				    if (pType[i].equals(cArg)) {
					out.format("%s%n", ctor.toGenericString());

					Type[] gpType = ctor.getGenericParameterTypes();
					for (int j = 0; j < gpType.length; j++) {
					    char ch = (pType[j].equals(cArg) ? '*' : ' ');
					    out.format("%7c%s[%d]: %s%n", ch,
						       "GenericParameterType", j, gpType[j]);
					}
					break;
				    }
				}
			    }

		        // production code should handle this exception more gracefully
			} catch (ClassNotFoundException x) {
			    x.printStackTrace();
			}
		    }

}
