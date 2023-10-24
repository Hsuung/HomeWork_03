package hw3;

import java.util.*;

public class hw3 {
	
	public static void main(String[] args ) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("請輸入三個整數");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if ( x == y && y == z && z == x && x > 0) {
			System.out.println("正三角形");
			}
		
		else if ( ((x + y > 1) && (x == y)) || ((y + z) > 1 && (y == z )) || ((z + x > 1) && (z == x)) ) {
			System.out.println("等腰三角形");
		}
		
		else if ( x != y && y != z && z != x && x > 0 && y > 0 && z > 0) {
			System.out.println("其它三角形");
		}
		
		else if ( (z * z == x * x + y * y) && x > 0 && y > 0 && z > 0) {
			System.out.println("直角三角形");
		}
		
		else {
			System.out.println("不是三角形");
		}
		
		
		System.out.println("========================================");
		
		
		System.out.println("開始猜數字吧");
		
		
		int a = s.nextInt();
		int b = (int) (Math.random() * 10);
		

		while ( b != a ) {
			System.out.println("猜錯囉");
			a = s.nextInt();
		}
		
		System.out.println("答對了 ! 答案就是" + b);
			
		
		System.out.println("開始猜0到100之間的數字吧");
		int h = (int) (Math.random() * 101);
		int h100 = s.nextInt();
		while (h != h100) {
			if (h < h100) {
				System.out.println("再小一點");
				h100 = s.nextInt();
			}
			else if (h > h100) {
				System.out.println("再大一點");
				h100 = s.nextInt();
			}
		}
			System.out.println("答對了 ! 答案就是" + h);
			
			
		System.out.println("========================================");
		
		
		System.out.println("阿文...請輸入你討厭哪個數字?");
		
		int number = s.nextInt();
		
		String sum;
		int i;
		int j;
		int count = 0;
		for (i = 0; i <= 4; i++) {
			if (i == number) {
					continue;
			}
			for (j = 0; j <= 9; ++j)
				if (j == number) {
					continue;
					}
					else if(i == 0 && j == 0) {
						continue;
					}
					else {
					count = count +1;
					sum = ("" + i + j);
					System.out.print(sum + " ");
					}
		}
		
		System.out.println("總共有" + count + "數字可以選");
	}
}
