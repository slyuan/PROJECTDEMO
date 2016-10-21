package com.amarsoft.slyuan.spring.afterbeanprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname)
			throws BeansException {
		// TODO Auto-generated method stub

		System.out.println("bean后处理器在初始化之前对" + beanname + "进行增强处理...");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean后处理器在初始化之后对" + beanname + "进行增强处理...");
		if (bean instanceof Chinese) {

			Chinese c = (Chinese) bean;
			c.setName("java疯狂讲义");

		}
		return null;
	}

}
