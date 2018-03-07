package top.xzit;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//可以读写基本数据类型的流
//Datainputsteam 
//DATAoutputstream
public class day02 {
	public static void main(String[] args) throws IOException{
		//写
		write();
		//读
		read();
	}

	private static void read() throws IOException{
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(new FileInputStream("a.txt"));
		int i = dis.readInt();
		char c = dis.readChar();
		boolean b = dis.readBoolean();
		float f = dis.readFloat();
		System.out.println(i);
		System.out.println(c);
		System.out.println(f);
		System.out.println(b);
		dis.close();
	}

	private static void write() throws IOException{
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("a.txt"));
		dos.writeInt(100);
		dos.writeChar('a');
		dos.writeBoolean(false);
		dos.writeFloat(12.32F);
		dos.close();
	}
}