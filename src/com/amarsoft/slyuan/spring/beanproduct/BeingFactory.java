package com.amarsoft.slyuan.spring.beanproduct;

public class BeingFactory {

	// ��̬����
	public static Being getBeing(String arg) {
		// ���ݲ���������Dogʵ��
		if (arg.equalsIgnoreCase("dog")) {
			return new Dog();
		}
		// ���򷵻�Catʵ��
		else {
			return new Cat();
		}
	}
}
