package com.amarsoft.slyuan.spring.beanproduct;

public class Dog implements Being {

	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void testBeing() {
		// TODO Auto-generated method stub
		System.out.println(msg + ",¹·°®¿Ð¹ÇÍ·");
	}

}
