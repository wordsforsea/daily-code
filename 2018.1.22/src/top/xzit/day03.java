package top.xzit;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class day03 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("pw1.txt"),true);
		//可以自动刷新的构造方法
		pw.print("我是最棒的");
		pw.println(true);
		pw.println("我不是最棒的");
		pw.print(false);
		//pw.newline(); 没有这个方法
		pw.close();//见到流就关闭，你开的流那就由你来关
		
	}
}
