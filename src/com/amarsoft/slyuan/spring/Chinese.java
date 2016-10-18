package com.amarsoft.slyuan.spring;

public class Chinese implements Person {

	private Axe axe;

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	//实现Person接口的useAxe()方法
	@Override
	public void useAxe() {
		// TODO Auto-generated method stub
		System.out.println(axe.chop());
	}

}
