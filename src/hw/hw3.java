package hw;

import java.util.Scanner;
import java.util.Arrays;

public class hw3 {
	
	public static void main(String args[]) {
		
//		1.請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
//		• Scanner紅底字請移動滑鼠到錯誤處,點選Import ‘Scanner’即可
//		• 留意程式是否已終止 (沒亮紅燈)
//		(提示:Scanner,三角形成立條件,判斷式if else)
//		(進階功能:加入直角三角形的判斷)
		
		int[] x = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.err.println("請輸入第" + (i + 1) + "個數字 : ");
			if (sc.hasNextInt()) {
				x[i] = sc.nextInt();
			}
		}
		//先把數字按照大小排列
		Arrays.sort(x);//[2,6,6][5,5,6]
		
		if (x[2] < (x[0] + x[1])) {
			if (x[0] == x[1] && x[1] == x[2]) {
				System.out.println("正三角形");
			}else if (x[0] == x[1] || x[0] == x[2] || x[1] == x[2]) {
				System.out.println("等腰三角形");
			}else if ((Math.pow(x[0], 2) + Math.pow(x[1], 2)) == Math.pow(x[2], 2)) {
				System.out.println("直角三角形");
			}else {
				System.out.println("其他三角形");
			}
		}else {
			System.out.println("這不是三角形");
		}
					
/*==========================上1下2==============================================*/

//		2.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//		• 透過Math類別的靜態方法random(),可以自動產生隨機的數字
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

//		int guess;
//		System.err.println("開始猜數字吧!");
//		int[] posibilities = new int[101];
//		for (int i = 0; i <= 100; i++) {
//			posibilities[i] = i;
//		}
//		int ans = (int)(Math.random() * 100);//0~99
//		if (ans == 99) {
//			ans += 1;
//		}
//		Scanner sc = new Scanner(System.in);
//		if (sc.hasNextInt()) {
//			for (;;) {
//				guess = sc.nextInt();
//				int search = Arrays.binarySearch(posibilities, guess);
//				int search_for_ans = Arrays.binarySearch(posibilities, posibilities[ans]);
//				if (guess != posibilities[ans] && search < search_for_ans) {
//					System.out.println("答錯囉!太小了");
//				}else if (guess != posibilities[ans] && search > search_for_ans) {
//					System.out.println("答錯囉!太大了");
//				}
//				else {
//					System.out.println("答對囉");
//					break;
//				}
//			}// 這是 for (;;)的結束括號
//		}// 這是 if (sc.hasNextInt())的結束括號

/*==========================上2下3==============================================*/
		
//		3.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
	
//		int dislike;
//	    int sum = 0;
//
//	    Scanner sc = new Scanner(System.in);
//	    System.err.println("阿文...請輸入你討厭哪個數字?");
//      if (sc.hasNextInt()) {
//		    dislike = sc.nextInt();
//		    for (int x = 0; x < 5; x++) {// x=十位數，y=個位數
//			    for (int y = 0; y < 10; y++) {
//				    if (x == dislike || y == dislike || (x == 0 && y == 0)) {//
//					    continue;
//				    } else {
//					    int canChoose = 10 * x + y;
//					    System.out.print(canChoose + " ");
//					    sum += 1;
//				    }
//		  	    }
//		    }
//		    System.out.println("總共有" + sum + "個數字可選");
//		
//		    int[] r6 = new int[6];
//		    int randomNum = 0;
//
//		    for (int i = 0; i < 6; i++) {
//		    	randomNum = getRandom();
//		    	int duplicate_Index = search(r6, randomNum);
//		    	while (randomNum == 0 || (duplicate_Index >= 0) || randomNum % 10 == dislike || randomNum / 10 == dislike) {
//		    		randomNum = getRandom();
//		    		duplicate_Index = search(r6, randomNum);
//		    	}
//		    	r6[i] = randomNum;
//		    }
//		
//		    for (int i = 0; i < 6; i++) {
//		    	System.out.print(r6[i] + " ");
//		    }
//      }// if (sc.hasNextInt())的結束括號
	}// 這是main的結束括號

//	public static int getRandom() { // 產生亂數
//	return (int) (Math.random() * 49 + 1);
//	}
//
//	public static int search(int[] r6, int numBeingSearched) {
//	for (int i = 0; i < r6.length; i++) {
//		if (r6[i] == numBeingSearched) {
//			return i;
//		}
//	}
//	return -1;
//	}
}// 這是class hw3的結束括號
