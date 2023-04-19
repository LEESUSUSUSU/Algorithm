


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

		// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
		// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

		int n = sc.nextInt(); // n 값
		int x = sc.nextInt(); // x 값

		int[] arr = new int[n]; // 정수가 n개가 주어진다.

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt(); // 둘째 줄에 수열 a를 이루는 정수 n개의 값.

		}
		for (int i = 0; i < arr.length; i++) { // 수열 a의 값을 비교 하기 위한 for문
			if (x > arr[i]) {
				; // X보다 작은 수

				System.out.print(arr[i] + " "); // X보다 작은 수 의 값을 for문 하는 동안 계속 프린터
			}
		}
	}
}
