package top.xzit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class day01 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("pw.txt");
		pw.write("hello/r/n");///r/n�ǻ��з�,���ﻻ������
		pw.write("world/r/n");
		pw.write("java");
		pw.close();
	}
}
