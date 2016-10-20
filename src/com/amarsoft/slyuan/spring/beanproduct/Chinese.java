package com.amarsoft.slyuan.spring.beanproduct;

public class Chinese implements Person {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name + ",您好！";
	}

	@Override
	public String sayGoodBye(String name) {
		// TODO Auto-generated method stub
		return name + "，下次再见";
	}

}
