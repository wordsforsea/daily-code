package top.xzit;

import java.io.FileInputStream;
import java.io.IOException;

public class day01 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("fis.txt");
		byte[] by = new byte[5];
		//int len = fis.read(by);
		//System.out.println(new String(by,0,len));
		//¸Ä½ø°æ
		int len = 0;
		while((len=fis.read(by)) != -1) {
			System.out.print(new String(by,0,len));
		}
	}
}
