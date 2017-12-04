package top.xzit;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class day01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String ss = "ÄãºÃ";
		byte[] by = ss.getBytes("utf-8");
		System.out.println(Arrays.toString(by));
		String s = new String(by,"utf-8");
		System.out.println(s);
	}
}
