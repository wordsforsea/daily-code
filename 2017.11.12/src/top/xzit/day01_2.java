package top.xzit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day01_2 {
	public static void main(String[] args) {
		System.out.println("������������");
		try {
			method();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����е���");
	}
    public static void method() throws ParseException{
    	String s = "2017-11-12";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date d = sdf.parse(s);
		System.out.println(d);
    }
}
