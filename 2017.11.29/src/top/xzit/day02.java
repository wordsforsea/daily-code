package top.xzit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class day02 {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("osw.txt"),"Utf-8");
		osw.write("ÖÐ¹ú");
		osw.close();
	}
}
