 package hw4;

import java.util.Scanner;

public class hw4 {
	
	public static void main(String[] args) {
		
		int[] a = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		int i;
		int count = 0;
		for (i = 0; i < a.length; i++) {
			sum += a[i];
			count += 1;
			}
		System.out.println("平均值為" + sum / count);
		System.out.println("大於平均值的有");
		for (i = 0; i < a.length; i++) {
		if (a[i] > sum / count)
			System.out.print( a[i] + " " );
		else 
			continue;
		}
		System.out.println("");
		
		
		System.out.println("========================================");
		
		
		String b = "Hello World";
		char[] revert = b.toCharArray();
		for (int j = b.length() - 1; j >= 0; j--) {
			System.out.print(revert[j]);
		}
		System.out.println("");
		
		
		System.out.println("========================================");
		
		
		String[] c = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String d = "";
		int vowel = 0;
		for (int h = 0; h < c.length; h++)
			d += c[h];
		char[] result = d.toCharArray();
		for (int k = 0; k < result.length; k++) {
			if (result[k] == 'a' || result[k] == 'e' || result[k] == 'i' || result[k] == 'o' || result[k] == 'u')
				vowel++;
		}
		System.out.println("總共有" + vowel + "個母音");
		
		
		System.out.println("========================================");
		
		
		int[][] bank = {
				{25, 32, 8, 19, 27},
				{2500, 800, 500, 1000, 1200}
				};
		
		System.out.println("請問要提多少錢?");
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
		System.out.print("有錢可借的員工編號" + " ");
		int rich = 0;
		for (int l = 0; l < bank[1].length; l++)
			if (money <= bank[1][l]) {
				rich++;
				System.out.print(bank[0][l] + " ");
			}
		System.out.println("共 " + rich + " 人");
		
		
		System.out.println("========================================");
		
		
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("輸入西元的年");
		int year = s.nextInt();
		System.out.println("輸入月");
		int month = s.nextInt();
		System.out.println("輸入日");
		int day = s.nextInt();
		
		int da = month - 1;
		int monthdayadd = 0;
		int totaldays = 0;
		
		if (year % 4 != 0) {
		    ;
		  } else if (year % 400 == 0) {
		    days[1] = days[1] + 1;
		  } else if (year % 100 == 0) {
		    ;
		  } else {
			days[1] = days[1] + 1;;
		  };
		 if (days[da] < day) {
			 System.out.println("沒有這一天");
		 }
		 else {
			 for (int g = 0; g < da; g++) {
				 monthdayadd += days[g];
				 };
				 totaldays = monthdayadd + day;
		 };
		 System.out.println(totaldays);
		 

		 System.out.println("========================================");
		 
		 
		 int[][] score = {
				 {10, 35, 40, 100, 90, 85, 75, 70},
				 {37, 75, 77, 89, 64, 75, 70, 95},
				 {100, 70, 79, 90, 75, 70, 79, 90},
				 {77, 95, 70, 89, 60, 75, 85, 89},
				 {98, 70, 89, 90, 75, 90, 89, 90},
				 {90, 80, 100, 75, 50, 20, 99, 75}
		 };
		 int[] student = {0, 0, 0, 0, 0, 0, 0, 0};
		 for (int t = 0; t < score.length; t++) {
			 for (int grade = 0; grade < score[t].length; grade++) {
				 int best = 0;
				 for (int big = 0; big < score[t].length; big++) {
					 if (score[t][grade] >= score[t][big]) {
					 	best += 1;
					 	if (best == score[t].length) {
					 		student[grade] += 1;
					 	};
					 };
				 };
			 };
		 }; 
		 for (int q = 0; q < student.length; q++) {
			 System.out.print(student[q] + " ");
		 };
		
	}

}
 