package com.amarsoft.slyuan.spring.listerner;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNofier implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		// TODO Auto-generated method stub

		// �ʼ�֪ͨҵ����
		// �����ʼ��¼�
		if (evt instanceof EmailEvent) {
			EmailEvent emailEvent = (EmailEvent) evt;
			System.out.println("��Ҫ�����ʼ��Ľ��յ�ַ��" + emailEvent.getAddress());
			System.out.println("��Ҫ�����ʼ����ʼ����ģ�" + emailEvent.getText());
		} else {
			System.out.println("�����¼���" + evt);
		}
	}

}
