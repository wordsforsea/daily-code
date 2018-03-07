package top.xzit01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class socketSend {
	public static void main(String[] args) throws IOException {
		//先创建需要的的socket对象
		DatagramSocket ds = new DatagramSocket();
		
		//让我们来创建数据吧
		byte[] buf = "我是最聪明的，以及最勤奋的".getBytes();
		int length = buf.length;
		InetAddress address = InetAddress.getByName("192.168.191.1"); //不能把ip作为地址直接传进去 需要经过 inetadress这个对象
		int port = 10086;
		
		//把数据打包
		DatagramPacket p = new DatagramPacket(buf, length, address, port);
		
		//发送数据
		ds.send(p);
		
		//释放资源
		ds.close();
		//所以写好了，睡觉 起床再来一遍
		
	}
}
