

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); // 몇 개의 숫자를 받을 껀지
		int[] arr = new int[num]; // 배열 만들어 주기
		int max = 0; // 최대값을 받아줄 변수
		int min = 0; // 최소값을 받아줄 변수

		// 5
		// 20 10 35 30 7 최소값 최대값 구하기

		for (int i = 0; i < num; i++) { // 배열 안에 숫자 넣기

			arr[i] = sc.nextInt();

		}
       Arrays.sort(arr);   // Arrays.sort 작은수 부터 큰 수 까지 정리 해주는 api
	System.out.println(arr[0] + " "+ arr[num-1]);
	}
	
	
}
