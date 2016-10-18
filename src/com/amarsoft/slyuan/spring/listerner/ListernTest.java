package com.amarsoft.slyuan.spring.listerner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListernTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		EmailEvent ele = new EmailEvent("test", "bossyslgood@126.com",
				"this is a test");
		// 发布容器事件
		ctx.publishEvent(ele);
	}

}
