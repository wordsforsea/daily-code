package top.xzit01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class socketSend {
	public static void main(String[] args) throws IOException {
		//�ȴ�����Ҫ�ĵ�socket����
		DatagramSocket ds = new DatagramSocket();
		
		//���������������ݰ�
		byte[] buf = "����������ģ��Լ����ڷܵ�".getBytes();
		int length = buf.length;
		InetAddress address = InetAddress.getByName("192.168.191.1"); //���ܰ�ip��Ϊ��ֱַ�Ӵ���ȥ ��Ҫ���� inetadress�������
		int port = 10086;
		
		//�����ݴ��
		DatagramPacket p = new DatagramPacket(buf, length, address, port);
		
		//��������
		ds.send(p);
		
		//�ͷ���Դ
		ds.close();
		//����д���ˣ�˯�� ������һ��
		
	}
}
