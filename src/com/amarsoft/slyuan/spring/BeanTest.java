package com.amarsoft.slyuan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// ��ȡchineseʵ��
		Person p = ctx.getBean("chinese", Person.class);
		p.useAxe();
	}

}
