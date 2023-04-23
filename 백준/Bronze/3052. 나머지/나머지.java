

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1,
		// 2, 0, 2이다.

		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

		int[] arr = new int[10]; // 자연수 10개의 배열 만들어 주기

		int count = 0; // 0이 이미 1개 이기 때문에 1개 카운트 미리 해주기
		int num = 0;

		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();

			arr[i] = n%42; // 임이의 수 10개 받기
		}

		for (int s = 0; s < arr.length; s++) {
			for (int i = s+1; i < arr.length; i++) {
				if (arr[s] == arr[i]) {
					 count++;        //중복되면 카운트
					 break;            //중복이 하나라도 나오면 돌아가기
				}

			
				

		}

	}
		num = arr.length - count; // 배열의 길이에서 중복 빼기

		System.out.println(num);
	}
}
