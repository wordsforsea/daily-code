package top.xzit;

import java.io.File;
import java.io.IOException;

public class day02 {
	public static void main(String[] args) throws IOException {
		File file = new File("G:\\a.txt");
		file.createNewFile();
		
		File file2 = new File("G:\\���ǻԹ��ĺܺ�.txt");
		file.renameTo(file2);
	}
}
