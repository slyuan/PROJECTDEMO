package com.amarsoft.slyuan.spring;

public class Chinese implements Person {

	private Axe axe;

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	//ʵ��Person�ӿڵ�useAxe()����
	@Override
	public void useAxe() {
		// TODO Auto-generated method stub
		System.out.println(axe.chop());
	}

}
