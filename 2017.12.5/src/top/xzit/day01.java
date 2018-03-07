package top.xzit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class day01 {
	public static void main(String[] args) throws IOException{
		String srcSring = "c:\\a.txt";
		String destString = "d:\\b.txt";
		method1(srcSring,destString);
		method2(srcSring,destString);
		method3(srcSring,destString);
	}
	public static void method1(String srcSting,String destSting) throws IOException{
		FileReader fr = new FileReader(srcSting);
		FileWriter fw = new FileWriter(destSting);
		int ch=0;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
	public static void method2(String srcSting,String destSting) throws IOException{
		FileReader fr = new FileReader(srcSting);
		FileWriter fw = new FileWriter(destSting);
		char[] chs = new char[1024];
		int len = 0;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);;
		}
		fr.close();
		fw.close();
	}
	public static void method3(String srcSting,String destSting) throws IOException{
		BufferedReader br = new BufferedReader(
				new FileReader(srcSting));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(destSting));
		String s = null;
		//int len = 0;
		while((s=br.readLine())!=null){
			bw.write(s);
			bw.newLine();
			bw.flush();//看这就是著名的bw三连
		}
		br.close();
		bw.close();
	}
}
