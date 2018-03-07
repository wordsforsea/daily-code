package top.xzit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//第一次从集合到文件
public class day03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new FileReader("b.txt"));
		ArrayList<String> array = new ArrayList<String>();
		
		String line = null;
		while((line=br.readLine())!=null){
			array.add(line);
			//System.out.println();
		}
		
		br.close();
		for(String s : array) {
			System.out.println(s);
		}
	}
}
