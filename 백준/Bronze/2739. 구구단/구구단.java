


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		int N;
		
		int num1= 0;
		
		N = sc.nextInt();
		
		for(int i = 1; i<10; i++) {
		
	
		num1 = N * i ;
	
		
		System.out.println(N +" * "+i + " = "+ num1);
		}
		
		
	}
}


