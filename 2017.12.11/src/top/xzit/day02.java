package top.xzit;
//�ڶ�����ϰ���ϵ��ļ�
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class day02 {
	public static void main(String[] args) throws IOException{
		ArrayList<String> array = new ArrayList<String>();
		array.add("�̿�ѵ��");
		array.add("�ú�ѧϰ");
		array.add("��������");
		
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
