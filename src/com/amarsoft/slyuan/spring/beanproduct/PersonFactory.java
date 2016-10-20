package com.amarsoft.slyuan.spring.beanproduct;

public class PersonFactory {

	public Person getPerson(String arg) {

		if (arg.equalsIgnoreCase("chin")) {
			return new Chinese();
		} else {
			return new American();
		}
	}
}
