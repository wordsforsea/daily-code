package top.xzit;

import java.io.FileOutputStream;
import java.io.IOException;

//数据换行
public class day01 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		for(int x=0;x<10;x++) {
			fos.write(("hell0"+x).getBytes());
			fos.write("\r\n".getBytes());//windows记事本不支持\n换行
		}
		fos.close();
	}
}
