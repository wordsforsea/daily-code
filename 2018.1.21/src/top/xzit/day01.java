package top.xzit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class day01 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for(int x=0;x<10;x++) {
			baos.write(("hello"+x).getBytes());
		}
		//baos.close(); ���ﲻ��Ҫ��ôд�����Ը���һ��Դ��
		byte[] byt = baos.toByteArray();//ת��Ϊbyte���飬���ں���Ķ�ȡ
		ByteArrayInputStream bais = new ByteArrayInputStream(byt);
		//���ｫ������Ϊ���������вι�����ж�ȡ
		int by=0;
		while((by=bais.read())!=-1){
			System.out.print((char)by);
		}
		bais.close();//���Բ�д
	}
}
