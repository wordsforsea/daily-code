package top.xzit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class day01 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for(int x=0;x<10;x++) {
			baos.write(("hello"+x).getBytes());
		}
		//baos.close(); 这里不需要这么写，可以跟踪一下源码
		byte[] byt = baos.toByteArray();//转换为byte数组，便于后面的读取
		ByteArrayInputStream bais = new ByteArrayInputStream(byt);
		//这里将数组作为参数带入有参构造进行读取
		int by=0;
		while((by=bais.read())!=-1){
			System.out.print((char)by);
		}
		bais.close();//可以不写
	}
}
