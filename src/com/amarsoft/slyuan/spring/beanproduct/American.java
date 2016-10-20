package com.amarsoft.slyuan.spring.beanproduct;

public class American implements Person {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name + ",Hello";
	}

	@Override
	public String sayGoodBye(String name) {
		// TODO Auto-generated method stub
		return name + ",Good Bye";
	}

}
