package com.path;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person p1 = (Person) context.getBean("JG");
		System.out.println(p1);
		Person p2 = (Person) context.getBean("DR");
		System.out.println(p2);
		Person p3 = (Person) context.getBean("AG");
		System.out.println(p3);

	}

}
