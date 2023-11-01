package hw5;

import java.util.*;

public class hw5 {
	
	public static void main(String[] args) {
		
		
		System.out.println("輸入寬");
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		System.out.println("輸入高");
		int h = s.nextInt();
		int[][] a = new int[h][w];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[w].length; j++) {
				System.out.print("*");
			};
			System.out.println("");
		};
		
		
		System.out.println("========================================");
		
		
		randAvg();
		System.out.println();
		
		
		System.out.println("========================================");
		
		
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		System.out.println(maxElement(intArray));
		System.out.println(maxElement(doubleArray));
		
		
		System.out.println("========================================");
		
		
		MyRectangle rec = new MyRectangle();
		rec.setWidth(10);
		rec.setDepth(20);
		System.out.println(rec.getArea());
		
		MyRectangle re = new MyRectangle(10.0, 20.0);
		System.out.println(re.getArea());
		
		
		System.out.println("========================================");
		
		
		System.out.println("本次隨機產生驗證碼為: ");
		genAuthCode();
	}



	static void randAvg() {
		
		int number;
		int sum = 0;
		int[] rand = new int[10];
		System.out.println("本次亂數結果:");
		for (int r = 0; r < rand.length; r++) {
			number = (int) (Math.random() * 101);
			rand[r] = number;
			System.out.print(number + " ");
			sum += number;
		}
		System.out.println();
		System.out.println(sum / rand.length);
	}
	
	
	static int maxElement(int x[][]) {
		int big = 0;
		for(int a = 0; a < x.length; a++) {
			for(int b = 0; b < x[a].length; b++) {
				if (big < x[a][b]) {
					big = x[a][b];
				}
			}
		} return big;
	}
	
	
	static double maxElement(double x[][]) {
		double big = 0;
		for(int c = 0; c < x.length; c++) {
			for (int d = 0; d < x[c].length; d++) {
				if (big < x[c][d]) {
					big = x[c][d];
				}
			}
		}return big;
		
	}
	
	static class MyRectangle {
		private double width;
		private double depth;
		public MyRectangle() {
			super();
		}
		public MyRectangle(double width, double depth) {
			this.width = width;
			this.depth = depth;
		}
		
		public void setWidth(double width) {
			this.width = width;
		}
		
		public void setDepth(double depth) {
			this.depth = depth;
		}
		
		public double getArea() {
			return width * depth;
		}
	}
	
	static void genAuthCode() {
		for (int ch = 0; ch <= 7; ch++) {
			int rng = (int) ((Math.random() * 75) + 48);
			while ((rng > 47 && rng < 58) || (rng > 64 && rng < 91) || (rng > 96 && rng < 123)) {
				char gen = (char)rng;
				System.out.print(gen);
				break;
		}
		}
		
	}
}
