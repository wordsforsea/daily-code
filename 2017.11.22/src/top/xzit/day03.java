package top.xzit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class day03 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("说明.txt");
		fos.write("测试下中文".getBytes());//中文是可以的
		fos.write(97);
		fos.close();
	}
}
