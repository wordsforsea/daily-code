package top.xzit.game;

import java.util.Scanner;

public class GuessNumber {
	private GuessNumber() {
		//˽�й��췽�����������ⲿ�� ���������ʵ�� �����ڵ���ģʽ
	}
	public static void start() {
		int number = (int) (Math.random()*100) + 1;//����һ�������
		int count = 0;//����һ��ͳ�Ʊ���
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���������ݣ�1-100��");
			int guessNumber = sc.nextInt();
			
			count++;
			//�ж�
			if(guessNumber>number) {
				System.out.println("��µ���"+guessNumber+"����");
			}else if (guessNumber<number) {
				System.out.println("��µ���"+guessNumber+"С��");
			}else {
				System.out.println("��ϲ���"+count+"�ξͲ¶���");
				break;//�¶��˾��˳�����Ȼһֱѭ��
			}
		}
	}
}
