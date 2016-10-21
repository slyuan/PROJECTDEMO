package com.amarsoft.slyuan.spring.afterbeanprocess;

import org.springframework.beans.factory.InitializingBean;

import com.amarsoft.slyuan.spring.Axe;
import com.amarsoft.slyuan.spring.Person;

public class Chinese implements Person, InitializingBean {

	private Axe axe;
	private String name;

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void useAxe() {
		// TODO Auto-generated method stub
		System.out.println(name + axe.chop());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("正在执行初始化方法afterPropertiesSet...");
	}

}
