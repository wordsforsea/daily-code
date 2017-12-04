package top.xzit;

import java.io.File;

public class day02 {
	public static void main(String[] args) {
		File file = new File("G:\\test2");
		deleteFile(file);
	}
	public static void deleteFile(File file) {
		File[] fileArray = file.listFiles();
		
		for(File f : fileArray) {
			if(f.isDirectory()) {
				deleteFile(f);
			}else {
				System.out.println(f.getName()+"-----"+f.delete());
			}
		}
		System.out.println(file.getName()+"-------"+file.delete());
	}
}
