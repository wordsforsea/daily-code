package top.xzit;

import java.io.File;

public class day02 {
	public static void main(String[] args) {
		File file = new File("g:\\");
		File[] fileArray = file.listFiles();
		for(File f : fileArray) {
			if(f.exists()) {
				if(f.isFile()) {
					if(f.getName().endsWith(".txt")) {
						System.out.println(f.getName());
					}
				}
			}
		}
		
		
	}
}
