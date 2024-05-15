package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Student wc=(Student) context.getBean(Student.class);
        System.out.println(wc.getHelloWorld().getMessage());
        //context.close();
	
}

}
