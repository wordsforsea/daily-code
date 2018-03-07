package top.xzit;
//第二次练习集合到文件
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class day02 {
	public static void main(String[] args) throws IOException{
		ArrayList<String> array = new ArrayList<String>();
		array.add("刻苦训练");
		array.add("好好学习");
		array.add("天天向上");
		
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("b.txt"));
		
		for(String  s : array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
