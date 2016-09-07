package com.amarsoft.slyuan.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStreamOperate {
	
	public static void main(String[] args) { 
		new FileStreamOperate().fileOperate();
	}

	
	public void fileOperate(){
	
		try {
			FileInputStream filein = new FileInputStream("D:/business.txt"); //源文件
			
			FileOutputStream fileout = new FileOutputStream("D:/tout.txt"); //目标文件
			
			 byte[] bytearray = new byte[1024];
			 
	            int hasRead = 0;  
	            //使用循环来重复“取水”的过程  
	            while((hasRead = filein.read(bytearray))>0)  
	            {  
	                fileout.write(bytearray);
	            }
	            filein.close();
	            fileout.flush();
	            fileout.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
