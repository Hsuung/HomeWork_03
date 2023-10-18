package hw2;

public class hw2 {
	public static void main(String[] args) {
		
		int i = 0;
		
		for (int count = 2; count <= 1000; count++) {
			if (count % 2 == 0) {
				i += count;}
		}
		System.out.println(i);
		
		
		System.out.println("========================================");
		
		int a = 1;
		
		
		for (int b = 1; b <= 10; b++) {
			a *= b;
			
		}
		System.out.println(a);
		
		
		System.out.println("========================================");
		
		int x = 1;
		int y = 1;
		
		while (y <= 10) {
			x *= y;
			y++;
		}
		System.out.println(x);
		
		
		System.out.println("========================================");
		
		int n = 1;
		
		for (int m = 1; m <= 10; m++) {
			n = m * m;
			System.out.println(n);
		}
	}

}
