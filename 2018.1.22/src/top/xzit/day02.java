package top.xzit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class day02 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("pw2.txt");
		pw.print("123456");
		pw.println();
		pw.print(true);
		pw.println();
		
		
		
		pw.close();
	}
}
