package top.xzit;

import java.io.File;
import java.io.IOException;

public class day02 {
	public static void main(String[] args) throws IOException {
		File file = new File("G:\\test");
		System.out.println("mkdir:"+file.mkdir());
		
		File file2 = new File("G:\\test\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		
		File file3 = new File("C:\\TXT\\AAA\\ccc");
		System.out.println("mkdirs:"+file3.mkdirs());
	}
	
	
}