package top.xzit;

import java.io.File;
//Ä¿Â¼±éÀú
public class day02 {
	public static void main(String[] args) {
		File file = new File("g:\\");
		String[] strArry = file.list();
		for (String s : strArry) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			System.out.println(f.getName());
		}
	}
}
