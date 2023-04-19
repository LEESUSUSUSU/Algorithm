

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n번의 반복
		
		
		for (int i = 1; i <= n; i++) {    // 첫번째
			for (int j = 1; j <= n - i; j++) { //개행을 계속 만들어 준다.
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();// 다음칸
		
	 
	}
	
	

	}

}
