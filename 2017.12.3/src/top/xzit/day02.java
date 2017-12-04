package top.xzit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class day02 {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(new 
				FileInputStream("a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new 
				FileOutputStream("b.txt"));
		char[] chs=new char[1024];
		int len=0;
		while((len=isr.read(chs))!=-1) {
			osw.write(chs, 0, len);
			osw.flush();//如果数据量大需要
		}
		isr.close();
		osw.close();
	}
}
