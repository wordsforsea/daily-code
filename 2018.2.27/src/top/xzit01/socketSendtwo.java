package top.xzit01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class socketSendtwo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		byte[] buf = "bվ����õ���վ��PHP����õ�����".getBytes();
		int length = buf.length;
		InetAddress address = InetAddress.getByName("192.168.1.10");
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(buf, length, address, port);
		ds.send(dp);
		ds.close();
	}
}
