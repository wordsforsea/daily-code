package top.xzit;

import java.io.File;

//���ϱ�ҵ�ˣ����˻���18����
//�����޸��ļ���
public class day03 {
	public static void main(String[] args) {
		File file = new File("G:\\");
		File[] fileArray = file.listFiles();
		for(File f : fileArray) {
			//System.out.println(f);
			String name = f.getName();
			//String�����в���ģ��ļ�����ƴ��
		}
	}
}
