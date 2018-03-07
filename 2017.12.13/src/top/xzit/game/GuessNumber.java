package top.xzit.game;

import java.util.Scanner;

public class GuessNumber {
	private GuessNumber() {
		//私有构造方法，不允许外部类 构建本类的实例 常见于单例模式
	}
	public static void start() {
		int number = (int) (Math.random()*100) + 1;//产生一个随机数
		int count = 0;//定义一个统计变量
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数据（1-100）");
			int guessNumber = sc.nextInt();
			
			count++;
			//判断
			if(guessNumber>number) {
				System.out.println("你猜的数"+guessNumber+"大了");
			}else if (guessNumber<number) {
				System.out.println("你猜的数"+guessNumber+"小了");
			}else {
				System.out.println("恭喜你第"+count+"次就猜对了");
				break;//猜对了就退出，不然一直循环
			}
		}
	}
}
