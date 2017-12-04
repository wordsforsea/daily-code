package top.xzit;

import java.io.File;

public class day03 {
	public static void main(String[] args) {
		File file = new File("g:\\");
		File[] fileArry = file.listFiles();
		for(File f : fileArry) {
			if(f.isFile()) {
				if(f.getName().endsWith(".txt")) {
					System.out.println(f.getName());
				}
				
			}
		}
	}
}
