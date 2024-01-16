package conditional.back_2480;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && a == c && b == c) {
			System.out.println(10000 + a*1000);
		} else if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
			
		}
		
	}
}
