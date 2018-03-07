package top.xzit01;

import java.awt.Frame;//导包要求：1.写全所有内容2.shift+CTRL+o
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("java第一个程序界面");
		f.setVisible(true);
		f.setSize(400, 300);
		f.setLocation(500, 300);
		
//		f.addWindowListener(new WindowListener() {
//			//对这里做一些解释
//			//第一步要添加一个监听器
//			//第二步实现匿名内部类，当然如果你愿意实现方法也可以
//			//会自动重写要监听的动作，然后重写下需要的方法，ok
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
//		});   采用了适配器来约束  减少不必要的代码 由jdk自己提供
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
