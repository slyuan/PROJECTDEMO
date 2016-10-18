package com.amarsoft.slyuan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 创建spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// 获取chinese实例
		Person p = ctx.getBean("chinese", Person.class);
		p.useAxe();
	}

}
