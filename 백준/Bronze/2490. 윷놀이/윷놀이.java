

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];
		
		int sum = 0;
	
		int j=0;

	while(j<3){

			for (int i = 0; i < 4; i++) {
				
				

				arr[i] = sc.nextInt();

				sum += arr[i];
				

				}
			switch (sum) {
			case 0:
				System.out.println("D");
				sum = 0;
				break;
			case 1:
				System.out.println("C");
				sum = 0;
				break;
			case 2:
				System.out.println("B");
				sum = 0;
				break;
			case 3:
				System.out.println("A");
				sum = 0;
				break;
			case 4:
				System.out.println("E");
				sum = 0;
				break;

			}
				j++;
			
		}
	}

}
