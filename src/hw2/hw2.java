package hw2;

public class hw2 {
	public static void main(String[] args) {
		
		int i = 0;
		
		for (int count = 2; count <= 1000; count++) {
			if (count % 2 == 0) {
				i += count;}
		}
		System.out.println(i);
	}

}
