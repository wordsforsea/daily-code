package top.xzit01;

import java.awt.Frame;//����Ҫ��1.дȫ��������2.shift+CTRL+o
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("java��һ���������");
		f.setVisible(true);
		f.setSize(400, 300);
		f.setLocation(500, 300);
		
//		f.addWindowListener(new WindowListener() {
//			//��������һЩ����
//			//��һ��Ҫ���һ��������
//			//�ڶ���ʵ�������ڲ��࣬��Ȼ�����Ը��ʵ�ַ���Ҳ����
//			//���Զ���дҪ�����Ķ�����Ȼ����д����Ҫ�ķ�����ok
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});   ��������������Լ��  ���ٲ���Ҫ�Ĵ��� ��jdk�Լ��ṩ
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				super.windowClosed(arg0);
				
			}
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				//super.windowClosing(arg0);
				System.exit(0);
			}
		});
	}
}
