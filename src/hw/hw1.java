package hw;

public class hw1 {
	
	public static void main(String[] args) {
//		1. 請設計一隻Java程式,計算12,6這兩個數值的和與積
		
		int num1 = 12, num2 = 6;
		int sum = num1 + num2;
		int product = num1 * num2;
		
		System.out.println("和是" + sum + "," + "積是" + product);
		
//		2. 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		
		int eggs = 200, dozen = 12;
		int quotient = eggs / dozen;
		int remainder = eggs % dozen;
		
		System.out.println("200顆蛋是" + quotient + "打" + remainder + "顆");
		
//		3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int totalsecond = 256559, minute = 60, hour = 3600, day = 86400;
		int dayremainder = totalsecond % day;
		int days = totalsecond / day;
		int hours = dayremainder / hour;
		int minutes = (dayremainder % hour) / minute;
		int seconds = dayremainder % hour % minute;
		
		System.out.println("256559秒是" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
		
//		4. 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//		
		final double pi = 3.1415;
		int radius = 5;
		double erea = Math.pow(radius, 2) * pi;
		double Circumference = pi * (radius * 2);
		
		System.out.println("圓面積=" + erea + "," + "圓周長=" + Circumference);
		
//		5. 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		
		double principal = 150;
		
		for(int i = 0; i < 10; i++) {
			principal *= (1.02);
		}
		
		System.out.println("本金加利息是" + principal + "萬元");
		//本金加利息是18284916299921363元
		
//		6. 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//			5 + 5
//			5 + ‘5’
//			5 + “5”
		
		System.out.println(5 + 5);
		//整數數字相加
		System.out.println(5 + '5');
		//數字5+改成萬國碼的字元5(數字5在萬國碼中編碼是16進位的35，換成2進位是53)
		System.out.println(5 + "5");
		//數字5變成字串與後面的字串5相串接
		
//		並請用註解各別說明答案的產生原因
	}
	 
}
