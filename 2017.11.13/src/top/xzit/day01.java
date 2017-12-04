package top.xzit;

import java.io.File;

public class day01 {
	public static void main(String[] args) {
		File file = new File("D:\\baidu\\BaiduNetdisk");//不会直接创建
		
		File file2 = new File("D:\\baidu\\BaiduNetdisk","a.txt");
		
		File file3 = new File("D:\\baidu\\BaiduNetdisk");
		File file4 = new File(file3,"a.txt");
		
	}
}
