package top.xzit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class day03 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("˵��.txt");
		fos.write("����������".getBytes());//�����ǿ��Ե�
		fos.write(97);
		fos.close();
	}
}
