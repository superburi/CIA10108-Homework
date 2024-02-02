package hw;

import java.util.Arrays;
import java.util.Scanner;

public class hw4 {
	
	public static void main(String[] args) {
//		1. 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
/*
		int sum = 0;
		int[] array1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}
		double avg = sum / array1.length;
		System.out.println(avg);
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > avg) {
				System.out.println(array1[i]);
			}
		}
		System.out.println("==============");
*/		
//		2. 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
/*		
		String s;
		char[] charArray = null;
		Scanner sc1 = new Scanner(System.in);
		System.err.println("請輸入一串文字");
		if (sc1.hasNextLine()) {
			s = sc1.nextLine();
			charArray = s.toCharArray();
		}
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		System.out.println("==================");
*/
//		3. 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
/*		
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int vowels = 0;
		char[][] planetArray = new char[planet.length][];
		
		for (int i = 0; i < planet.length; i++) {
			planetArray[i] = planet[i].toCharArray();
			for (int j = 0; j < planetArray[i].length; j++) {
				if (planetArray[i][j] == 'a' || planetArray[i][j] == 'e' ||
					planetArray[i][j] == 'i' ||planetArray[i][j] == 'o' ||
					planetArray[i][j] == 'u') {//可能超過母音陣列長度
					vowels++;
				}
			}
		}
		System.out.println(vowels);
		
		System.out.println("============");
*/
//		4. 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		(提示:Scanner,二維陣列)
/*
		int borrow;
		int lend = 0;
		int[] empno = {25, 32, 8, 19, 27};
		int[] cash = {2500, 800, 500, 1000, 1200};
		Scanner sc2 = new Scanner(System.in);
		System.err.println("請輸入欲借的金額");
		if (sc2.hasNextInt()) {
			borrow = sc2.nextInt();//100
			System.out.print("有錢可借的員工編號 : ");
			for (int i = 0; i < cash.length; i++) {
				if (cash[i] >= borrow) {
					System.out.print(empno[i] + " ");
					lend++;
				}
			}
			System.out.println("共" + lend + "人");
		}
		System.out.println("=================");
*/
//		5. 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
/*				
        int[] x = new int[3];//放年 月 日
        int days = 0;//該年第幾天
        int[] bigMonth = {1, 3, 5, 7, 8, 10, 12};//有31天的月份
        Scanner sc3 = new Scanner(System.in);

        // 輸入年份
        System.err.println("請輸入第1個數字 : ");
        if (sc3.hasNextInt()) {
            x[0] = sc3.nextInt();
        } else {
            System.err.println("請輸入整數");
            return;
        }

        // 輸入月份，確保月份合規則
        while (true) {
            System.err.println("請輸入第2個數字 : ");
            if (sc3.hasNextInt()) {
                x[1] = sc3.nextInt();
                if (x[1] <= 12) {
                    break;  // 輸入合規則，跳出循環
                } else {
                    System.err.println("月份不會大於12喔");
                }
            } else {
                System.err.println("請輸入整數");
                sc3.next();  // 再輸入一次
            }
        }

        // 輸入日期
        System.err.println("請輸入第3個數字 : ");
        if (sc3.hasNextInt()) {
            x[2] = sc3.nextInt();
        } else {
            System.err.println("請輸入整數");
            return;
        }

        Arrays.sort(bigMonth);
        int is_It_BigMonth = Arrays.binarySearch(bigMonth, x[1]);//檢查輸入的是不是大月

        if (x[0] % 4 != 0 && x[1] == 2 && x[2] > 28) {
            System.err.println("今年不是閏年喔");
        } else if (x[0] % 4 == 0 && x[1] == 2 && x[2] > 29) {
            System.err.println("2月最多29天喔");
        } else if (is_It_BigMonth < 0 && x[2] > 30) {
            System.err.println("這個月最多30天喔");
        } else if (is_It_BigMonth >= 0 && x[2] > 31) {
            System.err.println("這個月最多31天喔");
        } else {
            for (int i = 1; i < x[1]; i++) {//把幾個月換成幾天
                int month = Arrays.binarySearch(bigMonth, i);
                if (i == 2 && x[0] % 4 == 0) {
                    days += 29;
                } else if (i == 2 && x[0] % 4 != 0) {
                    days += 28;
                } else if (month < 0) {
                    days += 30;
                } else {
                    days += 31;
                }
            }
            days += x[2];
            System.out.println("輸入的日期為該年第" + days + "天");
        }
        sc3.close();
		    
		System.out.println("======================");
*/
//		6. 班上有8位同學,他們進行了6次考試結果如下:
//
//			請算出每位同學考最高分的次數
//			(提示:二維陣列)
/*		
		int[][] grade = {//拿第0項去跟第1項相減，若小於0就換第1項跟第2項相減，直到大於0就換跟後兩項相減，減到都大於0為止
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
		};
		int[] no1_Student_Index = new int[6];//考第一名的同學index的陣列
		int[] no1_Occur_Times = new int[8];//1到第8個學生考第一名的次數，初始都是0
		int stuno = 0;//代表每一輪考試最高分學生的index，因為j區域變數在外面用不了
		
		for (int i = 0; i < grade.length; i++) {
			int highest = grade[i][0];//初始化最高分學生的index
			stuno = 0;//同上
			for (int j = 1; j < grade[i].length; j++) {
				if ( (Math.abs(100 - grade[i][j])) < (Math.abs(100 - highest)) ) {
					highest = grade[i][j];//第一名換人當
					stuno = j;//該輪考試最高分學生的index
				}
			}
			no1_Student_Index[i] = stuno;
		}
		//幫每個同學紀錄考第一名的次數
		for (int i = 0; i < no1_Student_Index.length; i++) {
			no1_Occur_Times[no1_Student_Index[i]]++;
		}
		for (int i = 0; i < 8; i++) {
			System.out.println("第" + (i + 1) + "位學生考了" + no1_Occur_Times[i] + "次第一名");
		}
*/
	}
}
