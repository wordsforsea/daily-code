package top.xzit;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class day01 {
	public static void main(String[] args) {
		File file = new File("g:\\abc");
		file.mkdir();
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		Date d = new Date(file.lastModified());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}

}
