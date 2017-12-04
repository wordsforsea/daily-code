package top.xzit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day01_03 {
	public static void main(String[] args) {
		String s ="2017-11-12";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm");
		Date d = null;
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.exit(0);
		}finally {
			System.out.println("这里的代码可以执行");
		}
		System.out.println(d);
	}

}
