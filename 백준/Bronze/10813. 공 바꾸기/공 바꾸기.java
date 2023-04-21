

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n+1];
	

		for (int i = 1; i < n+1; i++) {

			arr[i] = i;
		

		}

		int M = sc.nextInt();

		for (int i = 1; i <= M; i++) {
			int k = sc.nextInt();
			int j = sc.nextInt();

			int temp;

			
				temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;

			

		}
	
		for (int i = 1; i < n+1; i++)
			System.out.print(arr[i] + " ");

	}

}
