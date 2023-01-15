package com.telusko.demoMVC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
       vehicle v=(vehicle)context.getBean("vehicle");
       v.drive();
    }
}
