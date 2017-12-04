package top.xzit;

import java.io.File;
import java.io.IOException;

public class day01 {
	public static void main(String[] args) throws IOException {
		File file = new File("g:\\a.txt");
		file.createNewFile();//创建了新的文件夹
		File file2 = new File("test.txt");
		file2.createNewFile();
		file2.delete();
	}
}
