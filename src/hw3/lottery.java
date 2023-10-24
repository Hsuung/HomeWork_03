package hw3;

import java.util.Scanner;

public class lottery {
	
public static void main(String[] args) {
		
		System.out.println("阿文...請輸入你討厭哪個數字?");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		String sum;
		int count = 0;
		int i;
		int j;
		int n = 0;
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
					}
		}
		String[] luckey = new String[count];
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
						sum = ("" + i + j);
						System.out.print(sum + " ");
						luckey[n] = sum;
						n = n + 1;
					}
		}

		System.out.println("總共有" + count + "數字可以選");
		
		
		int r;
		for (int t = 0; t < 6; t++) {
			r = (int) (Math.random() * count);
			System.out.println(luckey[r]);
		}
		
	}


}
