package com.amarsoft.slyuan.spring.listerner;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNofier implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		// TODO Auto-generated method stub

		// 邮件通知业务处理
		// 监听邮件事件
		if (evt instanceof EmailEvent) {
			EmailEvent emailEvent = (EmailEvent) evt;
			System.out.println("需要发送邮件的接收地址：" + emailEvent.getAddress());
			System.out.println("需要发送邮件的邮件正文：" + emailEvent.getText());
		} else {
			System.out.println("其他事件：" + evt);
		}
	}

}
