package com.amarsoft.slyuan.spring.afterbeanprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname)
			throws BeansException {
		// TODO Auto-generated method stub

		System.out.println("bean�������ڳ�ʼ��֮ǰ��" + beanname + "������ǿ����...");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean�������ڳ�ʼ��֮���" + beanname + "������ǿ����...");
		if (bean instanceof Chinese) {

			Chinese c = (Chinese) bean;
			c.setName("java�����");

		}
		return null;
	}

}
