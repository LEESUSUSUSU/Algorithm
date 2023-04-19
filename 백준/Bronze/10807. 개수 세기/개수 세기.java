

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 배열의 갯수
		int[] arr = new int[N]; // 배열을 만들어 줌.
		int temp = 0; // 마지막 카운트

		
		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt(); // 배열에 숫자 넣기

		}

		int c = sc.nextInt(); // 배열에 숫자와 비교할 숫자.

		for (int i = 0; i < arr.length; i++) {   //배열의 숫자와 비교 할 for문
			if (c == arr[i]) {
				temp++;

			}
		}
		
			
			System.out.println(temp);

		}
	}
