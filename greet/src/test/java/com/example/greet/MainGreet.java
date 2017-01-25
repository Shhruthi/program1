package com.example.greet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainGreet {
	
	public static void main(String a[])
	{
    ApplicationContext context=new FileSystemXmlApplicationContext("Beans.xml");
    GreetingsImpl greetingsImpl = (GreetingsImpl) context.getBean("greetobj");
	System.out.println(greetingsImpl.sayGreetings());
	}

}
