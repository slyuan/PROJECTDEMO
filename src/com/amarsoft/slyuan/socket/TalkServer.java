package com.amarsoft.slyuan.socket;

import java.io.*;
import java.net.*;

public class TalkServer{
	
	public static void main(String args[]) {
		new TalkServer().serverPrint();
		
	}
	
	public void serverPrint(){
		  
		   try {
			  
			 //����һ��ServerSocket�ڶ˿�4700�����ͻ�����
			ServerSocket server = null; 
			server = new ServerSocket(4700);
			
			
			//ʹ��accept()�����ȴ��ͻ������пͻ�
			//�����������һ��Socket���󣬲�����ִ��
			Socket socket = null;
			socket = server.accept();
			
			String line;

			BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));

			//��Socket����õ�����������������Ӧ��BufferedReader����

			PrintWriter os=new PrintWriter(socket.getOutputStream());

			//��Socket����õ��������������PrintWriter����

			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));

			//��ϵͳ��׼�����豸����BufferedReader����

			System.out.println("Client:"+is.readLine());

			//�ڱ�׼����ϴ�ӡ�ӿͻ��˶�����ַ���

			line=sin.readLine();
			
			//�ӱ�׼�������һ�ַ���

			while(!line.equals("bye")){

			//������ַ���Ϊ "bye"����ֹͣѭ��

			os.println(line);

			//��ͻ���������ַ���

			os.flush();

			//ˢ���������ʹClient�����յ����ַ���
			System.out.println("Server:"+line);

			//��ϵͳ��׼����ϴ�ӡ������ַ���

			System.out.println("Client:"+is.readLine());

			//��Client����һ�ַ���������ӡ����׼�����

			line=sin.readLine();

			//��ϵͳ��׼�������һ�ַ���

			}//����ѭ��
			
			os.close(); //�ر�Socket�����

			is.close(); //�ر�Socket������

			socket.close(); //�ر�Socket

			server.close(); //�ر�ServerSocket
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
