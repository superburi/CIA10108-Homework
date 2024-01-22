package hw;

public class hw2 {

	public static void main(String[] args) {
//		1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		
		int evensum = 0;
		
		for (int i = 0; i <= 1000; i += 2) {
			evensum += i;
		}
		
		System.out.println(evensum);
		
//		2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		
		int multiply_1 = 1;
		
		for (int i = 1; i <= 10; i++) {
			multiply_1 *= i;
		}
		
		System.out.println(multiply_1);
		
//		3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		
		int multiply_2 = 1;
		int i = 1;
		while(i <= 10) {
			multiply_2 *= i;
			i++;
		}
		
		System.out.println(multiply_2);
		
//		4.請設計一隻Java程式,輸出結果為以下:
//			1 4 9 16 25 36 49 64 81 100
		
		for (int j = 1; j <= 10; j++) {
			System.out.print((int)(Math.pow(j, 2)) + " ");
		}
		System.out.println();
		
//		5.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		
		/*
		  10位數字*x個位數字*y 若都不==4，就印出來，然後算出總共有幾個
		  兩個迴圈大的顯示十位數小的顯示個位數
		*/
		int without4 = 0;
		
		for(int x = 0; x != 4 && x < 5; x++) {
			for (int y = 1;y < 10; y++) {
				if (y != 4) {
					System.out.print(10 * x + y + " ");
					without4 += 1;
				}
			}
		}
		System.out.println();
		System.out.println("總共有" + without4 + "個");
		
//		6.請設計一隻Java程式,輸出結果為以下: 
//			1 2 3 4 5 6 7 8 9 10  
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4		
//			1 2 3		
//			1 2			
//			1
		
		/*
		  兩個for迴圈一外一內		
		  外迴圈初始值a=10，在>0時觸發，每跑完一次-- 	
		  內迴圈初始值b=1，在<=外迴圈值時觸發，每跑完一次++	
		*/
		for(int a = 10;a > 0; a--) {
			for(int b = 1; b <= a; b++) {
					System.out.print(b + " ");
			}
			System.out.println();//這時才要換行但已經>a=10，所以if內的換行根本不會執行
		}	
		
//		7.請設計一隻Java程式,輸出結果為以下:(用迴圈做)
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		
	    /*
	      宣告兩個變數r、t
 		  兩個for迴圈一外一內
		  外迴圈初始值q=1,在q<=6時觸發,每次跑完q++
		  內迴圈初始值e=1,在小於等於q的時候觸發,每次跑完++
		  內迴圈觸發，印出(r+t)
		  如果內迴圈執行完，則t+1並換行
	    */
		char r = '\u0041';
		int t = 0;
				
		for (int q = 1; q <= 6; q++) {
			for (int e = 1; e <= q; e++) {
				System.out.print((char)(r + t));//a
			}
			t += 1;
			System.out.println();
		}
			
//		8.請建立一個TestNineNine.java程式,可輸出九九乘法表
//
//		8-1.使用for迴圈 + while迴圈

		int p = 1, j;
		while (p <= 9) {
			for (j = 1; j <= 9; j++) {
				System.out.print(p + "*" + j + "=" + p * j + "\t");
			}
			p ++;
			System.out.println();
		}
		
		System.out.println();
//		8-2.使用for迴圈 + do while迴圈

		int o = 1, k;
		do {
			for (k = 1; k <= 9; k++) {
				System.out.print(o + "*" + k + "=" + o * k + "\t");
			}
			System.out.println();
			o++;
		} while (o <= 9);
		
		System.out.println();
//		8-3.使用while迴圈 + do while迴圈
		
		int h = 1, s;
		while (h <= 9) {
			s = 1;
			do {
				System.out.print(h + "*" + s + "=" + h * s + "\t");
				s++;
			} while (s <= 9);
			System.out.println();
		
			h++;
		}
		
	}
	
	

}
