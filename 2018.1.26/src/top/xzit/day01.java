package top.xzit;

import java.util.Properties;
import java.util.Set;

public class day01 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("����", "14");
		prop.setProperty("����", "15");
		prop.setProperty("����", "19");
		System.out.println(prop);
		
		//��ȡ
		Set<String> set = prop.stringPropertyNames();
		for(String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key+"------"+value);
		}
	}
}
