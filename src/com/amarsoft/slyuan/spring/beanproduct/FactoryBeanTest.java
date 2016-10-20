package com.amarsoft.slyuan.spring.beanproduct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 创建spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Person p = ctx.getBean("chin", Person.class);
		System.out.println(p.sayHello("中国人"));
	}
}
