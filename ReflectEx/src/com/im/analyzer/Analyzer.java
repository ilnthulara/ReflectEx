package com.im.analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Analyzer {
	public static void analyze(Object obj) {
		//If you have an object obj, you can get its class object with
		Class cls = obj.getClass();
		String name = cls.getName();
		System.out.println("Class Name: "+name);
		
		//You can get the class object for the superclass of a Class cls with
		Class sup = cls.getSuperclass();
		String superName = sup.getName();
		System.out.println("Super Class Name: "+superName);
		
		//Super Super Class
		Class supsup = sup.getSuperclass();
		String supsupName = supsup.getName();
		System.out.println("Super Class Name: "+supsupName);
		
		String simpleName = cls.getSimpleName();
		System.out.println("Simple Name: "+simpleName);
		
		//Get Modifiers
		int m = cls.getModifiers();
		boolean iPublic = Modifier.isPublic(m);
		if (Modifier.isPublic(m)) {
			System.out.println("It is public");
		}
		else {
			System.out.println("It is not public");
		}
		
		//Get Implemented interfaces
		Class[] interfaces = cls.getInterfaces();
		for (Class inf: interfaces) {
			System.out.println("Interface: "+inf.getName());
		}
		
		//Get all fields/variables
		Field[] fields = cls.getFields();
		for(Field field: fields) {
			String fname = field.getName();
			System.out.println("Field Name: "+fname);
			Class type = field.getType();
			System.out.println("Field Type: "+type.getName());
			if(fname.equals("age")) {
				try 
				{
					field.set(obj, 25);
					int newAge = (int)field.get(obj);
					System.out.println("New Age: "+newAge);
				} 
				catch (Exception e) 
				{
					// TODO: handle exception
				}
				
			}
			
		}
		
		//Get Constructors
		Constructor[] constructors = cls.getConstructors();
		for(Constructor constructor: constructors) {
			System.out.println("Constructor: "+constructor.getName());
			System.out.println("Constructor: "+constructor.toString());
		}
		
		//Get Methods
		Method[] methods = cls.getMethods();
		for(Method method: methods) {
			String mName = method.getName();
			System.out.println("Method: "+mName);
			if(mName.equals("fight")) {
				try 
				{
					method.invoke(obj, null);
				} 
				catch (Exception e) 
				{
					// TODO: handle exception
				}
				
			}
		}
	}
}
