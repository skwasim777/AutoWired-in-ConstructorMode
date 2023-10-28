package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("autowiring.xml");
		Employee emp = (Employee) app.getBean("emp");
		System.out.println(emp);
	}
}
