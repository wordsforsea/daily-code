package top.xzit01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonDemo {
	public static void main(String[] args) {
		Frame f = new Frame("测试按钮");
		Button bu = new Button("点下试试");
		f.add(bu);//把按钮添加到了窗体 类似vb 没vb直观
		f.setLayout(new FlowLayout());
		f.setBounds(400, 200, 300, 200);
		f.setVisible(true);
		
		//对控件进行事件编制
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				//super.windowClosing(arg0);
				System.exit(0);
			}
		});
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("再点试试");
			}
		});
	}
}
