package com.amarsoft.slyuan.spring.afterbeanprocess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amarsoft.slyuan.spring.Person;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ´´½¨springÈÝÆ÷
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person)ctx.getBean("chinesebean");
		p.useAxe();
	}

}
