package top.xzit;

import java.io.File;
import java.io.FilenameFilter;

public class day04 {
	public static void main(String[] args) {
		File file = new File("g:\\");
		String[] strArray = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//return false;
				File file = new File(dir,name);
				boolean flag =file.isFile();
				boolean flag2 = name.endsWith(".txt");
				return flag && flag2;
				
			}
			
		});
		/*String[] strArray = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//return false;
				File file = new File(dir,name);
				boolean flag =file.isFile();
				boolean flag2 = name.endsWith(".txt");
				return flag && flag2;
				
			}
			
		});*/
		for(String s : strArray) {
			System.out.println(s);
		}
	}
}
