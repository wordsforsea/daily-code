package top.xzit;

import java.io.File;

//马上毕业了，快了还有18个月
//批量修改文件名
public class day03 {
	public static void main(String[] args) {
		File file = new File("G:\\");
		File[] fileArray = file.listFiles();
		for(File f : fileArray) {
			//System.out.println(f);
			String name = f.getName();
			//String部分有不会的，文件名的拼接
		}
	}
}
