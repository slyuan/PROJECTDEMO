package com.amarsoft.slyuan.spring.listerner;

import org.springframework.context.ApplicationEvent;

public class EmailEvent extends ApplicationEvent {

	public EmailEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public EmailEvent(Object source, String address, String text) {
		super(source);
		this.address = address;
		this.text = text;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String address;
	private String text;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
