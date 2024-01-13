package Reflection;

import java.lang.reflect.Method;

class laxmi{
	void aryan() {}
}
public class examp {
        
	public static void main(String[] args) {
		laxmi obj =new laxmi();
		examp e = new examp();
		// to get the class
		Class c = obj.getClass();
		System.out.println(c);

		Class b = e.getClass();
		System.out.println(b);
		
		// to get methods
		Method methods[] = c.getMethods();
		for(Method m: methods) {
			System.out.println(m.getName());
		}
		// to get the method declared by ous
		Method method[] = c.getDeclaredMethods();
		for(Method m: method) {
			System.out.println(m.getName());
		}
	}
}
