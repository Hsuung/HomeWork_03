package hw1;

public class hw1 {
	public static void main(String[]args) {
		int a = 12;
		int b = 6;
		int c = a + b;
		int d = a * b;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("========================================");
		
		int egg = 200;
		int box = egg / 12;
		double each = egg % 12;
		System.out.println(box);
		System.out.println(each);
		
		System.out.println("========================================");		
		
		int totalsec = 256559;
		int oneday = 60 * 60 * 24;
		int onehr = 60 * 60;
		int onemin = 60;
		int day = totalsec / 60 / 60 / 24;
		int hr = (totalsec - (day * oneday)) / onehr;
		int min = (totalsec - (day * oneday) - (hr * onehr)) / onemin;
		int sec = totalsec - (day * oneday) - (hr * onehr) - (min * onemin);
		
		System.out.println(day + "天" + hr + "小時" + min + "分鐘" + sec + "秒");
		
		System.out.println("========================================");
		
		final double pi = 3.1415;
		double area = 5 * 5 * pi;
		double lengh = 5 * 2 * pi;
		System.out.println(area);
		System.out.println(lengh);
		
		System.out.println("========================================");
		
		int money = 1500000;
		double interest = 1.218994419994757;
		double result = money * interest;
		System.out.println(result);
		
		System.out.println("========================================");
		
		System.out.println(5+5);      //數字5+5
		System.out.println(5 + '5');  //Char5是UNICODE的數字53再加上5
		System.out.println(5+ "5");   //數字5+String的5
		
		
<<<<<<< HEAD
		System.out.println("=== master ===");
=======
		System.out.println("=== test*test ===");
>>>>>>> test
		System.out.println("=== tests2 ===");
		System.out.println("=== test3 ===");

	}
	


}
