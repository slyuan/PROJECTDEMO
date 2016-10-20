package com.amarsoft.slyuan.spring.beanproduct;

public class BeingFactory {

	// 静态工厂
	public static Being getBeing(String arg) {
		// 根据参数，返回Dog实例
		if (arg.equalsIgnoreCase("dog")) {
			return new Dog();
		}
		// 否则返回Cat实例
		else {
			return new Cat();
		}
	}
}
