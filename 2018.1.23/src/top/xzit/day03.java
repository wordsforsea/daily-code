package top.xzit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class day03 {
	public static void main(String[] args) throws IOException {
		resd();
	}

	private static void resd() throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile asf = new RandomAccessFile("asf.txt", "rw");
		int x = asf.readInt();
		System.out.println(x);
	}
}
