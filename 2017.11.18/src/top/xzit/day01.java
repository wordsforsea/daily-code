package top.xzit;

import java.io.File;
import java.io.FilenameFilter;
//测试两种查找文件的方式之一
public class day01 {
	public static void main(String[] args) {
		File file = new File("g:\\");
		String[] strArray = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File file = new File(dir,name);
				boolean flag = file.isFile();
				boolean flag2 = file.getName().endsWith(".txt");
				return flag && flag2;
			}
		});
		
		for(String s : strArray) {
			System.out.println(s);
		}
		
		
	}
}
