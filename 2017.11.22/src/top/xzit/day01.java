package top.xzit;

import java.io.File;

//遍历所有文件及文件夹
public class day01 {
	public static void main(String[] args) {
		File file = new File("G:\\CODE");
		getFile(file);
	}
	private static void getFile(File file) {
		File[] fileArray = file.listFiles();
		if(fileArray.length==0) {
			return ;
		}
		for(File f : fileArray) {
			if(f.isDirectory()) {
				getFile(f);
			}else {
				if(f.getName().endsWith(".java")){
					System.out.println(f.getAbsolutePath());
				}
			}
		}
	}
}
