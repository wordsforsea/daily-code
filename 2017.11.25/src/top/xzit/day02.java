package top.xzit;

import java.io.FileInputStream;
import java.io.IOException;

public class day02 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("fos.txt");
		int by = fis.read();
		while(by != -1) {
			System.out.print((char)by);
			by = fis.read();
		//×îÖÕ°æ
			
		}
	}
}
