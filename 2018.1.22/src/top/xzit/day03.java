package top.xzit;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class day03 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("pw1.txt"),true);
		//�����Զ�ˢ�µĹ��췽��
		pw.print("���������");
		pw.println(true);
		pw.println("�Ҳ��������");
		pw.print(false);
		//pw.newline(); û���������
		pw.close();//�������͹رգ��㿪�����Ǿ���������
		
	}
}
