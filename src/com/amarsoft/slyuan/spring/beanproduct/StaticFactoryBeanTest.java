package com.amarsoft.slyuan.spring.beanproduct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ´´½¨springÈÝÆ÷
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Being p1 = ctx.getBean("dog", Being.class);
		p1.testBeing();

		Being p2 = ctx.getBean("cat", Being.class);
		p2.testBeing();
	}

}
