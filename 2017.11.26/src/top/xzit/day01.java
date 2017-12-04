package top.xzit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//复制文本文件
public class day01 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt");
		FileInputStream fis = new FileInputStream("fis.txt");
		
		int by = 0;
		while((by=fis.read()) != -1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}
}
