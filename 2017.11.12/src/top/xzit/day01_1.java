package top.xzit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day01_1 {
	public static void main(String[] args) {
		String s = "2017-11-12";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		}catch(ParseException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("over");
	}

}
